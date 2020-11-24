package typings.estree.mod

import typings.estree.anon.Cooked
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
  implicit class TemplateElementOps[Self <: TemplateElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTail(value: Boolean): Self = this.set("tail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.TemplateElement): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Cooked): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
