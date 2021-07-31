package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportNamedDeclaration
  extends StObject
     with BaseNode
     with ModuleDeclaration {
  
  var declaration: js.UndefOr[Declaration | Null] = js.undefined
  
  var source: js.UndefOr[Literal | Null] = js.undefined
  
  var specifiers: js.Array[ExportSpecifier]
  
  @JSName("type")
  var type_ExportNamedDeclaration: typings.estree.estreeStrings.ExportNamedDeclaration
}
object ExportNamedDeclaration {
  
  @scala.inline
  def apply(specifiers: js.Array[ExportSpecifier]): ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[ExportNamedDeclaration]
  }
  
  @scala.inline
  implicit class ExportNamedDeclarationMutableBuilder[Self <: ExportNamedDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclaration(value: Declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    @scala.inline
    def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    @scala.inline
    def setSource(value: Literal): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSpecifiers(value: js.Array[ExportSpecifier]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersVarargs(value: ExportSpecifier*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExportNamedDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
