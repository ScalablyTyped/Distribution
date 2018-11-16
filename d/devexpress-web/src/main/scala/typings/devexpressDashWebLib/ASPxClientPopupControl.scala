package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the ASPxPopupControl control.
 */
@js.native
trait ASPxClientPopupControl extends ASPxClientPopupControlBase {
  /**
       * Occurs when a popup window's close button is clicked.
       */
  var CloseButtonClick: ASPxClientEvent[ASPxClientPopupWindowEventHandler[ASPxClientPopupControl]] = js.native
  /**
       * Brings the specified popup window to the front of the z-order.
       * @param window A ASPxClientPopupWindow object representing the popup window.
       */
  def BringWindowToFront(window: ASPxClientPopupWindow): scala.Unit = js.native
  /**
       * Returns the HTML code that is the content of the popup control's default popup window.
       */
  def GetContentHTML(): java.lang.String = js.native
  /**
       * Returns an object that invoked the default window.
       */
  def GetCurrentPopupElement(): js.Object = js.native
  /**
       * Returns an index of the object that invoked the default window within the PopupElementID list.
       */
  def GetCurrentPopupElementIndex(): scala.Double = js.native
  /**
       * Returns an object containing the information about a mouse event that invoked a default popup window.
       */
  def GetPopUpReasonMouseEvent(): js.Object = js.native
  /**
       * Returns a popup window specified by its index.
       * @param index An integer value specifying the zero-based index of the popup window object to be retrieved.
       */
  def GetWindow(index: scala.Double): ASPxClientPopupWindow = js.native
  /**
       * Returns a popup window specified by its name.
       * @param name A string value specifying the name of the popup window.
       */
  def GetWindowByName(name: java.lang.String): ASPxClientPopupWindow = js.native
  /**
       * Returns a value indicating whether the specified window is collapsed.
       * @param window An ASPxClientPopupWindow object specifying the popup window.
       */
  def GetWindowCollapsed(window: ASPxClientPopupWindow): scala.Boolean = js.native
  /**
       * Gets the height of the specified popup window's content region.
       * @param window An ASPxClientPopupWindow object that specifies the required popup window.
       */
  def GetWindowContentHeight(window: ASPxClientPopupWindow): scala.Double = js.native
  /**
       * Returns the HTML code that represents the contents of the specified popup window.
       * @param window An ASPxClientPopupWindow object that specifies the required popup window.
       */
  def GetWindowContentHtml(window: ASPxClientPopupWindow): java.lang.String = js.native
  /**
       * Returns an iframe object containing a web page specified via the specified popup window's SetWindowContentUrl client method).
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       */
  def GetWindowContentIFrame(window: ASPxClientPopupWindow): js.Object = js.native
  /**
       * Returns the URL pointing to the web page displayed within the control's specific popup window.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       */
  def GetWindowContentUrl(window: ASPxClientPopupWindow): java.lang.String = js.native
  /**
       * Gets the width of the specified popup window's content region.
       * @param window An ASPxClientPopupWindow object that specifies the required popup window.
       */
  def GetWindowContentWidth(window: ASPxClientPopupWindow): scala.Double = js.native
  /**
       * Returns the number of popup windows in the popup control.
       */
  def GetWindowCount(): scala.Double = js.native
  /**
       * Returns an object that invoked the specified popup window.
       * @param window An ASPxClientPopupWindow object that specifies the required popup window.
       */
  def GetWindowCurrentPopupElement(window: ASPxClientPopupWindow): js.Object = js.native
  /**
       * Returns an index of the object that invoked the specified popup window, within the window's PopupElementID list.
       * @param window An ASPxClientPopupWindow object that specifies the required popup window.
       */
  def GetWindowCurrentPopupElementIndex(window: ASPxClientPopupWindow): scala.Double = js.native
  /**
       * Returns the height of a specific popup window.
       * @param window A ASPxClientPopupWindow object that specifies the required popup window.
       */
  def GetWindowHeight(window: ASPxClientPopupWindow): scala.Double = js.native
  /**
       * Returns a value indicating whether the specified window is maximized.
       * @param window An ASPxClientPopupWindow object specifying the popup window.
       */
  def GetWindowMaximized(window: ASPxClientPopupWindow): scala.Boolean = js.native
  /**
       * Returns a value indicating whether the specified window is pinned.
       * @param window An ASPxClientPopupWindow object specifying the popup window.
       */
  def GetWindowPinned(window: ASPxClientPopupWindow): scala.Boolean = js.native
  /**
       * Returns an object containing the information about a mouse event that invoked the specified popup window.
       * @param window A ASPxClientPopupWindow object that specifies the required popup window.
       */
  def GetWindowPopUpReasonMouseEvent(window: ASPxClientPopupWindow): js.Object = js.native
  /**
       * Returns the width of a specific popup window.
       * @param window A ASPxClientPopupWindow object that specifies the required popup window.
       */
  def GetWindowWidth(window: ASPxClientPopupWindow): scala.Double = js.native
  /**
       * Closes the popup control's specified window.
       * @param window A ASPxClientPopupWindow object representing the popup window to close.
       */
  def HideWindow(window: ASPxClientPopupWindow): scala.Unit = js.native
  /**
       * Returns a value that specifies whether the popup control's specific window is displayed.
       * @param window A ASPxClientPopupWindow object representing the popup window whose visibility is checked.
       */
  def IsWindowVisible(window: ASPxClientPopupWindow): scala.Boolean = js.native
  /**
       * Sends a callback with parameters to update the popup window by processing the related popup window.
       * @param window 
       * @param parameter 
       */
  def PerformWindowCallback(window: ASPxClientPopupWindow, parameter: java.lang.String): scala.Unit = js.native
  /**
       * Sends a callback with parameters to update the popup window by processing the related popup window and the passed information on the server.
       * @param window A ASPxClientPopupWindow object identifying the processed popup window.
       * @param parameter A string value that represents any information that needs to be sent to the server-side CustomCallback event.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformWindowCallback(
    window: ASPxClientPopupWindow,
    parameter: java.lang.String,
    onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Refreshes the connection between the ASPxPopupControl and the popup element.
       */
  def RefreshPopupElementConnection(): scala.Unit = js.native
  /**
       * Refreshes the content of the web page displayed within the control's specific popup window.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       */
  def RefreshWindowContentUrl(window: ASPxClientPopupWindow): scala.Unit = js.native
  /**
       * Sets the maximum height of the popup window in adaptive mode.
       * @param maxHeight A string value specifying the maximum height of the popup window in adaptive mode as a percentage of the browser window inner height value.
       */
  def SetAdaptiveMaxHeight(maxHeight: java.lang.String): scala.Unit = js.native
  /**
       * Sets the maximum height of the popup window in adaptive mode.
       * @param maxHeight An integer value specifying the maximum height of the popup window in adaptive mode.
       */
  def SetAdaptiveMaxHeight(maxHeight: scala.Double): scala.Unit = js.native
  /**
       * Sets the maximum width of the popup window in adaptive mode.
       * @param maxWidth A string value specifying the maximum width of the popup window in adaptive mode as a percentage of the browser window inner width value.
       */
  def SetAdaptiveMaxWidth(maxWidth: java.lang.String): scala.Unit = js.native
  /**
       * Sets the maximum width of the popup window in adaptive mode.
       * @param maxWidth An integer value specifying the maximum width of the popup window in adaptive mode.
       */
  def SetAdaptiveMaxWidth(maxWidth: scala.Double): scala.Unit = js.native
  /**
       * Sets the minimum height of the popup window in adaptive mode.
       * @param minHeight A string value specifying the minimum height of the popup window in adaptive mode as a percentage of the browser window inner height value.
       */
  def SetAdaptiveMinHeight(minHeight: java.lang.String): scala.Unit = js.native
  /**
       * Sets the minimum height of the popup window in adaptive mode.
       * @param minHeight An integer value specifying the minimum height of the popup window in adaptive mode.
       */
  def SetAdaptiveMinHeight(minHeight: scala.Double): scala.Unit = js.native
  /**
       * Sets the minimum width of the popup window in adaptive mode.
       * @param minWidth A string value specifying the minimum width of the popup window in adaptive mode as a percentage of the browser window inner width value.
       */
  def SetAdaptiveMinWidth(minWidth: java.lang.String): scala.Unit = js.native
  /**
       * Sets the minimum width of the popup window in adaptive mode.
       * @param minWidth An integer value specifying the minimum width of the popup window in adaptive mode.
       */
  def SetAdaptiveMinWidth(minWidth: scala.Double): scala.Unit = js.native
  /**
       * Defines the HTML content for the popup control's default popup window.
       * @param html A string value that is the HTML code defining the content of the popup window.
       */
  def SetContentHTML(html: java.lang.String): scala.Unit = js.native
  /**
       * Sets the ID of a web control or HTML element (or a list of IDs) with which the current popup control is associated.
       * @param popupElementId A string value specifying the ID (or a list of IDs) of the web control or HTML element to which the popup control is associated.
       */
  def SetPopupElementID(popupElementId: java.lang.String): scala.Unit = js.native
  /**
       * Specifies the default popup window's size.
       * @param width An integer value that specifies the default popup window's width.
       * @param height An integer value that specifies the default popup window's height.
       */
  def SetSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
       * Sets the maximum height of the specified popup window in adaptive mode.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       * @param maxHeight An integer value specifying the maximum height of the popup window in adaptive mode as a percentage of the browser window inner height value.
       */
  def SetWindowAdaptiveMaxHeight(window: ASPxClientPopupWindow, maxHeight: java.lang.String): scala.Unit = js.native
  /**
       * Sets the maximum height of the specified popup window in adaptive mode.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       * @param maxHeight An integer value specifying the maximum height of the popup window in adaptive mode.
       */
  def SetWindowAdaptiveMaxHeight(window: ASPxClientPopupWindow, maxHeight: scala.Double): scala.Unit = js.native
  /**
       * Sets the maximum width of the specified popup window in adaptive mode.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       * @param maxWidth An integer value specifying the maximum width of the popup window in adaptive mode as a percentage of the browser window inner width value.
       */
  def SetWindowAdaptiveMaxWidth(window: ASPxClientPopupWindow, maxWidth: java.lang.String): scala.Unit = js.native
  /**
       * Sets the maximum width of the specified popup window in adaptive mode.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       * @param maxWidth An integer value specifying the maximum width of the popup window in adaptive mode.
       */
  def SetWindowAdaptiveMaxWidth(window: ASPxClientPopupWindow, maxWidth: scala.Double): scala.Unit = js.native
  /**
       * Sets the minimum height of the specified popup window in adaptive mode.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       * @param minHeight An integer value specifying the minimum height of the popup window in adaptive mode as a percentage of the browser window inner height value.
       */
  def SetWindowAdaptiveMinHeight(window: ASPxClientPopupWindow, minHeight: java.lang.String): scala.Unit = js.native
  /**
       * Sets the minimum height of the specified popup window in adaptive mode.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       * @param minHeight An integer value specifying the minimum height of the popup window in adaptive mode.
       */
  def SetWindowAdaptiveMinHeight(window: ASPxClientPopupWindow, minHeight: scala.Double): scala.Unit = js.native
  /**
       * Sets the minimum width of the specified popup window in adaptive mode.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       * @param minWidth An integer value specifying the minimum width of the popup window in adaptive mode as a percentage of the browser window inner width value.
       */
  def SetWindowAdaptiveMinWidth(window: ASPxClientPopupWindow, minWidth: java.lang.String): scala.Unit = js.native
  /**
       * Sets the minimum width of the specified popup window in adaptive mode.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       * @param minWidth An integer value specifying the minimum width of the popup window in adaptive mode.
       */
  def SetWindowAdaptiveMinWidth(window: ASPxClientPopupWindow, minWidth: scala.Double): scala.Unit = js.native
  /**
       * Sets a value indicating whether the specified window is collapsed.
       * @param window An ASPxClientPopupWindow object specifying the popup window.
       * @param value true to collapse the window; otherwise, false.
       */
  def SetWindowCollapsed(window: ASPxClientPopupWindow, value: scala.Boolean): scala.Unit = js.native
  /**
       * Defines the HTML content for a specific popup window within the popup control.
       * @param window An ASPxClientPopupWindow object that specifies the required popup window.
       * @param html A string value that represents the HTML code defining the content of the specified popup window.
       */
  def SetWindowContentHtml(window: ASPxClientPopupWindow, html: java.lang.String): scala.Unit = js.native
  /**
       * Sets the URL pointing to the web page that should be loaded into and displayed within the control's specific popup window.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       * @param url A string value specifying the URL to the web page to be displayed within the specified popup window.
       */
  def SetWindowContentUrl(window: ASPxClientPopupWindow, url: java.lang.String): scala.Unit = js.native
  /**
       * Sets a value indicating whether the specified window is maximized.
       * @param window An ASPxClientPopupWindow object specifying the popup window.
       * @param value true to maximize the window; otherwise, false.
       */
  def SetWindowMaximized(window: ASPxClientPopupWindow, value: scala.Boolean): scala.Unit = js.native
  /**
       * Sets a value indicating whether the specified window is pinned.
       * @param window An ASPxClientPopupWindow object specifying the popup window.
       * @param value true to pin the window; otherwise, false.
       */
  def SetWindowPinned(window: ASPxClientPopupWindow, value: scala.Boolean): scala.Unit = js.native
  /**
       * Sets the ID of a web control or HTML element (or a list of IDs) with which the current popup control's window is associated.
       * @param window An ASPxClientPopupWindow object representing a popup control's window.
       * @param popupElementId A string value specifying the ID (or a list of IDs) of the web control or HTML element with which the popup control's window is associated.
       */
  def SetWindowPopupElementID(window: ASPxClientPopupWindow, popupElementId: java.lang.String): scala.Unit = js.native
  /**
       * Specifies the size of a specific popup window.
       * @param window A ASPxClientPopupWindow object that specifies the required popup window.
       * @param width An integer value that specifies the required popup window's width.
       * @param height An integer value that specifies the required popup window's height.
       */
  def SetWindowSize(window: ASPxClientPopupWindow, width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
       * Invokes the popup control's specific window.
       * @param window A ASPxClientPopupWindow object representing the popup window to display.
       */
  def ShowWindow(window: ASPxClientPopupWindow): scala.Unit = js.native
  /**
       * Invokes the specified popup window at the popup element with the specified index.
       * @param window A ASPxClientPopupWindow object that specifies the required popup window.
       * @param popupElementIndex An integer value specifying the zero-based index of the popup element within the window's PopupElementID list.
       */
  def ShowWindow(window: ASPxClientPopupWindow, popupElementIndex: scala.Double): scala.Unit = js.native
  /**
       * Invokes the popup control's specific window and displays it over the specified HTML element.
       * @param window A ASPxClientPopupWindow object representing the popup window to display.
       * @param htmlElement An object specifying the HTML element relative to whose position the default popup window is invoked.
       */
  def ShowWindowAtElement(window: ASPxClientPopupWindow, htmlElement: js.Object): scala.Unit = js.native
  /**
       * Invokes the popup control's specific window and displays it over an HTML element specified by its unique identifier.
       * @param window A ASPxClientPopupWindow object representing the popup window to display.
       * @param id A string value that specifies the hierarchically qualified identifier of an HTML element relative to whose position the default popup window is invoked.
       */
  def ShowWindowAtElementByID(window: ASPxClientPopupWindow, id: java.lang.String): scala.Unit = js.native
  /**
       * Invokes the popup control's specific popup window at the specified position.
       * @param window A ASPxClientPopupWindow object representing the popup window to display.
       * @param x A integer value specifying the x-coordinate of the popup window's display position.
       * @param y A integer value specifying the y-coordinate of the popup window's display position.
       */
  def ShowWindowAtPos(window: ASPxClientPopupWindow, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
       * Stretches the popup window in adaptive mode vertically to the full height of the browser window.
       */
  def StretchVertically(): scala.Unit = js.native
  /**
       * Updates the default popup window's position, to correctly align it at either the specified element, or the center of the browser's window.
       */
  def UpdatePosition(): scala.Unit = js.native
  /**
       * Updates the default popup window's position, to correctly align it at the specified HTML element.
       * @param htmlElement An object specifying the HTML element to which the default popup window is aligned using the PopupVerticalAlign properties.
       */
  def UpdatePositionAtElement(htmlElement: js.Object): scala.Unit = js.native
  /**
       * Updates the specified popup window's position, to correctly align it at either the specified element, or the center of the browser's window.
       * @param window An ASPxClientPopupWindow object that specifies the required popup window.
       */
  def UpdateWindowPosition(window: ASPxClientPopupWindow): scala.Unit = js.native
  /**
       * Updates the specified popup window's position, to correctly align it at the specified HTML element.
       * @param window An ASPxClientPopupWindow object that specifies the required popup window.
       * @param htmlElement An object specifying the HTML element to which the specified popup window is aligned using the PopupVerticalAlign properties.
       */
  def UpdateWindowPositionAtElement(window: ASPxClientPopupWindow, htmlElement: js.Object): scala.Unit = js.native
  /**
       * Stretches the specified popup window in adaptive mode vertically to the full height of the browser window.
       * @param window A ASPxClientPopupWindow object representing the required popup window.
       */
  def WindowStretchVertically(window: ASPxClientPopupWindow): scala.Unit = js.native
}

