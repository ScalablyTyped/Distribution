package typings.firefoxWebextBrowser.browser.manifest

import typings.firefoxWebextBrowser.anon.Accentcolor
import typings.firefoxWebextBrowser.anon.Additionalbackgrounds
import typings.firefoxWebextBrowser.anon.Additionalbackgroundsalignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeType extends js.Object {
  var colors: js.UndefOr[Accentcolor] = js.undefined
  var images: js.UndefOr[Additionalbackgrounds] = js.undefined
  var properties: js.UndefOr[Additionalbackgroundsalignment] = js.undefined
}

object ThemeType {
  @scala.inline
  def apply(
    colors: Accentcolor = null,
    images: Additionalbackgrounds = null,
    properties: Additionalbackgroundsalignment = null
  ): ThemeType = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeType]
  }
}

