package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellData extends StObject {
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var columns: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var escapedLabel: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hierarchy: js.UndefOr[Hierarchy] = js.undefined
  
  var isClassicTotalRow: js.UndefOr[Boolean] = js.undefined
  
  var isDrillThrough: js.UndefOr[Boolean] = js.undefined
  
  var isGrandTotal: js.UndefOr[Boolean] = js.undefined
  
  var isGrandTotalColumn: js.UndefOr[Boolean] = js.undefined
  
  var isGrandTotalRow: js.UndefOr[Boolean] = js.undefined
  
  var isTotal: js.UndefOr[Boolean] = js.undefined
  
  var isTotalColumn: js.UndefOr[Boolean] = js.undefined
  
  var isTotalRow: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var measure: js.UndefOr[MeasureObject] = js.undefined
  
  var member: js.UndefOr[Member] = js.undefined
  
  var recordId: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var rowData: js.UndefOr[js.Array[CellData]] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object CellData {
  
  inline def apply(): CellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellData]
  }
  
  extension [Self <: CellData](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumns(value: js.Array[js.Object]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: js.Object*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setEscapedLabel(value: String): Self = StObject.set(x, "escapedLabel", value.asInstanceOf[js.Any])
    
    inline def setEscapedLabelUndefined: Self = StObject.set(x, "escapedLabel", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHierarchy(value: Hierarchy): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
    
    inline def setIsClassicTotalRow(value: Boolean): Self = StObject.set(x, "isClassicTotalRow", value.asInstanceOf[js.Any])
    
    inline def setIsClassicTotalRowUndefined: Self = StObject.set(x, "isClassicTotalRow", js.undefined)
    
    inline def setIsDrillThrough(value: Boolean): Self = StObject.set(x, "isDrillThrough", value.asInstanceOf[js.Any])
    
    inline def setIsDrillThroughUndefined: Self = StObject.set(x, "isDrillThrough", js.undefined)
    
    inline def setIsGrandTotal(value: Boolean): Self = StObject.set(x, "isGrandTotal", value.asInstanceOf[js.Any])
    
    inline def setIsGrandTotalColumn(value: Boolean): Self = StObject.set(x, "isGrandTotalColumn", value.asInstanceOf[js.Any])
    
    inline def setIsGrandTotalColumnUndefined: Self = StObject.set(x, "isGrandTotalColumn", js.undefined)
    
    inline def setIsGrandTotalRow(value: Boolean): Self = StObject.set(x, "isGrandTotalRow", value.asInstanceOf[js.Any])
    
    inline def setIsGrandTotalRowUndefined: Self = StObject.set(x, "isGrandTotalRow", js.undefined)
    
    inline def setIsGrandTotalUndefined: Self = StObject.set(x, "isGrandTotal", js.undefined)
    
    inline def setIsTotal(value: Boolean): Self = StObject.set(x, "isTotal", value.asInstanceOf[js.Any])
    
    inline def setIsTotalColumn(value: Boolean): Self = StObject.set(x, "isTotalColumn", value.asInstanceOf[js.Any])
    
    inline def setIsTotalColumnUndefined: Self = StObject.set(x, "isTotalColumn", js.undefined)
    
    inline def setIsTotalRow(value: Boolean): Self = StObject.set(x, "isTotalRow", value.asInstanceOf[js.Any])
    
    inline def setIsTotalRowUndefined: Self = StObject.set(x, "isTotalRow", js.undefined)
    
    inline def setIsTotalUndefined: Self = StObject.set(x, "isTotal", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def setMember(value: Member): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    inline def setRecordId(value: String | js.Array[String]): Self = StObject.set(x, "recordId", value.asInstanceOf[js.Any])
    
    inline def setRecordIdUndefined: Self = StObject.set(x, "recordId", js.undefined)
    
    inline def setRecordIdVarargs(value: String*): Self = StObject.set(x, "recordId", js.Array(value*))
    
    inline def setRowData(value: js.Array[CellData]): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
    
    inline def setRowDataVarargs(value: CellData*): Self = StObject.set(x, "rowData", js.Array(value*))
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRows(value: js.Array[js.Object]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: js.Object*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
