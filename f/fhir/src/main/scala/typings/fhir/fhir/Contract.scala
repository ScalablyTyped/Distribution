package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Legal Agreement
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Contract extends DomainResource {
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
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_issued != null) __obj.updateDynamic("_issued")(_issued.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actionReason != null) __obj.updateDynamic("actionReason")(actionReason.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (applies != null) __obj.updateDynamic("applies")(applies.asInstanceOf[js.Any])
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (bindingAttachment != null) __obj.updateDynamic("bindingAttachment")(bindingAttachment.asInstanceOf[js.Any])
    if (bindingReference != null) __obj.updateDynamic("bindingReference")(bindingReference.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (contentDerivative != null) __obj.updateDynamic("contentDerivative")(contentDerivative.asInstanceOf[js.Any])
    if (decisionType != null) __obj.updateDynamic("decisionType")(decisionType.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (friendly != null) __obj.updateDynamic("friendly")(friendly.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (issued != null) __obj.updateDynamic("issued")(issued.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (legal != null) __obj.updateDynamic("legal")(legal.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel.asInstanceOf[js.Any])
    if (signer != null) __obj.updateDynamic("signer")(signer.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valuedItem != null) __obj.updateDynamic("valuedItem")(valuedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contract]
  }
}

