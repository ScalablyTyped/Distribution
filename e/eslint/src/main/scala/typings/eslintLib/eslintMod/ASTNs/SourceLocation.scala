package typings
package eslintLib.eslintMod.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: estreeLib.estreeMod.Position
  var start: estreeLib.estreeMod.Position
}

object SourceLocation {
  @scala.inline
  def apply(end: estreeLib.estreeMod.Position, start: estreeLib.estreeMod.Position): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SourceLocation]
  }
}

