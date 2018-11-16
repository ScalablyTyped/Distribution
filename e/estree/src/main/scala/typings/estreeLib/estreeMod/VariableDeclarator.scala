package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VariableDeclarator extends BaseNode {
  var id: Pattern
  var init: js.UndefOr[estreeLib.Expression | scala.Null] = js.undefined
  @JSName("type")
  var type_VariableDeclarator: estreeLib.estreeLibStrings.VariableDeclarator
}

