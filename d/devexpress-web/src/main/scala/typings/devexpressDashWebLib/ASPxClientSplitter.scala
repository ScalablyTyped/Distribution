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

