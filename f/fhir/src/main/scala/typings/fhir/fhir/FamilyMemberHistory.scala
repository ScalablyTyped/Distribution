package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about patient's relatives, relevant for patient
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait FamilyMemberHistory extends DomainResource {
  /**
    * Contains extended information for property 'ageString'.
    */
  var _ageString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'bornDate'.
    */
  var _bornDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'bornString'.
    */
  var _bornString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'deceasedBoolean'.
    */
  var _deceasedBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'deceasedDate'.
    */
  var _deceasedDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'deceasedString'.
    */
  var _deceasedString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'estimatedAge'.
    */
  var _estimatedAge: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * (approximate) age
    */
  var ageAge: js.UndefOr[Age] = js.undefined
  /**
    * (approximate) age
    */
  var ageRange: js.UndefOr[Range] = js.undefined
  /**
    * (approximate) age
    */
  var ageString: js.UndefOr[String] = js.undefined
  /**
    * (approximate) date of birth
    */
  var bornDate: js.UndefOr[date] = js.undefined
  /**
    * (approximate) date of birth
    */
  var bornPeriod: js.UndefOr[Period] = js.undefined
  /**
    * (approximate) date of birth
    */
  var bornString: js.UndefOr[String] = js.undefined
  /**
    * Condition that the related person had
    */
  var condition: js.UndefOr[js.Array[FamilyMemberHistoryCondition]] = js.undefined
  /**
    * When history was captured/updated
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Dead? How old/when?
    */
  var deceasedAge: js.UndefOr[Age] = js.undefined
  /**
    * Dead? How old/when?
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Dead? How old/when?
    */
  var deceasedDate: js.UndefOr[date] = js.undefined
  /**
    * Dead? How old/when?
    */
  var deceasedRange: js.UndefOr[Range] = js.undefined
  /**
    * Dead? How old/when?
    */
  var deceasedString: js.UndefOr[String] = js.undefined
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Age is estimated?
    */
  var estimatedAge: js.UndefOr[Boolean] = js.undefined
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  /**
    * External Id(s) for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * The family member described
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The taking of a family member's history did not occur
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  /**
    * subject-unknown | withheld | unable-to-obtain | deferred
    */
  var notDoneReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * General note about related person
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Patient history is about
    */
  var patient: Reference
  /**
    * Why was family member history performed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Why was family member history performed?
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Relationship to the subject
    */
  var relationship: CodeableConcept
  /**
    * partial | completed | entered-in-error | health-unknown
    */
  var status: code
}

object FamilyMemberHistory {
  @scala.inline
  def apply(
    patient: Reference,
    relationship: CodeableConcept,
    status: code,
    _ageString: Element = null,
    _bornDate: Element = null,
    _bornString: Element = null,
    _date: Element = null,
    _deceasedBoolean: Element = null,
    _deceasedDate: Element = null,
    _deceasedString: Element = null,
    _estimatedAge: Element = null,
    _gender: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _name: Element = null,
    _notDone: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    ageAge: Age = null,
    ageRange: Range = null,
    ageString: String = null,
    bornDate: date = null,
    bornPeriod: Period = null,
    bornString: String = null,
    condition: js.Array[FamilyMemberHistoryCondition] = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    deceasedAge: Age = null,
    deceasedBoolean: js.UndefOr[Boolean] = js.undefined,
    deceasedDate: date = null,
    deceasedRange: Range = null,
    deceasedString: String = null,
    definition: js.Array[Reference] = null,
    estimatedAge: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    gender: code = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    notDone: js.UndefOr[Boolean] = js.undefined,
    notDoneReason: CodeableConcept = null,
    note: js.Array[Annotation] = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    resourceType: code = null,
    text: Narrative = null
  ): FamilyMemberHistory = {
    val __obj = js.Dynamic.literal(patient = patient, relationship = relationship, status = status)
    if (_ageString != null) __obj.updateDynamic("_ageString")(_ageString)
    if (_bornDate != null) __obj.updateDynamic("_bornDate")(_bornDate)
    if (_bornString != null) __obj.updateDynamic("_bornString")(_bornString)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_deceasedBoolean != null) __obj.updateDynamic("_deceasedBoolean")(_deceasedBoolean)
    if (_deceasedDate != null) __obj.updateDynamic("_deceasedDate")(_deceasedDate)
    if (_deceasedString != null) __obj.updateDynamic("_deceasedString")(_deceasedString)
    if (_estimatedAge != null) __obj.updateDynamic("_estimatedAge")(_estimatedAge)
    if (_gender != null) __obj.updateDynamic("_gender")(_gender)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_notDone != null) __obj.updateDynamic("_notDone")(_notDone)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (ageAge != null) __obj.updateDynamic("ageAge")(ageAge)
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange)
    if (ageString != null) __obj.updateDynamic("ageString")(ageString)
    if (bornDate != null) __obj.updateDynamic("bornDate")(bornDate)
    if (bornPeriod != null) __obj.updateDynamic("bornPeriod")(bornPeriod)
    if (bornString != null) __obj.updateDynamic("bornString")(bornString)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (deceasedAge != null) __obj.updateDynamic("deceasedAge")(deceasedAge)
    if (!js.isUndefined(deceasedBoolean)) __obj.updateDynamic("deceasedBoolean")(deceasedBoolean)
    if (deceasedDate != null) __obj.updateDynamic("deceasedDate")(deceasedDate)
    if (deceasedRange != null) __obj.updateDynamic("deceasedRange")(deceasedRange)
    if (deceasedString != null) __obj.updateDynamic("deceasedString")(deceasedString)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (!js.isUndefined(estimatedAge)) __obj.updateDynamic("estimatedAge")(estimatedAge)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(notDone)) __obj.updateDynamic("notDone")(notDone)
    if (notDoneReason != null) __obj.updateDynamic("notDoneReason")(notDoneReason)
    if (note != null) __obj.updateDynamic("note")(note)
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[FamilyMemberHistory]
  }
}

