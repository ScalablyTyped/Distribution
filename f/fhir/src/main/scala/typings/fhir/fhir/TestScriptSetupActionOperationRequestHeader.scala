package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each operation can have one or more header elements
  */
@js.native
trait TestScriptSetupActionOperationRequestHeader extends BackboneElement {
  /**
    * Contains extended information for property 'field'.
    */
  var _field: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * HTTP header field name
    */
  var field: String = js.native
  /**
    * HTTP headerfield value
    */
  var value: String = js.native
}

object TestScriptSetupActionOperationRequestHeader {
  @scala.inline
  def apply(field: String, value: String): TestScriptSetupActionOperationRequestHeader = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionOperationRequestHeader]
  }
  @scala.inline
  implicit class TestScriptSetupActionOperationRequestHeaderOps[Self <: TestScriptSetupActionOperationRequestHeader] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_field(value: Element): Self = this.set("_field", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_field: Self = this.set("_field", js.undefined)
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
  }
  
}

