package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainExpression
  extends BaseNode
     with Expression {
  
  var expression: ChainElement = js.native
  
  @JSName("type")
  var type_ChainExpression: typings.estree.estreeStrings.ChainExpression = js.native
}
object ChainExpression {
  
  @scala.inline
  def apply(expression: ChainElement, `type`: typings.estree.estreeStrings.ChainExpression): ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainExpression]
  }
  
  @scala.inline
  implicit class ChainExpressionMutableBuilder[Self <: ChainExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: ChainElement): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ChainExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
