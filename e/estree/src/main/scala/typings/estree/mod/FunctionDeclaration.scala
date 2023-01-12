package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionDeclaration
  extends StObject
     with BaseFunction
     with Declaration
     with Function {
  
  @JSName("body")
  var body_FunctionDeclaration: BlockStatement
  
  /** It is null when a function declaration is a part of the `export default function` statement */
  var id: Identifier | Null
  
  @JSName("type")
  var type_FunctionDeclaration: typings.estree.estreeStrings.FunctionDeclaration
}
object FunctionDeclaration {
  
  inline def apply(body: BlockStatement, params: js.Array[Pattern]): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[FunctionDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionDeclaration] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setType(value: typings.estree.estreeStrings.FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
