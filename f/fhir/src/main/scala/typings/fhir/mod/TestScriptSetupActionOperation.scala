package typings.fhir.mod

import typings.fhir.fhirStrings.json
import typings.fhir.fhirStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetupActionOperation
  extends StObject
     with BackboneElement {
  
  var _accept: js.UndefOr[Element] = js.undefined
  
  var _contentType: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _encodeRequestUrl: js.UndefOr[Element] = js.undefined
  
  var _label: js.UndefOr[Element] = js.undefined
  
  var _params: js.UndefOr[Element] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  var _responseId: js.UndefOr[Element] = js.undefined
  
  var _sourceId: js.UndefOr[Element] = js.undefined
  
  var _targetId: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * The content-type or mime-type to use for RESTful operation in the 'Accept' header.
    */
  var accept: js.UndefOr[xml | json] = js.undefined
  
  /**
    * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
    */
  var contentType: js.UndefOr[xml | json] = js.undefined
  
  /**
    * The description would be used by test engines for tracking and reporting purposes.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Which server to perform the operation on.
    */
  var destination: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
    */
  var encodeRequestUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The label would be used for tracking/logging purposes by test engines.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Path plus parameters after [type].  Used to set parts of the request URL explicitly.
    */
  var params: js.UndefOr[String] = js.undefined
  
  /**
    * Header elements would be used to set HTTP headers.
    */
  var requestHeader: js.UndefOr[js.Array[TestScriptSetupActionOperationRequestHeader]] = js.undefined
  
  /**
    * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * The fixture id (maybe new) to map to the response.
    */
  var responseId: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the fixture used as the body of a PUT or POST request.
    */
  var sourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests.
    */
  var targetId: js.UndefOr[String] = js.undefined
  
  /**
    * Server interaction or operation type.
    */
  var `type`: js.UndefOr[Coding] = js.undefined
  
  /**
    * Complete request URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object TestScriptSetupActionOperation {
  
  inline def apply(): TestScriptSetupActionOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionOperation]
  }
  
  extension [Self <: TestScriptSetupActionOperation](x: Self) {
    
    inline def setAccept(value: xml | json): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setContentType(value: xml | json): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestination(value: Double): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setEncodeRequestUrl(value: Boolean): Self = StObject.set(x, "encodeRequestUrl", value.asInstanceOf[js.Any])
    
    inline def setEncodeRequestUrlUndefined: Self = StObject.set(x, "encodeRequestUrl", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRequestHeader(value: js.Array[TestScriptSetupActionOperationRequestHeader]): Self = StObject.set(x, "requestHeader", value.asInstanceOf[js.Any])
    
    inline def setRequestHeaderUndefined: Self = StObject.set(x, "requestHeader", js.undefined)
    
    inline def setRequestHeaderVarargs(value: TestScriptSetupActionOperationRequestHeader*): Self = StObject.set(x, "requestHeader", js.Array(value*))
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
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
    
    inline def set_encodeRequestUrl(value: Element): Self = StObject.set(x, "_encodeRequestUrl", value.asInstanceOf[js.Any])
    
    inline def set_encodeRequestUrlUndefined: Self = StObject.set(x, "_encodeRequestUrl", js.undefined)
    
    inline def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    inline def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    inline def set_params(value: Element): Self = StObject.set(x, "_params", value.asInstanceOf[js.Any])
    
    inline def set_paramsUndefined: Self = StObject.set(x, "_params", js.undefined)
    
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
