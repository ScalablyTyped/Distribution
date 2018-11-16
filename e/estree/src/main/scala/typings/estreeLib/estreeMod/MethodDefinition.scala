package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MethodDefinition extends BaseNode {
  var computed: scala.Boolean
  var key: estreeLib.Expression
  var kind: estreeLib.estreeLibStrings.constructor | estreeLib.estreeLibStrings.method | estreeLib.estreeLibStrings.get | estreeLib.estreeLibStrings.set
  var static: scala.Boolean
  @JSName("type")
  var type_MethodDefinition: estreeLib.estreeLibStrings.MethodDefinition
  var value: FunctionExpression
}

