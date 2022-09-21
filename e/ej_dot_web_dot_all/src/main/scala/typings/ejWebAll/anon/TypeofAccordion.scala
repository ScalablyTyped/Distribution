package typings.ejWebAll.anon

import typings.ejWebAll.ej.Accordion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAccordion extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Accordion
}
object TypeofAccordion {
  
  inline def apply(Locale: Any, fn: Accordion): TypeofAccordion = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAccordion]
  }
  
  extension [Self <: TypeofAccordion](x: Self) {
    
    inline def setFn(value: Accordion): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
