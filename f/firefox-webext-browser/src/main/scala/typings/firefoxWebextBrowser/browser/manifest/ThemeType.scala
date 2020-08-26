package typings.firefoxWebextBrowser.browser.manifest

import typings.firefoxWebextBrowser.anon.Accentcolor
import typings.firefoxWebextBrowser.anon.Additionalbackgrounds
import typings.firefoxWebextBrowser.anon.Additionalbackgroundsalignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeType extends js.Object {
  var colors: js.UndefOr[Accentcolor] = js.native
  var images: js.UndefOr[Additionalbackgrounds] = js.native
  var properties: js.UndefOr[Additionalbackgroundsalignment] = js.native
}

object ThemeType {
  @scala.inline
  def apply(): ThemeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeType]
  }
  @scala.inline
  implicit class ThemeTypeOps[Self <: ThemeType] (val x: Self) extends AnyVal {
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
    def setColors(value: Accentcolor): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setImages(value: Additionalbackgrounds): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setProperties(value: Additionalbackgroundsalignment): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}

