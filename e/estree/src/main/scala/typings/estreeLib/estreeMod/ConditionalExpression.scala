package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalExpression extends BaseNode {
  var alternate: estreeLib.Expression
  var consequent: estreeLib.Expression
  var test: estreeLib.Expression
  @JSName("type")
  var type_ConditionalExpression: estreeLib.estreeLibStrings.ConditionalExpression
}

