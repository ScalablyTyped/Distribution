package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCondition extends js.Object {
  var condition: String
  var field: String
  var ignoreCase: Boolean
  var isComplex: Boolean
  var operator: String
  var predicates: js.Any
  var value: js.Any
}

object AnonCondition {
  @scala.inline
  def apply(
    condition: String,
    field: String,
    ignoreCase: Boolean,
    isComplex: Boolean,
    operator: String,
    predicates: js.Any,
    value: js.Any
  ): AnonCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], isComplex = isComplex.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCondition]
  }
}

