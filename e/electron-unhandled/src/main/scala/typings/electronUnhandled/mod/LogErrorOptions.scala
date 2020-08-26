package typings.electronUnhandled.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogErrorOptions extends js.Object {
  /**
  		Title of the error dialog.
  		@default `${appName} encountered an error`
  		*/
  val title: js.UndefOr[String] = js.native
}

object LogErrorOptions {
  @scala.inline
  def apply(): LogErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogErrorOptions]
  }
  @scala.inline
  implicit class LogErrorOptionsOps[Self <: LogErrorOptions] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

