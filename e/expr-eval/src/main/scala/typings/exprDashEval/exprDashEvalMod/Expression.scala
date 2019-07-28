package typings.exprDashEval.exprDashEvalMod

import typings.exprDashEval.Anon_WithMembers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  def evaluate(): js.Any = js.native
  def evaluate(values: Value): js.Any = js.native
  def simplify(): Expression = js.native
  def simplify(values: Value): Expression = js.native
  def substitute(variable: String, value: String): Expression = js.native
  def substitute(variable: String, value: Double): Expression = js.native
  def substitute(variable: String, value: Expression): Expression = js.native
  def symbols(): js.Array[String] = js.native
  def symbols(options: Anon_WithMembers): js.Array[String] = js.native
  def toJSFunction(params: String): js.Function1[/* repeated */ js.Any, Double] = js.native
  def toJSFunction(params: String, values: Value): js.Function1[/* repeated */ js.Any, Double] = js.native
  def variables(): js.Array[String] = js.native
  def variables(options: Anon_WithMembers): js.Array[String] = js.native
}

