package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxPopupControl control.
  */
@js.native
trait ASPxClientPopupControl
  extends StObject
     with ASPxClientPopupControlBase {
  
  /**
    * Brings the specified popup window to the front of the z-order.
    * @param window A ASPxClientPopupWindow object representing the popup window.
    */
  def BringWindowToFront(window: ASPxClientPopupWindow): Unit = js.native
  
  /**
    * Occurs when a user clicks the popup window's close button.
    */
  var CloseButtonClick: ASPxClientEvent[ASPxClientPopupWindowEventHandler[ASPxClientPopupControl]] = js.native
  
  /** @deprecated Use the GetContentHtml method instead. */
  /**
    * Returns the HTML code that is the content of the popup control's default popup window.
    */
  def GetContentHTML(): String = js.native
  
  /**
    * Returns an object that invoked the default window.
    */
  def GetCurrentPopupElement(): js.Any = js.native
  
  /**
    * Returns an index of the object that invoked the default window within the ASPxPopupControl.PopupElementID list.
    */
  def GetCurrentPopupElementIndex(): Double = js.native
  
  /**
    * Returns an object containing the information about a mouse event that invoked a default popup window.
    */
  def GetPopUpReasonMouseEvent(): js.Any = js.native
  
  /**
    * Returns a popup window specified by its index. An ASPxClientPopupWindow object representing the popup window located at the specified index within the control's ASPxPopupControl.Windows collection.
    * @param index An integer value specifying the zero-based index of the popup window object to be retrieved.
    */
  def GetWindow(index: Double): ASPxClientPopupWindow = js.native
  
  /**
    * Returns a popup window specified by its name. An ASPxClientPopupWindow object that represents the popup window with the specified name.
    * @param name A string value specifying the name of the popup window.
    */
  def GetWindowByName(name: String): ASPxClientPopupWindow = js.native
  
  /**
    * Returns a value indicating whether the specified window is collapsed. true if the window is collapsed; otherwise, false.
    * @param window An ASPxClientPopupWindow object specifying the popup window.
    */
  def GetWindowCollapsed(window: ASPxClientPopupWindow): Boolean = js.native
  
  /**
    * Gets the height of the specified popup window's content region. An integer value representing the height of the content region.
    * @param window An ASPxClientPopupWindow object that specifies the required popup window.
    */
  def GetWindowContentHeight(window: ASPxClientPopupWindow): Double = js.native
  
  /**
    * Returns the HTML code that represents the contents of the specified popup window. A string that represents the specified popup window's HTML content.
    * @param window An ASPxClientPopupWindow object that specifies the required popup window.
    */
  def GetWindowContentHtml(window: ASPxClientPopupWindow): String = js.native
  
  /**
    * Returns an iframe object containing a web page specified via the specified popup window's PopupWindow.ContentUrl property (or the popup control's client ASPxClientPopupControl.SetWindowContentUrl method). The iframe object that contains a web page displayed within the specified popup window.
    * @param window A ASPxClientPopupWindow object representing the required popup window.
    */
  def GetWindowContentIFrame(window: ASPxClientPopupWindow): js.Any = js.native
  
  /**
    * Returns the URL pointing to the web page displayed within the control's specific popup window. A string value representing the URL to the web page displayed within the specified popup window.
    * @param window A ASPxClientPopupWindow object representing the required popup window.
    */
  def GetWindowContentUrl(window: ASPxClientPopupWindow): String = js.native
  
  /**
    * Gets the width of the specified popup window's content region. An integer value representing the width of the content region.
    * @param window An ASPxClientPopupWindow object that specifies the required popup window.
    */
  def GetWindowContentWidth(window: ASPxClientPopupWindow): Double = js.native
  
  /**
    * Returns the number of popup windows in the popup control.
    */
  def GetWindowCount(): Double = js.native
  
  /**
    * Returns an object that invoked the specified popup window. An object that invoked the specified window.
    * @param window An ASPxClientPopupWindow object that specifies the required popup window.
    */
  def GetWindowCurrentPopupElement(window: ASPxClientPopupWindow): js.Any = js.native
  
  /**
    * Returns an index of the object that invoked the specified popup window, within the window's PopupWindow.PopupElementID list. An Int32 value that is the zero-based position of object's ID within the PopupElementID list.
    * @param window An ASPxClientPopupWindow object that specifies the required popup window.
    */
  def GetWindowCurrentPopupElementIndex(window: ASPxClientPopupWindow): Double = js.native
  
  /**
    * Returns the height of a specific popup window. An integer value that represents the specified popup window's height.
    * @param window A ASPxClientPopupWindow object that specifies the required popup window.
    */
  def GetWindowHeight(window: ASPxClientPopupWindow): Double = js.native
  
  /**
    * Returns a value indicating whether the specified window is maximized. true if the window is maximized; otherwise, false.
    * @param window An ASPxClientPopupWindow object specifying the popup window.
    */
  def GetWindowMaximized(window: ASPxClientPopupWindow): Boolean = js.native
  
  /**
    * Returns a value indicating whether the specified window is pinned. true if the window is pinned; otherwise, false.
    * @param window An ASPxClientPopupWindow object specifying the popup window.
    */
  def GetWindowPinned(window: ASPxClientPopupWindow): Boolean = js.native
  
  /**
    * Returns an object containing the information about a mouse event that invoked the specified popup window. An object containing the information about the mouse event.
    * @param window A ASPxClientPopupWindow object that specifies the required popup window.
    */
  def GetWindowPopUpReasonMouseEvent(window: ASPxClientPopupWindow): js.Any = js.native
  
  /**
    * Returns the width of a specific popup window. An integer value that represents the specified popup window's width.
    * @param window A ASPxClientPopupWindow object that specifies the required popup window.
    */
  def GetWindowWidth(window: ASPxClientPopupWindow): Double = js.native
  
  /**
    * Closes the popup control's specified window.
    * @param window A ASPxClientPopupWindow object representing the popup window to close.
    */
  def HideWindow(window: ASPxClientPopupWindow): Unit = js.native
  
  /**
    * Returns a value that specifies whether the popup control's specific window is displayed. true if the specified popup window is displayed; otherwise, false.
    * @param window A ASPxClientPopupWindow object representing the popup window whose visibility is checked.
    */
  def IsWindowVisible(window: ASPxClientPopupWindow): Boolean = js.native
  
  /**
    * Sends a callback with parameters to update the popup window by processing the related popup window and the passed information on the server.
    * @param window A ASPxClientPopupWindow object identifying the processed popup window.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxDataViewBase.CustomCallback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformWindowCallback(window: ASPxClientPopupWindow, parameter: String): Unit = js.native
  def PerformWindowCallback(window: ASPxClientPopupWindow, parameter: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Refreshes the connection between the ASPxPopupControl and the popup element.
    */
  def RefreshPopupElementConnection(): Unit = js.native
  
  /**
    * Refreshes the content of the web page displayed within the control's specific popup window.
    * @param window A ASPxClientPopupWindow object representing the required popup window.
    */
  def RefreshWindowContentUrl(window: ASPxClientPopupWindow): Unit = js.native
  
  def SetAdaptiveMaxHeight(maxHeight: String): Unit = js.native
  /**
    * Sets the maximum height of the popup window in adaptive mode.
    * @param maxHeight A string value specifying the maximum height of the popup window in adaptive mode as a percentage of the browser window inner height value.
    */
  def SetAdaptiveMaxHeight(maxHeight: Double): Unit = js.native
  
  def SetAdaptiveMaxWidth(maxWidth: String): Unit = js.native
  /**
    * Sets the maximum width of the popup window in adaptive mode.
    * @param maxWidth A string value specifying the maximum width of the popup window in adaptive mode as a percentage of the browser window inner width value.
    */
  def SetAdaptiveMaxWidth(maxWidth: Double): Unit = js.native
  
  def SetAdaptiveMinHeight(minHeight: String): Unit = js.native
  /**
    * Sets the minimum height of the popup window in adaptive mode.
    * @param minHeight A string value specifying the minimum height of the popup window in adaptive mode as a percentage of the browser window inner height value.
    */
  def SetAdaptiveMinHeight(minHeight: Double): Unit = js.native
  
  def SetAdaptiveMinWidth(minWidth: String): Unit = js.native
  /**
    * Sets the minimum width of the popup window in adaptive mode.
    * @param minWidth A string value specifying the minimum width of the popup window in adaptive mode as a percentage of the browser window inner width value.
    */
  def SetAdaptiveMinWidth(minWidth: Double): Unit = js.native
  
  /** @deprecated Use the SetContentHtml method instead. */
  /**
    * Defines the HTML content for the popup control's default popup window.
    * @param html A string value that is the HTML code defining the content of the popup window.
    */
  def SetContentHTML(html: String): Unit = js.native
  
  /**
    * Sets the ID of a web control or HTML element (or a list of IDs) with which the current popup control is associated.
    * @param popupElementId A string value specifying the ID (or a list of IDs) of the web control or HTML element to which the popup control is associated.
    */
  def SetPopupElementID(popupElementId: String): Unit = js.native
  
  /**
    * Specifies the default popup window's size.
    * @param width An integer value that specifies the default popup window's width.
    * @param height An integer value that specifies the default popup window's height.
    */
  def SetSize(width: Double, height: Double): Unit = js.native
  
  def SetWindowAdaptiveMaxHeight(window: ASPxClientPopupWindow, maxHeight: String): Unit = js.native
  /**
    * Sets the maximum height of the specified popup window in adaptive mode.
    * @param window A ASPxClientPopupWindow object representing the required popup window.
    * @param maxHeight An integer value specifying the maximum height of the popup window in adaptive mode.
    */
  def SetWindowAdaptiveMaxHeight(window: ASPxClientPopupWindow, maxHeight: Double): Unit = js.native
  
  def SetWindowAdaptiveMaxWidth(window: ASPxClientPopupWindow, maxWidth: String): Unit = js.native
  /**
    * Sets the maximum width of the specified popup window in adaptive mode.
    * @param window A ASPxClientPopupWindow object representing the required popup window.
    * @param maxWidth An integer value specifying the maximum width of the popup window in adaptive mode as a percentage of the browser window inner width value.
    */
  def SetWindowAdaptiveMaxWidth(window: ASPxClientPopupWindow, maxWidth: Double): Unit = js.native
  
  def SetWindowAdaptiveMinHeight(window: ASPxClientPopupWindow, minHeight: String): Unit = js.native
  /**
    * Sets the minimum height of the specified popup window in adaptive mode.
    * @param window A ASPxClientPopupWindow object representing the required popup window.
    * @param minHeight An integer value specifying the minimum height of the popup window in adaptive mode as a percentage of the browser window inner height value.
    */
  def SetWindowAdaptiveMinHeight(window: ASPxClientPopupWindow, minHeight: Double): Unit = js.native
  
  def SetWindowAdaptiveMinWidth(window: ASPxClientPopupWindow, minWidth: String): Unit = js.native
  /**
    * Sets the minimum width of the specified popup window in adaptive mode.
    * @param window A ASPxClientPopupWindow object representing the required popup window.
    * @param minWidth An integer value specifying the minimum width of the popup window in adaptive mode as a percentage of the browser window inner width value.
    */
  def SetWindowAdaptiveMinWidth(window: ASPxClientPopupWindow, minWidth: Double): Unit = js.native
  
  /**
    * Sets a value indicating whether the specified window is collapsed.
    * @param window An ASPxClientPopupWindow object specifying the popup window.
    * @param value true to collapse the window; otherwise, false.
    */
  def SetWindowCollapsed(window: ASPxClientPopupWindow, value: Boolean): Unit = js.native
  
  /**
    * Defines the HTML content for a specific popup window within the popup control.
    * @param window An ASPxClientPopupWindow object that specifies the required popup window.
    * @param html A string value that represents the HTML code defining the content of the specified popup window.
    */
  def SetWindowContentHtml(window: ASPxClientPopupWindow, html: String): Unit = js.native
  
  /**
    * Sets the URL pointing to the web page that should be loaded into and displayed within the control's specific popup window.
    * @param window A ASPxClientPopupWindow object representing the required popup window.
    * @param url A string value specifying the URL to the web page to be displayed within the specified popup window.
    */
  def SetWindowContentUrl(window: ASPxClientPopupWindow, url: String): Unit = js.native
  
  /**
    * Sets a value indicating whether the specified window is maximized.
    * @param window An ASPxClientPopupWindow object specifying the popup window.
    * @param value true to maximize the window; otherwise, false.
    */
  def SetWindowMaximized(window: ASPxClientPopupWindow, value: Boolean): Unit = js.native
  
  /**
    * Sets a value indicating whether the specified window is pinned.
    * @param window An ASPxClientPopupWindow object specifying the popup window.
    * @param value true to pin the window; otherwise, false.
    */
  def SetWindowPinned(window: ASPxClientPopupWindow, value: Boolean): Unit = js.native
  
  /**
    * Sets the ID of a web control or HTML element (or a list of IDs) with which the current popup control's window is associated.
    * @param window An ASPxClientPopupWindow object representing a popup control's window.
    * @param popupElementId A string value specifying the ID (or a list of IDs) of the web control or HTML element with which the popup control's window is associated.
    */
  def SetWindowPopupElementID(window: ASPxClientPopupWindow, popupElementId: String): Unit = js.native
  
  /**
    * Specifies the size of a specific popup window.
    * @param window A ASPxClientPopupWindow object that specifies the required popup window.
    * @param width An integer value that specifies the required popup window's width.
    * @param height An integer value that specifies the required popup window's height.
    */
  def SetWindowSize(window: ASPxClientPopupWindow, width: Double, height: Double): Unit = js.native
  
  /**
    * Invokes the specified popup window at the popup element with the specified index.
    * @param window A ASPxClientPopupWindow object that specifies the required popup window.
    * @param popupElementIndex An integer value specifying the zero-based index of the popup element within the window's PopupElementID list.
    */
  def ShowWindow(window: ASPxClientPopupWindow): Unit = js.native
  def ShowWindow(window: ASPxClientPopupWindow, popupElementIndex: Double): Unit = js.native
  
  /**
    * Invokes the popup control's specific window and displays it over the specified HTML element.
    * @param window A ASPxClientPopupWindow object representing the popup window to display.
    * @param htmlElement An object specifying the HTML element relative to whose position the default popup window is invoked.
    */
  def ShowWindowAtElement(window: ASPxClientPopupWindow, htmlElement: js.Any): Unit = js.native
  
  /**
    * Invokes the popup control's specific window and displays it over an HTML element specified by its unique identifier.
    * @param window A ASPxClientPopupWindow object representing the popup window to display.
    * @param id A string value that specifies the hierarchically qualified identifier of an HTML element relative to whose position the default popup window is invoked.
    */
  def ShowWindowAtElementByID(window: ASPxClientPopupWindow, id: String): Unit = js.native
  
  /**
    * Invokes the popup control's specific popup window at the specified position.
    * @param window A ASPxClientPopupWindow object representing the popup window to display.
    * @param x A integer value specifying the x-coordinate of the popup window's display position.
    * @param y A integer value specifying the y-coordinate of the popup window's display position.
    */
  def ShowWindowAtPos(window: ASPxClientPopupWindow, x: Double, y: Double): Unit = js.native
  
  /**
    * Stretches the popup window in adaptive mode vertically to the full height of the browser window.
    */
  def StretchVertically(): Unit = js.native
  
  /**
    * Updates the default popup window's position, to correctly align it at either the specified element, or the center of the browser's window.
    */
  def UpdatePosition(): Unit = js.native
  
  /**
    * Updates the default popup window's position, to correctly align it at the specified HTML element.
    * @param htmlElement An object specifying the HTML element to which the default popup window is aligned using the ASPxPopupControl.PopupHorizontalAlign and ASPxPopupControl.PopupVerticalAlign properties.
    */
  def UpdatePositionAtElement(htmlElement: js.Any): Unit = js.native
  
  /**
    * Updates the specified popup window's position, to correctly align it at either the specified element, or the center of the browser's window.
    * @param window An ASPxClientPopupWindow object that specifies the required popup window.
    */
  def UpdateWindowPosition(window: ASPxClientPopupWindow): Unit = js.native
  
  /**
    * Updates the specified popup window's position, to correctly align it at the specified HTML element.
    * @param window An ASPxClientPopupWindow object that specifies the required popup window.
    * @param htmlElement An object specifying the HTML element to which the specified popup window is aligned using the ASPxPopupControl.PopupHorizontalAlign and ASPxPopupControl.PopupVerticalAlign properties.
    */
  def UpdateWindowPositionAtElement(window: ASPxClientPopupWindow, htmlElement: js.Any): Unit = js.native
  
  /**
    * Stretches the specified popup window in adaptive mode vertically to the full height of the browser window.
    * @param window A ASPxClientPopupWindow object representing the required popup window.
    */
  def WindowStretchVertically(window: ASPxClientPopupWindow): Unit = js.native
}
