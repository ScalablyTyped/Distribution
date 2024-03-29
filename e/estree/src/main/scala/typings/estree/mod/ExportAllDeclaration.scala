package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAllDeclaration
  extends StObject
     with BaseNode
     with ModuleDeclaration {
  
  var exported: Identifier | Null
  
  var source: Literal
  
  @JSName("type")
  var type_ExportAllDeclaration: typings.estree.estreeStrings.ExportAllDeclaration
}
object ExportAllDeclaration {
  
  inline def apply(source: Literal): ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], exported = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[ExportAllDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportAllDeclaration] (val x: Self) extends AnyVal {
    
    inline def setExported(value: Identifier): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    inline def setExportedNull: Self = StObject.set(x, "exported", null)
    
    inline def setSource(value: Literal): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.ExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
