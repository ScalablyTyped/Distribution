package typings.gapiDotClientDotFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  /**
    * Debug messages related to test execution issues encountered during
    * evaluation.
    *
    * Debug messages may be related to too many or too few invocations of
    * function mocks or to runtime errors that occur during evaluation.
    *
    * For example: ```Unable to read variable [name: "resource"]```
    */
  var debugMessages: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Position in the `Source` or `Ruleset` where the principle runtime error
    * occurs.
    *
    * Evaluation of an expression may result in an error. Rules are deny by
    * default, so a `DENY` expectation when an error is generated is valid.
    * When there is a `DENY` with an error, the `SourcePosition` is returned.
    *
    * E.g. `error_position { line: 19 column: 37 }`
    */
  var errorPosition: js.UndefOr[SourcePosition] = js.undefined
  /**
    * The set of function calls made to service-defined methods.
    *
    * Function calls are included in the order in which they are encountered
    * during evaluation, are provided for both mocked and unmocked functions,
    * and included on the response regardless of the test `state`.
    */
  var functionCalls: js.UndefOr[js.Array[FunctionCall]] = js.undefined
  /** State of the test. */
  var state: js.UndefOr[String] = js.undefined
}

object TestResult {
  @scala.inline
  def apply(
    debugMessages: js.Array[String] = null,
    errorPosition: SourcePosition = null,
    functionCalls: js.Array[FunctionCall] = null,
    state: String = null
  ): TestResult = {
    val __obj = js.Dynamic.literal()
    if (debugMessages != null) __obj.updateDynamic("debugMessages")(debugMessages.asInstanceOf[js.Any])
    if (errorPosition != null) __obj.updateDynamic("errorPosition")(errorPosition.asInstanceOf[js.Any])
    if (functionCalls != null) __obj.updateDynamic("functionCalls")(functionCalls.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
}

