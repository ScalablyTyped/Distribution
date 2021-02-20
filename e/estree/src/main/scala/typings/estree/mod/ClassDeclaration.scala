package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassDeclaration
  extends BaseClass
     with Class
     with Declaration {
  
  /** It is null when a class declaration is a part of the `export default class` statement */
  var id: Identifier | Null = js.native
  
  @JSName("type")
  var type_ClassDeclaration: typings.estree.estreeStrings.ClassDeclaration = js.native
}
object ClassDeclaration {
  
  @scala.inline
  def apply(body: ClassBody, `type`: typings.estree.estreeStrings.ClassDeclaration): ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassDeclaration]
  }
  
  @scala.inline
  implicit class ClassDeclarationMutableBuilder[Self <: ClassDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ClassDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
