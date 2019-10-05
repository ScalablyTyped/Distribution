package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determine insurance validity and scope of coverage
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait EligibilityRequest extends DomainResource {
  /**
    * Contains extended information for property 'businessArrangement'.
    */
  var _businessArrangement: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'servicedDate'.
    */
  var _servicedDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Type of services covered
    */
  var benefitCategory: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Detailed services covered within the type
    */
  var benefitSubCategory: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Business agreement
    */
  var businessArrangement: js.UndefOr[String] = js.undefined
  /**
    * Insurance or medical plan
    */
  var coverage: js.UndefOr[Reference] = js.undefined
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Author
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  /**
    * Servicing Facility
    */
  var facility: js.UndefOr[Reference] = js.undefined
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Target
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
    * Desired processing priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.undefined
  /**
    * Estimated date or dates of Service
    */
  var servicedDate: js.UndefOr[date] = js.undefined
  /**
    * Estimated date or dates of Service
    */
  var servicedPeriod: js.UndefOr[Period] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}

object EligibilityRequest {
  @scala.inline
  def apply(
    _businessArrangement: Element = null,
    _created: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _servicedDate: Element = null,
    _status: Element = null,
    benefitCategory: CodeableConcept = null,
    benefitSubCategory: CodeableConcept = null,
    businessArrangement: String = null,
    contained: js.Array[Resource] = null,
    coverage: Reference = null,
    created: dateTime = null,
    enterer: Reference = null,
    extension: js.Array[Extension] = null,
    facility: Reference = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    insurer: Reference = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    patient: Reference = null,
    priority: CodeableConcept = null,
    provider: Reference = null,
    resourceType: code = null,
    servicedDate: date = null,
    servicedPeriod: Period = null,
    status: code = null,
    text: Narrative = null
  ): EligibilityRequest = {
    val __obj = js.Dynamic.literal()
    if (_businessArrangement != null) __obj.updateDynamic("_businessArrangement")(_businessArrangement)
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_servicedDate != null) __obj.updateDynamic("_servicedDate")(_servicedDate)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (benefitCategory != null) __obj.updateDynamic("benefitCategory")(benefitCategory)
    if (benefitSubCategory != null) __obj.updateDynamic("benefitSubCategory")(benefitSubCategory)
    if (businessArrangement != null) __obj.updateDynamic("businessArrangement")(businessArrangement)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (coverage != null) __obj.updateDynamic("coverage")(coverage)
    if (created != null) __obj.updateDynamic("created")(created)
    if (enterer != null) __obj.updateDynamic("enterer")(enterer)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (facility != null) __obj.updateDynamic("facility")(facility)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (insurer != null) __obj.updateDynamic("insurer")(insurer)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (patient != null) __obj.updateDynamic("patient")(patient)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (servicedDate != null) __obj.updateDynamic("servicedDate")(servicedDate)
    if (servicedPeriod != null) __obj.updateDynamic("servicedPeriod")(servicedPeriod)
    if (status != null) __obj.updateDynamic("status")(status)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[EligibilityRequest]
  }
}

