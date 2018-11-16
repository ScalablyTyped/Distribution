package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ForStatement extends BaseNode {
  var body: Statement
  var init: js.UndefOr[VariableDeclaration | estreeLib.Expression | scala.Null] = js.undefined
  var test: js.UndefOr[estreeLib.Expression | scala.Null] = js.undefined
  @JSName("type")
  var type_ForStatement: estreeLib.estreeLibStrings.ForStatement
  var update: js.UndefOr[estreeLib.Expression | scala.Null] = js.undefined
}

