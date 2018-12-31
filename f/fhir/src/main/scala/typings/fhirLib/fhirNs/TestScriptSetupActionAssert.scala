package typings
package fhirLib.fhirNs

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
  var compareToSourceExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Id of the source fixture to be evaluated
    */
  var compareToSourceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * XPath or JSONPath expression to evaluate against the source fixture
    */
  var compareToSourcePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * xml | json | ttl | none
    */
  var contentType: js.UndefOr[code] = js.undefined
  /**
    * Tracking/reporting assertion description
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * response | request
    */
  var direction: js.UndefOr[code] = js.undefined
  /**
    * The fluentpath expression to be evaluated
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * HTTP header field name
    */
  var headerField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tracking/logging assertion label
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fixture Id of minimum content resource
    */
  var minimumId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Perform validation on navigation links?
    */
  var navigationLinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains | notContains | eval
    */
  var operator: js.UndefOr[code] = js.undefined
  /**
    * XPath or JSONPath expression
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * delete | get | options | patch | post | put
    */
  var requestMethod: js.UndefOr[code] = js.undefined
  /**
    * Request URL comparison value
    */
  var requestURL: js.UndefOr[java.lang.String] = js.undefined
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
  var responseCode: js.UndefOr[java.lang.String] = js.undefined
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
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Will this assert produce a warning only on error?
    */
  var warningOnly: js.UndefOr[scala.Boolean] = js.undefined
}

