package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SwitchStatement extends BaseNode {
  var cases: js.Array[SwitchCase]
  var discriminant: estreeLib.Expression
  @JSName("type")
  var type_SwitchStatement: estreeLib.estreeLibStrings.SwitchStatement
}

