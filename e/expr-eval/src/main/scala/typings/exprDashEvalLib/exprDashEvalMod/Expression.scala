package typings
package exprDashEvalLib.exprDashEvalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  def evaluate(): js.Any = js.native
  def evaluate(values: Value): js.Any = js.native
  def simplify(): Expression = js.native
  def simplify(values: Value): Expression = js.native
  def substitute(variable: java.lang.String, value: Expression): Expression = js.native
  def substitute(variable: java.lang.String, value: java.lang.String): Expression = js.native
  def substitute(variable: java.lang.String, value: scala.Double): Expression = js.native
  def symbols(): js.Array[java.lang.String] = js.native
  def symbols(options: exprDashEvalLib.Anon_WithMembers): js.Array[java.lang.String] = js.native
  def toJSFunction(params: java.lang.String): js.Function1[/* repeated */ js.Any, scala.Double] = js.native
  def toJSFunction(params: java.lang.String, values: Value): js.Function1[/* repeated */ js.Any, scala.Double] = js.native
  def variables(): js.Array[java.lang.String] = js.native
  def variables(options: exprDashEvalLib.Anon_WithMembers): js.Array[java.lang.String] = js.native
}

