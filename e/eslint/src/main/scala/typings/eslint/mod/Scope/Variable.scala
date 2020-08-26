package typings.eslint.mod.Scope

import typings.estree.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  var defs: js.Array[Definition] = js.native
  var identifiers: js.Array[Identifier] = js.native
  var name: String = js.native
  var references: js.Array[Reference] = js.native
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
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefsVarargs(value: Definition*): Self = this.set("defs", js.Array(value :_*))
    @scala.inline
    def setDefs(value: js.Array[Definition]): Self = this.set("defs", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifiersVarargs(value: Identifier*): Self = this.set("identifiers", js.Array(value :_*))
    @scala.inline
    def setIdentifiers(value: js.Array[Identifier]): Self = this.set("identifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencesVarargs(value: Reference*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[Reference]): Self = this.set("references", value.asInstanceOf[js.Any])
  }
  
}

