package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetWindow extends js.Object {
  /** User-entered value. */
  var customHtml: js.UndefOr[String] = js.native
  /** Type of browser window for which the backup image of the flash creative can be displayed. */
  var targetWindowOption: js.UndefOr[String] = js.native
}

object TargetWindow {
  @scala.inline
  def apply(): TargetWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetWindow]
  }
  @scala.inline
  implicit class TargetWindowOps[Self <: TargetWindow] (val x: Self) extends AnyVal {
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
    def setCustomHtml(value: String): Self = this.set("customHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHtml: Self = this.set("customHtml", js.undefined)
    @scala.inline
    def setTargetWindowOption(value: String): Self = this.set("targetWindowOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetWindowOption: Self = this.set("targetWindowOption", js.undefined)
  }
  
}

