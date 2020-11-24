package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the SelectionChanged event.
  */
@js.native
trait ASPxClientDiagramSelectionChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets an array of the selected items (shapes or connectors).
    */
  var items: js.Array[DiagramItem] = js.native
}
object ASPxClientDiagramSelectionChangedEventArgs {
  
  @scala.inline
  def apply(items: js.Array[DiagramItem]): ASPxClientDiagramSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientDiagramSelectionChangedEventArgsOps[Self <: ASPxClientDiagramSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: DiagramItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[DiagramItem]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
