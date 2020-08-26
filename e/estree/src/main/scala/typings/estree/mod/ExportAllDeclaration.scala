package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAllDeclaration
  extends BaseNode
     with ModuleDeclaration {
  var source: Literal = js.native
  @JSName("type")
  var type_ExportAllDeclaration: typings.estree.estreeStrings.ExportAllDeclaration = js.native
}

object ExportAllDeclaration {
  @scala.inline
  def apply(source: Literal, `type`: typings.estree.estreeStrings.ExportAllDeclaration): ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAllDeclaration]
  }
  @scala.inline
  implicit class ExportAllDeclarationOps[Self <: ExportAllDeclaration] (val x: Self) extends AnyVal {
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
    def setSource(value: Literal): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExportAllDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

