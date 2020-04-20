package typings.eslint.mod.Scope

import typings.estree.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var defs: js.Array[Definition]
  var identifiers: js.Array[Identifier]
  var name: String
  var references: js.Array[Reference]
}

object Variable {
  @scala.inline
  def apply(
    defs: js.Array[Definition],
    identifiers: js.Array[Identifier],
    name: String,
    references: js.Array[Reference]
  ): Variable = {
    val __obj = js.Dynamic.literal(defs = defs.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

