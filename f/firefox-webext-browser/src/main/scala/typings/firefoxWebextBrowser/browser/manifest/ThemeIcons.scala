package typings.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeIcons extends js.Object {
  /** The dark icon to use for light themes */
  var dark: ExtensionURL
  /** A light icon to use for dark themes */
  var light: ExtensionURL
  /** The size of the icons */
  var size: Double
}

object ThemeIcons {
  @scala.inline
  def apply(dark: ExtensionURL, light: ExtensionURL, size: Double): ThemeIcons = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ThemeIcons]
  }
}

