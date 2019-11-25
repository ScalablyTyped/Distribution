package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to perform some action on or in regards to an existing resource
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ProcessRequest extends DomainResource {
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
    if (_action != null) __obj.updateDynamic("_action")(_action.asInstanceOf[js.Any])
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_exclude != null) __obj.updateDynamic("_exclude")(_exclude.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_include != null) __obj.updateDynamic("_include")(_include.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_nullify != null) __obj.updateDynamic("_nullify")(_nullify.asInstanceOf[js.Any])
    if (_reference != null) __obj.updateDynamic("_reference")(_reference.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(nullify)) __obj.updateDynamic("nullify")(nullify.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRequest]
  }
}

