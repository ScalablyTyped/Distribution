package typings.ejWebAll.anon

import typings.ejWebAll.ej.Rotator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRotator extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Rotator
}
object TypeofRotator {
  
  inline def apply(Locale: Any, fn: Rotator): TypeofRotator = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRotator]
  }
  
  extension [Self <: TypeofRotator](x: Self) {
    
    inline def setFn(value: Rotator): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
