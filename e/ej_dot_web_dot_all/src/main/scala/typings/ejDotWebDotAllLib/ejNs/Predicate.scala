package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Predicate")
@js.native
class Predicate () extends js.Object {
  def this(field: java.lang.String, operator: FilterOperators, value: js.Any, ignoreCase: scala.Boolean) = this()
  def and(field: java.lang.String, operator: js.Any, value: js.Any, ignoreCase: scala.Boolean): Predicate = js.native
  def or(field: java.lang.String, operator: js.Any, value: js.Any, ignoreCase: scala.Boolean): Predicate = js.native
  def or(predicate: js.Array[_]): js.Any = js.native
  def toJSON(): ejDotWebDotAllLib.Anon_Predicates = js.native
  def validate(record: js.Any): scala.Boolean = js.native
}

