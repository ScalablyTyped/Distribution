package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IfStatement extends BaseNode {
  var alternate: js.UndefOr[Statement | scala.Null] = js.undefined
  var consequent: Statement
  var test: estreeLib.Expression
  @JSName("type")
  var type_IfStatement: estreeLib.estreeLibStrings.IfStatement
}

