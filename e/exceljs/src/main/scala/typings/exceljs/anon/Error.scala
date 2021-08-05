package typings.exceljs.anon

import typings.exceljs.mod.CellErrorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: CellErrorValue
}
object Error {
  
  inline def apply(error: CellErrorValue): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: CellErrorValue): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
