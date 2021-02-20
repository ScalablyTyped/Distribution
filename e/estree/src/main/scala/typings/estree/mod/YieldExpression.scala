package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YieldExpression
  extends BaseNode
     with Expression {
  
  var argument: js.UndefOr[Expression | Null] = js.native
  
  var delegate: Boolean = js.native
  
  @JSName("type")
  var type_YieldExpression: typings.estree.estreeStrings.YieldExpression = js.native
}
object YieldExpression {
  
  @scala.inline
  def apply(delegate: Boolean, `type`: typings.estree.estreeStrings.YieldExpression): YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YieldExpression]
  }
  
  @scala.inline
  implicit class YieldExpressionMutableBuilder[Self <: YieldExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    @scala.inline
    def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    @scala.inline
    def setDelegate(value: Boolean): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.YieldExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
