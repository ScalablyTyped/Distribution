package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapTreeViewEventMap extends ControlEventMap {
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
}

