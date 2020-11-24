package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The setup operation to perform
  */
@js.native
trait TestScriptSetupActionOperation extends BackboneElement {
  
  /**
    * Contains extended information for property 'accept'.
    */
  var _accept: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'destination'.
    */
  var _destination: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'encodeRequestUrl'.
    */
  var _encodeRequestUrl: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'label'.
    */
  var _label: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'origin'.
    */
  var _origin: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'params'.
    */
  var _params: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'requestId'.
    */
  var _requestId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'responseId'.
    */
  var _responseId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sourceId'.
    */
  var _sourceId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'targetId'.
    */
  var _targetId: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * xml | json | ttl | none
    */
  var accept: js.UndefOr[code] = js.native
  
  /**
    * xml | json | ttl | none
    */
  var contentType: js.UndefOr[code] = js.native
  
  /**
    * Tracking/reporting operation description
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Server responding to the request
    */
  var destination: js.UndefOr[integer] = js.native
  
  /**
    * Whether or not to send the request url in encoded format
    */
  var encodeRequestUrl: js.UndefOr[Boolean] = js.native
  
  /**
    * Tracking/logging operation label
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Server initiating the request
    */
  var origin: js.UndefOr[integer] = js.native
  
  /**
    * Explicitly defined path parameters
    */
  var params: js.UndefOr[String] = js.native
  
  /**
    * Each operation can have one or more header elements
    */
  var requestHeader: js.UndefOr[js.Array[TestScriptSetupActionOperationRequestHeader]] = js.native
  
  /**
    * Fixture Id of mapped request
    */
  var requestId: js.UndefOr[id] = js.native
  
  /**
    * Resource type
    */
  var resource: js.UndefOr[code] = js.native
  
  /**
    * Fixture Id of mapped response
    */
  var responseId: js.UndefOr[id] = js.native
  
  /**
    * Fixture Id of body for PUT and POST requests
    */
  var sourceId: js.UndefOr[id] = js.native
  
  /**
    * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
    */
  var targetId: js.UndefOr[id] = js.native
  
  /**
    * The operation code type that will be executed
    */
  var `type`: js.UndefOr[Coding] = js.native
  
  /**
    * Request URL
    */
  var url: js.UndefOr[String] = js.native
}
object TestScriptSetupActionOperation {
  
  @scala.inline
  def apply(): TestScriptSetupActionOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionOperation]
  }
  
  @scala.inline
  implicit class TestScriptSetupActionOperationOps[Self <: TestScriptSetupActionOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_accept(value: Element): Self = this.set("_accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_accept: Self = this.set("_accept", js.undefined)
    
    @scala.inline
    def set_contentType(value: Element): Self = this.set("_contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_contentType: Self = this.set("_contentType", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_destination(value: Element): Self = this.set("_destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_destination: Self = this.set("_destination", js.undefined)
    
    @scala.inline
    def set_encodeRequestUrl(value: Element): Self = this.set("_encodeRequestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_encodeRequestUrl: Self = this.set("_encodeRequestUrl", js.undefined)
    
    @scala.inline
    def set_label(value: Element): Self = this.set("_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_label: Self = this.set("_label", js.undefined)
    
    @scala.inline
    def set_origin(value: Element): Self = this.set("_origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_origin: Self = this.set("_origin", js.undefined)
    
    @scala.inline
    def set_params(value: Element): Self = this.set("_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_params: Self = this.set("_params", js.undefined)
    
    @scala.inline
    def set_requestId(value: Element): Self = this.set("_requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_requestId: Self = this.set("_requestId", js.undefined)
    
    @scala.inline
    def set_resource(value: Element): Self = this.set("_resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_resource: Self = this.set("_resource", js.undefined)
    
    @scala.inline
    def set_responseId(value: Element): Self = this.set("_responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_responseId: Self = this.set("_responseId", js.undefined)
    
    @scala.inline
    def set_sourceId(value: Element): Self = this.set("_sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sourceId: Self = this.set("_sourceId", js.undefined)
    
    @scala.inline
    def set_targetId(value: Element): Self = this.set("_targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_targetId: Self = this.set("_targetId", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def setAccept(value: code): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setContentType(value: code): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDestination(value: integer): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setEncodeRequestUrl(value: Boolean): Self = this.set("encodeRequestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeRequestUrl: Self = this.set("encodeRequestUrl", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOrigin(value: integer): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setParams(value: String): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setRequestHeaderVarargs(value: TestScriptSetupActionOperationRequestHeader*): Self = this.set("requestHeader", js.Array(value :_*))
    
    @scala.inline
    def setRequestHeader(value: js.Array[TestScriptSetupActionOperationRequestHeader]): Self = this.set("requestHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeader: Self = this.set("requestHeader", js.undefined)
    
    @scala.inline
    def setRequestId(value: id): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setResource(value: code): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResponseId(value: id): Self = this.set("responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseId: Self = this.set("responseId", js.undefined)
    
    @scala.inline
    def setSourceId(value: id): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceId: Self = this.set("sourceId", js.undefined)
    
    @scala.inline
    def setTargetId(value: id): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
    
    @scala.inline
    def setType(value: Coding): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
