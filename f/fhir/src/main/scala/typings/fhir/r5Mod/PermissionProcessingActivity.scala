package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionProcessingActivity
  extends StObject
     with BackboneElement {
  
  /**
    * If the processing is a transfer, or involves another party, we must capture where it the data allowed or expected to be shared - with a party or person. This can be a party instance or party type
    * § Purpose – a specific purpose of the data.
    */
  var partyCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * If the processing is a transfer, we must capture where it the data allowed or expected to be shared - with a party or person.
    */
  var partyReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The purpose for which the permission is given.
    */
  var purpose: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object PermissionProcessingActivity {
  
  inline def apply(): PermissionProcessingActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionProcessingActivity]
  }
  
  extension [Self <: PermissionProcessingActivity](x: Self) {
    
    inline def setPartyCodeableConcept(value: js.Array[CodeableConcept]): Self = StObject.set(x, "partyCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setPartyCodeableConceptUndefined: Self = StObject.set(x, "partyCodeableConcept", js.undefined)
    
    inline def setPartyCodeableConceptVarargs(value: CodeableConcept*): Self = StObject.set(x, "partyCodeableConcept", js.Array(value*))
    
    inline def setPartyReference(value: js.Array[Reference]): Self = StObject.set(x, "partyReference", value.asInstanceOf[js.Any])
    
    inline def setPartyReferenceUndefined: Self = StObject.set(x, "partyReference", js.undefined)
    
    inline def setPartyReferenceVarargs(value: Reference*): Self = StObject.set(x, "partyReference", js.Array(value*))
    
    inline def setPurpose(value: js.Array[CodeableConcept]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setPurposeVarargs(value: CodeableConcept*): Self = StObject.set(x, "purpose", js.Array(value*))
  }
}
