package typings
package eslintLib.eslintMod.ScopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var defs: js.Array[Definition]
  var identifiers: js.Array[estreeLib.estreeMod.Identifier]
  var name: java.lang.String
  var references: js.Array[Reference]
}

object Variable {
  @scala.inline
  def apply(
    defs: js.Array[Definition],
    identifiers: js.Array[estreeLib.estreeMod.Identifier],
    name: java.lang.String,
    references: js.Array[Reference]
  ): Variable = {
    val __obj = js.Dynamic.literal(defs = defs, identifiers = identifiers, name = name, references = references)
  
    __obj.asInstanceOf[Variable]
  }
}

