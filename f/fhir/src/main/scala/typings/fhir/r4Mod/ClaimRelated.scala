package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimRelated
  extends StObject
     with BackboneElement {
  
  /**
    * Reference to a related claim.
    */
  var claim: js.UndefOr[Reference] = js.undefined
  
  /**
    * For example, Property/Casualty insurer claim # or Workers Compensation case # .
    */
  var reference: js.UndefOr[Identifier] = js.undefined
  
  /**
    * For example, prior claim or umbrella.
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
