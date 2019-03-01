package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeType extends js.Object {
  var colors: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Accentcolor] = js.undefined
  var icons: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Addons] = js.undefined
  var images: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Additionalbackgrounds] = js.undefined
  var properties: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Additionalbackgroundsalignment] = js.undefined
}

object ThemeType {
  @scala.inline
  def apply(
    colors: firefoxDashWebextDashBrowserLib.Anon_Accentcolor = null,
    icons: firefoxDashWebextDashBrowserLib.Anon_Addons = null,
    images: firefoxDashWebextDashBrowserLib.Anon_Additionalbackgrounds = null,
    properties: firefoxDashWebextDashBrowserLib.Anon_Additionalbackgroundsalignment = null
  ): ThemeType = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (images != null) __obj.updateDynamic("images")(images)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ThemeType]
  }
}

