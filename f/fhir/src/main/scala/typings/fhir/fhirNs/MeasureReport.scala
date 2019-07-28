package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of a measure evaluation
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait MeasureReport extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * When the report was generated
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * What data was evaluated to produce the measure score
    */
  var evaluatedResources: js.UndefOr[Reference] = js.undefined
  /**
    * Measure results for each group
    */
  var group: js.UndefOr[js.Array[MeasureReportGroup]] = js.undefined
  /**
    * Additional identifier for the Report
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * What measure was evaluated
    */
  var measure: Reference
  /**
    * What patient the report is for
    */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
    * What period the report covers
    */
  var period: Period
  /**
    * Who is reporting the data
    */
  var reportingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * complete | pending | error
    */
  var status: code
  /**
    * individual | patient-list | summary
    */
  var `type`: code
}

object MeasureReport {
  @scala.inline
  def apply(
    measure: Reference,
    period: Period,
    status: code,
    `type`: code,
    _date: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _type: Element = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    evaluatedResources: Reference = null,
    extension: js.Array[Extension] = null,
    group: js.Array[MeasureReportGroup] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    patient: Reference = null,
    reportingOrganization: Reference = null,
    resourceType: code = null,
    text: Narrative = null
  ): MeasureReport = {
    val __obj = js.Dynamic.literal(measure = measure, period = period, status = status)
    __obj.updateDynamic("type")(`type`)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (evaluatedResources != null) __obj.updateDynamic("evaluatedResources")(evaluatedResources)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (group != null) __obj.updateDynamic("group")(group)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (patient != null) __obj.updateDynamic("patient")(patient)
    if (reportingOrganization != null) __obj.updateDynamic("reportingOrganization")(reportingOrganization)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MeasureReport]
  }
}

