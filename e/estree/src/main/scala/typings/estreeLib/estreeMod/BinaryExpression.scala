package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression extends BaseNode {
  var left: estreeLib.Expression
  var operator: BinaryOperator
  var right: estreeLib.Expression
  @JSName("type")
  var type_BinaryExpression: estreeLib.estreeLibStrings.BinaryExpression
}

