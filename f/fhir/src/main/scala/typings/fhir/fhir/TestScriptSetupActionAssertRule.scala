package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The reference to a TestScript.rule
  */
@js.native
trait TestScriptSetupActionAssertRule extends BackboneElement {
  /**
    * Contains extended information for property 'ruleId'.
    */
  var _ruleId: js.UndefOr[Element] = js.native
  /**
    * Rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptSetupActionAssertRuleParam]] = js.native
  /**
    * Id of the TestScript.rule
    */
  var ruleId: id = js.native
}

object TestScriptSetupActionAssertRule {
  @scala.inline
  def apply(ruleId: id): TestScriptSetupActionAssertRule = {
    val __obj = js.Dynamic.literal(ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRule]
  }
  @scala.inline
  implicit class TestScriptSetupActionAssertRuleOps[Self <: TestScriptSetupActionAssertRule] (val x: Self) extends AnyVal {
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
    def setRuleId(value: id): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    @scala.inline
    def set_ruleId(value: Element): Self = this.set("_ruleId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_ruleId: Self = this.set("_ruleId", js.undefined)
    @scala.inline
    def setParamVarargs(value: TestScriptSetupActionAssertRuleParam*): Self = this.set("param", js.Array(value :_*))
    @scala.inline
    def setParam(value: js.Array[TestScriptSetupActionAssertRuleParam]): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
  }
  
}

