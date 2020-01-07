package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `TestSuite` is a collection of `TestCase` instances that validate the
  * logical correctness of a `Ruleset`. The `TestSuite` may be referenced
  * in-line within a `TestRuleset` invocation or as part of a `Release` object
  * as a pre-release check.
  */
@js.native
trait Schema$TestSuite extends js.Object {
  /**
    * Collection of test cases associated with the `TestSuite`.
    */
  var testCases: js.UndefOr[js.Array[Schema$TestCase]] = js.native
}

object Schema$TestSuite {
  @scala.inline
  def apply(testCases: js.Array[Schema$TestCase] = null): Schema$TestSuite = {
    val __obj = js.Dynamic.literal()
    if (testCases != null) __obj.updateDynamic("testCases")(testCases.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestSuite]
  }
}

