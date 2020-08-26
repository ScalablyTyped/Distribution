package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AboutDriveThemes extends js.Object {
  var backgroundImageLink: js.UndefOr[String] = js.native
  var colorRgb: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
}

object AboutDriveThemes {
  @scala.inline
  def apply(): AboutDriveThemes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AboutDriveThemes]
  }
  @scala.inline
  implicit class AboutDriveThemesOps[Self <: AboutDriveThemes] (val x: Self) extends AnyVal {
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
    def setBackgroundImageLink(value: String): Self = this.set("backgroundImageLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageLink: Self = this.set("backgroundImageLink", js.undefined)
    @scala.inline
    def setColorRgb(value: String): Self = this.set("colorRgb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRgb: Self = this.set("colorRgb", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

