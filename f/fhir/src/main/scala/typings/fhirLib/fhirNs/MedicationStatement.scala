package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Record of medication being taken by a patient
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait MedicationStatement extends DomainResource {
  /**
    * Contains extended information for property 'dateAsserted'.
    */
  var _dateAsserted: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'taken'.
    */
  var _taken: js.UndefOr[Element] = js.undefined
  /**
    * Fulfils plan, proposal or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Encounter / Episode associated with MedicationStatement
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * When the statement was asserted?
    */
  var dateAsserted: js.UndefOr[dateTime] = js.undefined
  /**
    * Additional supporting information
    */
  var derivedFrom: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Details of how medication is/was taken or should be taken
    */
  var dosage: js.UndefOr[js.Array[Dosage]] = js.undefined
  /**
    * The date/time or interval when the medication was taken
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * The date/time or interval when the medication was taken
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Person or organization that provided the information about the taking of this medication
    */
  var informationSource: js.UndefOr[Reference] = js.undefined
  /**
    * What medication was taken
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What medication was taken
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  /**
    * Further information about the statement
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Reason for why the medication is being/was taken
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * True if asserting medication was not given
    */
  var reasonNotTaken: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Condition or observation that supports why the medication is being/was taken
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * active | completed | entered-in-error | intended | stopped | on-hold
    */
  var status: code
  /**
    * Who is/was taking  the medication
    */
  var subject: Reference
  /**
    * y | n | unk | na
    */
  var taken: code
}

object MedicationStatement {
  @scala.inline
  def apply(
    status: code,
    subject: Reference,
    taken: code,
    _dateAsserted: Element = null,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _taken: Element = null,
    basedOn: js.Array[Reference] = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    dateAsserted: dateTime = null,
    derivedFrom: js.Array[Reference] = null,
    dosage: js.Array[Dosage] = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    informationSource: Reference = null,
    language: code = null,
    medicationCodeableConcept: CodeableConcept = null,
    medicationReference: Reference = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    partOf: js.Array[Reference] = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonNotTaken: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    resourceType: code = null,
    text: Narrative = null
  ): MedicationStatement = {
    val __obj = js.Dynamic.literal(status = status, subject = subject, taken = taken)
    if (_dateAsserted != null) __obj.updateDynamic("_dateAsserted")(_dateAsserted)
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_taken != null) __obj.updateDynamic("_taken")(_taken)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (dateAsserted != null) __obj.updateDynamic("dateAsserted")(dateAsserted)
    if (derivedFrom != null) __obj.updateDynamic("derivedFrom")(derivedFrom)
    if (dosage != null) __obj.updateDynamic("dosage")(dosage)
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime)
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (informationSource != null) __obj.updateDynamic("informationSource")(informationSource)
    if (language != null) __obj.updateDynamic("language")(language)
    if (medicationCodeableConcept != null) __obj.updateDynamic("medicationCodeableConcept")(medicationCodeableConcept)
    if (medicationReference != null) __obj.updateDynamic("medicationReference")(medicationReference)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (partOf != null) __obj.updateDynamic("partOf")(partOf)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    if (reasonNotTaken != null) __obj.updateDynamic("reasonNotTaken")(reasonNotTaken)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MedicationStatement]
  }
}

