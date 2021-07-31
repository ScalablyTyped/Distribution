package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSpecifier
  extends StObject
     with BaseModuleSpecifier
     with ModuleSpecifier {
  
  var imported: Identifier
  
  @JSName("type")
  var type_ImportSpecifier: typings.estree.estreeStrings.ImportSpecifier
}
object ImportSpecifier {
  
  @scala.inline
  def apply(imported: Identifier, local: Identifier): ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[ImportSpecifier]
  }
  
  @scala.inline
  implicit class ImportSpecifierMutableBuilder[Self <: ImportSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImported(value: Identifier): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
