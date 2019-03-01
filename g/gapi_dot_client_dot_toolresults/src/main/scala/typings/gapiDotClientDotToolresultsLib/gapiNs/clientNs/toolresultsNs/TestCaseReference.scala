package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseReference extends js.Object {
  /** The name of the class. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the test case.
    *
    * Required.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the test suite to which this test case belongs. */
  var testSuiteName: js.UndefOr[java.lang.String] = js.undefined
}

object TestCaseReference {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    name: java.lang.String = null,
    testSuiteName: java.lang.String = null
  ): TestCaseReference = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (name != null) __obj.updateDynamic("name")(name)
    if (testSuiteName != null) __obj.updateDynamic("testSuiteName")(testSuiteName)
    __obj.asInstanceOf[TestCaseReference]
  }
}

