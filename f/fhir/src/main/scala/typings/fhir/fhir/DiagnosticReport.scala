package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DiagnosticReport extends DomainResource {
  /**
    * Contains extended information for property 'conclusion'.
    */
  var _conclusion: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * What was requested
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Service category
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Name/Code for this diagnostic report
    */
  var code: CodeableConcept
  /**
    * Codes for the conclusion
    */
  var codedDiagnosis: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Clinical Interpretation of test results
    */
  var conclusion: js.UndefOr[String] = js.undefined
  /**
    * Health care event when test ordered
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Clinically relevant time/time-period for report
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Clinically relevant time/time-period for report
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Business identifier for report
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Key images associated with this report
    */
  var image: js.UndefOr[js.Array[DiagnosticReportImage]] = js.undefined
  /**
    * Reference to full details of imaging associated with the diagnostic report
    */
  var imagingStudy: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * DateTime this version was released
    */
  var issued: js.UndefOr[instant] = js.undefined
  /**
    * Participants in producing the report
    */
  var performer: js.UndefOr[js.Array[DiagnosticReportPerformer]] = js.undefined
  /**
    * Entire report as issued
    */
  var presentedForm: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * Observations - simple, or complex nested groups
    */
  var result: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Specimens this report is based on
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * registered | partial | preliminary | final +
    */
  var status: code
  /**
    * The subject of the report - usually, but not always, the patient
    */
  var subject: js.UndefOr[Reference] = js.undefined
}

object DiagnosticReport {
  @scala.inline
  def apply(
    code: CodeableConcept,
    status: code,
    _conclusion: Element = null,
    _effectiveDateTime: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _issued: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    basedOn: js.Array[Reference] = null,
    category: CodeableConcept = null,
    codedDiagnosis: js.Array[CodeableConcept] = null,
    conclusion: String = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    effectiveDateTime: dateTime = null,
    effectivePeriod: Period = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    image: js.Array[DiagnosticReportImage] = null,
    imagingStudy: js.Array[Reference] = null,
    implicitRules: uri = null,
    issued: instant = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    performer: js.Array[DiagnosticReportPerformer] = null,
    presentedForm: js.Array[Attachment] = null,
    resourceType: code = null,
    result: js.Array[Reference] = null,
    specimen: js.Array[Reference] = null,
    subject: Reference = null,
    text: Narrative = null
  ): DiagnosticReport = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_conclusion != null) __obj.updateDynamic("_conclusion")(_conclusion.asInstanceOf[js.Any])
    if (_effectiveDateTime != null) __obj.updateDynamic("_effectiveDateTime")(_effectiveDateTime.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_issued != null) __obj.updateDynamic("_issued")(_issued.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (codedDiagnosis != null) __obj.updateDynamic("codedDiagnosis")(codedDiagnosis.asInstanceOf[js.Any])
    if (conclusion != null) __obj.updateDynamic("conclusion")(conclusion.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (effectiveDateTime != null) __obj.updateDynamic("effectiveDateTime")(effectiveDateTime.asInstanceOf[js.Any])
    if (effectivePeriod != null) __obj.updateDynamic("effectivePeriod")(effectivePeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imagingStudy != null) __obj.updateDynamic("imagingStudy")(imagingStudy.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (issued != null) __obj.updateDynamic("issued")(issued.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (presentedForm != null) __obj.updateDynamic("presentedForm")(presentedForm.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (specimen != null) __obj.updateDynamic("specimen")(specimen.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReport]
  }
}

