package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeFieldListActions event.
  */
@js.native
trait ASPxClientReportDesignerCustomizeFieldListActionsEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to the current item's available actions.
    */
  var Actions: js.Array[_] = js.native
  
  /**
    * Specifies the Field List's item that is currently being processed.
    */
  var Item: js.Any = js.native
}
object ASPxClientReportDesignerCustomizeFieldListActionsEventArgs {
  
  @scala.inline
  def apply(Actions: js.Array[_], Item: js.Any): ASPxClientReportDesignerCustomizeFieldListActionsEventArgs = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeFieldListActionsEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerCustomizeFieldListActionsEventArgsOps[Self <: ASPxClientReportDesignerCustomizeFieldListActionsEventArgs] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: js.Any*): Self = this.set("Actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[_]): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("Item", value.asInstanceOf[js.Any])
  }
}
