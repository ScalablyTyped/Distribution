package typings.ejWebAll.anon

import typings.ejWebAll.ej.SpellCheck
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSpellCheck extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: SpellCheck
}
object TypeofSpellCheck {
  
  inline def apply(Locale: js.Any, fn: SpellCheck): TypeofSpellCheck = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSpellCheck]
  }
  
  extension [Self <: TypeofSpellCheck](x: Self) {
    
    inline def setFn(value: SpellCheck): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
