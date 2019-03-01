package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The setup operation to perform
  */
trait TestScriptSetupActionOperation extends BackboneElement {
  /**
    * Contains extended information for property 'accept'.
    */
  var _accept: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'destination'.
    */
  var _destination: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'encodeRequestUrl'.
    */
  var _encodeRequestUrl: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'label'.
    */
  var _label: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'origin'.
    */
  var _origin: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'params'.
    */
  var _params: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'requestId'.
    */
  var _requestId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'responseId'.
    */
  var _responseId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sourceId'.
    */
  var _sourceId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'targetId'.
    */
  var _targetId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * xml | json | ttl | none
    */
  var accept: js.UndefOr[code] = js.undefined
  /**
    * xml | json | ttl | none
    */
  var contentType: js.UndefOr[code] = js.undefined
  /**
    * Tracking/reporting operation description
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Server responding to the request
    */
  var destination: js.UndefOr[integer] = js.undefined
  /**
    * Whether or not to send the request url in encoded format
    */
  var encodeRequestUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Tracking/logging operation label
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Server initiating the request
    */
  var origin: js.UndefOr[integer] = js.undefined
  /**
    * Explicitly defined path parameters
    */
  var params: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Each operation can have one or more header elements
    */
  var requestHeader: js.UndefOr[js.Array[TestScriptSetupActionOperationRequestHeader]] = js.undefined
  /**
    * Fixture Id of mapped request
    */
  var requestId: js.UndefOr[id] = js.undefined
  /**
    * Resource type
    */
  var resource: js.UndefOr[code] = js.undefined
  /**
    * Fixture Id of mapped response
    */
  var responseId: js.UndefOr[id] = js.undefined
  /**
    * Fixture Id of body for PUT and POST requests
    */
  var sourceId: js.UndefOr[id] = js.undefined
  /**
    * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
    */
  var targetId: js.UndefOr[id] = js.undefined
  /**
    * The operation code type that will be executed
    */
  var `type`: js.UndefOr[Coding] = js.undefined
  /**
    * Request URL
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object TestScriptSetupActionOperation {
  @scala.inline
  def apply(
    _accept: Element = null,
    _contentType: Element = null,
    _description: Element = null,
    _destination: Element = null,
    _encodeRequestUrl: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _label: Element = null,
    _origin: Element = null,
    _params: Element = null,
    _requestId: Element = null,
    _resource: Element = null,
    _responseId: Element = null,
    _sourceId: Element = null,
    _targetId: Element = null,
    _url: Element = null,
    accept: code = null,
    contentType: code = null,
    description: java.lang.String = null,
    destination: js.UndefOr[integer] = js.undefined,
    encodeRequestUrl: js.UndefOr[scala.Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    origin: js.UndefOr[integer] = js.undefined,
    params: java.lang.String = null,
    requestHeader: js.Array[TestScriptSetupActionOperationRequestHeader] = null,
    requestId: id = null,
    resource: code = null,
    responseId: id = null,
    sourceId: id = null,
    targetId: id = null,
    `type`: Coding = null,
    url: java.lang.String = null
  ): TestScriptSetupActionOperation = {
    val __obj = js.Dynamic.literal()
    if (_accept != null) __obj.updateDynamic("_accept")(_accept)
    if (_contentType != null) __obj.updateDynamic("_contentType")(_contentType)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_destination != null) __obj.updateDynamic("_destination")(_destination)
    if (_encodeRequestUrl != null) __obj.updateDynamic("_encodeRequestUrl")(_encodeRequestUrl)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_label != null) __obj.updateDynamic("_label")(_label)
    if (_origin != null) __obj.updateDynamic("_origin")(_origin)
    if (_params != null) __obj.updateDynamic("_params")(_params)
    if (_requestId != null) __obj.updateDynamic("_requestId")(_requestId)
    if (_resource != null) __obj.updateDynamic("_resource")(_resource)
    if (_responseId != null) __obj.updateDynamic("_responseId")(_responseId)
    if (_sourceId != null) __obj.updateDynamic("_sourceId")(_sourceId)
    if (_targetId != null) __obj.updateDynamic("_targetId")(_targetId)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(destination)) __obj.updateDynamic("destination")(destination)
    if (!js.isUndefined(encodeRequestUrl)) __obj.updateDynamic("encodeRequestUrl")(encodeRequestUrl)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(origin)) __obj.updateDynamic("origin")(origin)
    if (params != null) __obj.updateDynamic("params")(params)
    if (requestHeader != null) __obj.updateDynamic("requestHeader")(requestHeader)
    if (requestId != null) __obj.updateDynamic("requestId")(requestId)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (responseId != null) __obj.updateDynamic("responseId")(responseId)
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TestScriptSetupActionOperation]
  }
}

