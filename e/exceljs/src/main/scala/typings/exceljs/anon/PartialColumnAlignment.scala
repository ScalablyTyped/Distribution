package typings.exceljs.anon

import typings.exceljs.mod.Cell
import typings.exceljs.mod.CellValue
import typings.exceljs.mod.Fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.Column> */
@js.native
trait PartialColumnAlignment extends js.Object {
  var alignment: js.UndefOr[PartialAlignment] = js.native
  var border: js.UndefOr[PartialBordersBottom] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var defn: js.UndefOr[js.Any] = js.native
  var eachCell: js.UndefOr[
    js.Function1[/* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit], Unit]
  ] = js.native
  var equivalentTo: js.UndefOr[js.Function1[/* other */ typings.exceljs.mod.Column, Boolean]] = js.native
  var fill: js.UndefOr[Fill] = js.native
  var font: js.UndefOr[PartialFont] = js.native
  var header: js.UndefOr[String | js.Array[String]] = js.native
  var headerCount: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[js.Array[String]] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var isCustomWidth: js.UndefOr[Boolean] = js.native
  var isDefault: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var letter: js.UndefOr[String] = js.native
  var numFmt: js.UndefOr[String] = js.native
  var number: js.UndefOr[Double] = js.native
  var outlineLevel: js.UndefOr[Double] = js.native
  var protection: js.UndefOr[PartialProtection] = js.native
  var style: js.UndefOr[PartialStyleAlignment] = js.native
  @JSName("toString")
  var toString_FPartialColumnAlignment: js.UndefOr[js.Function0[String]] = js.native
  var values: js.UndefOr[js.Array[CellValue]] = js.native
  var width: js.UndefOr[Double] = js.native
  var worksheet: js.UndefOr[this.type] = js.native
}

object PartialColumnAlignment {
  @scala.inline
  def apply(): PartialColumnAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColumnAlignment]
  }
  @scala.inline
  implicit class PartialColumnAlignmentOps[Self <: PartialColumnAlignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignment(value: PartialAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setBorder(value: PartialBordersBottom): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setDefn(value: js.Any): Self = this.set("defn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefn: Self = this.set("defn", js.undefined)
    @scala.inline
    def setEachCell(value: /* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit] => Unit): Self = this.set("eachCell", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEachCell: Self = this.set("eachCell", js.undefined)
    @scala.inline
    def setEquivalentTo(value: /* other */ typings.exceljs.mod.Column => Boolean): Self = this.set("equivalentTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEquivalentTo: Self = this.set("equivalentTo", js.undefined)
    @scala.inline
    def setFill(value: Fill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: PartialFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHeaderVarargs(value: String*): Self = this.set("header", js.Array(value :_*))
    @scala.inline
    def setHeader(value: String | js.Array[String]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderCount(value: Double): Self = this.set("headerCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCount: Self = this.set("headerCount", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIsCustomWidth(value: Boolean): Self = this.set("isCustomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCustomWidth: Self = this.set("isCustomWidth", js.undefined)
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLetter(value: String): Self = this.set("letter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetter: Self = this.set("letter", js.undefined)
    @scala.inline
    def setNumFmt(value: String): Self = this.set("numFmt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFmt: Self = this.set("numFmt", js.undefined)
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setOutlineLevel(value: Double): Self = this.set("outlineLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineLevel: Self = this.set("outlineLevel", js.undefined)
    @scala.inline
    def setProtection(value: PartialProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
    @scala.inline
    def setStyle(value: PartialStyleAlignment): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
    @scala.inline
    def setValuesVarargs(value: CellValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[CellValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWorksheet(value: PartialColumnAlignment): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
  
}

