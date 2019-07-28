package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.double
import typings.exceljs.exceljsStrings.doubleAccounting
import typings.exceljs.exceljsStrings.major
import typings.exceljs.exceljsStrings.minor
import typings.exceljs.exceljsStrings.none
import typings.exceljs.exceljsStrings.single
import typings.exceljs.exceljsStrings.singleAccounting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  var charset: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var scheme: js.UndefOr[minor | major | none] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strike: js.UndefOr[Boolean] = js.undefined
  var underline: js.UndefOr[Boolean | none | single | double | singleAccounting | doubleAccounting] = js.undefined
}

object Font {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    charset: Int | Double = null,
    color: Color = null,
    family: Int | Double = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    scheme: minor | major | none = null,
    size: Int | Double = null,
    strike: js.UndefOr[Boolean] = js.undefined,
    underline: Boolean | none | single | double | singleAccounting | doubleAccounting = null
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

