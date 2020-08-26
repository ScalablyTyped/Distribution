package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter that can be used in a value set
  */
@js.native
trait CodeSystemFilter extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'operator'.
    */
  var _operator: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Code that identifies the filter
    */
  var code: typings.fhir.fhir.code = js.native
  /**
    * How or why the filter is used
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Operators that can be used with filter
    */
  var operator: js.Array[code] = js.native
  /**
    * What to use for the value
    */
  var value: String = js.native
}

object CodeSystemFilter {
  @scala.inline
  def apply(code: code, operator: js.Array[code], value: String): CodeSystemFilter = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemFilter]
  }
  @scala.inline
  implicit class CodeSystemFilterOps[Self <: CodeSystemFilter] (val x: Self) extends AnyVal {
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperatorVarargs(value: code*): Self = this.set("operator", js.Array(value :_*))
    @scala.inline
    def setOperator(value: js.Array[code]): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_operatorVarargs(value: Element*): Self = this.set("_operator", js.Array(value :_*))
    @scala.inline
    def set_operator(value: js.Array[Element]): Self = this.set("_operator", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_operator: Self = this.set("_operator", js.undefined)
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

