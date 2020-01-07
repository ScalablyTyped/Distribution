package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Test result message containing the state of the test as well as a
  * description and source position for test failures.
  */
@js.native
trait Schema$TestResult extends js.Object {
  /**
    * Debug messages related to test execution issues encountered during
    * evaluation.  Debug messages may be related to too many or too few
    * invocations of function mocks or to runtime errors that occur during
    * evaluation.  For example: ```Unable to read variable [name:
    * &quot;resource&quot;]```
    */
  var debugMessages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Position in the `Source` or `Ruleset` where the principle runtime error
    * occurs.  Evaluation of an expression may result in an error. Rules are
    * deny by default, so a `DENY` expectation when an error is generated is
    * valid. When there is a `DENY` with an error, the `SourcePosition` is
    * returned.  E.g. `error_position { line: 19 column: 37 }`
    */
  var errorPosition: js.UndefOr[Schema$SourcePosition] = js.native
  /**
    * The set of function calls made to service-defined methods.  Function
    * calls are included in the order in which they are encountered during
    * evaluation, are provided for both mocked and unmocked functions, and
    * included on the response regardless of the test `state`.
    */
  var functionCalls: js.UndefOr[js.Array[Schema$FunctionCall]] = js.native
  /**
    * State of the test.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The set of visited expressions for a given test. This returns positions
    * and evaluation results of all visited expressions.
    */
  var visitedExpressions: js.UndefOr[js.Array[Schema$VisitedExpression]] = js.native
}

object Schema$TestResult {
  @scala.inline
  def apply(
    debugMessages: js.Array[String] = null,
    errorPosition: Schema$SourcePosition = null,
    functionCalls: js.Array[Schema$FunctionCall] = null,
    state: String = null,
    visitedExpressions: js.Array[Schema$VisitedExpression] = null
  ): Schema$TestResult = {
    val __obj = js.Dynamic.literal()
    if (debugMessages != null) __obj.updateDynamic("debugMessages")(debugMessages.asInstanceOf[js.Any])
    if (errorPosition != null) __obj.updateDynamic("errorPosition")(errorPosition.asInstanceOf[js.Any])
    if (functionCalls != null) __obj.updateDynamic("functionCalls")(functionCalls.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (visitedExpressions != null) __obj.updateDynamic("visitedExpressions")(visitedExpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestResult]
  }
}

