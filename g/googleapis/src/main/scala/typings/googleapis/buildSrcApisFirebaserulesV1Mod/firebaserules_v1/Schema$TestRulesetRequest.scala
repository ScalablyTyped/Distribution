package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirebaseRulesService.TestRuleset.
  */
@js.native
trait Schema$TestRulesetRequest extends js.Object {
  /**
    * Optional `Source` to be checked for correctness.  This field must not be
    * set when the resource name refers to a `Ruleset`.
    */
  var source: js.UndefOr[Schema$Source] = js.native
  /**
    * Inline `TestSuite` to run.
    */
  var testSuite: js.UndefOr[Schema$TestSuite] = js.native
}

object Schema$TestRulesetRequest {
  @scala.inline
  def apply(source: Schema$Source = null, testSuite: Schema$TestSuite = null): Schema$TestRulesetRequest = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (testSuite != null) __obj.updateDynamic("testSuite")(testSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestRulesetRequest]
  }
}

