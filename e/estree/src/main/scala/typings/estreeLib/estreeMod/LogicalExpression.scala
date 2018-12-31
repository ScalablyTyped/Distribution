package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression extends BaseNode {
  var left: estreeLib.Expression
  var operator: LogicalOperator
  var right: estreeLib.Expression
  @JSName("type")
  var type_LogicalExpression: estreeLib.estreeLibStrings.LogicalExpression
}

