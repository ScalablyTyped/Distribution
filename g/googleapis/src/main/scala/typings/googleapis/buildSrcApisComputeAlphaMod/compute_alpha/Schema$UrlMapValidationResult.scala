package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message representing the validation result for a UrlMap.
  */
@js.native
trait Schema$UrlMapValidationResult extends js.Object {
  var loadErrors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the given UrlMap can be successfully loaded. If false,
    * &#39;loadErrors&#39; indicates the reasons.
    */
  var loadSucceeded: js.UndefOr[Boolean] = js.native
  var testFailures: js.UndefOr[js.Array[Schema$TestFailure]] = js.native
  /**
    * If successfully loaded, this field indicates whether the test passed. If
    * false, &#39;testFailures&#39;s indicate the reason of failure.
    */
  var testPassed: js.UndefOr[Boolean] = js.native
}

object Schema$UrlMapValidationResult {
  @scala.inline
  def apply(
    loadErrors: js.Array[String] = null,
    loadSucceeded: js.UndefOr[Boolean] = js.undefined,
    testFailures: js.Array[Schema$TestFailure] = null,
    testPassed: js.UndefOr[Boolean] = js.undefined
  ): Schema$UrlMapValidationResult = {
    val __obj = js.Dynamic.literal()
    if (loadErrors != null) __obj.updateDynamic("loadErrors")(loadErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(loadSucceeded)) __obj.updateDynamic("loadSucceeded")(loadSucceeded.asInstanceOf[js.Any])
    if (testFailures != null) __obj.updateDynamic("testFailures")(testFailures.asInstanceOf[js.Any])
    if (!js.isUndefined(testPassed)) __obj.updateDynamic("testPassed")(testPassed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlMapValidationResult]
  }
}

