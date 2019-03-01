package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: estreeLib.estreeMod.Identifier
}

object Anon_Name {
  @scala.inline
  def apply(name: estreeLib.estreeMod.Identifier): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}

