package typings.exprEval.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expr-eval", "Parser")
@js.native
class Parser () extends js.Object {
  def this(options: ParserOptions) = this()
  var consts: js.Any = js.native
  var functions: js.Any = js.native
  var unaryOps: js.Any = js.native
  def evaluate(expression: String): Double = js.native
  def evaluate(expression: String, values: Value): Double = js.native
  def parse(expression: String): Expression = js.native
}

/* static members */
@JSImport("expr-eval", "Parser")
@js.native
object Parser extends js.Object {
  def evaluate(expression: String): Double = js.native
  def evaluate(expression: String, values: Value): Double = js.native
  def parse(expression: String): Expression = js.native
}

