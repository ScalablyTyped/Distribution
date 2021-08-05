package typings.ejWebAll.anon

import typings.ejWebAll.ej.Calculate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCalculate extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Calculate
}
object TypeofCalculate {
  
  inline def apply(Locale: js.Any, fn: Calculate): TypeofCalculate = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalculate]
  }
  
  extension [Self <: TypeofCalculate](x: Self) {
    
    inline def setFn(value: Calculate): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
