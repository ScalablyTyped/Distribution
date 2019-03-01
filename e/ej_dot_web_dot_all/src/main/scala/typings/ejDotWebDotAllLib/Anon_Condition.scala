package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition extends js.Object {
  var condition: java.lang.String
  var field: java.lang.String
  var ignoreCase: scala.Boolean
  var isComplex: scala.Boolean
  var operator: java.lang.String
  var predicates: js.Any
  var value: js.Any
}

object Anon_Condition {
  @scala.inline
  def apply(
    condition: java.lang.String,
    field: java.lang.String,
    ignoreCase: scala.Boolean,
    isComplex: scala.Boolean,
    operator: java.lang.String,
    predicates: js.Any,
    value: js.Any
  ): Anon_Condition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("condition")(condition)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("ignoreCase")(ignoreCase)
    __obj.updateDynamic("isComplex")(isComplex)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("predicates")(predicates)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Condition]
  }
}

