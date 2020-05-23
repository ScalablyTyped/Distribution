package typings.fhir.fhir

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
  var description: js.UndefOr[String] = js.undefined
  /**
    * Server responding to the request
    */
  var destination: js.UndefOr[integer] = js.undefined
  /**
    * Whether or not to send the request url in encoded format
    */
  var encodeRequestUrl: js.UndefOr[Boolean] = js.undefined
  /**
    * Tracking/logging operation label
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Server initiating the request
    */
  var origin: js.UndefOr[integer] = js.undefined
  /**
    * Explicitly defined path parameters
    */
  var params: js.UndefOr[String] = js.undefined
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
  var url: js.UndefOr[String] = js.undefined
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
    description: String = null,
    destination: js.UndefOr[integer] = js.undefined,
    encodeRequestUrl: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    label: String = null,
    modifierExtension: js.Array[Extension] = null,
    origin: js.UndefOr[integer] = js.undefined,
    params: String = null,
    requestHeader: js.Array[TestScriptSetupActionOperationRequestHeader] = null,
    requestId: id = null,
    resource: code = null,
    responseId: id = null,
    sourceId: id = null,
    targetId: id = null,
    `type`: Coding = null,
    url: String = null
  ): TestScriptSetupActionOperation = {
    val __obj = js.Dynamic.literal()
    if (_accept != null) __obj.updateDynamic("_accept")(_accept.asInstanceOf[js.Any])
    if (_contentType != null) __obj.updateDynamic("_contentType")(_contentType.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_destination != null) __obj.updateDynamic("_destination")(_destination.asInstanceOf[js.Any])
    if (_encodeRequestUrl != null) __obj.updateDynamic("_encodeRequestUrl")(_encodeRequestUrl.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_label != null) __obj.updateDynamic("_label")(_label.asInstanceOf[js.Any])
    if (_origin != null) __obj.updateDynamic("_origin")(_origin.asInstanceOf[js.Any])
    if (_params != null) __obj.updateDynamic("_params")(_params.asInstanceOf[js.Any])
    if (_requestId != null) __obj.updateDynamic("_requestId")(_requestId.asInstanceOf[js.Any])
    if (_resource != null) __obj.updateDynamic("_resource")(_resource.asInstanceOf[js.Any])
    if (_responseId != null) __obj.updateDynamic("_responseId")(_responseId.asInstanceOf[js.Any])
    if (_sourceId != null) __obj.updateDynamic("_sourceId")(_sourceId.asInstanceOf[js.Any])
    if (_targetId != null) __obj.updateDynamic("_targetId")(_targetId.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(destination)) __obj.updateDynamic("destination")(destination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeRequestUrl)) __obj.updateDynamic("encodeRequestUrl")(encodeRequestUrl.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(origin)) __obj.updateDynamic("origin")(origin.get.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (requestHeader != null) __obj.updateDynamic("requestHeader")(requestHeader.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (responseId != null) __obj.updateDynamic("responseId")(responseId.asInstanceOf[js.Any])
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionOperation]
  }
}

