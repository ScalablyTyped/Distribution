package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryExpression
  extends BaseNode
     with Expression {
  
  var left: Expression = js.native
  
  var operator: BinaryOperator = js.native
  
  var right: Expression = js.native
  
  @JSName("type")
  var type_BinaryExpression: typings.estree.estreeStrings.BinaryExpression = js.native
}
object BinaryExpression {
  
  @scala.inline
  def apply(
    left: Expression,
    operator: BinaryOperator,
    right: Expression,
    `type`: typings.estree.estreeStrings.BinaryExpression
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
  
  @scala.inline
  implicit class BinaryExpressionMutableBuilder[Self <: BinaryExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: BinaryOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
