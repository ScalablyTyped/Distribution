package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataObject extends StObject {
  
  var cols: js.Array[DataObjectColumn]
  
  var p: Any
  
  var rows: js.Array[DataObjectRow]
}
object DataObject {
  
  inline def apply(cols: js.Array[DataObjectColumn], p: Any, rows: js.Array[DataObjectRow]): DataObject = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataObject] (val x: Self) extends AnyVal {
    
    inline def setCols(value: js.Array[DataObjectColumn]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsVarargs(value: DataObjectColumn*): Self = StObject.set(x, "cols", js.Array(value*))
    
    inline def setP(value: Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[DataObjectRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: DataObjectRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
