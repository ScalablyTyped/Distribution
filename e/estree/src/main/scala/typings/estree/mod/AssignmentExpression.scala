package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentExpression
  extends BaseNode
     with Expression {
  
  var left: Pattern | MemberExpression = js.native
  
  var operator: AssignmentOperator = js.native
  
  var right: Expression = js.native
  
  @JSName("type")
  var type_AssignmentExpression: typings.estree.estreeStrings.AssignmentExpression = js.native
}
object AssignmentExpression {
  
  @scala.inline
  def apply(
    left: Pattern | MemberExpression,
    operator: AssignmentOperator,
    right: Expression,
    `type`: typings.estree.estreeStrings.AssignmentExpression
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression]
  }
  
  @scala.inline
  implicit class AssignmentExpressionMutableBuilder[Self <: AssignmentExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Pattern | MemberExpression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: AssignmentOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
