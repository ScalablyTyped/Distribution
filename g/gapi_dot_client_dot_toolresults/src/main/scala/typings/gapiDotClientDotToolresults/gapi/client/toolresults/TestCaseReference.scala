package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseReference extends js.Object {
  /** The name of the class. */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The name of the test case.
    *
    * Required.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The name of the test suite to which this test case belongs. */
  var testSuiteName: js.UndefOr[String] = js.undefined
}

object TestCaseReference {
  @scala.inline
  def apply(className: String = null, name: String = null, testSuiteName: String = null): TestCaseReference = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (name != null) __obj.updateDynamic("name")(name)
    if (testSuiteName != null) __obj.updateDynamic("testSuiteName")(testSuiteName)
    __obj.asInstanceOf[TestCaseReference]
  }
}

