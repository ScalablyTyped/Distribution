package typings.fhir.r3Mod

import typings.fhir.fhirStrings.json
import typings.fhir.fhirStrings.none
import typings.fhir.fhirStrings.ttl
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
  
  var _requestId: js.UndefOr[Element] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  var _responseId: js.UndefOr[Element] = js.undefined
  
  var _sourceId: js.UndefOr[Element] = js.undefined
  
  var _targetId: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * If this is specified, then test engine shall set the 'Accept' header to the corresponding value.    If 'xml' is specified, then 'Accept' header of 'application/fhir+xml' will be set.  If 'json' is specified, then 'application/fhir+json' will be used.    If you'd like to explicitly set the 'Accept' to some other value then use the 'requestHeader' element.
    */
  var accept: js.UndefOr[xml | json | ttl | none] = js.undefined
  
  /**
    * If this is specified, then test engine shall set the 'Content-Type' header to the corresponding value.    If 'xml' is specified, then 'Content-Type' header of 'application/fhir+xml' will be set.    If 'json' is specified, then 'application/fhir+json' will be used.    If you'd like to explicitly set the 'Content-Type' to some other value then use the 'requestHeader' element.
    */
  var contentType: js.UndefOr[xml | json | ttl | none] = js.undefined
  
  /**
    * This has no impact on the verification itself.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If multiple TestScript.destination elements are defined and operation.destination is undefined, test engine will report an error as it cannot determine what destination to use for the exchange.
    */
  var destination: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
    */
  var encodeRequestUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This has no impact on the verification itself.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * If absent, test engine will send the message.  When present, test engine will not send the request message but will wait for the request message to be sent from this origin server.
    */
  var origin: js.UndefOr[Double] = js.undefined
  
  /**
    * If "url" element is specified, then "targetId", "params", and "resource" elements will be ignored as "url" element will have everything needed for constructing the request url.  If "params" element is specified, then "targetId" element is ignored.  For FHIR operations that require a resource (e.g. "read" and "vread" operations), the "resource" element must be specified when "params" element is specified.  If "url" and "params" elements are absent, then the request url will be constructed from "targetId" fixture if present.  For "read" operation, the resource and id values will be extracted from "targetId" fixture and used to construct the url.  For "vread" and "history" operations, the versionId value will also be used.   Test engines would append whatever is specified for "params" to the URL after the resource type without tampering with the string (beyond encoding the URL for HTTP).  The "params" element does not correspond exactly to "search parameters".  Nor is it the "path".  It corresponds to the part of the URL that comes after the [type] (when "resource" element is specified); e.g. It corresponds to "/[id]/_history/[vid] {?_format=[mime-type]}" in the following operation: GET [base]/[type]/[id]/_history/[vid] {?_format=[mime-type]}  Test engines do have to look for placeholders (${}) and replace the variable placeholders with the variable values at runtime before sending the request.
    */
  var params: js.UndefOr[String] = js.undefined
  
  /**
    * This gives control to test-script writers to set headers explicitly based on test requirements.  It will allow for testing using:  - "If-Modified-Since" and "If-None-Match" headers.  See http://hl7.org/fhir/STU3/http.html#2.1.0.5.1 - "If-Match" header.  See http://hl7.org/fhir/STU3/http.html#2.1.0.11 - Conditional Create using "If-None-Exist".  See http://hl7.org/fhir/STU3/http.html#2.1.0.13.1 - Invalid "Content-Type" header for negative testing. - etc.
    */
  var requestHeader: js.UndefOr[js.Array[TestScriptSetupActionOperationRequestHeader]] = js.undefined
  
  /**
    * If a requestId is supplied, then the resulting request (both headers and body) is mapped to the fixture ID (which may be entirely new and previously undeclared) designated by "requestId".  If requestId is not specified, it is the test engine's responsibility to store the request and use it as the requestId in subsequent assertions when assertion path and/or headerField is specified, direction is equal to request, and the requestId in not specified.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * If "url" element is specified, then "targetId", "params", and "resource" elements will be ignored as "url" element will have everything needed for constructing the request url.  If "params" element is specified, then "targetId" element is ignored. For FHIR operations that require a resource (e.g. "read" and "vread" operations), the "resource" element must be specified when "params" element is specified.  If "url" and "params" elements are absent, then the request url will be constructed from "targetId" fixture if present. For "read" operation, the resource and id values will be extracted from "targetId" fixture and used to construct the url. For "vread" and "history" operations, the versionId value will also be used.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * If a responseId is supplied, and the server responds, then the resulting response (both headers and body) is mapped to the fixture ID (which may be entirely new and previously undeclared) designated by "responseId".  If responseId is not specified, it is the test engine's responsibility to store the response and use it as the responseId in subsequent assertions when assertion path and/or headerField is specified and the responseId is not specified.
    */
  var responseId: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the fixture used as the body of a PUT or POST request.
    */
  var sourceId: js.UndefOr[String] = js.undefined
  
  /**
    * If "url" element is specified, then "targetId", "params", and "resource" elements will be ignored as "url" element will have everything needed for constructing the request url.  If "params" element is specified, then "targetId" element is ignored.  For FHIR operations that require a resource (e.g. "read" and "vread" operations), the "resource" element must be specified when "params" element is specified.  If "url" and "params" elements are absent, then the request url will be constructed from "targetId" fixture if present.  For "read" operation, the resource and id values will be extracted from "targetId" fixture and used to construct the url.  For "vread" and "history" operations, the versionId value will also be used.
    */
  var targetId: js.UndefOr[String] = js.undefined
  
  /**
    * See http://hl7.org/fhir/STU3/http.html for list of server interactions.
    */
  var `type`: js.UndefOr[Coding] = js.undefined
  
  /**
    * Used to set the request URL explicitly.  If "url" element is defined, then "targetId", "resource", and "params" elements will be ignored.  Test engines would use whatever is specified in "url" without tampering with the string (beyond encoding the URL for HTTP).  Test engines do have to look for placeholders (${}) and replace the variable placeholders with the variable values at runtime before sending the request.
    */
  var url: js.UndefOr[String] = js.undefined
}
object TestScriptSetupActionOperation {
  
  inline def apply(): TestScriptSetupActionOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptSetupActionOperation] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: xml | json | ttl | none): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setContentType(value: xml | json | ttl | none): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestination(value: Double): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setEncodeRequestUrl(value: Boolean): Self = StObject.set(x, "encodeRequestUrl", value.asInstanceOf[js.Any])
    
    inline def setEncodeRequestUrlUndefined: Self = StObject.set(x, "encodeRequestUrl", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOrigin(value: Double): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRequestHeader(value: js.Array[TestScriptSetupActionOperationRequestHeader]): Self = StObject.set(x, "requestHeader", value.asInstanceOf[js.Any])
    
    inline def setRequestHeaderUndefined: Self = StObject.set(x, "requestHeader", js.undefined)
    
    inline def setRequestHeaderVarargs(value: TestScriptSetupActionOperationRequestHeader*): Self = StObject.set(x, "requestHeader", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
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
