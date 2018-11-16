package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateExpression extends BaseNode {
  var argument: estreeLib.Expression
  var operator: UpdateOperator
  var prefix: scala.Boolean
  @JSName("type")
  var type_UpdateExpression: estreeLib.estreeLibStrings.UpdateExpression
}

