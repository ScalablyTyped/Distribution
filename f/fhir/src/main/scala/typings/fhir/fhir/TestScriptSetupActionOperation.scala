package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The setup operation to perform
  */
trait TestScriptSetupActionOperation
  extends StObject
     with BackboneElement {
  
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
  
  inline def apply(): TestScriptSetupActionOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionOperation]
  }
  
  extension [Self <: TestScriptSetupActionOperation](x: Self) {
    
    inline def setAccept(value: code): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setContentType(value: code): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestination(value: integer): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setEncodeRequestUrl(value: Boolean): Self = StObject.set(x, "encodeRequestUrl", value.asInstanceOf[js.Any])
    
    inline def setEncodeRequestUrlUndefined: Self = StObject.set(x, "encodeRequestUrl", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOrigin(value: integer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRequestHeader(value: js.Array[TestScriptSetupActionOperationRequestHeader]): Self = StObject.set(x, "requestHeader", value.asInstanceOf[js.Any])
    
    inline def setRequestHeaderUndefined: Self = StObject.set(x, "requestHeader", js.undefined)
    
    inline def setRequestHeaderVarargs(value: TestScriptSetupActionOperationRequestHeader*): Self = StObject.set(x, "requestHeader", js.Array(value :_*))
    
    inline def setRequestId(value: id): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setResource(value: code): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponseId(value: id): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setSourceId(value: id): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setTargetId(value: id): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_accept(value: Element): Self = StObject.set(x, "_accept", value.asInstanceOf[js.Any])
    
    inline def set_acceptUndefined: Self = StObject.set(x, "_accept", js.undefined)
    
    inline def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    inline def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_destination(value: Element): Self = StObject.set(x, "_destination", value.asInstanceOf[js.Any])
    
    inline def set_destinationUndefined: Self = StObject.set(x, "_destination", js.undefined)
    
    inline def set_encodeRequestUrl(value: Element): Self = StObject.set(x, "_encodeRequestUrl", value.asInstanceOf[js.Any])
    
    inline def set_encodeRequestUrlUndefined: Self = StObject.set(x, "_encodeRequestUrl", js.undefined)
    
    inline def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    inline def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    inline def set_origin(value: Element): Self = StObject.set(x, "_origin", value.asInstanceOf[js.Any])
    
    inline def set_originUndefined: Self = StObject.set(x, "_origin", js.undefined)
    
    inline def set_params(value: Element): Self = StObject.set(x, "_params", value.asInstanceOf[js.Any])
    
    inline def set_paramsUndefined: Self = StObject.set(x, "_params", js.undefined)
    
    inline def set_requestId(value: Element): Self = StObject.set(x, "_requestId", value.asInstanceOf[js.Any])
    
    inline def set_requestIdUndefined: Self = StObject.set(x, "_requestId", js.undefined)
    
    inline def set_resource(value: Element): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    inline def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
    
    inline def set_responseId(value: Element): Self = StObject.set(x, "_responseId", value.asInstanceOf[js.Any])
    
    inline def set_responseIdUndefined: Self = StObject.set(x, "_responseId", js.undefined)
    
    inline def set_sourceId(value: Element): Self = StObject.set(x, "_sourceId", value.asInstanceOf[js.Any])
    
    inline def set_sourceIdUndefined: Self = StObject.set(x, "_sourceId", js.undefined)
    
    inline def set_targetId(value: Element): Self = StObject.set(x, "_targetId", value.asInstanceOf[js.Any])
    
    inline def set_targetIdUndefined: Self = StObject.set(x, "_targetId", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
