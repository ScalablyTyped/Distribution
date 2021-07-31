package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionExpression
  extends StObject
     with BaseFunction
     with Expression
     with Function {
  
  @JSName("body")
  var body_FunctionExpression: BlockStatement
  
  var id: js.UndefOr[Identifier | Null] = js.undefined
  
  @JSName("type")
  var type_FunctionExpression: typings.estree.estreeStrings.FunctionExpression
}
object FunctionExpression {
  
  @scala.inline
  def apply(body: BlockStatement, params: js.Array[Pattern]): FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[FunctionExpression]
  }
  
  @scala.inline
  implicit class FunctionExpressionMutableBuilder[Self <: FunctionExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.FunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
