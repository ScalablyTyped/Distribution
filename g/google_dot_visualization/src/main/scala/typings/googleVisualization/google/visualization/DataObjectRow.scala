package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataObjectRow extends StObject {
  
  var c: js.Array[DataObjectCell]
  
  var p: js.UndefOr[js.Any] = js.undefined
}
object DataObjectRow {
  
  inline def apply(c: js.Array[DataObjectCell]): DataObjectRow = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectRow]
  }
  
  extension [Self <: DataObjectRow](x: Self) {
    
    inline def setC(value: js.Array[DataObjectCell]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: DataObjectCell*): Self = StObject.set(x, "c", js.Array(value :_*))
    
    inline def setP(value: js.Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
  }
}
