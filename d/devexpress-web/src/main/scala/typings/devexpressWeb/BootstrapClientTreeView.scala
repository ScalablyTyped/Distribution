package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapTreeView control.
  */
@js.native
trait BootstrapClientTreeView extends ASPxClientTreeView {
  /**
    * Selects the specified node within the Tree View control on the client side.
    * @param node A BootstrapClientTreeViewNode object specifying the node to select.
    */
  def SetSelectedNode(node: BootstrapClientTreeViewNode): Unit = js.native
}

object BootstrapClientTreeView {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]],
    CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]],
    CollapseAll: () => Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]],
    ExpandAll: () => Unit,
    ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]],
    ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]],
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetNode: Double => ASPxClientTreeViewNode,
    GetNodeByName: String => ASPxClientTreeViewNode,
    GetNodeByText: String => ASPxClientTreeViewNode,
    GetNodeCount: () => Double,
    GetParentControl: () => js.Any,
    GetRootNode: () => ASPxClientTreeViewNode,
    GetSelectedNode: () => ASPxClientTreeViewNode,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetSelectedNode: BootstrapClientTreeViewNode => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): BootstrapClientTreeView = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CheckedChanged = CheckedChanged.asInstanceOf[js.Any], CollapseAll = js.Any.fromFunction0(CollapseAll), EndCallback = EndCallback.asInstanceOf[js.Any], ExpandAll = js.Any.fromFunction0(ExpandAll), ExpandedChanged = ExpandedChanged.asInstanceOf[js.Any], ExpandedChanging = ExpandedChanging.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = js.Any.fromFunction0(GetNodeCount), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRootNode = js.Any.fromFunction0(GetRootNode), GetSelectedNode = js.Any.fromFunction0(GetSelectedNode), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], NodeClick = NodeClick.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetSelectedNode = js.Any.fromFunction1(SetSelectedNode), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeView]
  }
  @scala.inline
  implicit class BootstrapClientTreeViewOps[Self <: BootstrapClientTreeView] (val x: Self) extends AnyVal {
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
    def setSetSelectedNode(value: BootstrapClientTreeViewNode => Unit): Self = this.set("SetSelectedNode", js.Any.fromFunction1(value))
  }
  
}

