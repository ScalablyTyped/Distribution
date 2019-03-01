package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Clinical issue with action
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait DetectedIssue extends DomainResource {
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
  var detail: js.UndefOr[java.lang.String] = js.undefined
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
    detail: java.lang.String = null,
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_detail != null) __obj.updateDynamic("_detail")(_detail)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_reference != null) __obj.updateDynamic("_reference")(_reference)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_severity != null) __obj.updateDynamic("_severity")(_severity)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (author != null) __obj.updateDynamic("author")(author)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicated != null) __obj.updateDynamic("implicated")(implicated)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (mitigation != null) __obj.updateDynamic("mitigation")(mitigation)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (patient != null) __obj.updateDynamic("patient")(patient)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DetectedIssue]
  }
}

