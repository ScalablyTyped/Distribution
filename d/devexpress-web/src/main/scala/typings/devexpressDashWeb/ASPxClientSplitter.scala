package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxSplitter object.
  */
@JSGlobal("ASPxClientSplitter")
@js.native
class ASPxClientSplitter () extends ASPxClientControl {
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

/* static members */
@JSGlobal("ASPxClientSplitter")
@js.native
object ASPxClientSplitter extends js.Object {
  /**
    * Converts the specified object to the ASPxClientSplitter type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientSplitter = js.native
}

