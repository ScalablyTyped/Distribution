package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDefaultDeclaration
  extends BaseNode
     with ModuleDeclaration {
  var declaration: Declaration | Expression = js.native
  @JSName("type")
  var type_ExportDefaultDeclaration: typings.estree.estreeStrings.ExportDefaultDeclaration = js.native
}

object ExportDefaultDeclaration {
  @scala.inline
  def apply(
    declaration: Declaration | Expression,
    `type`: typings.estree.estreeStrings.ExportDefaultDeclaration
  ): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
  @scala.inline
  implicit class ExportDefaultDeclarationOps[Self <: ExportDefaultDeclaration] (val x: Self) extends AnyVal {
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
    def setDeclaration(value: Declaration | Expression): Self = this.set("declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExportDefaultDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

