package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Related Claims which may be revelant to processing this claimn
  */
trait ClaimRelated
  extends StObject
     with BackboneElement {
  
  /**
    * Reference to the related claim
    */
  var claim: js.UndefOr[Reference] = js.undefined
  
  /**
    * Related file or case reference
    */
  var reference: js.UndefOr[Identifier] = js.undefined
  
  /**
    * How the reference claim is related
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
}
object ClaimRelated {
  
  inline def apply(): ClaimRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimRelated]
  }
  
  extension [Self <: ClaimRelated](x: Self) {
    
    inline def setClaim(value: Reference): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    inline def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    inline def setReference(value: Identifier): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
  }
}
