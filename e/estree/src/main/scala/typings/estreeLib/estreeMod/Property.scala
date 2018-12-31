package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends BaseNode {
  var computed: scala.Boolean
  var key: estreeLib.Expression
   // Could be an AssignmentProperty
  var kind: estreeLib.estreeLibStrings.init | estreeLib.estreeLibStrings.get | estreeLib.estreeLibStrings.set
  var method: scala.Boolean
  var shorthand: scala.Boolean
  @JSName("type")
  var type_Property: estreeLib.estreeLibStrings.Property
  var value: estreeLib.Expression | Pattern
}

