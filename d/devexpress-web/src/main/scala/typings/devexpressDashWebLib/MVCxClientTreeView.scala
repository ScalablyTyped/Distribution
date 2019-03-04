package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the TreeView extension.
  */
trait MVCxClientTreeView extends ASPxClientTreeView {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientTreeView: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientTreeView]]
}

object MVCxClientTreeView {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientTreeView]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]],
    CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]],
    CollapseAll: js.Function0[scala.Unit],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]],
    ExpandAll: js.Function0[scala.Unit],
    ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]],
    ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetNode: js.Function1[scala.Double, ASPxClientTreeViewNode],
    GetNodeByName: js.Function1[java.lang.String, ASPxClientTreeViewNode],
    GetNodeByText: js.Function1[java.lang.String, ASPxClientTreeViewNode],
    GetNodeCount: js.Function0[scala.Double],
    GetParentControl: js.Function0[js.Object],
    GetRootNode: js.Function0[ASPxClientTreeViewNode],
    GetSelectedNode: js.Function0[ASPxClientTreeViewNode],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetSelectedNode: js.Function1[ASPxClientTreeViewNode, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): MVCxClientTreeView = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, BeginCallback = BeginCallback, CallbackError = CallbackError, CheckedChanged = CheckedChanged, CollapseAll = CollapseAll, EndCallback = EndCallback, ExpandAll = ExpandAll, ExpandedChanged = ExpandedChanged, ExpandedChanging = ExpandedChanging, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetNode = GetNode, GetNodeByName = GetNodeByName, GetNodeByText = GetNodeByText, GetNodeCount = GetNodeCount, GetParentControl = GetParentControl, GetRootNode = GetRootNode, GetSelectedNode = GetSelectedNode, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, NodeClick = NodeClick, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetSelectedNode = SetSelectedNode, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[MVCxClientTreeView]
  }
}

