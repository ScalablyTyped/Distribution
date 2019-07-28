package typings.ejDotWebDotAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition extends js.Object {
  var condition: String
  var field: String
  var ignoreCase: Boolean
  var isComplex: Boolean
  var operator: String
  var predicates: js.Any
  var value: js.Any
}

object Anon_Condition {
  @scala.inline
  def apply(
    condition: String,
    field: String,
    ignoreCase: Boolean,
    isComplex: Boolean,
    operator: String,
    predicates: js.Any,
    value: js.Any
  ): Anon_Condition = {
    val __obj = js.Dynamic.literal(condition = condition, field = field, ignoreCase = ignoreCase, isComplex = isComplex, operator = operator, predicates = predicates, value = value)
  
    __obj.asInstanceOf[Anon_Condition]
  }
}

