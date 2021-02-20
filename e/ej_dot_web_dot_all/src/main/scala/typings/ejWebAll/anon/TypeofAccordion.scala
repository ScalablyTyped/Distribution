package typings.ejWebAll.anon

import typings.ejWebAll.ej.Accordion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAccordion extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Accordion = js.native
}
object TypeofAccordion {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Accordion): TypeofAccordion = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAccordion]
  }
  
  @scala.inline
  implicit class TypeofAccordionMutableBuilder[Self <: TypeofAccordion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Accordion): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
