package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ProcessResponse resource
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait ProcessResponse extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Request for additional information
    */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.undefined
  /**
    * Error code
    */
  var error: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Authoring Organization
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * Processing outcome
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Processing comments or additional requirements
    */
  var processNote: js.UndefOr[js.Array[ProcessResponseProcessNote]] = js.undefined
  /**
    * Request reference
    */
  var request: js.UndefOr[Reference] = js.undefined
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * Responsible Practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}

object ProcessResponse {
  @scala.inline
  def apply(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    communicationRequest: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    disposition: String = null,
    error: js.Array[CodeableConcept] = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    outcome: CodeableConcept = null,
    processNote: js.Array[ProcessResponseProcessNote] = null,
    request: Reference = null,
    requestOrganization: Reference = null,
    requestProvider: Reference = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null
  ): ProcessResponse = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (communicationRequest != null) __obj.updateDynamic("communicationRequest")(communicationRequest)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (created != null) __obj.updateDynamic("created")(created)
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    if (error != null) __obj.updateDynamic("error")(error)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (form != null) __obj.updateDynamic("form")(form)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (processNote != null) __obj.updateDynamic("processNote")(processNote)
    if (request != null) __obj.updateDynamic("request")(request)
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization)
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ProcessResponse]
  }
}

