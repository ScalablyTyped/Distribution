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
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetLayoutData = GetLayoutData, GetMainElement = GetMainElement, GetPane = GetPane, GetPaneByName = GetPaneByName, GetPaneCount = GetPaneCount, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, PaneCollapsed = PaneCollapsed, PaneCollapsing = PaneCollapsing, PaneContentUrlLoaded = PaneContentUrlLoaded, PaneExpanded = PaneExpanded, PaneExpanding = PaneExpanding, PaneResizeCompleted = PaneResizeCompleted, PaneResized = PaneResized, PaneResizing = PaneResizing, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetAllowResize = SetAllowResize, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientSplitter]
  }
}

