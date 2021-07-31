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
  
  @scala.inline
  def apply(body: BlockStatement, params: js.Array[Pattern]): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[FunctionDeclaration]
  }
  
  @scala.inline
  implicit class FunctionDeclarationMutableBuilder[Self <: FunctionDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
