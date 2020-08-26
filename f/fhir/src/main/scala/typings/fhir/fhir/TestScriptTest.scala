package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test in this script
  */
@js.native
trait TestScriptTest extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * A test operation or assert to perform
    */
  var action: js.Array[TestScriptTestAction] = js.native
  /**
    * Tracking/reporting short description of the test
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Tracking/logging name of this test
    */
  var name: js.UndefOr[String] = js.native
}

object TestScriptTest {
  @scala.inline
  def apply(action: js.Array[TestScriptTestAction]): TestScriptTest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTest]
  }
  @scala.inline
  implicit class TestScriptTestOps[Self <: TestScriptTest] (val x: Self) extends AnyVal {
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
    def setActionVarargs(value: TestScriptTestAction*): Self = this.set("action", js.Array(value :_*))
    @scala.inline
    def setAction(value: js.Array[TestScriptTestAction]): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

