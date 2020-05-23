package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determine insurance validity and scope of coverage
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
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
    if (_businessArrangement != null) __obj.updateDynamic("_businessArrangement")(_businessArrangement.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_servicedDate != null) __obj.updateDynamic("_servicedDate")(_servicedDate.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (benefitCategory != null) __obj.updateDynamic("benefitCategory")(benefitCategory.asInstanceOf[js.Any])
    if (benefitSubCategory != null) __obj.updateDynamic("benefitSubCategory")(benefitSubCategory.asInstanceOf[js.Any])
    if (businessArrangement != null) __obj.updateDynamic("businessArrangement")(businessArrangement.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (coverage != null) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (enterer != null) __obj.updateDynamic("enterer")(enterer.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (facility != null) __obj.updateDynamic("facility")(facility.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (insurer != null) __obj.updateDynamic("insurer")(insurer.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (servicedDate != null) __obj.updateDynamic("servicedDate")(servicedDate.asInstanceOf[js.Any])
    if (servicedPeriod != null) __obj.updateDynamic("servicedPeriod")(servicedPeriod.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityRequest]
  }
}

