package typings.expressBoom.mod.global.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoomError[Data] extends js.Object {
  var data: Data = js.native
  var isBoom: Boolean = js.native
  var isServer: Boolean = js.native
  var message: String = js.native
  var output: Output = js.native
  def reformat(): Unit = js.native
}

object BoomError {
  @scala.inline
  def apply[Data](
    data: Data,
    isBoom: Boolean,
    isServer: Boolean,
    message: String,
    output: Output,
    reformat: () => Unit
  ): BoomError[Data] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isBoom = isBoom.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reformat = js.Any.fromFunction0(reformat))
    __obj.asInstanceOf[BoomError[Data]]
  }
  @scala.inline
  implicit class BoomErrorOps[Self <: BoomError[_], Data] (val x: Self with BoomError[Data]) extends AnyVal {
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
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBoom(value: Boolean): Self = this.set("isBoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsServer(value: Boolean): Self = this.set("isServer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: Output): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setReformat(value: () => Unit): Self = this.set("reformat", js.Any.fromFunction0(value))
  }
  
}

