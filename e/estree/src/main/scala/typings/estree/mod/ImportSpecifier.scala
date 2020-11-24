package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  
  var imported: Identifier = js.native
  
  @JSName("type")
  var type_ImportSpecifier: typings.estree.estreeStrings.ImportSpecifier = js.native
}
object ImportSpecifier {
  
  @scala.inline
  def apply(imported: Identifier, local: Identifier, `type`: typings.estree.estreeStrings.ImportSpecifier): ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier]
  }
  
  @scala.inline
  implicit class ImportSpecifierOps[Self <: ImportSpecifier] (val x: Self) extends AnyVal {
    
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
    def setImported(value: Identifier): Self = this.set("imported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ImportSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
