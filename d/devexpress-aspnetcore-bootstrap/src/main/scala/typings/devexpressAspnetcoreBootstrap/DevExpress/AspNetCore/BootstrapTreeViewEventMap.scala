package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTreeViewEventMap extends ControlEventMap {
  
  var beginCallback: BeginCallbackEventArgs = js.native
  
  var callbackError: CallbackErrorEventArgs = js.native
  
  var checkedChanged: TreeViewNodeProcessingModeEventArgs = js.native
  
  var endCallback: EndCallbackEventArgs = js.native
  
  var expandedChanged: TreeViewNodeEventArgs = js.native
  
  var expandedChanging: TreeViewNodeCancelEventArgs = js.native
  
  var nodeClick: TreeViewNodeClickEventArgs = js.native
}
object BootstrapTreeViewEventMap {
  
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    checkedChanged: TreeViewNodeProcessingModeEventArgs,
    endCallback: EndCallbackEventArgs,
    expandedChanged: TreeViewNodeEventArgs,
    expandedChanging: TreeViewNodeCancelEventArgs,
    init: EventArgs,
    nodeClick: TreeViewNodeClickEventArgs
  ): BootstrapTreeViewEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], checkedChanged = checkedChanged.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], expandedChanging = expandedChanging.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], nodeClick = nodeClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTreeViewEventMap]
  }
  
  @scala.inline
  implicit class BootstrapTreeViewEventMapOps[Self <: BootstrapTreeViewEventMap] (val x: Self) extends AnyVal {
    
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
    def setBeginCallback(value: BeginCallbackEventArgs): Self = this.set("beginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = this.set("callbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedChanged(value: TreeViewNodeProcessingModeEventArgs): Self = this.set("checkedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = this.set("endCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedChanged(value: TreeViewNodeEventArgs): Self = this.set("expandedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedChanging(value: TreeViewNodeCancelEventArgs): Self = this.set("expandedChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeClick(value: TreeViewNodeClickEventArgs): Self = this.set("nodeClick", value.asInstanceOf[js.Any])
  }
}
