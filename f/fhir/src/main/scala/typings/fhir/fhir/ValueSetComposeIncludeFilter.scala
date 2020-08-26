package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Select codes/concepts by their properties (including relationships)
  */
@js.native
trait ValueSetComposeIncludeFilter extends BackboneElement {
  /**
    * Contains extended information for property 'op'.
    */
  var _op: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'property'.
    */
  var _property: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | exists
    */
  var op: code = js.native
  /**
    * A property defined by the code system
    */
  var property: code = js.native
  /**
    * Code from the system, or regex criteria, or boolean value for exists
    */
  var value: code = js.native
}

object ValueSetComposeIncludeFilter {
  @scala.inline
  def apply(op: code, property: code, value: code): ValueSetComposeIncludeFilter = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetComposeIncludeFilter]
  }
  @scala.inline
  implicit class ValueSetComposeIncludeFilterOps[Self <: ValueSetComposeIncludeFilter] (val x: Self) extends AnyVal {
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
    def setOp(value: code): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: code): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: code): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_op(value: Element): Self = this.set("_op", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_op: Self = this.set("_op", js.undefined)
    @scala.inline
    def set_property(value: Element): Self = this.set("_property", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_property: Self = this.set("_property", js.undefined)
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
  }
  
}

