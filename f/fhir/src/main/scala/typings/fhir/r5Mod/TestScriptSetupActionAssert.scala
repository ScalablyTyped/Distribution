package typings.fhir.r5Mod

import typings.fhir.fhirStrings.bad
import typings.fhir.fhirStrings.conflict
import typings.fhir.fhirStrings.contains
import typings.fhir.fhirStrings.created
import typings.fhir.fhirStrings.delete_
import typings.fhir.fhirStrings.empty
import typings.fhir.fhirStrings.equals
import typings.fhir.fhirStrings.eval
import typings.fhir.fhirStrings.forbidden
import typings.fhir.fhirStrings.get_
import typings.fhir.fhirStrings.gone
import typings.fhir.fhirStrings.greaterThan
import typings.fhir.fhirStrings.head_
import typings.fhir.fhirStrings.in
import typings.fhir.fhirStrings.lessThan
import typings.fhir.fhirStrings.methodNotAllowed
import typings.fhir.fhirStrings.noContent
import typings.fhir.fhirStrings.notContains
import typings.fhir.fhirStrings.notEmpty
import typings.fhir.fhirStrings.notEquals
import typings.fhir.fhirStrings.notFound
import typings.fhir.fhirStrings.notIn
import typings.fhir.fhirStrings.notModified
import typings.fhir.fhirStrings.okay
import typings.fhir.fhirStrings.options
import typings.fhir.fhirStrings.patch_
import typings.fhir.fhirStrings.post_
import typings.fhir.fhirStrings.preconditionFailed
import typings.fhir.fhirStrings.put_
import typings.fhir.fhirStrings.request
import typings.fhir.fhirStrings.response
import typings.fhir.fhirStrings.unprocessable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetupActionAssert
  extends StObject
     with BackboneElement {
  
  var _compareToSourceExpression: js.UndefOr[Element] = js.undefined
  
  var _compareToSourceId: js.UndefOr[Element] = js.undefined
  
  var _compareToSourcePath: js.UndefOr[Element] = js.undefined
  
  var _contentType: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _direction: js.UndefOr[Element] = js.undefined
  
  var _expression: js.UndefOr[Element] = js.undefined
  
  var _headerField: js.UndefOr[Element] = js.undefined
  
  var _label: js.UndefOr[Element] = js.undefined
  
  var _minimumId: js.UndefOr[Element] = js.undefined
  
  var _navigationLinks: js.UndefOr[Element] = js.undefined
  
  var _operator: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _requestMethod: js.UndefOr[Element] = js.undefined
  
  var _requestURL: js.UndefOr[Element] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  var _response: js.UndefOr[Element] = js.undefined
  
  var _responseCode: js.UndefOr[Element] = js.undefined
  
  var _sourceId: js.UndefOr[Element] = js.undefined
  
  var _stopTestOnFail: js.UndefOr[Element] = js.undefined
  
  var _validateProfileId: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  var _warningOnly: js.UndefOr[Element] = js.undefined
  
  /**
    * Thefhirpath expression to be evaluated against the expected fixture to compare to. Ignored if "assert.value" is used. The evaluation will be done before the assertion is evaluated.
    */
  var compareToSourceExpression: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the source fixture used as the contents to be evaluated by either the "source/expression" or "sourceId/path" definition.
    */
  var compareToSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The XPath or JSONPath expression to be evaluated against the expected fixture to compare to. Ignored if "assert.value" is used. The evaluation will be done before the assertion is evaluated.
    */
  var compareToSourcePath: js.UndefOr[String] = js.undefined
  
  /**
    * If this is specified, then test engine shall confirm that the content-type of the last operation's headers is set to this value.  If "assert.sourceId" element is specified, then the evaluation will be done against the headers mapped to that sourceId (and not the last operation's headers).  If you'd like to have more control over the string, then use 'assert.headerField' instead.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * This has no impact on the verification itself.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If the direction is specified as "response" (the default), then the processing of this assert is against the received response message. If the direction is specified as "request", then the processing of this assert is against the sent request message.
    */
  var direction: js.UndefOr[response | request] = js.undefined
  
  /**
    * If both "expression" and a "fixtureId" are specified, then the expression will be evaluated against the request or response body mapped to the fixtureId.  If "expression" is specified and a "fixtureId" is not, then the expression will be evaluated against the response body of the last operation.  Test engines are to store the request and response body and headers of the last operation at all times for subsequent assertions.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * If "headerField" is specified then "value" must be specified.  If "sourceId" is not specified, then "headerField" will be evaluated against the last operation's response headers.  Test engines are to keep track of the last operation's response body and response headers.
    */
  var headerField: js.UndefOr[String] = js.undefined
  
  /**
    * This has no impact on the verification itself.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Asserts that the response contains all the element/content in another fixture pointed to by minimumId.  This can be a statically defined fixture or one that is dynamically set via responseId.
    */
  var minimumId: js.UndefOr[String] = js.undefined
  
  /**
    * Asserts that the Bundle contains first, last, and next links.
    */
  var navigationLinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Operators are useful especially for negative testing.  If operator is not specified, then the "equals" operator is assumed; e.g. ```<code>   <assert>  <operator value="in" />  <responseCode value="200,201,204" />    </assert>    <assert>  <operator value="notEquals" />  <response value="okay"/>   </assert>    <assert>  <operator value="greaterThan" />    <responseHeader>     <field value="Content-Length" />     <value value="0" />    </responseHeader/>   </assert> </code> ```.
    */
  var operator: js.UndefOr[
    equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains | notContains | eval
  ] = js.undefined
  
  /**
    * If both "path" and a "fixtureId" are specified, then the path will be evaluated against the request or response body mapped to the fixtureId.  If "path" is specified and a "fixtureId" is not, then the path will be evaluated against the response body of the last operation.  Test engines are to store the request and response body and headers of the last operation at all times for subsequent assertions.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * If "requestMethod" is specified then it will be used in place of "value". The "requestMethod" will evaluate against the last operation's request HTTP operation.
    */
  var requestMethod: js.UndefOr[delete_ | get_ | options | patch_ | post_ | put_ | head_] = js.undefined
  
  /**
    * If "requestURL" is specified then it will be used in place of "value". The "requestURL" will evaluate against the last operation's full request URL path string.
    */
  var requestURL: js.UndefOr[String] = js.undefined
  
  /**
    * This will be expected resource type in response body e.g. in read, vread, search, etc.  See http://build.fhir.org/resourcelist.html for complete list of resource types; e.g. <assert > <resourceType value="Patient" </assert>.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * This is a shorter way of achieving similar verifications via "assert.responseCode".  If you need more control, then use "assert.responseCode"  e.g. <assert>  <contentType value="json" />  <response value="okay"/> </assert>.
    */
  var response: js.UndefOr[
    okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
  ] = js.undefined
  
  /**
    * To be used with "operator" attribute value. Asserts that the response code equals this value if "operator" is not specified.   If the operator is "in" or "notIn" then the responseCode would be a comma-separated list of values e.g. "200,201". Otherwise, it's expected to be a numeric value.   If "fixture" is not specified, then the "responseBodyId" value of the last operation is assumed.
    */
  var responseCode: js.UndefOr[String] = js.undefined
  
  /**
    * This can be a statically defined fixture (at the top of the testscript) or a dynamically set fixture created by responseId of the action.operation element.
    */
  var sourceId: js.UndefOr[String] = js.undefined
  
  /**
    * If this element is specified and it is true, then assertion failures should not stop the current test execution from proceeding.
    */
  var stopTestOnFail: Boolean
  
  /**
    * The ID of a Profile fixture. Asserts that the response is valid according to the Profile specified by validateProfileId.
    */
  var validateProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * The string-representation of a number, string, or boolean that is expected.  Test engines do have to look for placeholders (${}) and replace the variable placeholders with the variable values at runtime before comparing this value to the actual value.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * If this element is specified and it is true, then assertion failures can be logged by test engine but should not stop the test script execution from proceeding.  There are likely cases where the spec is not clear on what should happen. If the spec says something is optional (maybe a response header for example), but a server doesn’t do it, we could choose to issue a warning.
    */
  var warningOnly: Boolean
}
object TestScriptSetupActionAssert {
  
  inline def apply(stopTestOnFail: Boolean, warningOnly: Boolean): TestScriptSetupActionAssert = {
    val __obj = js.Dynamic.literal(stopTestOnFail = stopTestOnFail.asInstanceOf[js.Any], warningOnly = warningOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssert]
  }
  
  extension [Self <: TestScriptSetupActionAssert](x: Self) {
    
    inline def setCompareToSourceExpression(value: String): Self = StObject.set(x, "compareToSourceExpression", value.asInstanceOf[js.Any])
    
    inline def setCompareToSourceExpressionUndefined: Self = StObject.set(x, "compareToSourceExpression", js.undefined)
    
    inline def setCompareToSourceId(value: String): Self = StObject.set(x, "compareToSourceId", value.asInstanceOf[js.Any])
    
    inline def setCompareToSourceIdUndefined: Self = StObject.set(x, "compareToSourceId", js.undefined)
    
    inline def setCompareToSourcePath(value: String): Self = StObject.set(x, "compareToSourcePath", value.asInstanceOf[js.Any])
    
    inline def setCompareToSourcePathUndefined: Self = StObject.set(x, "compareToSourcePath", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDirection(value: response | request): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setHeaderField(value: String): Self = StObject.set(x, "headerField", value.asInstanceOf[js.Any])
    
    inline def setHeaderFieldUndefined: Self = StObject.set(x, "headerField", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMinimumId(value: String): Self = StObject.set(x, "minimumId", value.asInstanceOf[js.Any])
    
    inline def setMinimumIdUndefined: Self = StObject.set(x, "minimumId", js.undefined)
    
    inline def setNavigationLinks(value: Boolean): Self = StObject.set(x, "navigationLinks", value.asInstanceOf[js.Any])
    
    inline def setNavigationLinksUndefined: Self = StObject.set(x, "navigationLinks", js.undefined)
    
    inline def setOperator(
      value: equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains | notContains | eval
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRequestMethod(value: delete_ | get_ | options | patch_ | post_ | put_ | head_): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    inline def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
    
    inline def setRequestURL(value: String): Self = StObject.set(x, "requestURL", value.asInstanceOf[js.Any])
    
    inline def setRequestURLUndefined: Self = StObject.set(x, "requestURL", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponse(
      value: okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseCode(value: String): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setStopTestOnFail(value: Boolean): Self = StObject.set(x, "stopTestOnFail", value.asInstanceOf[js.Any])
    
    inline def setValidateProfileId(value: String): Self = StObject.set(x, "validateProfileId", value.asInstanceOf[js.Any])
    
    inline def setValidateProfileIdUndefined: Self = StObject.set(x, "validateProfileId", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWarningOnly(value: Boolean): Self = StObject.set(x, "warningOnly", value.asInstanceOf[js.Any])
    
    inline def set_compareToSourceExpression(value: Element): Self = StObject.set(x, "_compareToSourceExpression", value.asInstanceOf[js.Any])
    
    inline def set_compareToSourceExpressionUndefined: Self = StObject.set(x, "_compareToSourceExpression", js.undefined)
    
    inline def set_compareToSourceId(value: Element): Self = StObject.set(x, "_compareToSourceId", value.asInstanceOf[js.Any])
    
    inline def set_compareToSourceIdUndefined: Self = StObject.set(x, "_compareToSourceId", js.undefined)
    
    inline def set_compareToSourcePath(value: Element): Self = StObject.set(x, "_compareToSourcePath", value.asInstanceOf[js.Any])
    
    inline def set_compareToSourcePathUndefined: Self = StObject.set(x, "_compareToSourcePath", js.undefined)
    
    inline def set_contentType(value: Element): Self = StObject.set(x, "_contentType", value.asInstanceOf[js.Any])
    
    inline def set_contentTypeUndefined: Self = StObject.set(x, "_contentType", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_direction(value: Element): Self = StObject.set(x, "_direction", value.asInstanceOf[js.Any])
    
    inline def set_directionUndefined: Self = StObject.set(x, "_direction", js.undefined)
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_headerField(value: Element): Self = StObject.set(x, "_headerField", value.asInstanceOf[js.Any])
    
    inline def set_headerFieldUndefined: Self = StObject.set(x, "_headerField", js.undefined)
    
    inline def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    inline def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    inline def set_minimumId(value: Element): Self = StObject.set(x, "_minimumId", value.asInstanceOf[js.Any])
    
    inline def set_minimumIdUndefined: Self = StObject.set(x, "_minimumId", js.undefined)
    
    inline def set_navigationLinks(value: Element): Self = StObject.set(x, "_navigationLinks", value.asInstanceOf[js.Any])
    
    inline def set_navigationLinksUndefined: Self = StObject.set(x, "_navigationLinks", js.undefined)
    
    inline def set_operator(value: Element): Self = StObject.set(x, "_operator", value.asInstanceOf[js.Any])
    
    inline def set_operatorUndefined: Self = StObject.set(x, "_operator", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_requestMethod(value: Element): Self = StObject.set(x, "_requestMethod", value.asInstanceOf[js.Any])
    
    inline def set_requestMethodUndefined: Self = StObject.set(x, "_requestMethod", js.undefined)
    
    inline def set_requestURL(value: Element): Self = StObject.set(x, "_requestURL", value.asInstanceOf[js.Any])
    
    inline def set_requestURLUndefined: Self = StObject.set(x, "_requestURL", js.undefined)
    
    inline def set_resource(value: Element): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    inline def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
    
    inline def set_response(value: Element): Self = StObject.set(x, "_response", value.asInstanceOf[js.Any])
    
    inline def set_responseCode(value: Element): Self = StObject.set(x, "_responseCode", value.asInstanceOf[js.Any])
    
    inline def set_responseCodeUndefined: Self = StObject.set(x, "_responseCode", js.undefined)
    
    inline def set_responseUndefined: Self = StObject.set(x, "_response", js.undefined)
    
    inline def set_sourceId(value: Element): Self = StObject.set(x, "_sourceId", value.asInstanceOf[js.Any])
    
    inline def set_sourceIdUndefined: Self = StObject.set(x, "_sourceId", js.undefined)
    
    inline def set_stopTestOnFail(value: Element): Self = StObject.set(x, "_stopTestOnFail", value.asInstanceOf[js.Any])
    
    inline def set_stopTestOnFailUndefined: Self = StObject.set(x, "_stopTestOnFail", js.undefined)
    
    inline def set_validateProfileId(value: Element): Self = StObject.set(x, "_validateProfileId", value.asInstanceOf[js.Any])
    
    inline def set_validateProfileIdUndefined: Self = StObject.set(x, "_validateProfileId", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
    
    inline def set_warningOnly(value: Element): Self = StObject.set(x, "_warningOnly", value.asInstanceOf[js.Any])
    
    inline def set_warningOnlyUndefined: Self = StObject.set(x, "_warningOnly", js.undefined)
  }
}
