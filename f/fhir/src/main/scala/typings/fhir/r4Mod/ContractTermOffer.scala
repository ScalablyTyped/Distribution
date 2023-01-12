package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermOffer
  extends StObject
     with BackboneElement {
  
  var _linkId: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Response to offer text.
    */
  var answer: js.UndefOr[js.Array[ContractTermOfferAnswer]] = js.undefined
  
  /**
    * Type of choice made by accepting party with respect to an offer made by an offeror/ grantee.
    */
  var decision: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * How the decision about a Contract was conveyed.
    */
  var decisionMode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Unique identifier for this particular Contract Provision.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The id of the clause or question text of the offer in the referenced questionnaire/response.
    */
  var linkId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Offer Recipient.
    */
  var party: js.UndefOr[js.Array[ContractTermOfferParty]] = js.undefined
  
  /**
    * Security labels that protects the offer.
    */
  var securityLabelNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Human readable form of this Contract Offer.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The Contract.topic may be an application for or offer of a policy or service (e.g., uri to a consent directive form or a health insurance policy), which becomes the Contract once accepted by both the grantor and grantee.
    * The Contract Resource may function simply as the computable representation of the executed contract, which may be the attached to the Contract Resource as the “binding” or as the “friendly” electronic form.  For example, a Contract Resource may be automatically populated with the values expressed in a related QuestionnaireResponse.
    * However, the Contract Resource may be considered the legally binding contract if it is the only “executed” form of this contract, and includes the signatures as *The Contract Resource may function as the computable representation of an application or offer in a pre-executed Contract if the grantor has not entered any values.  In this case, it is populated with values in a “legal” form of the application or offer or by the values in an associated Questionnaire.  If the grantor has filled in the legal form or the associated Questionnaire Response, then these values are used to populate a pre-executed Contract Resource.
    * If the Contract.topic is considered an application or offer, then the policy is often required to be attached as the “legal” basis for the application to ensure “informed consent” to the contract, and that any discrepancy between the application and the policy are interpreted against the policy.  Implementers should check organizational and jurisdictional policies to determine the relationship among multiple representations of a contract pre- and post-execution.
    */
  var topic: js.UndefOr[Reference] = js.undefined
  
  /**
    * Type of Contract Provision such as specific requirements, purposes for actions, obligations, prohibitions, e.g. life time maximum benefit.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ContractTermOffer {
  
  inline def apply(): ContractTermOffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTermOffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractTermOffer] (val x: Self) extends AnyVal {
    
    inline def setAnswer(value: js.Array[ContractTermOfferAnswer]): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
    
    inline def setAnswerVarargs(value: ContractTermOfferAnswer*): Self = StObject.set(x, "answer", js.Array(value*))
    
    inline def setDecision(value: CodeableConcept): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    inline def setDecisionMode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "decisionMode", value.asInstanceOf[js.Any])
    
    inline def setDecisionModeUndefined: Self = StObject.set(x, "decisionMode", js.undefined)
    
    inline def setDecisionModeVarargs(value: CodeableConcept*): Self = StObject.set(x, "decisionMode", js.Array(value*))
    
    inline def setDecisionUndefined: Self = StObject.set(x, "decision", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLinkId(value: js.Array[String]): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setLinkIdVarargs(value: String*): Self = StObject.set(x, "linkId", js.Array(value*))
    
    inline def setParty(value: js.Array[ContractTermOfferParty]): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setPartyVarargs(value: ContractTermOfferParty*): Self = StObject.set(x, "party", js.Array(value*))
    
    inline def setSecurityLabelNumber(value: js.Array[Double]): Self = StObject.set(x, "securityLabelNumber", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelNumberUndefined: Self = StObject.set(x, "securityLabelNumber", js.undefined)
    
    inline def setSecurityLabelNumberVarargs(value: Double*): Self = StObject.set(x, "securityLabelNumber", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTopic(value: Reference): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_linkId(value: js.Array[Element]): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_linkIdVarargs(value: Element*): Self = StObject.set(x, "_linkId", js.Array(value*))
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
