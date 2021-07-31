package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassExpression
  extends StObject
     with BaseClass
     with Class
     with Expression {
  
  var id: js.UndefOr[Identifier | Null] = js.undefined
  
  @JSName("type")
  var type_ClassExpression: typings.estree.estreeStrings.ClassExpression
}
object ClassExpression {
  
  @scala.inline
  def apply(body: ClassBody): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[ClassExpression]
  }
  
  @scala.inline
  implicit class ClassExpressionMutableBuilder[Self <: ClassExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ClassExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
