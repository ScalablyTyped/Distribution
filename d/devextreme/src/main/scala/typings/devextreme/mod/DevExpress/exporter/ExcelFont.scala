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
  /** @name ExcelFont.bold */
  var bold: js.UndefOr[Boolean] = js.undefined
  /** @name ExcelFont.color */
  var color: js.UndefOr[String] = js.undefined
  /** @name ExcelFont.italic */
  var italic: js.UndefOr[Boolean] = js.undefined
  /** @name ExcelFont.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name ExcelFont.size */
  var size: js.UndefOr[Double] = js.undefined
  /** @name ExcelFont.underline */
  var underline: js.UndefOr[double | doubleAccounting | none | single_ | singleAccounting] = js.undefined
}

object ExcelFont {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: js.UndefOr[Double] = js.undefined,
    underline: double | doubleAccounting | none | single_ | singleAccounting = null
  ): ExcelFont = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelFont]
  }
}

