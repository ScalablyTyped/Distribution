package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportNamespaceSpecifier
  extends StObject
     with BaseModuleSpecifier
     with ModuleSpecifier {
  
  @JSName("type")
  var type_ImportNamespaceSpecifier: typings.estree.estreeStrings.ImportNamespaceSpecifier
}
object ImportNamespaceSpecifier {
  
  @scala.inline
  def apply(local: Identifier): ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[ImportNamespaceSpecifier]
  }
  
  @scala.inline
  implicit class ImportNamespaceSpecifierMutableBuilder[Self <: ImportNamespaceSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ImportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
