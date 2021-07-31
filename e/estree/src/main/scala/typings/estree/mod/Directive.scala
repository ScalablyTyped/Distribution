package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directive
  extends StObject
     with BaseNode {
  
  var directive: String
  
  var expression: Literal
  
  @JSName("type")
  var type_Directive: typings.estree.estreeStrings.ExpressionStatement
}
object Directive {
  
  @scala.inline
  def apply(directive: String, expression: Literal): Directive = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[Directive]
  }
  
  @scala.inline
  implicit class DirectiveMutableBuilder[Self <: Directive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirective(value: String): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Literal): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
