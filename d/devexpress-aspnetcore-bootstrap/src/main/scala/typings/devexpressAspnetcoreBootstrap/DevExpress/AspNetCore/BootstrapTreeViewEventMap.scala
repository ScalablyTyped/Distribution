package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapTreeViewEventMap
  extends StObject
     with ControlEventMap {
  
  var beginCallback: BeginCallbackEventArgs
  
  var callbackError: CallbackErrorEventArgs
  
  var checkedChanged: TreeViewNodeProcessingModeEventArgs
  
  var endCallback: EndCallbackEventArgs
  
  var expandedChanged: TreeViewNodeEventArgs
  
  var expandedChanging: TreeViewNodeCancelEventArgs
  
  var nodeClick: TreeViewNodeClickEventArgs
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
  implicit class BootstrapTreeViewEventMapMutableBuilder[Self <: BootstrapTreeViewEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginCallback(value: BeginCallbackEventArgs): Self = StObject.set(x, "beginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: CallbackErrorEventArgs): Self = StObject.set(x, "callbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedChanged(value: TreeViewNodeProcessingModeEventArgs): Self = StObject.set(x, "checkedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: EndCallbackEventArgs): Self = StObject.set(x, "endCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedChanged(value: TreeViewNodeEventArgs): Self = StObject.set(x, "expandedChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedChanging(value: TreeViewNodeCancelEventArgs): Self = StObject.set(x, "expandedChanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeClick(value: TreeViewNodeClickEventArgs): Self = StObject.set(x, "nodeClick", value.asInstanceOf[js.Any])
  }
}
