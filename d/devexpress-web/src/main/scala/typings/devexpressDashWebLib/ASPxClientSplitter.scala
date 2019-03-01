package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxSplitter object.
  */
trait ASPxClientSplitter extends ASPxClientControl {
  /**
    * Fires after a pane has been collapsed.
    */
  var PaneCollapsed: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  /**
    * Fires before a pane is collapsed.
    */
  var PaneCollapsing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]
  /**
    * Fires after a specific web page has been loaded into a pane.
    */
  var PaneContentUrlLoaded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  /**
    * Fires after a pane has been expanded.
    */
  var PaneExpanded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  /**
    * Fires before a pane is expanded.
    */
  var PaneExpanding: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]
  /**
    * Occurs when a pane resize operation has been completed.
    */
  var PaneResizeCompleted: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  /**
    * Fires after a pane has been resized.
    */
  var PaneResized: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  /**
    * Fires before a pane is resized.
    */
  var PaneResizing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]
  /**
    * Returns a string value that represents the client state of splitter panes.
    */
  def GetLayoutData(): java.lang.String
  /**
    * Returns the splitter's root pane specified by its index within the Panes collection.
    * @param index An integer value specifying the zero-based index of the root pane to be retrieved.
    */
  def GetPane(index: scala.Double): ASPxClientSplitterPane
  /**
    * Returns a pane specified by its name.
    * @param name A string value specifying the name of the pane.
    */
  def GetPaneByName(name: java.lang.String): ASPxClientSplitterPane
  /**
    * Returns the number of panes at the root level of a splitter.
    */
  def GetPaneCount(): scala.Double
  /**
    * Specifies whether the control's panes can be resized by end-users on the client side.
    * @param allowResize true if pane resizing is allowed; otherwise, false.
    */
  def SetAllowResize(allowResize: scala.Boolean): scala.Unit
}

object ASPxClientSplitter {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetLayoutData: js.Function0[java.lang.String],
    GetMainElement: js.Function0[js.Object],
    GetPane: js.Function1[scala.Double, ASPxClientSplitterPane],
    GetPaneByName: js.Function1[java.lang.String, ASPxClientSplitterPane],
    GetPaneCount: js.Function0[scala.Double],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    PaneCollapsed: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneCollapsing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]],
    PaneContentUrlLoaded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneExpanded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneExpanding: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]],
    PaneResizeCompleted: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneResized: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneResizing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetAllowResize: js.Function1[scala.Boolean, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientSplitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetLayoutData")(GetLayoutData)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetPane")(GetPane)
    __obj.updateDynamic("GetPaneByName")(GetPaneByName)
    __obj.updateDynamic("GetPaneCount")(GetPaneCount)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("PaneCollapsed")(PaneCollapsed)
    __obj.updateDynamic("PaneCollapsing")(PaneCollapsing)
    __obj.updateDynamic("PaneContentUrlLoaded")(PaneContentUrlLoaded)
    __obj.updateDynamic("PaneExpanded")(PaneExpanded)
    __obj.updateDynamic("PaneExpanding")(PaneExpanding)
    __obj.updateDynamic("PaneResizeCompleted")(PaneResizeCompleted)
    __obj.updateDynamic("PaneResized")(PaneResized)
    __obj.updateDynamic("PaneResizing")(PaneResizing)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetAllowResize")(SetAllowResize)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientSplitter]
  }
}

