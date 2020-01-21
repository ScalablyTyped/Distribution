package typings.firefoxWebextBrowser.browser.manifest

import typings.firefoxWebextBrowser.AnonAccentcolor
import typings.firefoxWebextBrowser.AnonAdditionalbackgrounds
import typings.firefoxWebextBrowser.AnonAdditionalbackgroundsalignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeType extends js.Object {
  var colors: js.UndefOr[AnonAccentcolor] = js.undefined
  var images: js.UndefOr[AnonAdditionalbackgrounds] = js.undefined
  var properties: js.UndefOr[AnonAdditionalbackgroundsalignment] = js.undefined
}

object ThemeType {
  @scala.inline
  def apply(
    colors: AnonAccentcolor = null,
    images: AnonAdditionalbackgrounds = null,
    properties: AnonAdditionalbackgroundsalignment = null
  ): ThemeType = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeType]
  }
}

