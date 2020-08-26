package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportNamedDeclaration
  extends BaseNode
     with ModuleDeclaration {
  var declaration: js.UndefOr[Declaration | Null] = js.native
  var source: js.UndefOr[Literal | Null] = js.native
  var specifiers: js.Array[ExportSpecifier] = js.native
  @JSName("type")
  var type_ExportNamedDeclaration: typings.estree.estreeStrings.ExportNamedDeclaration = js.native
}

object ExportNamedDeclaration {
  @scala.inline
  def apply(specifiers: js.Array[ExportSpecifier], `type`: typings.estree.estreeStrings.ExportNamedDeclaration): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
  @scala.inline
  implicit class ExportNamedDeclarationOps[Self <: ExportNamedDeclaration] (val x: Self) extends AnyVal {
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
    def setSpecifiersVarargs(value: ExportSpecifier*): Self = this.set("specifiers", js.Array(value :_*))
    @scala.inline
    def setSpecifiers(value: js.Array[ExportSpecifier]): Self = this.set("specifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExportNamedDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclaration(value: Declaration): Self = this.set("declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclaration: Self = this.set("declaration", js.undefined)
    @scala.inline
    def setDeclarationNull: Self = this.set("declaration", null)
    @scala.inline
    def setSource(value: Literal): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
  }
  
}

