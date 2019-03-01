package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EligibilityResponse resource
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait EligibilityResponse extends DomainResource {
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
  var disposition: js.UndefOr[java.lang.String] = js.undefined
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
  var inforce: js.UndefOr[scala.Boolean] = js.undefined
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
    disposition: java.lang.String = null,
    error: js.Array[EligibilityResponseError] = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    inforce: js.UndefOr[scala.Boolean] = js.undefined,
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
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_inforce != null) __obj.updateDynamic("_inforce")(_inforce)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (created != null) __obj.updateDynamic("created")(created)
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    if (error != null) __obj.updateDynamic("error")(error)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (form != null) __obj.updateDynamic("form")(form)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (!js.isUndefined(inforce)) __obj.updateDynamic("inforce")(inforce)
    if (insurance != null) __obj.updateDynamic("insurance")(insurance)
    if (insurer != null) __obj.updateDynamic("insurer")(insurer)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (request != null) __obj.updateDynamic("request")(request)
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization)
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (status != null) __obj.updateDynamic("status")(status)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[EligibilityResponse]
  }
}

