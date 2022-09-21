package typings.ejWebAll.anon

import typings.ejWebAll.ej.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSignature extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Signature
}
object TypeofSignature {
  
  inline def apply(Locale: Any, fn: Signature): TypeofSignature = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSignature]
  }
  
  extension [Self <: TypeofSignature](x: Self) {
    
    inline def setFn(value: Signature): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
