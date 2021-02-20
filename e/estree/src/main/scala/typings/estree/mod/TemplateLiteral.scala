package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLiteral
  extends BaseNode
     with Expression {
  
  var expressions: js.Array[Expression] = js.native
  
  var quasis: js.Array[TemplateElement] = js.native
  
  @JSName("type")
  var type_TemplateLiteral: typings.estree.estreeStrings.TemplateLiteral = js.native
}
object TemplateLiteral {
  
  @scala.inline
  def apply(
    expressions: js.Array[Expression],
    quasis: js.Array[TemplateElement],
    `type`: typings.estree.estreeStrings.TemplateLiteral
  ): TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteral]
  }
  
  @scala.inline
  implicit class TemplateLiteralMutableBuilder[Self <: TemplateLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setQuasis(value: js.Array[TemplateElement]): Self = StObject.set(x, "quasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasisVarargs(value: TemplateElement*): Self = StObject.set(x, "quasis", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
