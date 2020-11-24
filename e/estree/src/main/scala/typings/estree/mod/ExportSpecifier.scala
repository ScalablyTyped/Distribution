package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  
  var exported: Identifier = js.native
  
  @JSName("type")
  var type_ExportSpecifier: typings.estree.estreeStrings.ExportSpecifier = js.native
}
object ExportSpecifier {
  
  @scala.inline
  def apply(exported: Identifier, local: Identifier, `type`: typings.estree.estreeStrings.ExportSpecifier): ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier]
  }
  
  @scala.inline
  implicit class ExportSpecifierOps[Self <: ExportSpecifier] (val x: Self) extends AnyVal {
    
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
    def setExported(value: Identifier): Self = this.set("exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExportSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
