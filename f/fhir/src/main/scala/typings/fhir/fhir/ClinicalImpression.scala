package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A clinical assessment performed when planning treatments and management strategies for a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ClinicalImpression extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'protocol'.
    */
  var _protocol: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'summary'.
    */
  var _summary: js.UndefOr[Element] = js.undefined
  /**
    * Action taken as part of assessment procedure
    */
  var action: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * The clinician performing the assessment
    */
  var assessor: js.UndefOr[Reference] = js.undefined
  /**
    * Kind of assessment performed
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Encounter or Episode created from
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * When the assessment was documented
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Why/how the assessment was performed
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Time of assessment
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Time of assessment
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Possible or likely findings and diagnoses
    */
  var finding: js.UndefOr[js.Array[ClinicalImpressionFinding]] = js.undefined
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * One or more sets of investigations (signs, symptions, etc.)
    */
  var investigation: js.UndefOr[js.Array[ClinicalImpressionInvestigation]] = js.undefined
  /**
    * Comments made about the ClinicalImpression
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * Reference to last assessment
    */
  var previous: js.UndefOr[Reference] = js.undefined
  /**
    * Relevant impressions of patient state
    */
  var problem: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Estimate of likely outcome
    */
  var prognosisCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * RiskAssessment expressing likely outcome
    */
  var prognosisReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Clinical Protocol followed
    */
  var protocol: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * draft | completed | entered-in-error
    */
  var status: code
  /**
    * Patient or group assessed
    */
  var subject: Reference
  /**
    * Summary of the assessment
    */
  var summary: js.UndefOr[String] = js.undefined
}

object ClinicalImpression {
  @scala.inline
  def apply(
    status: code,
    subject: Reference,
    _date: Element = null,
    _description: Element = null,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _protocol: js.Array[Element] = null,
    _resourceType: Element = null,
    _status: Element = null,
    _summary: Element = null,
    action: js.Array[Reference] = null,
    assessor: Reference = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    date: dateTime = null,
    description: String = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
    extension: js.Array[Extension] = null,
    finding: js.Array[ClinicalImpressionFinding] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    investigation: js.Array[ClinicalImpressionInvestigation] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    previous: Reference = null,
    problem: js.Array[Reference] = null,
    prognosisCodeableConcept: js.Array[CodeableConcept] = null,
    prognosisReference: js.Array[Reference] = null,
    protocol: js.Array[uri] = null,
    resourceType: code = null,
    summary: String = null,
    text: Narrative = null
  ): ClinicalImpression = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_protocol != null) __obj.updateDynamic("_protocol")(_protocol.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (_summary != null) __obj.updateDynamic("_summary")(_summary.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (assessor != null) __obj.updateDynamic("assessor")(assessor.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (finding != null) __obj.updateDynamic("finding")(finding.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (investigation != null) __obj.updateDynamic("investigation")(investigation.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (problem != null) __obj.updateDynamic("problem")(problem.asInstanceOf[js.Any])
    if (prognosisCodeableConcept != null) __obj.updateDynamic("prognosisCodeableConcept")(prognosisCodeableConcept.asInstanceOf[js.Any])
    if (prognosisReference != null) __obj.updateDynamic("prognosisReference")(prognosisReference.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpression]
  }
}

