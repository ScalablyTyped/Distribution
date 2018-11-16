package typings
package exprDashEvalLib.exprDashEvalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expr-eval", "Parser")
@js.native
class Parser () extends js.Object {
  def this(options: ParserOptions) = this()
  var functions: js.Any = js.native
  def evaluate(expression: java.lang.String): scala.Double = js.native
  def evaluate(expression: java.lang.String, values: Value): scala.Double = js.native
  def parse(expression: java.lang.String): Expression = js.native
}

@JSImport("expr-eval", "Parser")
@js.native
object Parser extends js.Object {
  def evaluate(expression: java.lang.String): scala.Double = js.native
  def evaluate(expression: java.lang.String, values: exprDashEvalLib.exprDashEvalMod.Value): scala.Double = js.native
  def parse(expression: java.lang.String): exprDashEvalLib.exprDashEvalMod.Expression = js.native
}

