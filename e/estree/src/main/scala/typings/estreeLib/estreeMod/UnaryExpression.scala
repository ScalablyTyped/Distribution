package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression extends BaseNode {
  var argument: estreeLib.Expression
  var operator: UnaryOperator
  var prefix: estreeLib.estreeLibNumbers.`true`
  @JSName("type")
  var type_UnaryExpression: estreeLib.estreeLibStrings.UnaryExpression
}

