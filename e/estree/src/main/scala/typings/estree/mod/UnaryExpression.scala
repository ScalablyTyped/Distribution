package typings.estree.mod

import typings.estree.estreeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnaryExpression
  extends BaseNode
     with Expression {
  
  var argument: Expression = js.native
  
  var operator: UnaryOperator = js.native
  
  var prefix: `true` = js.native
  
  @JSName("type")
  var type_UnaryExpression: typings.estree.estreeStrings.UnaryExpression = js.native
}
object UnaryExpression {
  
  @scala.inline
  def apply(
    argument: Expression,
    operator: UnaryOperator,
    prefix: `true`,
    `type`: typings.estree.estreeStrings.UnaryExpression
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
  
  @scala.inline
  implicit class UnaryExpressionMutableBuilder[Self <: UnaryExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: UnaryOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: `true`): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
