package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allergy or Intolerance (generally: Risk of adverse reaction to a substance)
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait AllergyIntolerance extends DomainResource {
  /**
    * Contains extended information for property 'assertedDate'.
    */
  var _assertedDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'clinicalStatus'.
    */
  var _clinicalStatus: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'criticality'.
    */
  var _criticality: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'lastOccurrence'.
    */
  var _lastOccurrence: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'onsetDateTime'.
    */
  var _onsetDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'verificationStatus'.
    */
  var _verificationStatus: js.UndefOr[Element] = js.undefined
  /**
    * Date record was believed accurate
    */
  var assertedDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Source of the information about the allergy
    */
  var asserter: js.UndefOr[Reference] = js.undefined
  /**
    * food | medication | environment | biologic
    */
  var category: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * active | inactive | resolved
    */
  var clinicalStatus: js.UndefOr[code] = js.undefined
  /**
    * Code that identifies the allergy or intolerance
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * low | high | unable-to-assess
    */
  var criticality: js.UndefOr[code] = js.undefined
  /**
    * External ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Date(/time) of last known occurrence of a reaction
    */
  var lastOccurrence: js.UndefOr[dateTime] = js.undefined
  /**
    * Additional text not captured in other fields
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When allergy or intolerance was identified
    */
  var onsetAge: js.UndefOr[Age] = js.undefined
  /**
    * When allergy or intolerance was identified
    */
  var onsetDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * When allergy or intolerance was identified
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  /**
    * When allergy or intolerance was identified
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  /**
    * When allergy or intolerance was identified
    */
  var onsetString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Who the sensitivity is for
    */
  var patient: Reference
  /**
    * Adverse Reaction Events linked to exposure to substance
    */
  var reaction: js.UndefOr[js.Array[AllergyIntoleranceReaction]] = js.undefined
  /**
    * Who recorded the sensitivity
    */
  var recorder: js.UndefOr[Reference] = js.undefined
  /**
    * allergy | intolerance - Underlying mechanism (if known)
    */
  var `type`: js.UndefOr[code] = js.undefined
  /**
    * unconfirmed | confirmed | refuted | entered-in-error
    */
  var verificationStatus: code
}

object AllergyIntolerance {
  @scala.inline
  def apply(
    patient: Reference,
    verificationStatus: code,
    _assertedDate: Element = null,
    _category: js.Array[Element] = null,
    _clinicalStatus: Element = null,
    _criticality: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _lastOccurrence: Element = null,
    _onsetDateTime: Element = null,
    _onsetString: Element = null,
    _resourceType: Element = null,
    _type: Element = null,
    _verificationStatus: Element = null,
    assertedDate: dateTime = null,
    asserter: Reference = null,
    category: js.Array[code] = null,
    clinicalStatus: code = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    criticality: code = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    lastOccurrence: dateTime = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    onsetAge: Age = null,
    onsetDateTime: dateTime = null,
    onsetPeriod: Period = null,
    onsetRange: Range = null,
    onsetString: java.lang.String = null,
    reaction: js.Array[AllergyIntoleranceReaction] = null,
    recorder: Reference = null,
    resourceType: code = null,
    text: Narrative = null,
    `type`: code = null
  ): AllergyIntolerance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("patient")(patient)
    __obj.updateDynamic("verificationStatus")(verificationStatus)
    if (_assertedDate != null) __obj.updateDynamic("_assertedDate")(_assertedDate)
    if (_category != null) __obj.updateDynamic("_category")(_category)
    if (_clinicalStatus != null) __obj.updateDynamic("_clinicalStatus")(_clinicalStatus)
    if (_criticality != null) __obj.updateDynamic("_criticality")(_criticality)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_lastOccurrence != null) __obj.updateDynamic("_lastOccurrence")(_lastOccurrence)
    if (_onsetDateTime != null) __obj.updateDynamic("_onsetDateTime")(_onsetDateTime)
    if (_onsetString != null) __obj.updateDynamic("_onsetString")(_onsetString)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_verificationStatus != null) __obj.updateDynamic("_verificationStatus")(_verificationStatus)
    if (assertedDate != null) __obj.updateDynamic("assertedDate")(assertedDate)
    if (asserter != null) __obj.updateDynamic("asserter")(asserter)
    if (category != null) __obj.updateDynamic("category")(category)
    if (clinicalStatus != null) __obj.updateDynamic("clinicalStatus")(clinicalStatus)
    if (code != null) __obj.updateDynamic("code")(code)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (criticality != null) __obj.updateDynamic("criticality")(criticality)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lastOccurrence != null) __obj.updateDynamic("lastOccurrence")(lastOccurrence)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (onsetAge != null) __obj.updateDynamic("onsetAge")(onsetAge)
    if (onsetDateTime != null) __obj.updateDynamic("onsetDateTime")(onsetDateTime)
    if (onsetPeriod != null) __obj.updateDynamic("onsetPeriod")(onsetPeriod)
    if (onsetRange != null) __obj.updateDynamic("onsetRange")(onsetRange)
    if (onsetString != null) __obj.updateDynamic("onsetString")(onsetString)
    if (reaction != null) __obj.updateDynamic("reaction")(reaction)
    if (recorder != null) __obj.updateDynamic("recorder")(recorder)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AllergyIntolerance]
  }
}

