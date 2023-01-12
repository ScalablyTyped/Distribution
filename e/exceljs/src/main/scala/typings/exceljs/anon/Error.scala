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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setError(value: CellErrorValue): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
