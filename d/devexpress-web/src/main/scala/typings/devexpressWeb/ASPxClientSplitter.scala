package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxSplitter object.
  */
@js.native
trait ASPxClientSplitter extends ASPxClientControl {
  /**
    * Fires after a pane has been collapsed.
    */
  var PaneCollapsed: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]] = js.native
  /**
    * Fires before a pane is collapsed.
    */
  var PaneCollapsing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]] = js.native
  /**
    * Fires after a specific web page has been loaded into a pane.
    */
  var PaneContentUrlLoaded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]] = js.native
  /**
    * Fires after a pane has been expanded.
    */
  var PaneExpanded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]] = js.native
  /**
    * Fires before a pane is expanded.
    */
  var PaneExpanding: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]] = js.native
  /**
    * Occurs when a pane resize operation has been completed.
    */
  var PaneResizeCompleted: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]] = js.native
  /**
    * Fires after a pane has been resized.
    */
  var PaneResized: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]] = js.native
  /**
    * Fires before a pane is resized.
    */
  var PaneResizing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]] = js.native
  /**
    * Returns a string value that represents the client state of splitter panes.
    */
  def GetLayoutData(): String = js.native
  /**
    * Returns the splitter's root pane specified by its index within the ASPxSplitter.Panes collection. An ASPxClientSplitterPane object representing the root pane located at the specified index within the splitter's ASPxSplitter.Panes collection.
    * @param index An integer value specifying the zero-based index of the root pane to be retrieved.
    */
  def GetPane(index: Double): ASPxClientSplitterPane = js.native
  /**
    * Returns a pane specified by its name. An ASPxClientSplitterPane object that represents the pane with the specified name.
    * @param name A string value specifying the name of the pane.
    */
  def GetPaneByName(name: String): ASPxClientSplitterPane = js.native
  /**
    * Returns the number of panes at the root level of a splitter.
    */
  def GetPaneCount(): Double = js.native
  /**
    * Specifies whether the control's panes can be resized by end-users on the client side.
    * @param allowResize true if pane resizing is allowed; otherwise, false.
    */
  def SetAllowResize(allowResize: Boolean): Unit = js.native
}

object ASPxClientSplitter {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetLayoutData: () => String,
    GetMainElement: () => js.Any,
    GetPane: Double => ASPxClientSplitterPane,
    GetPaneByName: String => ASPxClientSplitterPane,
    GetPaneCount: () => Double,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    PaneCollapsed: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneCollapsing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]],
    PaneContentUrlLoaded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneExpanded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneExpanding: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]],
    PaneResizeCompleted: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneResized: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneResizing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetAllowResize: Boolean => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientSplitter = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetLayoutData = js.Any.fromFunction0(GetLayoutData), GetMainElement = js.Any.fromFunction0(GetMainElement), GetPane = js.Any.fromFunction1(GetPane), GetPaneByName = js.Any.fromFunction1(GetPaneByName), GetPaneCount = js.Any.fromFunction0(GetPaneCount), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], PaneCollapsed = PaneCollapsed.asInstanceOf[js.Any], PaneCollapsing = PaneCollapsing.asInstanceOf[js.Any], PaneContentUrlLoaded = PaneContentUrlLoaded.asInstanceOf[js.Any], PaneExpanded = PaneExpanded.asInstanceOf[js.Any], PaneExpanding = PaneExpanding.asInstanceOf[js.Any], PaneResizeCompleted = PaneResizeCompleted.asInstanceOf[js.Any], PaneResized = PaneResized.asInstanceOf[js.Any], PaneResizing = PaneResizing.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetAllowResize = js.Any.fromFunction1(SetAllowResize), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSplitter]
  }
  @scala.inline
  implicit class ASPxClientSplitterOps[Self <: ASPxClientSplitter] (val x: Self) extends AnyVal {
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
    def setGetLayoutData(value: () => String): Self = this.set("GetLayoutData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPane(value: Double => ASPxClientSplitterPane): Self = this.set("GetPane", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPaneByName(value: String => ASPxClientSplitterPane): Self = this.set("GetPaneByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPaneCount(value: () => Double): Self = this.set("GetPaneCount", js.Any.fromFunction0(value))
    @scala.inline
    def setPaneCollapsed(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = this.set("PaneCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneCollapsing(value: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]): Self = this.set("PaneCollapsing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneContentUrlLoaded(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = this.set("PaneContentUrlLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneExpanded(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = this.set("PaneExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneExpanding(value: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]): Self = this.set("PaneExpanding", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneResizeCompleted(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = this.set("PaneResizeCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneResized(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = this.set("PaneResized", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaneResizing(value: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]): Self = this.set("PaneResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetAllowResize(value: Boolean => Unit): Self = this.set("SetAllowResize", js.Any.fromFunction1(value))
  }
  
}

