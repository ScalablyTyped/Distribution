package typings.ejWebAll.anon

import typings.ejWebAll.ej.Spreadsheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSpreadsheet extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Spreadsheet
}
object TypeofSpreadsheet {
  
  inline def apply(Locale: Any, fn: Spreadsheet): TypeofSpreadsheet = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSpreadsheet]
  }
  
  extension [Self <: TypeofSpreadsheet](x: Self) {
    
    inline def setFn(value: Spreadsheet): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
