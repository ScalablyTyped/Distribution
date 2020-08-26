package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The assertion to perform
  */
@js.native
trait TestScriptSetupActionAssert extends BackboneElement {
  /**
    * Contains extended information for property 'compareToSourceExpression'.
    */
  var _compareToSourceExpression: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'compareToSourceId'.
    */
  var _compareToSourceId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'compareToSourcePath'.
    */
  var _compareToSourcePath: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'contentType'.
    */
  var _contentType: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'direction'.
    */
  var _direction: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'headerField'.
    */
  var _headerField: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'label'.
    */
  var _label: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'minimumId'.
    */
  var _minimumId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'navigationLinks'.
    */
  var _navigationLinks: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'operator'.
    */
  var _operator: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'requestMethod'.
    */
  var _requestMethod: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'requestURL'.
    */
  var _requestURL: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'resource'.
    */
  var _resource: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'response'.
    */
  var _response: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'responseCode'.
    */
  var _responseCode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sourceId'.
    */
  var _sourceId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'validateProfileId'.
    */
  var _validateProfileId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'warningOnly'.
    */
  var _warningOnly: js.UndefOr[Element] = js.native
  /**
    * The fluentpath expression to evaluate against the source fixture
    */
  var compareToSourceExpression: js.UndefOr[String] = js.native
  /**
    * Id of the source fixture to be evaluated
    */
  var compareToSourceId: js.UndefOr[String] = js.native
  /**
    * XPath or JSONPath expression to evaluate against the source fixture
    */
  var compareToSourcePath: js.UndefOr[String] = js.native
  /**
    * xml | json | ttl | none
    */
  var contentType: js.UndefOr[code] = js.native
  /**
    * Tracking/reporting assertion description
    */
  var description: js.UndefOr[String] = js.native
  /**
    * response | request
    */
  var direction: js.UndefOr[code] = js.native
  /**
    * The fluentpath expression to be evaluated
    */
  var expression: js.UndefOr[String] = js.native
  /**
    * HTTP header field name
    */
  var headerField: js.UndefOr[String] = js.native
  /**
    * Tracking/logging assertion label
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Fixture Id of minimum content resource
    */
  var minimumId: js.UndefOr[String] = js.native
  /**
    * Perform validation on navigation links?
    */
  var navigationLinks: js.UndefOr[Boolean] = js.native
  /**
    * equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains | notContains | eval
    */
  var operator: js.UndefOr[code] = js.native
  /**
    * XPath or JSONPath expression
    */
  var path: js.UndefOr[String] = js.native
  /**
    * delete | get | options | patch | post | put
    */
  var requestMethod: js.UndefOr[code] = js.native
  /**
    * Request URL comparison value
    */
  var requestURL: js.UndefOr[String] = js.native
  /**
    * Resource type
    */
  var resource: js.UndefOr[code] = js.native
  /**
    * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
    */
  var response: js.UndefOr[code] = js.native
  /**
    * HTTP response code to test
    */
  var responseCode: js.UndefOr[String] = js.native
  /**
    * The reference to a TestScript.rule
    */
  var rule: js.UndefOr[TestScriptSetupActionAssertRule] = js.native
  /**
    * The reference to a TestScript.ruleset
    */
  var ruleset: js.UndefOr[TestScriptSetupActionAssertRuleset] = js.native
  /**
    * Fixture Id of source expression or headerField
    */
  var sourceId: js.UndefOr[id] = js.native
  /**
    * Profile Id of validation profile reference
    */
  var validateProfileId: js.UndefOr[id] = js.native
  /**
    * The value to compare to
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Will this assert produce a warning only on error?
    */
  var warningOnly: js.UndefOr[Boolean] = js.native
}

object TestScriptSetupActionAssert {
  @scala.inline
  def apply(): TestScriptSetupActionAssert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptSetupActionAssert]
  }
  @scala.inline
  implicit class TestScriptSetupActionAssertOps[Self <: TestScriptSetupActionAssert] (val x: Self) extends AnyVal {
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
    def set_compareToSourceExpression(value: Element): Self = this.set("_compareToSourceExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_compareToSourceExpression: Self = this.set("_compareToSourceExpression", js.undefined)
    @scala.inline
    def set_compareToSourceId(value: Element): Self = this.set("_compareToSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_compareToSourceId: Self = this.set("_compareToSourceId", js.undefined)
    @scala.inline
    def set_compareToSourcePath(value: Element): Self = this.set("_compareToSourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_compareToSourcePath: Self = this.set("_compareToSourcePath", js.undefined)
    @scala.inline
    def set_contentType(value: Element): Self = this.set("_contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_contentType: Self = this.set("_contentType", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_direction(value: Element): Self = this.set("_direction", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_direction: Self = this.set("_direction", js.undefined)
    @scala.inline
    def set_expression(value: Element): Self = this.set("_expression", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_expression: Self = this.set("_expression", js.undefined)
    @scala.inline
    def set_headerField(value: Element): Self = this.set("_headerField", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_headerField: Self = this.set("_headerField", js.undefined)
    @scala.inline
    def set_label(value: Element): Self = this.set("_label", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_label: Self = this.set("_label", js.undefined)
    @scala.inline
    def set_minimumId(value: Element): Self = this.set("_minimumId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_minimumId: Self = this.set("_minimumId", js.undefined)
    @scala.inline
    def set_navigationLinks(value: Element): Self = this.set("_navigationLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_navigationLinks: Self = this.set("_navigationLinks", js.undefined)
    @scala.inline
    def set_operator(value: Element): Self = this.set("_operator", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_operator: Self = this.set("_operator", js.undefined)
    @scala.inline
    def set_path(value: Element): Self = this.set("_path", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_path: Self = this.set("_path", js.undefined)
    @scala.inline
    def set_requestMethod(value: Element): Self = this.set("_requestMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_requestMethod: Self = this.set("_requestMethod", js.undefined)
    @scala.inline
    def set_requestURL(value: Element): Self = this.set("_requestURL", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_requestURL: Self = this.set("_requestURL", js.undefined)
    @scala.inline
    def set_resource(value: Element): Self = this.set("_resource", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_resource: Self = this.set("_resource", js.undefined)
    @scala.inline
    def set_response(value: Element): Self = this.set("_response", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_response: Self = this.set("_response", js.undefined)
    @scala.inline
    def set_responseCode(value: Element): Self = this.set("_responseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_responseCode: Self = this.set("_responseCode", js.undefined)
    @scala.inline
    def set_sourceId(value: Element): Self = this.set("_sourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sourceId: Self = this.set("_sourceId", js.undefined)
    @scala.inline
    def set_validateProfileId(value: Element): Self = this.set("_validateProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_validateProfileId: Self = this.set("_validateProfileId", js.undefined)
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
    @scala.inline
    def set_warningOnly(value: Element): Self = this.set("_warningOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_warningOnly: Self = this.set("_warningOnly", js.undefined)
    @scala.inline
    def setCompareToSourceExpression(value: String): Self = this.set("compareToSourceExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareToSourceExpression: Self = this.set("compareToSourceExpression", js.undefined)
    @scala.inline
    def setCompareToSourceId(value: String): Self = this.set("compareToSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareToSourceId: Self = this.set("compareToSourceId", js.undefined)
    @scala.inline
    def setCompareToSourcePath(value: String): Self = this.set("compareToSourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareToSourcePath: Self = this.set("compareToSourcePath", js.undefined)
    @scala.inline
    def setContentType(value: code): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDirection(value: code): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setHeaderField(value: String): Self = this.set("headerField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderField: Self = this.set("headerField", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMinimumId(value: String): Self = this.set("minimumId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumId: Self = this.set("minimumId", js.undefined)
    @scala.inline
    def setNavigationLinks(value: Boolean): Self = this.set("navigationLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigationLinks: Self = this.set("navigationLinks", js.undefined)
    @scala.inline
    def setOperator(value: code): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRequestMethod(value: code): Self = this.set("requestMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMethod: Self = this.set("requestMethod", js.undefined)
    @scala.inline
    def setRequestURL(value: String): Self = this.set("requestURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestURL: Self = this.set("requestURL", js.undefined)
    @scala.inline
    def setResource(value: code): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResponse(value: code): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setResponseCode(value: String): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCode: Self = this.set("responseCode", js.undefined)
    @scala.inline
    def setRule(value: TestScriptSetupActionAssertRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    @scala.inline
    def setRuleset(value: TestScriptSetupActionAssertRuleset): Self = this.set("ruleset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleset: Self = this.set("ruleset", js.undefined)
    @scala.inline
    def setSourceId(value: id): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceId: Self = this.set("sourceId", js.undefined)
    @scala.inline
    def setValidateProfileId(value: id): Self = this.set("validateProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateProfileId: Self = this.set("validateProfileId", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWarningOnly(value: Boolean): Self = this.set("warningOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarningOnly: Self = this.set("warningOnly", js.undefined)
  }
  
}

