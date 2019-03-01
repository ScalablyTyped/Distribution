package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapValidationResult extends js.Object {
  var loadErrors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the reasons. */
  var loadSucceeded: js.UndefOr[scala.Boolean] = js.undefined
  var testFailures: js.UndefOr[js.Array[TestFailure]] = js.undefined
  /** If successfully loaded, this field indicates whether the test passed. If false, 'testFailures's indicate the reason of failure. */
  var testPassed: js.UndefOr[scala.Boolean] = js.undefined
}

object UrlMapValidationResult {
  @scala.inline
  def apply(
    loadErrors: js.Array[java.lang.String] = null,
    loadSucceeded: js.UndefOr[scala.Boolean] = js.undefined,
    testFailures: js.Array[TestFailure] = null,
    testPassed: js.UndefOr[scala.Boolean] = js.undefined
  ): UrlMapValidationResult = {
    val __obj = js.Dynamic.literal()
    if (loadErrors != null) __obj.updateDynamic("loadErrors")(loadErrors)
    if (!js.isUndefined(loadSucceeded)) __obj.updateDynamic("loadSucceeded")(loadSucceeded)
    if (testFailures != null) __obj.updateDynamic("testFailures")(testFailures)
    if (!js.isUndefined(testPassed)) __obj.updateDynamic("testPassed")(testPassed)
    __obj.asInstanceOf[UrlMapValidationResult]
  }
}

