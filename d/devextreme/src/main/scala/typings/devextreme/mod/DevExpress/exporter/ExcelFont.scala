package typings.devextreme.mod.DevExpress.exporter

import typings.devextreme.devextremeStrings.double
import typings.devextreme.devextremeStrings.doubleAccounting
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.singleAccounting
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcelFont extends js.Object {
  /** Specifies whether the text should be in bold. */
  var bold: js.UndefOr[Boolean] = js.undefined
  /** The text's color in hexadecimal characters. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies whether the text should be in italic. */
  var italic: js.UndefOr[Boolean] = js.undefined
  /** The name of the typeface that should be applied to the text. */
  var name: js.UndefOr[String] = js.undefined
  /** The font size specified in points (1/72 of an inch). */
  var size: js.UndefOr[Double] = js.undefined
  /** The underline formatting style. */
  var underline: js.UndefOr[double | doubleAccounting | none | single_ | singleAccounting] = js.undefined
}

object ExcelFont {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: Int | Double = null,
    underline: double | doubleAccounting | none | single_ | singleAccounting = null
  ): ExcelFont = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelFont]
  }
}

