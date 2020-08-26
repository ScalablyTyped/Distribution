package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ImageDataOrExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Additionalbackgrounds extends js.Object {
  var additional_backgrounds: js.UndefOr[js.Array[ImageDataOrExtensionURL]] = js.native
  /**
    * @deprecated Unsupported images property, use 'theme.images.theme_frame', this alias is ignored in
    *     Firefox >= 70.
    */
  var headerURL: js.UndefOr[ImageDataOrExtensionURL] = js.native
  var theme_frame: js.UndefOr[ImageDataOrExtensionURL] = js.native
}

object Additionalbackgrounds {
  @scala.inline
  def apply(): Additionalbackgrounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Additionalbackgrounds]
  }
  @scala.inline
  implicit class AdditionalbackgroundsOps[Self <: Additionalbackgrounds] (val x: Self) extends AnyVal {
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
    def setAdditional_backgroundsVarargs(value: ImageDataOrExtensionURL*): Self = this.set("additional_backgrounds", js.Array(value :_*))
    @scala.inline
    def setAdditional_backgrounds(value: js.Array[ImageDataOrExtensionURL]): Self = this.set("additional_backgrounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditional_backgrounds: Self = this.set("additional_backgrounds", js.undefined)
    @scala.inline
    def setHeaderURL(value: ImageDataOrExtensionURL): Self = this.set("headerURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderURL: Self = this.set("headerURL", js.undefined)
    @scala.inline
    def setTheme_frame(value: ImageDataOrExtensionURL): Self = this.set("theme_frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme_frame: Self = this.set("theme_frame", js.undefined)
  }
  
}

