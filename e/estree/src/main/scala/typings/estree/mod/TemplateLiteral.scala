package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLiteral
  extends StObject
     with BaseNode
     with Expression {
  
  var expressions: js.Array[Expression]
  
  var quasis: js.Array[TemplateElement]
  
  @JSName("type")
  var type_TemplateLiteral: typings.estree.estreeStrings.TemplateLiteral
}
object TemplateLiteral {
  
  @scala.inline
  def apply(expressions: js.Array[Expression], quasis: js.Array[TemplateElement]): TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
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
