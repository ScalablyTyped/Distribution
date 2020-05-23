package typings.exceljs.anon

import typings.exceljs.mod.Cell
import typings.exceljs.mod.CellValue
import typings.exceljs.mod.Fill
import typings.exceljs.mod.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Column> */
trait PartialColumn extends js.Object {
  var alignment: js.UndefOr[PartialAlignment] = js.undefined
  var border: js.UndefOr[PartialBordersBottom] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var defn: js.UndefOr[js.Any] = js.undefined
  var eachCell: js.UndefOr[
    js.Function1[/* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit], Unit]
  ] = js.undefined
  var equivalentTo: js.UndefOr[js.Function1[/* other */ typings.exceljs.mod.Column, Boolean]] = js.undefined
  var fill: js.UndefOr[Fill] = js.undefined
  var font: js.UndefOr[PartialFont] = js.undefined
  var header: js.UndefOr[String | js.Array[String]] = js.undefined
  var headerCount: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var isCustomWidth: js.UndefOr[Boolean] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var letter: js.UndefOr[String] = js.undefined
  var numFmt: js.UndefOr[String] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var outlineLevel: js.UndefOr[Double] = js.undefined
  var protection: js.UndefOr[PartialProtection] = js.undefined
  var style: js.UndefOr[PartialStyleAlignment] = js.undefined
  @JSName("toString")
  var toString_FPartialColumn: js.UndefOr[js.Function0[String]] = js.undefined
  var values: js.UndefOr[js.Array[CellValue]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var worksheet: js.UndefOr[Worksheet] = js.undefined
}

object PartialColumn {
  @scala.inline
  def apply(
    alignment: PartialAlignment = null,
    border: PartialBordersBottom = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    defn: js.Any = null,
    eachCell: /* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit] => Unit = null,
    equivalentTo: /* other */ typings.exceljs.mod.Column => Boolean = null,
    fill: Fill = null,
    font: PartialFont = null,
    header: String | js.Array[String] = null,
    headerCount: js.UndefOr[Double] = js.undefined,
    headers: js.Array[String] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    isCustomWidth: js.UndefOr[Boolean] = js.undefined,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    letter: String = null,
    numFmt: String = null,
    number: js.UndefOr[Double] = js.undefined,
    outlineLevel: js.UndefOr[Double] = js.undefined,
    protection: PartialProtection = null,
    style: PartialStyleAlignment = null,
    toString: () => String = null,
    values: js.Array[CellValue] = null,
    width: js.UndefOr[Double] = js.undefined,
    worksheet: Worksheet = null
  ): PartialColumn = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (defn != null) __obj.updateDynamic("defn")(defn.asInstanceOf[js.Any])
    if (eachCell != null) __obj.updateDynamic("eachCell")(js.Any.fromFunction1(eachCell))
    if (equivalentTo != null) __obj.updateDynamic("equivalentTo")(js.Any.fromFunction1(equivalentTo))
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(headerCount)) __obj.updateDynamic("headerCount")(headerCount.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCustomWidth)) __obj.updateDynamic("isCustomWidth")(isCustomWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (letter != null) __obj.updateDynamic("letter")(letter.asInstanceOf[js.Any])
    if (numFmt != null) __obj.updateDynamic("numFmt")(numFmt.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineLevel)) __obj.updateDynamic("outlineLevel")(outlineLevel.get.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialColumn]
  }
}

