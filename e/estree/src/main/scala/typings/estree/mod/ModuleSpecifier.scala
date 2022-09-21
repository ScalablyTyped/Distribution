package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.estree.mod.ImportSpecifier
  - typings.estree.mod.ImportDefaultSpecifier
  - typings.estree.mod.ImportNamespaceSpecifier
  - typings.estree.mod.ExportSpecifier
*/
trait ModuleSpecifier extends StObject
object ModuleSpecifier {
  
  inline def ExportSpecifier(exported: Identifier, local: Identifier): typings.estree.mod.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typings.estree.mod.ExportSpecifier]
  }
  
  inline def ImportDefaultSpecifier(local: Identifier): typings.estree.mod.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typings.estree.mod.ImportDefaultSpecifier]
  }
  
  inline def ImportNamespaceSpecifier(local: Identifier): typings.estree.mod.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typings.estree.mod.ImportNamespaceSpecifier]
  }
  
  inline def ImportSpecifier(imported: Identifier, local: Identifier): typings.estree.mod.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typings.estree.mod.ImportSpecifier]
  }
}
