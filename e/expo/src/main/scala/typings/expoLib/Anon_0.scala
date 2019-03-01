package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var backgroundImage: js.UndefOr[java.lang.String] = js.undefined
  var exponentIconColor: js.UndefOr[expoLib.expoLibStrings.white | expoLib.expoLibStrings.blue] = js.undefined
  var exponentIconGrayscale: js.UndefOr[expoLib.expoLibNumbers.`1` | expoLib.expoLibNumbers.`0`] = js.undefined
  var hideExponentText: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    backgroundImage: java.lang.String = null,
    exponentIconColor: expoLib.expoLibStrings.white | expoLib.expoLibStrings.blue = null,
    exponentIconGrayscale: expoLib.expoLibNumbers.`1` | expoLib.expoLibNumbers.`0` = null,
    hideExponentText: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null
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

