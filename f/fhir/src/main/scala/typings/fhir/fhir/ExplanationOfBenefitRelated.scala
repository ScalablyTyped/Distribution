package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Related Claims which may be revelant to processing this claim
  */
@js.native
trait ExplanationOfBenefitRelated extends BackboneElement {
  
  /**
    * Reference to the related claim
    */
  var claim: js.UndefOr[Reference] = js.native
  
  /**
    * Related file or case reference
    */
  var reference: js.UndefOr[Identifier] = js.native
  
  /**
    * How the reference claim is related
    */
  var relationship: js.UndefOr[CodeableConcept] = js.native
}
object ExplanationOfBenefitRelated {
  
  @scala.inline
  def apply(): ExplanationOfBenefitRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitRelated]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitRelatedMutableBuilder[Self <: ExplanationOfBenefitRelated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaim(value: Reference): Self = StObject.set(x, "claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimUndefined: Self = StObject.set(x, "claim", js.undefined)
    
    @scala.inline
    def setReference(value: Identifier): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    @scala.inline
    def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
  }
}
