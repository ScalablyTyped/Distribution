package typings.expressPinoLogger.mod.httpAugmentingMod

import typings.pino.mod.Logger
import typings.pinoHttp.mod.ReqId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingMessage extends js.Object {
  var id: ReqId = js.native
  var log: Logger = js.native
}

object IncomingMessage {
  @scala.inline
  def apply(id: ReqId, log: Logger): IncomingMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingMessage]
  }
  @scala.inline
  implicit class IncomingMessageOps[Self <: IncomingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: ReqId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog(value: Logger): Self = this.set("log", value.asInstanceOf[js.Any])
  }
  
}

