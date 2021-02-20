package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Party to be paid any benefits payable
  */
@js.native
trait ExplanationOfBenefitPayee extends BackboneElement {
  
  /**
    * Party to receive the payable
    */
  var party: js.UndefOr[Reference] = js.native
  
  /**
    * organization | patient | practitioner | relatedperson
    */
  var resourceType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Type of party: Subscriber, Provider, other
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object ExplanationOfBenefitPayee {
  
  @scala.inline
  def apply(): ExplanationOfBenefitPayee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitPayee]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitPayeeMutableBuilder[Self <: ExplanationOfBenefitPayee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    @scala.inline
    def setResourceType(value: CodeableConcept): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
