package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCaseReference extends js.Object {
  /** The name of the class. */
  var className: js.UndefOr[String] = js.native
  /**
    * The name of the test case.
    *
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  /** The name of the test suite to which this test case belongs. */
  var testSuiteName: js.UndefOr[String] = js.native
}

object TestCaseReference {
  @scala.inline
  def apply(): TestCaseReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseReference]
  }
  @scala.inline
  implicit class TestCaseReferenceOps[Self <: TestCaseReference] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTestSuiteName(value: String): Self = this.set("testSuiteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestSuiteName: Self = this.set("testSuiteName", js.undefined)
  }
  
}

