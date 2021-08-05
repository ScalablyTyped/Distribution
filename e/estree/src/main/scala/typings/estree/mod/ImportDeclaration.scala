package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDeclaration
  extends StObject
     with BaseNode
     with ModuleDeclaration {
  
  var source: Literal
  
  var specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  
  @JSName("type")
  var type_ImportDeclaration: typings.estree.estreeStrings.ImportDeclaration
}
object ImportDeclaration {
  
  inline def apply(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[ImportDeclaration]
  }
  
  extension [Self <: ImportDeclaration](x: Self) {
    
    inline def setSource(value: Literal): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSpecifiers(value: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersVarargs(value: (ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier)*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    
    inline def setType(value: typings.estree.estreeStrings.ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
