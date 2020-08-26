package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Assert rule used within the test script
  */
@js.native
trait TestScriptRule extends BackboneElement {
  /**
    * Rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptRuleParam]] = js.native
  /**
    * Assert rule resource reference
    */
  var resource: Reference = js.native
}

object TestScriptRule {
  @scala.inline
  def apply(resource: Reference): TestScriptRule = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRule]
  }
  @scala.inline
  implicit class TestScriptRuleOps[Self <: TestScriptRule] (val x: Self) extends AnyVal {
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
    def setResource(value: Reference): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamVarargs(value: TestScriptRuleParam*): Self = this.set("param", js.Array(value :_*))
    @scala.inline
    def setParam(value: js.Array[TestScriptRuleParam]): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
  }
  
}

