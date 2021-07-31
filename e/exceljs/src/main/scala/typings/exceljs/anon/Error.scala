package typings.exceljs.anon

import typings.exceljs.mod.CellErrorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: CellErrorValue
}
object Error {
  
  @scala.inline
  def apply(error: CellErrorValue): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: CellErrorValue): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
