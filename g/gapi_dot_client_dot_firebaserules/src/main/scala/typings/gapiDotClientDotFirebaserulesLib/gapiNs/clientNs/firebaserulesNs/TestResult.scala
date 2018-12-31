package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

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
  var debugMessages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var state: js.UndefOr[java.lang.String] = js.undefined
}

