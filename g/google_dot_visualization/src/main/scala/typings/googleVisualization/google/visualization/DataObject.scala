package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataObject extends StObject {
  
  var cols: js.Array[DataObjectColumn] = js.native
  
  var p: js.Any = js.native
  
  var rows: js.Array[DataObjectRow] = js.native
}
object DataObject {
  
  @scala.inline
  def apply(cols: js.Array[DataObjectColumn], p: js.Any, rows: js.Array[DataObjectRow]): DataObject = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
  
  @scala.inline
  implicit class DataObjectMutableBuilder[Self <: DataObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: js.Array[DataObjectColumn]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsVarargs(value: DataObjectColumn*): Self = StObject.set(x, "cols", js.Array(value :_*))
    
    @scala.inline
    def setP(value: js.Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[DataObjectRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: DataObjectRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
