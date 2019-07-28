package typings.gapiDotClientDotFirebaserules.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRulesetRequest extends js.Object {
  /**
    * Optional `Source` to be checked for correctness.
    *
    * This field must not be set when the resource name refers to a `Ruleset`.
    */
  var source: js.UndefOr[Source] = js.undefined
  /** Inline `TestSuite` to run. */
  var testSuite: js.UndefOr[TestSuite] = js.undefined
}

object TestRulesetRequest {
  @scala.inline
  def apply(source: Source = null, testSuite: TestSuite = null): TestRulesetRequest = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (testSuite != null) __obj.updateDynamic("testSuite")(testSuite)
    __obj.asInstanceOf[TestRulesetRequest]
  }
}

