package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassDeclaration
  extends StObject
     with BaseClass
     with Class
     with Declaration {
  
  /** It is null when a class declaration is a part of the `export default class` statement */
  var id: Identifier | Null
  
  @JSName("type")
  var type_ClassDeclaration: typings.estree.estreeStrings.ClassDeclaration
}
object ClassDeclaration {
  
  inline def apply(body: ClassBody): ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[ClassDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassDeclaration] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setType(value: typings.estree.estreeStrings.ClassDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
