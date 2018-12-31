package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the splitter's SplitterPane object.
  */
@js.native
trait ASPxClientSplitterPane extends js.Object {
  /**
    * Gets the index of the current pane within the pane collection to which it belongs.
    * Value: An integer value representing the zero-based index of the current pane within the SplitterPaneCollection collection.
    */
  var index: scala.Double = js.native
  /**
    * Gets the name that uniquely identifies the current splitter pane.
    * Value: A string value that represents the value assigned to the pane's Name property.
    */
  var name: java.lang.String = js.native
  /**
    * Collapses the current pane and occupies its space by maximizing the specified pane.
    * @param maximizedPane A ASPxClientSplitterPane object specifying the pane to be maximized to occupy the freed space.
    */
  def Collapse(maximizedPane: ASPxClientSplitterPane): scala.Boolean = js.native
  /**
    * Collapses the current pane in a backward direction, and occupies its space by maximizing the next adjacent pane.
    */
  def CollapseBackward(): scala.Boolean = js.native
  /**
    * Collapses the current pane in a forward direction and occupies its space by maximizing the previous adjacent pane.
    */
  def CollapseForward(): scala.Boolean = js.native
  /**
    * Expands the current pane object on the client side.
    */
  def Expand(): scala.Boolean = js.native
  /**
    * Gets the height of the pane's content area.
    */
  def GetClientHeight(): scala.Double = js.native
  /**
    * Gets the width of the pane's content area.
    */
  def GetClientWidth(): scala.Double = js.native
  /**
    * Returns an iframe object containing a web page specified via the pane's SetContentUrl client method).
    */
  def GetContentIFrame(): js.Object = js.native
  /**
    * Gets the URL of a web page displayed as a pane's content.
    */
  def GetContentUrl(): java.lang.String = js.native
  /**
    * Returns an HTML element representing a splitter pane object.
    */
  def GetElement(): js.Object = js.native
  /**
    * Returns the next sibling pane of the current pane.
    */
  def GetNextPane(): ASPxClientSplitterPane = js.native
  /**
    * Returns the current pane's immediate child pane specified by its index.
    * @param index An integer value specifying the zero-based index of the child pane to be retrieved.
    */
  def GetPane(index: scala.Double): ASPxClientSplitterPane = js.native
  /**
    * Returns the current pane's child pane specified by its name.
    * @param name A string value specifying the name of the pane.
    */
  def GetPaneByName(name: java.lang.String): ASPxClientSplitterPane = js.native
  /**
    * Returns the number of the current pane's immediate child panes.
    */
  def GetPaneCount(): scala.Double = js.native
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
  def GetScrollLeft(): scala.Double = js.native
  /**
    * Returns the distance between the top edge of the pane content and the topmost portion of the content currently visible in the pane.
    */
  def GetScrollTop(): scala.Double = js.native
  /**
    * Returns the splitter pane's size, in pixels or percents.
    */
  def GetSize(): java.lang.String = js.native
  /**
    * Returns a client splitter object that contains the current pane.
    */
  def GetSplitter(): ASPxClientSplitter = js.native
  /**
    * Returns whether the pane is collapsed.
    */
  def IsCollapsed(): scala.Boolean = js.native
  /**
    * Returns whether the pane's content is loaded from an external web page.
    */
  def IsContentUrlPane(): scala.Boolean = js.native
  /**
    * Determines whether the current pane is the first pane within the SplitterPaneCollection.
    */
  def IsFirstPane(): scala.Boolean = js.native
  /**
    * Determines whether the current pane is the last pane within the SplitterPaneCollection.
    */
  def IsLastPane(): scala.Boolean = js.native
  /**
    * Returns a value that indicates the orientation in which the current pane and its sibling panes are stacked.
    */
  def IsVertical(): scala.Boolean = js.native
  /**
    * Forces the client PaneResized event to be generated.
    */
  def RaiseResizedEvent(): scala.Unit = js.native
  /**
    * Refreshes the content of the web page displayed within the current pane.
    */
  def RefreshContentUrl(): scala.Unit = js.native
  /**
    * Specifies whether the current pane can be resized by end-users on the client side.
    * @param allowResize true if pane resizing is allowed; otherwise, false.
    */
  def SetAllowResize(allowResize: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the URL to point to a web page that should be loaded into, and displayed within the current pane.
    * @param url A string value specifying the URL to a web page displayed within the pane.
    */
  def SetContentUrl(url: java.lang.String): scala.Unit = js.native
  /**
    * Sets the URL to point to a web page that should be loaded into, and displayed within the current pane, but should not be cached by a client browser.
    * @param url A string value specifying the URL to a web page displayed within the pane.
    * @param preventBrowserCaching true to prevent the browser to cache the loaded content; false to allow browser caching.
    */
  def SetContentUrl(url: java.lang.String, preventBrowserCaching: scala.Boolean): scala.Unit = js.native
  /**
    * Specifies the distance between the left edge of the pane content and the leftmost portion of the content currently visible in the pane.
    * @param value An integer value that is the distance (in pixels).
    */
  def SetScrollLeft(value: scala.Double): scala.Unit = js.native
  /**
    * Specifies the distance between the top edge of the pane content and the topmost portion of the content currently visible in the pane.
    * @param value An integer value that is the distance (in pixels).
    */
  def SetScrollTop(value: scala.Double): scala.Unit = js.native
  /**
    * Specifies the splitter pane's size, in pixels or percents.
    * @param size A string value that specifies the splitter pane's size, in pixels or percents.
    */
  def SetSize(size: java.lang.String): scala.Unit = js.native
  /**
    * Specifies the splitter pane's size in pixels.
    * @param size An integer value that specifies the splitter pane's size.
    */
  def SetSize(size: scala.Double): scala.Unit = js.native
}

