package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Legal Agreement
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait Contract extends DomainResource {
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Action stipulated by this Contract
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Rationale for the stiplulated action
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Entity being ascribed responsibility
    */
  var agent: js.UndefOr[js.Array[ContractAgent]] = js.undefined
  /**
    * Effective time
    */
  var applies: js.UndefOr[Period] = js.undefined
  /**
    * Authority under which this Contract has standing
    */
  var authority: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Binding Contract
    */
  var bindingAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Binding Contract
    */
  var bindingReference: js.UndefOr[Reference] = js.undefined
  /**
    * Content derived from the basal information
    */
  var contentDerivative: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Decision by Grantor
    */
  var decisionType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Domain in which this Contract applies
    */
  var domain: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Contract Friendly Language
    */
  var friendly: js.UndefOr[js.Array[ContractFriendly]] = js.undefined
  /**
    * Contract number
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * When this Contract was issued
    */
  var issued: js.UndefOr[dateTime] = js.undefined
  /**
    * Contract Legal Language
    */
  var legal: js.UndefOr[js.Array[ContractLegal]] = js.undefined
  /**
    * Computable Contract Language
    */
  var rule: js.UndefOr[js.Array[ContractRule]] = js.undefined
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Contract Signatory
    */
  var signer: js.UndefOr[js.Array[ContractSigner]] = js.undefined
  /**
    * amended | appended | cancelled | disputed | entered-in-error | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Subtype within the context of type
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Contract Target Entity
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Contract Term List
    */
  var term: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  /**
    * Context of the Contract
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Type or form
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Contract Valued Item List
    */
  var valuedItem: js.UndefOr[js.Array[ContractValuedItem]] = js.undefined
}

object Contract {
  @scala.inline
  def apply(
    _id: Element = null,
    _implicitRules: Element = null,
    _issued: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    action: js.Array[CodeableConcept] = null,
    actionReason: js.Array[CodeableConcept] = null,
    agent: js.Array[ContractAgent] = null,
    applies: Period = null,
    authority: js.Array[Reference] = null,
    bindingAttachment: Attachment = null,
    bindingReference: Reference = null,
    contained: js.Array[Resource] = null,
    contentDerivative: CodeableConcept = null,
    decisionType: CodeableConcept = null,
    domain: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    friendly: js.Array[ContractFriendly] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    issued: dateTime = null,
    language: code = null,
    legal: js.Array[ContractLegal] = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    resourceType: code = null,
    rule: js.Array[ContractRule] = null,
    securityLabel: js.Array[Coding] = null,
    signer: js.Array[ContractSigner] = null,
    status: code = null,
    subType: js.Array[CodeableConcept] = null,
    subject: js.Array[Reference] = null,
    term: js.Array[ContractTerm] = null,
    text: Narrative = null,
    topic: js.Array[Reference] = null,
    `type`: CodeableConcept = null,
    valuedItem: js.Array[ContractValuedItem] = null
  ): Contract = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_issued != null) __obj.updateDynamic("_issued")(_issued)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (action != null) __obj.updateDynamic("action")(action)
    if (actionReason != null) __obj.updateDynamic("actionReason")(actionReason)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (applies != null) __obj.updateDynamic("applies")(applies)
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (bindingAttachment != null) __obj.updateDynamic("bindingAttachment")(bindingAttachment)
    if (bindingReference != null) __obj.updateDynamic("bindingReference")(bindingReference)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (contentDerivative != null) __obj.updateDynamic("contentDerivative")(contentDerivative)
    if (decisionType != null) __obj.updateDynamic("decisionType")(decisionType)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (friendly != null) __obj.updateDynamic("friendly")(friendly)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (issued != null) __obj.updateDynamic("issued")(issued)
    if (language != null) __obj.updateDynamic("language")(language)
    if (legal != null) __obj.updateDynamic("legal")(legal)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel)
    if (signer != null) __obj.updateDynamic("signer")(signer)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subType != null) __obj.updateDynamic("subType")(subType)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (term != null) __obj.updateDynamic("term")(term)
    if (text != null) __obj.updateDynamic("text")(text)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (valuedItem != null) __obj.updateDynamic("valuedItem")(valuedItem)
    __obj.asInstanceOf[Contract]
  }
}

