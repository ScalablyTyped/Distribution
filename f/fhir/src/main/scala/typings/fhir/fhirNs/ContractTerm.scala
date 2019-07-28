package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Term List
  */
trait ContractTerm extends BackboneElement {
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Contract Term Activity
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Purpose for the Contract Term Action
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Contract Term Agent List
    */
  var agent: js.UndefOr[js.Array[ContractTermAgent]] = js.undefined
  /**
    * Contract Term Effective Time
    */
  var applies: js.UndefOr[Period] = js.undefined
  /**
    * Nested Contract Term Group
    */
  var group: js.UndefOr[js.Array[ContractTerm]] = js.undefined
  /**
    * Contract Term Number
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Contract Term Issue Date Time
    */
  var issued: js.UndefOr[dateTime] = js.undefined
  /**
    * Security Labels that define affected terms
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Contract Term Type specific classification
    */
  var subType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Human readable Contract term text
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * Context of the Contract term
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Contract Term Type or Form
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Contract Term Valued Item List
    */
  var valuedItem: js.UndefOr[js.Array[ContractTermValuedItem]] = js.undefined
}

object ContractTerm {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _issued: Element = null,
    _text: Element = null,
    action: js.Array[CodeableConcept] = null,
    actionReason: js.Array[CodeableConcept] = null,
    agent: js.Array[ContractTermAgent] = null,
    applies: Period = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    group: js.Array[ContractTerm] = null,
    id: String = null,
    identifier: Identifier = null,
    issued: dateTime = null,
    modifierExtension: js.Array[Extension] = null,
    securityLabel: js.Array[Coding] = null,
    subType: CodeableConcept = null,
    text: String = null,
    topic: js.Array[Reference] = null,
    `type`: CodeableConcept = null,
    valuedItem: js.Array[ContractTermValuedItem] = null
  ): ContractTerm = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_issued != null) __obj.updateDynamic("_issued")(_issued)
    if (_text != null) __obj.updateDynamic("_text")(_text)
    if (action != null) __obj.updateDynamic("action")(action)
    if (actionReason != null) __obj.updateDynamic("actionReason")(actionReason)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (applies != null) __obj.updateDynamic("applies")(applies)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (group != null) __obj.updateDynamic("group")(group)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (issued != null) __obj.updateDynamic("issued")(issued)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (securityLabel != null) __obj.updateDynamic("securityLabel")(securityLabel)
    if (subType != null) __obj.updateDynamic("subType")(subType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (valuedItem != null) __obj.updateDynamic("valuedItem")(valuedItem)
    __obj.asInstanceOf[ContractTerm]
  }
}

