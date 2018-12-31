package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCase extends BaseNode {
  var consequent: js.Array[Statement]
  var test: js.UndefOr[estreeLib.Expression | scala.Null] = js.undefined
  @JSName("type")
  var type_SwitchCase: estreeLib.estreeLibStrings.SwitchCase
}

