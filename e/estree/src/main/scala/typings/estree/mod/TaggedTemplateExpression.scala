package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedTemplateExpression
  extends StObject
     with BaseNode
     with Expression {
  
  var quasi: TemplateLiteral
  
  var tag: Expression
  
  @JSName("type")
  var type_TaggedTemplateExpression: typings.estree.estreeStrings.TaggedTemplateExpression
}
object TaggedTemplateExpression {
  
  @scala.inline
  def apply(quasi: TemplateLiteral, tag: Expression): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
  
  @scala.inline
  implicit class TaggedTemplateExpressionMutableBuilder[Self <: TaggedTemplateExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuasi(value: TemplateLiteral): Self = StObject.set(x, "quasi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Expression): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
