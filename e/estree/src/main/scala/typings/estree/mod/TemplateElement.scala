package typings.estree.mod

import typings.estree.anon.Cooked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateElement
  extends BaseNode
     with Node {
  
  var tail: Boolean = js.native
  
  @JSName("type")
  var type_TemplateElement: typings.estree.estreeStrings.TemplateElement = js.native
  
  var value: Cooked = js.native
}
object TemplateElement {
  
  @scala.inline
  def apply(tail: Boolean, `type`: typings.estree.estreeStrings.TemplateElement, value: Cooked): TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateElement]
  }
  
  @scala.inline
  implicit class TemplateElementMutableBuilder[Self <: TemplateElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTail(value: Boolean): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.TemplateElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Cooked): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
