package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTerm
  extends StObject
     with BackboneElement {
  
  var _issued: js.UndefOr[Element] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Several agents may be associated (i.e. has some responsibility for an activity) with an activity and vice-versa.
    * For example, in cases of actions initiated by one user for other users, or in events that involve more than one user, hardware device, software, or system process. However, only one user may be the initiator/requestor for the event.
    */
  var action: js.UndefOr[js.Array[ContractTermAction]] = js.undefined
  
  /**
    * Relevant time or time-period when this Contract Provision is applicable.
    */
  var applies: js.UndefOr[Period] = js.undefined
  
  /**
    * Contract Term Asset List.
    */
  var asset: js.UndefOr[js.Array[ContractTermAsset]] = js.undefined
  
  /**
    * Nested group of Contract Provisions.
    */
  var group: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  
  /**
    * Unique identifier for this particular Contract Provision.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * When this Contract Provision was issued.
    */
  var issued: js.UndefOr[String] = js.undefined
  
  /**
    * The matter of concern in the context of this provision of the agrement.
    */
  var offer: ContractTermOffer
  
  /**
    * Security labels that protect the handling of information about the term and its elements, which may be specifically identified..
    */
  var securityLabel: js.UndefOr[js.Array[ContractTermSecurityLabel]] = js.undefined
  
  /**
    * A specialized legal clause or condition based on overarching contract type.
    */
  var subType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Statement of a provision in a policy or a contract.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The entity that the term applies to.
    */
  var topicCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The entity that the term applies to.
    */
  var topicReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A legal clause or condition contained within a contract that requires one or both parties to perform a particular requirement by some specified time or prevents one or both parties from performing a particular requirement by some specified time.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ContractTerm {
  
  inline def apply(offer: ContractTermOffer): ContractTerm = {
    val __obj = js.Dynamic.literal(offer = offer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractTerm]
  }
  
  extension [Self <: ContractTerm](x: Self) {
    
    inline def setAction(value: js.Array[ContractTermAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: ContractTermAction*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setApplies(value: Period): Self = StObject.set(x, "applies", value.asInstanceOf[js.Any])
    
    inline def setAppliesUndefined: Self = StObject.set(x, "applies", js.undefined)
    
    inline def setAsset(value: js.Array[ContractTermAsset]): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setAssetVarargs(value: ContractTermAsset*): Self = StObject.set(x, "asset", js.Array(value*))
    
    inline def setGroup(value: js.Array[ContractTerm]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: ContractTerm*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIssued(value: String): Self = StObject.set(x, "issued", value.asInstanceOf[js.Any])
    
    inline def setIssuedUndefined: Self = StObject.set(x, "issued", js.undefined)
    
    inline def setOffer(value: ContractTermOffer): Self = StObject.set(x, "offer", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabel(value: js.Array[ContractTermSecurityLabel]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: ContractTermSecurityLabel*): Self = StObject.set(x, "securityLabel", js.Array(value*))
    
    inline def setSubType(value: CodeableConcept): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeUndefined: Self = StObject.set(x, "subType", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTopicCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "topicCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setTopicCodeableConceptUndefined: Self = StObject.set(x, "topicCodeableConcept", js.undefined)
    
    inline def setTopicReference(value: Reference): Self = StObject.set(x, "topicReference", value.asInstanceOf[js.Any])
    
    inline def setTopicReferenceUndefined: Self = StObject.set(x, "topicReference", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_issued(value: Element): Self = StObject.set(x, "_issued", value.asInstanceOf[js.Any])
    
    inline def set_issuedUndefined: Self = StObject.set(x, "_issued", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
