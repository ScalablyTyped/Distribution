package typings.ejWebAll.ej

import typings.ejWebAll.anon.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Predicate extends js.Object {
  def and(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean): Predicate = js.native
  def and(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean, ignoreAccent: Boolean): Predicate = js.native
  def or(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean): Predicate = js.native
  def or(field: String, operator: js.Any, value: js.Any, ignoreCase: Boolean, ignoreAccent: Boolean): Predicate = js.native
  def or(predicate: js.Array[_]): js.Any = js.native
  def toJSON(): Condition = js.native
  def validate(record: js.Any): Boolean = js.native
}

