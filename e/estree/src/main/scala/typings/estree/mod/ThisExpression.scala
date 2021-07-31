package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThisExpression
  extends StObject
     with BaseNode
     with Expression {
  
  @JSName("type")
  var type_ThisExpression: typings.estree.estreeStrings.ThisExpression
}
object ThisExpression {
  
  @scala.inline
  def apply(): ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[ThisExpression]
  }
  
  @scala.inline
  implicit class ThisExpressionMutableBuilder[Self <: ThisExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
