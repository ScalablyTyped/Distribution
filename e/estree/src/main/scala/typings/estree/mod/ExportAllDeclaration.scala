package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ExportAllDeclarationMutableBuilder[Self <: ExportAllDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Literal): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
