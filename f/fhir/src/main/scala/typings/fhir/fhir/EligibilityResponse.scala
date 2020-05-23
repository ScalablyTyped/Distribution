package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EligibilityResponse resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait EligibilityResponse extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'inforce'.
    */
  var _inforce: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.undefined
  /**
    * Processing errors
    */
  var error: js.UndefOr[js.Array[EligibilityResponseError]] = js.undefined
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Coverage inforce indicator
    */
  var inforce: js.UndefOr[Boolean] = js.undefined
  /**
    * Details by insurance coverage
    */
  var insurance: js.UndefOr[js.Array[EligibilityResponseInsurance]] = js.undefined
  /**
    * Insurer issuing the coverage
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Eligibility reference
    */
  var request: js.UndefOr[Reference] = js.undefined
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * Responsible practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}

object EligibilityResponse {
  @scala.inline
  def apply(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _inforce: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    disposition: String = null,
    error: js.Array[EligibilityResponseError] = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    inforce: js.UndefOr[Boolean] = js.undefined,
    insurance: js.Array[EligibilityResponseInsurance] = null,
    insurer: Reference = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    outcome: CodeableConcept = null,
    request: Reference = null,
    requestOrganization: Reference = null,
    requestProvider: Reference = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): EligibilityResponse = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_inforce != null) __obj.updateDynamic("_inforce")(_inforce.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (!js.isUndefined(inforce)) __obj.updateDynamic("inforce")(inforce.get.asInstanceOf[js.Any])
    if (insurance != null) __obj.updateDynamic("insurance")(insurance.asInstanceOf[js.Any])
    if (insurer != null) __obj.updateDynamic("insurer")(insurer.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization.asInstanceOf[js.Any])
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponse]
  }
}

