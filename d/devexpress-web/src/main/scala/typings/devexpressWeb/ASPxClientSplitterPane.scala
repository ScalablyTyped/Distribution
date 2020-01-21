package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the splitter's SplitterPane object.
  */
@JSGlobal("ASPxClientSplitterPane")
@js.native
class ASPxClientSplitterPane () extends js.Object {
  /**
    * Gets the index of the current pane within the pane collection to which it belongs.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the current splitter pane.
    */
  var name: String = js.native
  /**
    * Collapses the current pane and occupies its space by maximizing the specified pane. true if the current pane has been collapsed successfully; otherwise, false.
    * @param maximizedPane A ASPxClientSplitterPane object specifying the pane to be maximized to occupy the freed space.
    */
  def Collapse(maximizedPane: ASPxClientSplitterPane): Boolean = js.native
  /**
    * Collapses the current pane in a backward direction, and occupies its space by maximizing the next adjacent pane.
    */
  def CollapseBackward(): Boolean = js.native
  /**
    * Collapses the current pane in a forward direction and occupies its space by maximizing the previous adjacent pane.
    */
  def CollapseForward(): Boolean = js.native
  /**
    * Expands the current pane object on the client side.
    */
  def Expand(): Boolean = js.native
  /**
    * Gets the height of the pane's content area.
    */
  def GetClientHeight(): Double = js.native
  /**
    * Gets the width of the pane's content area.
    */
  def GetClientWidth(): Double = js.native
  /**
    * Returns an iframe object containing a web page specified via the pane's SplitterPane.ContentUrl property (or the ASPxClientSplitterPane.SetContentUrl client method).
    */
  def GetContentIFrame(): js.Any = js.native
  /**
    * Gets the URL of a web page displayed as a pane's content.
    */
  def GetContentUrl(): String = js.native
  /**
    * Returns an HTML element representing a splitter pane object.
    */
  def GetElement(): js.Any = js.native
  /**
    * Returns the next sibling pane of the current pane.
    */
  def GetNextPane(): ASPxClientSplitterPane = js.native
  /**
    * Returns the current pane's immediate child pane specified by its index. An ASPxClientSplitterPane object representing the pane's immediate child pane located at the specified index within the pane's SplitterPane.Panes collection.
    * @param index An integer value specifying the zero-based index of the child pane to be retrieved.
    */
  def GetPane(index: Double): ASPxClientSplitterPane = js.native
  /**
    * Returns the current pane's child pane specified by its name. An ASPxClientSplitterPane object that represents the current pane's child pane with the specified name.
    * @param name A string value specifying the name of the pane.
    */
  def GetPaneByName(name: String): ASPxClientSplitterPane = js.native
  /**
    * Returns the number of the current pane's immediate child panes.
    */
  def GetPaneCount(): Double = js.native
  /**
    * Returns the immediate parent of the current pane.
    */
  def GetParentPane(): ASPxClientSplitterPane = js.native
  /**
    * Returns the previous sibling pane of the current pane.
    */
  def GetPrevPane(): ASPxClientSplitterPane = js.native
  /**
    * Returns the distance between the left edge of the pane content and the leftmost portion of the content currently visible in the pane.
    */
  def GetScrollLeft(): Double = js.native
  /**
    * Returns the distance between the top edge of the pane content and the topmost portion of the content currently visible in the pane.
    */
  def GetScrollTop(): Double = js.native
  /**
    * Returns the splitter pane's size, in pixels or percents.
    */
  def GetSize(): String = js.native
  /**
    * Returns a client splitter object that contains the current pane.
    */
  def GetSplitter(): ASPxClientSplitter = js.native
  /**
    * Returns whether the pane is collapsed.
    */
  def IsCollapsed(): Boolean = js.native
  /**
    * Returns whether the pane's content is loaded from an external web page.
    */
  def IsContentUrlPane(): Boolean = js.native
  /**
    * Determines whether the current pane is the first pane within the SplitterPaneCollection.
    */
  def IsFirstPane(): Boolean = js.native
  /**
    * Determines whether the current pane is the last pane within the SplitterPaneCollection.
    */
  def IsLastPane(): Boolean = js.native
  /**
    * Returns a value that indicates the orientation in which the current pane and its sibling panes are stacked.
    */
  def IsVertical(): Boolean = js.native
  /**
    * Forces the client ASPxClientSplitter.PaneResized event to be generated.
    */
  def RaiseResizedEvent(): Unit = js.native
  /**
    * Refreshes the content of the web page displayed within the current pane.
    */
  def RefreshContentUrl(): Unit = js.native
  /**
    * Specifies whether the current pane can be resized by end-users on the client side.
    * @param allowResize true if pane resizing is allowed; otherwise, false.
    */
  def SetAllowResize(allowResize: Boolean): Unit = js.native
  /**
    * Sets the URL to point to a web page that should be loaded into, and displayed within the current pane, but should not be cached by a client browser.
    * @param url A string value specifying the URL to a web page displayed within the pane.
    * @param preventBrowserCaching true to prevent the browser to cache the loaded content; false to allow browser caching.
    */
  def SetContentUrl(url: String): Unit = js.native
  def SetContentUrl(url: String, preventBrowserCaching: Boolean): Unit = js.native
  /**
    * Specifies the distance between the left edge of the pane content and the leftmost portion of the content currently visible in the pane.
    * @param value An integer value that is the distance (in pixels).
    */
  def SetScrollLeft(value: Double): Unit = js.native
  /**
    * Specifies the distance between the top edge of the pane content and the topmost portion of the content currently visible in the pane.
    * @param value An integer value that is the distance (in pixels).
    */
  def SetScrollTop(value: Double): Unit = js.native
  def SetSize(size: String): Unit = js.native
  /**
    * Specifies the splitter pane's size in pixels.
    * @param size An integer value that specifies the splitter pane's size.
    */
  def SetSize(size: Double): Unit = js.native
}

