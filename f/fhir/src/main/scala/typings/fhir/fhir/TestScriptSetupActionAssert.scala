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
    if (_compareToSourceExpression != null) __obj.updateDynamic("_compareToSourceExpression")(_compareToSourceExpression)
    if (_compareToSourceId != null) __obj.updateDynamic("_compareToSourceId")(_compareToSourceId)
    if (_compareToSourcePath != null) __obj.updateDynamic("_compareToSourcePath")(_compareToSourcePath)
    if (_contentType != null) __obj.updateDynamic("_contentType")(_contentType)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_direction != null) __obj.updateDynamic("_direction")(_direction)
    if (_expression != null) __obj.updateDynamic("_expression")(_expression)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_headerField != null) __obj.updateDynamic("_headerField")(_headerField)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_label != null) __obj.updateDynamic("_label")(_label)
    if (_minimumId != null) __obj.updateDynamic("_minimumId")(_minimumId)
    if (_navigationLinks != null) __obj.updateDynamic("_navigationLinks")(_navigationLinks)
    if (_operator != null) __obj.updateDynamic("_operator")(_operator)
    if (_path != null) __obj.updateDynamic("_path")(_path)
    if (_requestMethod != null) __obj.updateDynamic("_requestMethod")(_requestMethod)
    if (_requestURL != null) __obj.updateDynamic("_requestURL")(_requestURL)
    if (_resource != null) __obj.updateDynamic("_resource")(_resource)
    if (_response != null) __obj.updateDynamic("_response")(_response)
    if (_responseCode != null) __obj.updateDynamic("_responseCode")(_responseCode)
    if (_sourceId != null) __obj.updateDynamic("_sourceId")(_sourceId)
    if (_validateProfileId != null) __obj.updateDynamic("_validateProfileId")(_validateProfileId)
    if (_value != null) __obj.updateDynamic("_value")(_value)
    if (_warningOnly != null) __obj.updateDynamic("_warningOnly")(_warningOnly)
    if (compareToSourceExpression != null) __obj.updateDynamic("compareToSourceExpression")(compareToSourceExpression)
    if (compareToSourceId != null) __obj.updateDynamic("compareToSourceId")(compareToSourceId)
    if (compareToSourcePath != null) __obj.updateDynamic("compareToSourcePath")(compareToSourcePath)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (description != null) __obj.updateDynamic("description")(description)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (headerField != null) __obj.updateDynamic("headerField")(headerField)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (minimumId != null) __obj.updateDynamic("minimumId")(minimumId)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(navigationLinks)) __obj.updateDynamic("navigationLinks")(navigationLinks)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (path != null) __obj.updateDynamic("path")(path)
    if (requestMethod != null) __obj.updateDynamic("requestMethod")(requestMethod)
    if (requestURL != null) __obj.updateDynamic("requestURL")(requestURL)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (ruleset != null) __obj.updateDynamic("ruleset")(ruleset)
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId)
    if (validateProfileId != null) __obj.updateDynamic("validateProfileId")(validateProfileId)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(warningOnly)) __obj.updateDynamic("warningOnly")(warningOnly)
    __obj.asInstanceOf[TestScriptSetupActionAssert]
  }
}

