package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.D
import typings.devextreme.devextremeStrings.GT
import typings.devextreme.devextremeStrings.T
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPivotGridPivotGridCell extends StObject {
  
  /**
    * The cell&apos;s column path. Available for data area cells only.
    */
  var columnPath: js.UndefOr[js.Array[String | Double | js.Date]] = js.undefined
  
  /**
    * The type of the column to which the cell belongs. Available for data area cells only.
    */
  var columnType: js.UndefOr[D | T | GT] = js.undefined
  
  /**
    * The data field&apos;s index. Available for data area cells only.
    */
  var dataIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether the cell is expanded. Available for row or column area cells only.
    */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path to the row/column cell. Available for row or column area cells only.
    */
  var path: js.UndefOr[js.Array[String | Double | js.Date]] = js.undefined
  
  /**
    * The cell&apos;s row path. Available for data area cells only.
    */
  var rowPath: js.UndefOr[js.Array[String | Double | js.Date]] = js.undefined
  
  /**
    * The type of the row to which the cell belongs. Available for data area cells only.
    */
  var rowType: js.UndefOr[D | T | GT] = js.undefined
  
  /**
    * The text displayed in the cell.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The cell&apos;s type. Available for row or column area cells only.
    */
  var `type`: js.UndefOr[D | T | GT] = js.undefined
  
  /**
    * The cell&apos;s value.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object dxPivotGridPivotGridCell {
  
  inline def apply(): dxPivotGridPivotGridCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridPivotGridCell]
  }
  
  extension [Self <: dxPivotGridPivotGridCell](x: Self) {
    
    inline def setColumnPath(value: js.Array[String | Double | js.Date]): Self = StObject.set(x, "columnPath", value.asInstanceOf[js.Any])
    
    inline def setColumnPathUndefined: Self = StObject.set(x, "columnPath", js.undefined)
    
    inline def setColumnPathVarargs(value: (String | Double | js.Date)*): Self = StObject.set(x, "columnPath", js.Array(value*))
    
    inline def setColumnType(value: D | T | GT): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
    
    inline def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setPath(value: js.Array[String | Double | js.Date]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: (String | Double | js.Date)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRowPath(value: js.Array[String | Double | js.Date]): Self = StObject.set(x, "rowPath", value.asInstanceOf[js.Any])
    
    inline def setRowPathUndefined: Self = StObject.set(x, "rowPath", js.undefined)
    
    inline def setRowPathVarargs(value: (String | Double | js.Date)*): Self = StObject.set(x, "rowPath", js.Array(value*))
    
    inline def setRowType(value: D | T | GT): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    
    inline def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: D | T | GT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
