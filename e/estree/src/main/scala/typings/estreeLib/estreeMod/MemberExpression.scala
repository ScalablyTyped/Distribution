package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression extends BaseNode {
  var computed: scala.Boolean
  var `object`: estreeLib.Expression | Super
  var property: estreeLib.Expression
  @JSName("type")
  var type_MemberExpression: estreeLib.estreeLibStrings.MemberExpression
}

