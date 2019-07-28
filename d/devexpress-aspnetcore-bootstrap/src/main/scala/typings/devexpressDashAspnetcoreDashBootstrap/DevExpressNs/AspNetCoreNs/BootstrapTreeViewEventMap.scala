package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal(beginCallback = beginCallback, callbackError = callbackError, checkedChanged = checkedChanged, endCallback = endCallback, expandedChanged = expandedChanged, expandedChanging = expandedChanging, init = init, nodeClick = nodeClick)
  
    __obj.asInstanceOf[BootstrapTreeViewEventMap]
  }
}

