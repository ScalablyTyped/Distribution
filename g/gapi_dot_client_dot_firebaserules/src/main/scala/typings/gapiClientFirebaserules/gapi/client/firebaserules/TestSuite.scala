package typings.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSuite extends js.Object {
  /** Collection of test cases associated with the `TestSuite`. */
  var testCases: js.UndefOr[js.Array[TestCase]] = js.native
}

object TestSuite {
  @scala.inline
  def apply(): TestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSuite]
  }
  @scala.inline
  implicit class TestSuiteOps[Self <: TestSuite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTestCasesVarargs(value: TestCase*): Self = this.set("testCases", js.Array(value :_*))
    @scala.inline
    def setTestCases(value: js.Array[TestCase]): Self = this.set("testCases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestCases: Self = this.set("testCases", js.undefined)
  }
  
}

