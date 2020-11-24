package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ItemClick and ItemDblClick events.
  */
@js.native
trait ASPxClientDiagramItemClickEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets an object that provides information about an item (shape or connector) related to the event.
    */
  var item: DiagramItem = js.native
}
object ASPxClientDiagramItemClickEventArgs {
  
  @scala.inline
  def apply(item: DiagramItem): ASPxClientDiagramItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramItemClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDiagramItemClickEventArgsOps[Self <: ASPxClientDiagramItemClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setItem(value: DiagramItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
}
