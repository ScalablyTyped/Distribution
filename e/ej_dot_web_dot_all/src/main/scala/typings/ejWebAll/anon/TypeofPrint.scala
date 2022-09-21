package typings.ejWebAll.anon

import typings.ejWebAll.ej.Print
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPrint extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Print
}
object TypeofPrint {
  
  inline def apply(Locale: Any, fn: Print): TypeofPrint = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPrint]
  }
  
  extension [Self <: TypeofPrint](x: Self) {
    
    inline def setFn(value: Print): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
