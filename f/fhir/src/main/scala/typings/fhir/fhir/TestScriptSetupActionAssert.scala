package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The assertion to perform
  */
trait TestScriptSetupActionAssert
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'compareToSourceExpression'.
    */
  var _compareToSourceExpression: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'compareToSourceId'.
    */
  var _compareToSourceId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'compareToSourcePath'.
    */
  var _compareToSourcePath: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'direction'.
    */
  var _direction: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'headerField'.
    */
  var _headerField: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'label'.
    */
  var _label: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'minimumId'.
    */
  var _minimumId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'navigationLinks'.
    */
  var _navigationLinks: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'operator'.
    */
  var _operator: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'requestMethod'.
    */
  var _requestMethod: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'requestURL'.
    */
  var _requestURL: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'response'.
    */
  var _response: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'responseCode'.
    */
  var _responseCode: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sourceId'.
    */
  var _sourceId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'validateProfileId'.
    */
  var _validateProfileId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'warningOnly'.
    */
  var _warningOnly: js.UndefOr[Element] = js.undefined
  
  /**
    * The fluentpath expression to evaluate against the source fixture
    */
  var compareToSourceExpression: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the source fixture to be evaluated
    */
  var compareToSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * XPath or JSONPath expression to evaluate against the source fixture
    */
  var compareToSourcePath: js.UndefOr[String] = js.undefined
  
  /**
    * xml | json | ttl | none
    */
  var contentType: js.UndefOr[code] = js.undefined
  
  /**
    * Tracking/reporting assertion description
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * response | request
    */
  var direction: js.UndefOr[code] = js.undefined
  
  /**
    * The fluentpath expression to be evaluated
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP header field name
    */
  var headerField: js.UndefOr[String] = js.undefined
  
  /**
    * Tracking/logging assertion label
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Fixture Id of minimum content resource
    */
  var minimumId: js.UndefOr[String] = js.undefined
  
  /**
    * Perform validation on navigation links?
    */
  var navigationLinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains | notContains | eval
    */
  var operator: js.UndefOr[code] = js.undefined
  
  /**
    * XPath or JSONPath expression
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * delete | get | options | patch | post | put
    */
  var requestMethod: js.UndefOr[code] = js.undefined
  
  /**
    * Request URL comparison value
    */
  var requestURL: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type
    */
  var resource: js.UndefOr[code] = js.undefined
  
  /**
    * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
    */
  var response: js.UndefOr[code] = js.undefined
  
  /**
    * HTTP response code to test
    */
  var responseCode: js.UndefOr[String] = js.undefined
  
  /**
    * The reference to a TestScript.rule
    */
  var rule: js.UndefOr[TestScriptSetupActionAssertRule] = js.undefined
  
  /**
    * The reference to a TestScript.ruleset
    */
  var ruleset: js.UndefOr[TestScriptSetupActionAssertRuleset] = js.undefined
  
  /**
    * Fixture Id of source expression or headerField
    */
  var sourceId: js.UndefOr[id] = js.undefined
  
  /**
    * Profile Id of validation profile reference
    */
  var validateProfileId: js.UndefOr[id] = js.undefined
  
  /**
    * The value to compare to
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Will this assert produce a warning only on error?
    */
  var warningOnly: js.UndefOr[Boolean] = js.undefined
}
object TestScriptSetupActionAssert {
  
  inline def apply(): TestScriptSetupActionAssert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionAssert]
  }
  
  extension [Self <: TestScriptSetupActionAssert](x: Self) {
    
    inline def setCompareToSourceExpression(value: String): Self = StObject.set(x, "compareToSourceExpression", value.asInstanceOf[js.Any])
    
    inline def setCompareToSourceExpressionUndefined: Self = StObject.set(x, "compareToSourceExpression", js.undefined)
    
    inline def setCompareToSourceId(value: String): Self = StObject.set(x, "compareToSourceId", value.asInstanceOf[js.Any])
    
    inline def setCompareToSourceIdUndefined: Self = StObject.set(x, "compareToSourceId", js.undefined)
    
    inline def setCompareToSourcePath(value: String): Self = StObject.set(x, "compareToSourcePath", value.asInstanceOf[js.Any])
    
    inline def setCompareToSourcePathUndefined: Self = StObject.set(x, "compareToSourcePath", js.undefined)
    
    inline def setContentType(value: code): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDirection(value: code): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
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
    
    inline def setOperator(value: code): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRequestMethod(value: code): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
    
    inline def setRequestMethodUndefined: Self = StObject.set(x, "requestMethod", js.undefined)
    
    inline def setRequestURL(value: String): Self = StObject.set(x, "requestURL", value.asInstanceOf[js.Any])
    
    inline def setRequestURLUndefined: Self = StObject.set(x, "requestURL", js.undefined)
    
    inline def setResource(value: code): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponse(value: code): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseCode(value: String): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setRule(value: TestScriptSetupActionAssertRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setRuleset(value: TestScriptSetupActionAssertRuleset): Self = StObject.set(x, "ruleset", value.asInstanceOf[js.Any])
    
    inline def setRulesetUndefined: Self = StObject.set(x, "ruleset", js.undefined)
    
    inline def setSourceId(value: id): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setValidateProfileId(value: id): Self = StObject.set(x, "validateProfileId", value.asInstanceOf[js.Any])
    
    inline def setValidateProfileIdUndefined: Self = StObject.set(x, "validateProfileId", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWarningOnly(value: Boolean): Self = StObject.set(x, "warningOnly", value.asInstanceOf[js.Any])
    
    inline def setWarningOnlyUndefined: Self = StObject.set(x, "warningOnly", js.undefined)
    
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
    
    inline def set_validateProfileId(value: Element): Self = StObject.set(x, "_validateProfileId", value.asInstanceOf[js.Any])
    
    inline def set_validateProfileIdUndefined: Self = StObject.set(x, "_validateProfileId", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
    
    inline def set_warningOnly(value: Element): Self = StObject.set(x, "_warningOnly", value.asInstanceOf[js.Any])
    
    inline def set_warningOnlyUndefined: Self = StObject.set(x, "_warningOnly", js.undefined)
  }
}
