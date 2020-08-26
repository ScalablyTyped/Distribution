package typings.expressWinston.mod

import typings.winston.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorLoggerOptionsWithWinstonInstance
  extends BaseErrorLoggerOptions
     with ErrorLoggerOptions {
  var winstonInstance: Logger = js.native
}

object ErrorLoggerOptionsWithWinstonInstance {
  @scala.inline
  def apply(winstonInstance: Logger): ErrorLoggerOptionsWithWinstonInstance = {
    val __obj = js.Dynamic.literal(winstonInstance = winstonInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorLoggerOptionsWithWinstonInstance]
  }
  @scala.inline
  implicit class ErrorLoggerOptionsWithWinstonInstanceOps[Self <: ErrorLoggerOptionsWithWinstonInstance] (val x: Self) extends AnyVal {
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
    def setWinstonInstance(value: Logger): Self = this.set("winstonInstance", value.asInstanceOf[js.Any])
  }
  
}

