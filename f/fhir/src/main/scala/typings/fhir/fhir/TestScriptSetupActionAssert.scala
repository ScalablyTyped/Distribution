package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The assertion to perform
  */
trait TestScriptSetupActionAssert extends BackboneElement {
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
  @scala.inline
  def apply(
    _compareToSourceExpression: Element = null,
    _compareToSourceId: Element = null,
    _compareToSourcePath: Element = null,
    _contentType: Element = null,
    _description: Element = null,
    _direction: Element = null,
    _expression: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _headerField: Element = null,
    _id: Element = null,
    _label: Element = null,
    _minimumId: Element = null,
    _navigationLinks: Element = null,
    _operator: Element = null,
    _path: Element = null,
    _requestMethod: Element = null,
    _requestURL: Element = null,
    _resource: Element = null,
    _response: Element = null,
    _responseCode: Element = null,
    _sourceId: Element = null,
    _validateProfileId: Element = null,
    _value: Element = null,
    _warningOnly: Element = null,
    compareToSourceExpression: String = null,
    compareToSourceId: String = null,
    compareToSourcePath: String = null,
    contentType: code = null,
    description: String = null,
    direction: code = null,
    expression: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    headerField: String = null,
    id: String = null,
    label: String = null,
    minimumId: String = null,
    modifierExtension: js.Array[Extension] = null,
    navigationLinks: js.UndefOr[Boolean] = js.undefined,
    operator: code = null,
    path: String = null,
    requestMethod: code = null,
    requestURL: String = null,
    resource: code = null,
    response: code = null,
    responseCode: String = null,
    rule: TestScriptSetupActionAssertRule = null,
    ruleset: TestScriptSetupActionAssertRuleset = null,
    sourceId: id = null,
    validateProfileId: id = null,
    value: String = null,
    warningOnly: js.UndefOr[Boolean] = js.undefined
  ): TestScriptSetupActionAssert = {
    val __obj = js.Dynamic.literal()
    if (_compareToSourceExpression != null) __obj.updateDynamic("_compareToSourceExpression")(_compareToSourceExpression.asInstanceOf[js.Any])
    if (_compareToSourceId != null) __obj.updateDynamic("_compareToSourceId")(_compareToSourceId.asInstanceOf[js.Any])
    if (_compareToSourcePath != null) __obj.updateDynamic("_compareToSourcePath")(_compareToSourcePath.asInstanceOf[js.Any])
    if (_contentType != null) __obj.updateDynamic("_contentType")(_contentType.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_direction != null) __obj.updateDynamic("_direction")(_direction.asInstanceOf[js.Any])
    if (_expression != null) __obj.updateDynamic("_expression")(_expression.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_headerField != null) __obj.updateDynamic("_headerField")(_headerField.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_label != null) __obj.updateDynamic("_label")(_label.asInstanceOf[js.Any])
    if (_minimumId != null) __obj.updateDynamic("_minimumId")(_minimumId.asInstanceOf[js.Any])
    if (_navigationLinks != null) __obj.updateDynamic("_navigationLinks")(_navigationLinks.asInstanceOf[js.Any])
    if (_operator != null) __obj.updateDynamic("_operator")(_operator.asInstanceOf[js.Any])
    if (_path != null) __obj.updateDynamic("_path")(_path.asInstanceOf[js.Any])
    if (_requestMethod != null) __obj.updateDynamic("_requestMethod")(_requestMethod.asInstanceOf[js.Any])
    if (_requestURL != null) __obj.updateDynamic("_requestURL")(_requestURL.asInstanceOf[js.Any])
    if (_resource != null) __obj.updateDynamic("_resource")(_resource.asInstanceOf[js.Any])
    if (_response != null) __obj.updateDynamic("_response")(_response.asInstanceOf[js.Any])
    if (_responseCode != null) __obj.updateDynamic("_responseCode")(_responseCode.asInstanceOf[js.Any])
    if (_sourceId != null) __obj.updateDynamic("_sourceId")(_sourceId.asInstanceOf[js.Any])
    if (_validateProfileId != null) __obj.updateDynamic("_validateProfileId")(_validateProfileId.asInstanceOf[js.Any])
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    if (_warningOnly != null) __obj.updateDynamic("_warningOnly")(_warningOnly.asInstanceOf[js.Any])
    if (compareToSourceExpression != null) __obj.updateDynamic("compareToSourceExpression")(compareToSourceExpression.asInstanceOf[js.Any])
    if (compareToSourceId != null) __obj.updateDynamic("compareToSourceId")(compareToSourceId.asInstanceOf[js.Any])
    if (compareToSourcePath != null) __obj.updateDynamic("compareToSourcePath")(compareToSourcePath.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (headerField != null) __obj.updateDynamic("headerField")(headerField.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (minimumId != null) __obj.updateDynamic("minimumId")(minimumId.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationLinks)) __obj.updateDynamic("navigationLinks")(navigationLinks.get.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (requestMethod != null) __obj.updateDynamic("requestMethod")(requestMethod.asInstanceOf[js.Any])
    if (requestURL != null) __obj.updateDynamic("requestURL")(requestURL.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (ruleset != null) __obj.updateDynamic("ruleset")(ruleset.asInstanceOf[js.Any])
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId.asInstanceOf[js.Any])
    if (validateProfileId != null) __obj.updateDynamic("validateProfileId")(validateProfileId.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(warningOnly)) __obj.updateDynamic("warningOnly")(warningOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssert]
  }
}

