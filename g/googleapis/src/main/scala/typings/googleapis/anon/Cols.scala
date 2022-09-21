package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cols extends StObject {
  
  var cols: js.UndefOr[js.Array[Id]] = js.undefined
  
  var rows: js.UndefOr[js.Array[C]] = js.undefined
}
object Cols {
  
  inline def apply(): Cols = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cols]
  }
  
  extension [Self <: Cols](x: Self) {
    
    inline def setCols(value: js.Array[Id]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setColsVarargs(value: Id*): Self = StObject.set(x, "cols", js.Array(value*))
    
    inline def setRows(value: js.Array[C]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: C*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
