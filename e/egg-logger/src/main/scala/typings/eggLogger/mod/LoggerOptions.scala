package typings.eggLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerOptions extends js.Object {
  var allowDebugAtProd: js.UndefOr[Boolean] = js.native
  var consoleLevel: js.UndefOr[LoggerLevel] = js.native
  var encoding: js.UndefOr[String] = js.native
  var level: js.UndefOr[LoggerLevel] = js.native
}

object LoggerOptions {
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
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
    def setAllowDebugAtProd(value: Boolean): Self = this.set("allowDebugAtProd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDebugAtProd: Self = this.set("allowDebugAtProd", js.undefined)
    @scala.inline
    def setConsoleLevel(value: LoggerLevel): Self = this.set("consoleLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsoleLevel: Self = this.set("consoleLevel", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setLevel(value: LoggerLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

