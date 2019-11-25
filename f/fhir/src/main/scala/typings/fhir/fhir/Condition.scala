package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information about conditions, problems or diagnoses
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Condition extends DomainResource {
  /**
    * Contains extended information for property 'abatementBoolean'.
    */
  var _abatementBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'abatementDateTime'.
    */
  var _abatementDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'abatementString'.
    */
  var _abatementString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'assertedDate'.
    */
  var _assertedDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'clinicalStatus'.
    */
  var _clinicalStatus: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'onsetDateTime'.
    */
  var _onsetDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'verificationStatus'.
    */
  var _verificationStatus: js.UndefOr[Element] = js.undefined
  /**
    * If/when in resolution/remission
    */
  var abatementAge: js.UndefOr[Age] = js.undefined
  /**
    * If/when in resolution/remission
    */
  var abatementBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * If/when in resolution/remission
    */
  var abatementDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * If/when in resolution/remission
    */
  var abatementPeriod: js.UndefOr[Period] = js.undefined
  /**
    * If/when in resolution/remission
    */
  var abatementRange: js.UndefOr[Range] = js.undefined
  /**
    * If/when in resolution/remission
    */
  var abatementString: js.UndefOr[String] = js.undefined
  /**
    * Date record was believed accurate
    */
  var assertedDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Person who asserts this condition
    */
  var asserter: js.UndefOr[Reference] = js.undefined
  /**
    * Anatomical location, if relevant
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * problem-list-item | encounter-diagnosis
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * active | recurrence | inactive | remission | resolved
    */
  var clinicalStatus: js.UndefOr[code] = js.undefined
  /**
    * Identification of the condition, problem or diagnosis
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Encounter or episode when condition first asserted
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Supporting evidence
    */
  var evidence: js.UndefOr[js.Array[ConditionEvidence]] = js.undefined
  /**
    * External Ids for this condition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Additional information about the Condition
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetAge: js.UndefOr[Age] = js.undefined
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  /**
    * Estimated or actual date,  date-time, or age
    */
  var onsetString: js.UndefOr[String] = js.undefined
  /**
    * Subjective severity of condition
    */
  var severity: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Stage/grade, usually assessed formally
    */
  var stage: js.UndefOr[ConditionStage] = js.undefined
  /**
    * Who has the condition?
    */
  var subject: Reference
  /**
    * provisional | differential | confirmed | refuted | entered-in-error | unknown
    */
  var verificationStatus: js.UndefOr[code] = js.undefined
}

object Condition {
  @scala.inline
  def apply(
    subject: Reference,
    _abatementBoolean: Element = null,
    _abatementDateTime: Element = null,
    _abatementString: Element = null,
    _assertedDate: Element = null,
    _clinicalStatus: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _onsetDateTime: Element = null,
    _onsetString: Element = null,
    _resourceType: Element = null,
    _verificationStatus: Element = null,
    abatementAge: Age = null,
    abatementBoolean: js.UndefOr[Boolean] = js.undefined,
    abatementDateTime: dateTime = null,
    abatementPeriod: Period = null,
    abatementRange: Range = null,
    abatementString: String = null,
    assertedDate: dateTime = null,
    asserter: Reference = null,
    bodySite: js.Array[CodeableConcept] = null,
    category: js.Array[CodeableConcept] = null,
    clinicalStatus: code = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    evidence: js.Array[ConditionEvidence] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    onsetAge: Age = null,
    onsetDateTime: dateTime = null,
    onsetPeriod: Period = null,
    onsetRange: Range = null,
    onsetString: String = null,
    resourceType: code = null,
    severity: CodeableConcept = null,
    stage: ConditionStage = null,
    text: Narrative = null,
    verificationStatus: code = null
  ): Condition = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    if (_abatementBoolean != null) __obj.updateDynamic("_abatementBoolean")(_abatementBoolean.asInstanceOf[js.Any])
    if (_abatementDateTime != null) __obj.updateDynamic("_abatementDateTime")(_abatementDateTime.asInstanceOf[js.Any])
    if (_abatementString != null) __obj.updateDynamic("_abatementString")(_abatementString.asInstanceOf[js.Any])
    if (_assertedDate != null) __obj.updateDynamic("_assertedDate")(_assertedDate.asInstanceOf[js.Any])
    if (_clinicalStatus != null) __obj.updateDynamic("_clinicalStatus")(_clinicalStatus.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_onsetDateTime != null) __obj.updateDynamic("_onsetDateTime")(_onsetDateTime.asInstanceOf[js.Any])
    if (_onsetString != null) __obj.updateDynamic("_onsetString")(_onsetString.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_verificationStatus != null) __obj.updateDynamic("_verificationStatus")(_verificationStatus.asInstanceOf[js.Any])
    if (abatementAge != null) __obj.updateDynamic("abatementAge")(abatementAge.asInstanceOf[js.Any])
    if (!js.isUndefined(abatementBoolean)) __obj.updateDynamic("abatementBoolean")(abatementBoolean.asInstanceOf[js.Any])
    if (abatementDateTime != null) __obj.updateDynamic("abatementDateTime")(abatementDateTime.asInstanceOf[js.Any])
    if (abatementPeriod != null) __obj.updateDynamic("abatementPeriod")(abatementPeriod.asInstanceOf[js.Any])
    if (abatementRange != null) __obj.updateDynamic("abatementRange")(abatementRange.asInstanceOf[js.Any])
    if (abatementString != null) __obj.updateDynamic("abatementString")(abatementString.asInstanceOf[js.Any])
    if (assertedDate != null) __obj.updateDynamic("assertedDate")(assertedDate.asInstanceOf[js.Any])
    if (asserter != null) __obj.updateDynamic("asserter")(asserter.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (clinicalStatus != null) __obj.updateDynamic("clinicalStatus")(clinicalStatus.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (evidence != null) __obj.updateDynamic("evidence")(evidence.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (onsetAge != null) __obj.updateDynamic("onsetAge")(onsetAge.asInstanceOf[js.Any])
    if (onsetDateTime != null) __obj.updateDynamic("onsetDateTime")(onsetDateTime.asInstanceOf[js.Any])
    if (onsetPeriod != null) __obj.updateDynamic("onsetPeriod")(onsetPeriod.asInstanceOf[js.Any])
    if (onsetRange != null) __obj.updateDynamic("onsetRange")(onsetRange.asInstanceOf[js.Any])
    if (onsetString != null) __obj.updateDynamic("onsetString")(onsetString.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

