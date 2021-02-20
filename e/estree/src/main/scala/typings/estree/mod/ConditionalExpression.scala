package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalExpression
  extends BaseNode
     with Expression {
  
  var alternate: Expression = js.native
  
  var consequent: Expression = js.native
  
  var test: Expression = js.native
  
  @JSName("type")
  var type_ConditionalExpression: typings.estree.estreeStrings.ConditionalExpression = js.native
}
object ConditionalExpression {
  
  @scala.inline
  def apply(
    alternate: Expression,
    consequent: Expression,
    test: Expression,
    `type`: typings.estree.estreeStrings.ConditionalExpression
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalExpression]
  }
  
  @scala.inline
  implicit class ConditionalExpressionMutableBuilder[Self <: ConditionalExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: Expression): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequent(value: Expression): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
