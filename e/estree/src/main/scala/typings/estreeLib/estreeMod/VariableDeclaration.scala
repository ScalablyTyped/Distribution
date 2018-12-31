package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration extends BaseNode {
  var declarations: js.Array[VariableDeclarator]
  var kind: estreeLib.estreeLibStrings.`var` | estreeLib.estreeLibStrings.let | estreeLib.estreeLibStrings.const
  @JSName("type")
  var type_VariableDeclaration: estreeLib.estreeLibStrings.VariableDeclaration
}

