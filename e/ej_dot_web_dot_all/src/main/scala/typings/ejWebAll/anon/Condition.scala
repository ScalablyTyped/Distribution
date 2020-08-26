package typings.ejWebAll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  var condition: String = js.native
  var field: String = js.native
  var ignoreCase: Boolean = js.native
  var isComplex: Boolean = js.native
  var operator: String = js.native
  var predicates: js.Any = js.native
  var value: js.Any = js.native
}

object Condition {
  @scala.inline
  def apply(
    condition: String,
    field: String,
    ignoreCase: Boolean,
    isComplex: Boolean,
    operator: String,
    predicates: js.Any,
    value: js.Any
  ): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], isComplex = isComplex.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
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
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComplex(value: Boolean): Self = this.set("isComplex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicates(value: js.Any): Self = this.set("predicates", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

