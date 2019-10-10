package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest.ImageDataOrExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Additionalbackgrounds extends js.Object {
  var additional_backgrounds: js.UndefOr[js.Array[ImageDataOrExtensionURL]] = js.undefined
  /**
    * @deprecated Unsupported images property, use 'theme.images.theme_frame', this alias is ignored in
    *     Firefox >= 70.
    */
  var headerURL: js.UndefOr[ImageDataOrExtensionURL] = js.undefined
  var theme_frame: js.UndefOr[ImageDataOrExtensionURL] = js.undefined
}

object Anon_Additionalbackgrounds {
  @scala.inline
  def apply(
    additional_backgrounds: js.Array[ImageDataOrExtensionURL] = null,
    headerURL: ImageDataOrExtensionURL = null,
    theme_frame: ImageDataOrExtensionURL = null
  ): Anon_Additionalbackgrounds = {
    val __obj = js.Dynamic.literal()
    if (additional_backgrounds != null) __obj.updateDynamic("additional_backgrounds")(additional_backgrounds)
    if (headerURL != null) __obj.updateDynamic("headerURL")(headerURL)
    if (theme_frame != null) __obj.updateDynamic("theme_frame")(theme_frame)
    __obj.asInstanceOf[Anon_Additionalbackgrounds]
  }
}

