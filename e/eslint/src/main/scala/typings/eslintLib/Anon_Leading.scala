package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leading extends js.Object {
  var leading: js.Array[estreeLib.estreeMod.Comment]
  var trailing: js.Array[estreeLib.estreeMod.Comment]
}

object Anon_Leading {
  @scala.inline
  def apply(leading: js.Array[estreeLib.estreeMod.Comment], trailing: js.Array[estreeLib.estreeMod.Comment]): Anon_Leading = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("leading")(leading)
    __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[Anon_Leading]
  }
}

