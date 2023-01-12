package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEventPreventiveAction
  extends StObject
     with BackboneElement {
  
  /**
    * The action that contributed to avoiding the adverse event.
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The action that contributed to avoiding the adverse event.
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}
object AdverseEventPreventiveAction {
  
  inline def apply(): AdverseEventPreventiveAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdverseEventPreventiveAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdverseEventPreventiveAction] (val x: Self) extends AnyVal {
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
  }
}
