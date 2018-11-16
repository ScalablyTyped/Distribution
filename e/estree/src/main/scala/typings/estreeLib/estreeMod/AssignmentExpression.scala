package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AssignmentExpression extends BaseNode {
  var left: Pattern | MemberExpression
  var operator: AssignmentOperator
  var right: estreeLib.Expression
  @JSName("type")
  var type_AssignmentExpression: estreeLib.estreeLibStrings.AssignmentExpression
}

