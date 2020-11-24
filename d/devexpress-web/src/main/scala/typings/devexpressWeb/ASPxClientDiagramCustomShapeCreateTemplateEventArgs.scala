package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the CustomShapeCreateTemplate event.
  */
@js.native
trait ASPxClientDiagramCustomShapeCreateTemplateEventArgs extends ASPxClientEventArgs {
  
  /**
    * Returns a container for an instance of the template.
    */
  var container: js.Any = js.native
  
  /**
    * Gets the currently processed diagram item.
    */
  var item: DiagramShape = js.native
}
object ASPxClientDiagramCustomShapeCreateTemplateEventArgs {
  
  @scala.inline
  def apply(container: js.Any, item: DiagramShape): ASPxClientDiagramCustomShapeCreateTemplateEventArgs = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramCustomShapeCreateTemplateEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDiagramCustomShapeCreateTemplateEventArgsOps[Self <: ASPxClientDiagramCustomShapeCreateTemplateEventArgs] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: DiagramShape): Self = this.set("item", value.asInstanceOf[js.Any])
  }
}
