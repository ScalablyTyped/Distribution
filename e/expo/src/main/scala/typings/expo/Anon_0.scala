package typings.expo

import typings.expo.expoNumbers.`0`
import typings.expo.expoNumbers.`1`
import typings.expo.expoStrings.blue
import typings.expo.expoStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var backgroundImage: js.UndefOr[String] = js.undefined
  var exponentIconColor: js.UndefOr[white | blue] = js.undefined
  var exponentIconGrayscale: js.UndefOr[`1` | `0`] = js.undefined
  var hideExponentText: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    backgroundImage: String = null,
    exponentIconColor: white | blue = null,
    exponentIconGrayscale: `1` | `0` = null,
    hideExponentText: js.UndefOr[Boolean] = js.undefined,
    icon: String = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage)
    if (exponentIconColor != null) __obj.updateDynamic("exponentIconColor")(exponentIconColor.asInstanceOf[js.Any])
    if (exponentIconGrayscale != null) __obj.updateDynamic("exponentIconGrayscale")(exponentIconGrayscale.asInstanceOf[js.Any])
    if (!js.isUndefined(hideExponentText)) __obj.updateDynamic("hideExponentText")(hideExponentText)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[Anon_0]
  }
}

