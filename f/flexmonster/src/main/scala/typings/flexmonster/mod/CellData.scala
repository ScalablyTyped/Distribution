package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellData extends js.Object {
  
  var columnIndex: js.UndefOr[Double] = js.native
  
  var columns: js.UndefOr[js.Array[js.Object]] = js.native
  
  var escapedLabel: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hierarchy: js.UndefOr[Hierarchy] = js.native
  
  var isClassicTotalRow: js.UndefOr[Boolean] = js.native
  
  var isDrillThrough: js.UndefOr[Boolean] = js.native
  
  var isGrandTotal: js.UndefOr[Boolean] = js.native
  
  var isGrandTotalColumn: js.UndefOr[Boolean] = js.native
  
  var isGrandTotalRow: js.UndefOr[Boolean] = js.native
  
  var isTotal: js.UndefOr[Boolean] = js.native
  
  var isTotalColumn: js.UndefOr[Boolean] = js.native
  
  var isTotalRow: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var measure: js.UndefOr[MeasureObject] = js.native
  
  var member: js.UndefOr[Member] = js.native
  
  var recordId: js.UndefOr[String | js.Array[String]] = js.native
  
  var rowData: js.UndefOr[js.Array[CellData]] = js.native
  
  var rowIndex: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[js.Array[js.Object]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object CellData {
  
  @scala.inline
  def apply(): CellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellData]
  }
  
  @scala.inline
  implicit class CellDataOps[Self <: CellData] (val x: Self) extends AnyVal {
    
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: js.Object*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[js.Object]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setEscapedLabel(value: String): Self = this.set("escapedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapedLabel: Self = this.set("escapedLabel", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHierarchy(value: Hierarchy): Self = this.set("hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchy: Self = this.set("hierarchy", js.undefined)
    
    @scala.inline
    def setIsClassicTotalRow(value: Boolean): Self = this.set("isClassicTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClassicTotalRow: Self = this.set("isClassicTotalRow", js.undefined)
    
    @scala.inline
    def setIsDrillThrough(value: Boolean): Self = this.set("isDrillThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDrillThrough: Self = this.set("isDrillThrough", js.undefined)
    
    @scala.inline
    def setIsGrandTotal(value: Boolean): Self = this.set("isGrandTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGrandTotal: Self = this.set("isGrandTotal", js.undefined)
    
    @scala.inline
    def setIsGrandTotalColumn(value: Boolean): Self = this.set("isGrandTotalColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGrandTotalColumn: Self = this.set("isGrandTotalColumn", js.undefined)
    
    @scala.inline
    def setIsGrandTotalRow(value: Boolean): Self = this.set("isGrandTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGrandTotalRow: Self = this.set("isGrandTotalRow", js.undefined)
    
    @scala.inline
    def setIsTotal(value: Boolean): Self = this.set("isTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTotal: Self = this.set("isTotal", js.undefined)
    
    @scala.inline
    def setIsTotalColumn(value: Boolean): Self = this.set("isTotalColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTotalColumn: Self = this.set("isTotalColumn", js.undefined)
    
    @scala.inline
    def setIsTotalRow(value: Boolean): Self = this.set("isTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTotalRow: Self = this.set("isTotalRow", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMeasure(value: MeasureObject): Self = this.set("measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasure: Self = this.set("measure", js.undefined)
    
    @scala.inline
    def setMember(value: Member): Self = this.set("member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    
    @scala.inline
    def setRecordIdVarargs(value: String*): Self = this.set("recordId", js.Array(value :_*))
    
    @scala.inline
    def setRecordId(value: String | js.Array[String]): Self = this.set("recordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordId: Self = this.set("recordId", js.undefined)
    
    @scala.inline
    def setRowDataVarargs(value: CellData*): Self = this.set("rowData", js.Array(value :_*))
    
    @scala.inline
    def setRowData(value: js.Array[CellData]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowData: Self = this.set("rowData", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Object*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[js.Object]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
