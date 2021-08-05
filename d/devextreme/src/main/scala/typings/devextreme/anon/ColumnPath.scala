package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnPath extends StObject {
  
  var columnPath: js.UndefOr[js.Array[String | Double | typings.std.Date]] = js.undefined
  
  var customColumns: js.UndefOr[js.Array[String]] = js.undefined
  
  var dataIndex: js.UndefOr[Double] = js.undefined
  
  var maxRowCount: js.UndefOr[Double] = js.undefined
  
  var rowPath: js.UndefOr[js.Array[String | Double | typings.std.Date]] = js.undefined
}
object ColumnPath {
  
  inline def apply(): ColumnPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnPath]
  }
  
  extension [Self <: ColumnPath](x: Self) {
    
    inline def setColumnPath(value: js.Array[String | Double | typings.std.Date]): Self = StObject.set(x, "columnPath", value.asInstanceOf[js.Any])
    
    inline def setColumnPathUndefined: Self = StObject.set(x, "columnPath", js.undefined)
    
    inline def setColumnPathVarargs(value: (String | Double | typings.std.Date)*): Self = StObject.set(x, "columnPath", js.Array(value :_*))
    
    inline def setCustomColumns(value: js.Array[String]): Self = StObject.set(x, "customColumns", value.asInstanceOf[js.Any])
    
    inline def setCustomColumnsUndefined: Self = StObject.set(x, "customColumns", js.undefined)
    
    inline def setCustomColumnsVarargs(value: String*): Self = StObject.set(x, "customColumns", js.Array(value :_*))
    
    inline def setDataIndex(value: Double): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
    
    inline def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
    
    inline def setMaxRowCount(value: Double): Self = StObject.set(x, "maxRowCount", value.asInstanceOf[js.Any])
    
    inline def setMaxRowCountUndefined: Self = StObject.set(x, "maxRowCount", js.undefined)
    
    inline def setRowPath(value: js.Array[String | Double | typings.std.Date]): Self = StObject.set(x, "rowPath", value.asInstanceOf[js.Any])
    
    inline def setRowPathUndefined: Self = StObject.set(x, "rowPath", js.undefined)
    
    inline def setRowPathVarargs(value: (String | Double | typings.std.Date)*): Self = StObject.set(x, "rowPath", js.Array(value :_*))
  }
}
