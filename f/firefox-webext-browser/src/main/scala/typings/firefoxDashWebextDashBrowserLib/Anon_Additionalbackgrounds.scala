package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Additionalbackgrounds extends js.Object {
  var additional_backgrounds: js.UndefOr[
    js.Array[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ImageDataOrExtensionURL
    ]
  ] = js.undefined
  /** @deprecated Please use _theme.images.theme_frame_, this alias will be removed in Firefox 69. */
  var headerURL: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ImageDataOrExtensionURL
  ] = js.undefined
  var theme_frame: js.UndefOr[
    firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ImageDataOrExtensionURL
  ] = js.undefined
}

object Anon_Additionalbackgrounds {
  @scala.inline
  def apply(
    additional_backgrounds: js.Array[
      firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ImageDataOrExtensionURL
    ] = null,
    headerURL: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ImageDataOrExtensionURL = null,
    theme_frame: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.ImageDataOrExtensionURL = null
  ): Anon_Additionalbackgrounds = {
    val __obj = js.Dynamic.literal()
    if (additional_backgrounds != null) __obj.updateDynamic("additional_backgrounds")(additional_backgrounds)
    if (headerURL != null) __obj.updateDynamic("headerURL")(headerURL)
    if (theme_frame != null) __obj.updateDynamic("theme_frame")(theme_frame)
    __obj.asInstanceOf[Anon_Additionalbackgrounds]
  }
}

