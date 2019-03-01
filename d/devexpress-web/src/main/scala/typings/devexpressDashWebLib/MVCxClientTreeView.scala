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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("BeginCallback")(BeginCallback)
    __obj.updateDynamic("CallbackError")(CallbackError)
    __obj.updateDynamic("CheckedChanged")(CheckedChanged)
    __obj.updateDynamic("CollapseAll")(CollapseAll)
    __obj.updateDynamic("EndCallback")(EndCallback)
    __obj.updateDynamic("ExpandAll")(ExpandAll)
    __obj.updateDynamic("ExpandedChanged")(ExpandedChanged)
    __obj.updateDynamic("ExpandedChanging")(ExpandedChanging)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetNode")(GetNode)
    __obj.updateDynamic("GetNodeByName")(GetNodeByName)
    __obj.updateDynamic("GetNodeByText")(GetNodeByText)
    __obj.updateDynamic("GetNodeCount")(GetNodeCount)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetRootNode")(GetRootNode)
    __obj.updateDynamic("GetSelectedNode")(GetSelectedNode)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("NodeClick")(NodeClick)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetSelectedNode")(SetSelectedNode)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MVCxClientTreeView]
  }
}

