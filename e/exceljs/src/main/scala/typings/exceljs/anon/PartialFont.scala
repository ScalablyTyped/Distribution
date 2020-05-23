package typings.exceljs.anon

import typings.exceljs.exceljsStrings.double
import typings.exceljs.exceljsStrings.doubleAccounting
import typings.exceljs.exceljsStrings.major
import typings.exceljs.exceljsStrings.minor
import typings.exceljs.exceljsStrings.none_
import typings.exceljs.exceljsStrings.single
import typings.exceljs.exceljsStrings.singleAccounting
import typings.exceljs.exceljsStrings.subscript
import typings.exceljs.exceljsStrings.superscript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Font> */
trait PartialFont extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  var charset: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[PartialColor] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var scheme: js.UndefOr[minor | major | none_] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strike: js.UndefOr[Boolean] = js.undefined
  var underline: js.UndefOr[Boolean | none_ | single | double | singleAccounting | doubleAccounting] = js.undefined
  var vertAlign: js.UndefOr[superscript | subscript] = js.undefined
}

object PartialFont {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    charset: js.UndefOr[Double] = js.undefined,
    color: PartialColor = null,
    family: js.UndefOr[Double] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    scheme: minor | major | none_ = null,
    size: js.UndefOr[Double] = js.undefined,
    strike: js.UndefOr[Boolean] = js.undefined,
    underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting = null,
    vertAlign: superscript | subscript = null
  ): PartialFont = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(charset)) __obj.updateDynamic("charset")(charset.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline.get.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strike)) __obj.updateDynamic("strike")(strike.get.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (vertAlign != null) __obj.updateDynamic("vertAlign")(vertAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFont]
  }
}

