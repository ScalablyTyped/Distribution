package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellData extends StObject {
  
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
  implicit class CellDataMutableBuilder[Self <: CellData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[js.Object]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: js.Object*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setEscapedLabel(value: String): Self = StObject.set(x, "escapedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapedLabelUndefined: Self = StObject.set(x, "escapedLabel", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHierarchy(value: Hierarchy): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
    
    @scala.inline
    def setIsClassicTotalRow(value: Boolean): Self = StObject.set(x, "isClassicTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClassicTotalRowUndefined: Self = StObject.set(x, "isClassicTotalRow", js.undefined)
    
    @scala.inline
    def setIsDrillThrough(value: Boolean): Self = StObject.set(x, "isDrillThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDrillThroughUndefined: Self = StObject.set(x, "isDrillThrough", js.undefined)
    
    @scala.inline
    def setIsGrandTotal(value: Boolean): Self = StObject.set(x, "isGrandTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGrandTotalColumn(value: Boolean): Self = StObject.set(x, "isGrandTotalColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGrandTotalColumnUndefined: Self = StObject.set(x, "isGrandTotalColumn", js.undefined)
    
    @scala.inline
    def setIsGrandTotalRow(value: Boolean): Self = StObject.set(x, "isGrandTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGrandTotalRowUndefined: Self = StObject.set(x, "isGrandTotalRow", js.undefined)
    
    @scala.inline
    def setIsGrandTotalUndefined: Self = StObject.set(x, "isGrandTotal", js.undefined)
    
    @scala.inline
    def setIsTotal(value: Boolean): Self = StObject.set(x, "isTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTotalColumn(value: Boolean): Self = StObject.set(x, "isTotalColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTotalColumnUndefined: Self = StObject.set(x, "isTotalColumn", js.undefined)
    
    @scala.inline
    def setIsTotalRow(value: Boolean): Self = StObject.set(x, "isTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTotalRowUndefined: Self = StObject.set(x, "isTotalRow", js.undefined)
    
    @scala.inline
    def setIsTotalUndefined: Self = StObject.set(x, "isTotal", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    @scala.inline
    def setMember(value: Member): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    @scala.inline
    def setRecordId(value: String | js.Array[String]): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordIdUndefined: Self = StObject.set(x, "recordId", js.undefined)
    
    @scala.inline
    def setRecordIdVarargs(value: String*): Self = StObject.set(x, "recordId", js.Array(value :_*))
    
    @scala.inline
    def setRowData(value: js.Array[CellData]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
    
    @scala.inline
    def setRowDataVarargs(value: CellData*): Self = StObject.set(x, "rowData", js.Array(value :_*))
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[js.Object]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Object*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
