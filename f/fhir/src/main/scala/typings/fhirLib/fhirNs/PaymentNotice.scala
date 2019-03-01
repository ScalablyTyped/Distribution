package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PaymentNotice request
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait PaymentNotice extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'statusDate'.
    */
  var _statusDate: js.UndefOr[Element] = js.undefined
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * Whether payment has been sent or cleared
    */
  var paymentStatus: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.undefined
  /**
    * Request reference
    */
  var request: js.UndefOr[Reference] = js.undefined
  /**
    * Response reference
    */
  var response: js.UndefOr[Reference] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Payment or clearing date
    */
  var statusDate: js.UndefOr[date] = js.undefined
  /**
    * Insurer or Regulatory body
    */
  var target: js.UndefOr[Reference] = js.undefined
}

object PaymentNotice {
  @scala.inline
  def apply(
    _created: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _statusDate: Element = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    organization: Reference = null,
    paymentStatus: CodeableConcept = null,
    provider: Reference = null,
    request: Reference = null,
    resourceType: code = null,
    response: Reference = null,
    status: code = null,
    statusDate: date = null,
    target: Reference = null,
    text: Narrative = null
  ): PaymentNotice = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_statusDate != null) __obj.updateDynamic("_statusDate")(_statusDate)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (created != null) __obj.updateDynamic("created")(created)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (paymentStatus != null) __obj.updateDynamic("paymentStatus")(paymentStatus)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (request != null) __obj.updateDynamic("request")(request)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (response != null) __obj.updateDynamic("response")(response)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusDate != null) __obj.updateDynamic("statusDate")(statusDate)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PaymentNotice]
  }
}

