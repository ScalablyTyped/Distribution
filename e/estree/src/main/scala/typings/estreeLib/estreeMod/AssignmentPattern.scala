package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentPattern extends BaseNode {
  var left: Pattern
  var right: estreeLib.Expression
  @JSName("type")
  var type_AssignmentPattern: estreeLib.estreeLibStrings.AssignmentPattern
}

