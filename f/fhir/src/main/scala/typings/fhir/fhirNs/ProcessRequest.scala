package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to perform some action on or in regards to an existing resource
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait ProcessRequest extends DomainResource {
  /**
    * Contains extended information for property 'action'.
    */
  var _action: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'exclude'.
    */
  var _exclude: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'include'.
    */
  var _include: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'nullify'.
    */
  var _nullify: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * cancel | poll | reprocess | status
    */
  var action: js.UndefOr[code] = js.undefined
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Resource type(s) to exclude
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Resource type(s) to include
    */
  var include: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Items to re-adjudicate
    */
  var item: js.UndefOr[js.Array[ProcessRequestItem]] = js.undefined
  /**
    * Remove history
    */
  var nullify: js.UndefOr[Boolean] = js.undefined
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * Selection period
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * Responsible practitioner
    */
  var provider: js.UndefOr[Reference] = js.undefined
  /**
    * Reference number/string
    */
  var reference: js.UndefOr[String] = js.undefined
  /**
    * Reference to the Request resource
    */
  var request: js.UndefOr[Reference] = js.undefined
  /**
    * Reference to the Response resource
    */
  var response: js.UndefOr[Reference] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Party which is the target of the request
    */
  var target: js.UndefOr[Reference] = js.undefined
}

object ProcessRequest {
  @scala.inline
  def apply(
    _action: Element = null,
    _created: Element = null,
    _exclude: js.Array[Element] = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _include: js.Array[Element] = null,
    _language: Element = null,
    _nullify: Element = null,
    _reference: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    action: code = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    exclude: js.Array[String] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    include: js.Array[String] = null,
    item: js.Array[ProcessRequestItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    nullify: js.UndefOr[Boolean] = js.undefined,
    organization: Reference = null,
    period: Period = null,
    provider: Reference = null,
    reference: String = null,
    request: Reference = null,
    resourceType: code = null,
    response: Reference = null,
    status: code = null,
    target: Reference = null,
    text: Narrative = null
  ): ProcessRequest = {
    val __obj = js.Dynamic.literal()
    if (_action != null) __obj.updateDynamic("_action")(_action)
    if (_created != null) __obj.updateDynamic("_created")(_created)
    if (_exclude != null) __obj.updateDynamic("_exclude")(_exclude)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_include != null) __obj.updateDynamic("_include")(_include)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_nullify != null) __obj.updateDynamic("_nullify")(_nullify)
    if (_reference != null) __obj.updateDynamic("_reference")(_reference)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (action != null) __obj.updateDynamic("action")(action)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (created != null) __obj.updateDynamic("created")(created)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (include != null) __obj.updateDynamic("include")(include)
    if (item != null) __obj.updateDynamic("item")(item)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(nullify)) __obj.updateDynamic("nullify")(nullify)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (period != null) __obj.updateDynamic("period")(period)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    if (request != null) __obj.updateDynamic("request")(request)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (response != null) __obj.updateDynamic("response")(response)
    if (status != null) __obj.updateDynamic("status")(status)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ProcessRequest]
  }
}

