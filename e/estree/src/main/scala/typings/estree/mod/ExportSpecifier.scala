package typings.estree.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ExportSpecifierMutableBuilder[Self <: ExportSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExported(value: Identifier): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
