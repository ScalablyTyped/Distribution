package typings.firefoxDashWebextDashBrowser.browser._manifest

import typings.firefoxDashWebextDashBrowser.Anon_Accentcolor
import typings.firefoxDashWebextDashBrowser.Anon_Additionalbackgrounds
import typings.firefoxDashWebextDashBrowser.Anon_Additionalbackgroundsalignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeType extends js.Object {
  var colors: js.UndefOr[Anon_Accentcolor] = js.undefined
  var images: js.UndefOr[Anon_Additionalbackgrounds] = js.undefined
  var properties: js.UndefOr[Anon_Additionalbackgroundsalignment] = js.undefined
}

object ThemeType {
  @scala.inline
  def apply(
    colors: Anon_Accentcolor = null,
    images: Anon_Additionalbackgrounds = null,
    properties: Anon_Additionalbackgroundsalignment = null
  ): ThemeType = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeType]
  }
}

