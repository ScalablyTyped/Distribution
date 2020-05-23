package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about patient's relatives, relevant for patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
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
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_ageString != null) __obj.updateDynamic("_ageString")(_ageString.asInstanceOf[js.Any])
    if (_bornDate != null) __obj.updateDynamic("_bornDate")(_bornDate.asInstanceOf[js.Any])
    if (_bornString != null) __obj.updateDynamic("_bornString")(_bornString.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_deceasedBoolean != null) __obj.updateDynamic("_deceasedBoolean")(_deceasedBoolean.asInstanceOf[js.Any])
    if (_deceasedDate != null) __obj.updateDynamic("_deceasedDate")(_deceasedDate.asInstanceOf[js.Any])
    if (_deceasedString != null) __obj.updateDynamic("_deceasedString")(_deceasedString.asInstanceOf[js.Any])
    if (_estimatedAge != null) __obj.updateDynamic("_estimatedAge")(_estimatedAge.asInstanceOf[js.Any])
    if (_gender != null) __obj.updateDynamic("_gender")(_gender.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_notDone != null) __obj.updateDynamic("_notDone")(_notDone.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (ageAge != null) __obj.updateDynamic("ageAge")(ageAge.asInstanceOf[js.Any])
    if (ageRange != null) __obj.updateDynamic("ageRange")(ageRange.asInstanceOf[js.Any])
    if (ageString != null) __obj.updateDynamic("ageString")(ageString.asInstanceOf[js.Any])
    if (bornDate != null) __obj.updateDynamic("bornDate")(bornDate.asInstanceOf[js.Any])
    if (bornPeriod != null) __obj.updateDynamic("bornPeriod")(bornPeriod.asInstanceOf[js.Any])
    if (bornString != null) __obj.updateDynamic("bornString")(bornString.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (deceasedAge != null) __obj.updateDynamic("deceasedAge")(deceasedAge.asInstanceOf[js.Any])
    if (!js.isUndefined(deceasedBoolean)) __obj.updateDynamic("deceasedBoolean")(deceasedBoolean.get.asInstanceOf[js.Any])
    if (deceasedDate != null) __obj.updateDynamic("deceasedDate")(deceasedDate.asInstanceOf[js.Any])
    if (deceasedRange != null) __obj.updateDynamic("deceasedRange")(deceasedRange.asInstanceOf[js.Any])
    if (deceasedString != null) __obj.updateDynamic("deceasedString")(deceasedString.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (!js.isUndefined(estimatedAge)) __obj.updateDynamic("estimatedAge")(estimatedAge.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(notDone)) __obj.updateDynamic("notDone")(notDone.get.asInstanceOf[js.Any])
    if (notDoneReason != null) __obj.updateDynamic("notDoneReason")(notDoneReason.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistory]
  }
}

