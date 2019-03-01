package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("beginCallback")(beginCallback)
    __obj.updateDynamic("callbackError")(callbackError)
    __obj.updateDynamic("checkedChanged")(checkedChanged)
    __obj.updateDynamic("endCallback")(endCallback)
    __obj.updateDynamic("expandedChanged")(expandedChanged)
    __obj.updateDynamic("expandedChanging")(expandedChanging)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("nodeClick")(nodeClick)
    __obj.asInstanceOf[BootstrapTreeViewEventMap]
  }
}

