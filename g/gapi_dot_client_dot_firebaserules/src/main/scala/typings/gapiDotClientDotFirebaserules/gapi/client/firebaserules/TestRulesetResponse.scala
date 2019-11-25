package typings.gapiDotClientDotFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRulesetResponse extends js.Object {
  /**
    * Syntactic and semantic `Source` issues of varying severity. Issues of
    * `ERROR` severity will prevent tests from executing.
    */
  var issues: js.UndefOr[js.Array[Issue]] = js.undefined
  /**
    * The set of test results given the test cases in the `TestSuite`.
    * The results will appear in the same order as the test cases appear in the
    * `TestSuite`.
    */
  var testResults: js.UndefOr[js.Array[TestResult]] = js.undefined
}

object TestRulesetResponse {
  @scala.inline
  def apply(issues: js.Array[Issue] = null, testResults: js.Array[TestResult] = null): TestRulesetResponse = {
    val __obj = js.Dynamic.literal()
    if (issues != null) __obj.updateDynamic("issues")(issues.asInstanceOf[js.Any])
    if (testResults != null) __obj.updateDynamic("testResults")(testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRulesetResponse]
  }
}

