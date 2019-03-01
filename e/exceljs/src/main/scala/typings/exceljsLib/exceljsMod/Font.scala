package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var charset: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var family: js.UndefOr[scala.Double] = js.undefined
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var scheme: js.UndefOr[
    exceljsLib.exceljsLibStrings.minor | exceljsLib.exceljsLibStrings.major | exceljsLib.exceljsLibStrings.none
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var strike: js.UndefOr[scala.Boolean] = js.undefined
  var underline: js.UndefOr[
    scala.Boolean | exceljsLib.exceljsLibStrings.none | exceljsLib.exceljsLibStrings.single | exceljsLib.exceljsLibStrings.double | exceljsLib.exceljsLibStrings.singleAccounting | exceljsLib.exceljsLibStrings.doubleAccounting
  ] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    charset: scala.Int | scala.Double = null,
    color: Color = null,
    family: scala.Int | scala.Double = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    scheme: exceljsLib.exceljsLibStrings.minor | exceljsLib.exceljsLibStrings.major | exceljsLib.exceljsLibStrings.none = null,
    size: scala.Int | scala.Double = null,
    strike: js.UndefOr[scala.Boolean] = js.undefined,
    underline: scala.Boolean | exceljsLib.exceljsLibStrings.none | exceljsLib.exceljsLibStrings.single | exceljsLib.exceljsLibStrings.double | exceljsLib.exceljsLibStrings.singleAccounting | exceljsLib.exceljsLibStrings.doubleAccounting = null
  ): Font = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strike)) __obj.updateDynamic("strike")(strike)
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

