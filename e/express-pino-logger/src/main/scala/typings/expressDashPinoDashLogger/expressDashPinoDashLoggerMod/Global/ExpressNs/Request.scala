package typings.expressDashPinoDashLogger.expressDashPinoDashLoggerMod.Global.ExpressNs

import typings.pino.pinoMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var log: Logger
}

object Request {
  @scala.inline
  def apply(log: Logger): Request = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[Request]
  }
}

