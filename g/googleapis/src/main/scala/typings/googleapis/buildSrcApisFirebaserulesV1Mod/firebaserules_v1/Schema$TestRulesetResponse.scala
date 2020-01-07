package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirebaseRulesService.TestRuleset.
  */
@js.native
trait Schema$TestRulesetResponse extends js.Object {
  /**
    * Syntactic and semantic `Source` issues of varying severity. Issues of
    * `ERROR` severity will prevent tests from executing.
    */
  var issues: js.UndefOr[js.Array[Schema$Issue]] = js.native
  /**
    * The set of test results given the test cases in the `TestSuite`. The
    * results will appear in the same order as the test cases appear in the
    * `TestSuite`.
    */
  var testResults: js.UndefOr[js.Array[Schema$TestResult]] = js.native
}

object Schema$TestRulesetResponse {
  @scala.inline
  def apply(issues: js.Array[Schema$Issue] = null, testResults: js.Array[Schema$TestResult] = null): Schema$TestRulesetResponse = {
    val __obj = js.Dynamic.literal()
    if (issues != null) __obj.updateDynamic("issues")(issues.asInstanceOf[js.Any])
    if (testResults != null) __obj.updateDynamic("testResults")(testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestRulesetResponse]
  }
}

