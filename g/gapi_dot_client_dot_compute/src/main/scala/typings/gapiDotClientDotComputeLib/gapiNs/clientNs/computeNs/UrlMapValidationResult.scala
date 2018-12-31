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

