package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Clinical issue with action
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DetectedIssue extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'detail'.
    */
  var _detail: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The provider or device that identified the issue
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * Issue Category, e.g. drug-drug, duplicate therapy, etc.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * When identified
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Description and context
    */
  var detail: js.UndefOr[String] = js.undefined
  /**
    * Unique id for the detected issue
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Problem resource
    */
  var implicated: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Step taken to address
    */
  var mitigation: js.UndefOr[js.Array[DetectedIssueMitigation]] = js.undefined
  /**
    * Associated patient
    */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
    * Authority for issue
    */
  var reference: js.UndefOr[uri] = js.undefined
  /**
    * high | moderate | low
    */
  var severity: js.UndefOr[code] = js.undefined
  /**
    * registered | preliminary | final | amended +
    */
  var status: code
}

object DetectedIssue {
  @scala.inline
  def apply(
    status: code,
    _date: Element = null,
    _detail: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _reference: Element = null,
    _resourceType: Element = null,
    _severity: Element = null,
    _status: Element = null,
    author: Reference = null,
    category: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    detail: String = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicated: js.Array[Reference] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    mitigation: js.Array[DetectedIssueMitigation] = null,
    modifierExtension: js.Array[Extension] = null,
    patient: Reference = null,
    reference: uri = null,
    resourceType: code = null,
    severity: code = null,
    text: Narrative = null
  ): DetectedIssue = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_detail != null) __obj.updateDynamic("_detail")(_detail.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_reference != null) __obj.updateDynamic("_reference")(_reference.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_severity != null) __obj.updateDynamic("_severity")(_severity.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicated != null) __obj.updateDynamic("implicated")(implicated.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (mitigation != null) __obj.updateDynamic("mitigation")(mitigation.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedIssue]
  }
}

