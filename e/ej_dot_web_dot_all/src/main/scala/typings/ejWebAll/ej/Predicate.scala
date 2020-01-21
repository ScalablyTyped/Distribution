package typings.ejWebAll.ej

import typings.ejWebAll.AnonCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Predicate")
@js.native
class Predicate () extends js.Object {
  def this(field: String, operator: FilterOperators, value: js.Any, ignoreCase: Boolean) = this()
  def this(
    field: String,
    operator: FilterOperators,
    value: js.Any,
    ignoreCase: Boolean,
    ignoreAccent: Boolean
  ) = this()
  def and(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean): Predicate = js.native
  def and(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean, ignoreAccent: Boolean): Predicate = js.native
  def or(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean): Predicate = js.native
  def or(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean, ignoreAccent: Boolean): Predicate = js.native
  def or(predicate: js.Array[_]): js.Any = js.native
  def toJSON(): AnonCondition = js.native
  def validate(record: js.Any): Boolean = js.native
}

