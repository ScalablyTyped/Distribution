package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEventContributingFactor
  extends StObject
     with BackboneElement {
  
  /**
    * The item that is suspected to have increased the probability or severity of the adverse event.
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The item that is suspected to have increased the probability or severity of the adverse event.
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}
object AdverseEventContributingFactor {
  
  inline def apply(): AdverseEventContributingFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdverseEventContributingFactor]
  }
  
  extension [Self <: AdverseEventContributingFactor](x: Self) {
    
    inline def setItemCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "itemCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setItemCodeableConceptUndefined: Self = StObject.set(x, "itemCodeableConcept", js.undefined)
    
    inline def setItemReference(value: Reference): Self = StObject.set(x, "itemReference", value.asInstanceOf[js.Any])
    
    inline def setItemReferenceUndefined: Self = StObject.set(x, "itemReference", js.undefined)
  }
}
