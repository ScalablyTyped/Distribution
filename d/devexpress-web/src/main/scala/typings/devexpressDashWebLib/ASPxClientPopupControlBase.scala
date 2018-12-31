package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Serves as a base class for the ASPxClientPopupControl classes.
  */
@js.native
trait ASPxClientPopupControlBase extends ASPxClientControl {
  /**
    * Occurs on the client side when window resizing completes.
    */
  var AfterResizing: ASPxClientEvent[ASPxClientPopupWindowEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Occurs on the client side when window resizing initiates.
    */
  var BeforeResizing: ASPxClientEvent[ASPxClientPopupWindowEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the control.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Occurs on the client side when a control's window closes or hides.
    */
  var CloseUp: ASPxClientEvent[ASPxClientPopupWindowCloseUpEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Enables you to cancel window closing on the client side.
    */
  var Closing: ASPxClientEvent[ASPxClientPopupWindowCancelEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Occurs on the client side when the window pin state is changed.
    */
  var PinnedChanged: ASPxClientEvent[ASPxClientPopupWindowPinnedChangedEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Occurs on the client side when a control's window is invoked.
    */
  var PopUp: ASPxClientEvent[ASPxClientPopupWindowEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Occurs on the client side after a window has been resized.
    */
  var Resize: ASPxClientEvent[ASPxClientPopupWindowResizeEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Occurs on the client side after a control's window has been invoked.
    */
  var Shown: ASPxClientEvent[ASPxClientPopupWindowEventHandler[ASPxClientPopupControlBase]] = js.native
  /**
    * Modifies a control's window size in accordance with the content.
    */
  def AdjustSize(): scala.Unit = js.native
  /**
    * Brings the window to the front of the z-order.
    */
  def BringToFront(): scala.Unit = js.native
  /**
    * Returns a value indicating whether the window is collapsed.
    */
  def GetCollapsed(): scala.Boolean = js.native
  /**
    * Gets the height of the default window's (for ASPxPopupControl) or panel's (for ASPxDockPanel) content region.
    */
  def GetContentHeight(): scala.Double = js.native
  /**
    * Returns the HTML code that specifies the contents of the control's window.
    */
  def GetContentHtml(): java.lang.String = js.native
  /**
    * Returns an iframe object containing a web page specified via the control's SetContentUrl client method).
    */
  def GetContentIFrame(): js.Object = js.native
  /**
    * Returns an iframe object containing a web page specified via the control's SetContentUrl client method).
    */
  def GetContentIFrameWindow(): js.Object = js.native
  /**
    * Returns the URL pointing to the web page displayed within the control's window.
    */
  def GetContentUrl(): java.lang.String = js.native
  /**
    * Gets the width of the default window's (for ASPxPopupControl) or panel's (for ASPxDockPanel) content region.
    */
  def GetContentWidth(): scala.Double = js.native
  /**
    * Returns the URL pointing to the image displayed within the window footer by default.
    */
  def GetFooterImageUrl(): java.lang.String = js.native
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within a window's footer.
    */
  def GetFooterNavigateUrl(): java.lang.String = js.native
  /**
    * Returns the text displayed within a window's footer.
    */
  def GetFooterText(): java.lang.String = js.native
  /**
    * Returns the URL pointing to the image displayed within the window header.
    */
  def GetHeaderImageUrl(): java.lang.String = js.native
  /**
    * Returns the URL where the web browser will navigate when the text or image is clicked within a window's header.
    */
  def GetHeaderNavigateUrl(): java.lang.String = js.native
  /**
    * Returns the text displayed within a window's header.
    */
  def GetHeaderText(): java.lang.String = js.native
  /**
    * Returns a value indicating whether the window is maximized.
    */
  def GetMaximized(): scala.Boolean = js.native
  /**
    * Returns a value indicating whether the window is pinned.
    */
  def GetPinned(): scala.Boolean = js.native
  /**
    * Closes the control's window.
    */
  def Hide(): scala.Unit = js.native
  /**
    * Returns a value that specifies whether the control's window is displayed.
    */
  def IsVisible(): scala.Boolean = js.native
  /**
    * Sends a callback to the server and generates the server-side WindowCallback event, passing the specified argument to it.
    * @param parameter A string value that is any information that needs to be sent to the server-side WindowCallback event.
    */
  def PerformCallback(parameter: java.lang.String): scala.Unit = js.native
  /**
    * Refreshes the content of the web page displayed within the control's window.
    */
  def RefreshContentUrl(): scala.Unit = js.native
  /**
    * Sets a value indicating whether the window is collapsed.
    * @param value true, to collapse the window; otherwise, false.
    */
  def SetCollapsed(value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the HTML markup specifying the contents of the control's window.
    * @param html A string value that specifies the HTML markup.
    */
  def SetContentHtml(html: java.lang.String): scala.Unit = js.native
  /**
    * Sets the URL to point to the web page that should be loaded into, and displayed within the control's window.
    * @param url A string value specifying the URL to the web page displayed within the control's window.
    */
  def SetContentUrl(url: java.lang.String): scala.Unit = js.native
  /**
    * Specifies the URL which points to the image displayed within the window footer by default.
    * @param value A string value that is the URL for the image displayed within the window footer.
    */
  def SetFooterImageUrl(value: java.lang.String): scala.Unit = js.native
  /**
    * Specifies the URL where the web browser will navigate when the text or image is clicked within a window's footer.
    * @param value A string value which specifies the required navigation location.
    */
  def SetFooterNavigateUrl(value: java.lang.String): scala.Unit = js.native
  /**
    * Specifies the text displayed within a window's footer.
    * @param value A string value that specifies a window's footer text.
    */
  def SetFooterText(value: java.lang.String): scala.Unit = js.native
  /**
    * Specifies the URL which points to the image displayed within the window header.
    * @param value A string value that is the URL to the image displayed within the header.
    */
  def SetHeaderImageUrl(value: java.lang.String): scala.Unit = js.native
  /**
    * Specifies the URL where the web browser will navigate when the text or image is clicked within a window's header.
    * @param value A string value which specifies the required navigation location.
    */
  def SetHeaderNavigateUrl(value: java.lang.String): scala.Unit = js.native
  /**
    * Specifies the text displayed within a window's header.
    * @param value A string value that specifies a window's header text.
    */
  def SetHeaderText(value: java.lang.String): scala.Unit = js.native
  /**
    * Sets a value indicating whether the window is maximized.
    * @param value true. to maximize the window; otherwise, false.
    */
  def SetMaximized(value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets a value indicating whether the window is pinned.
    * @param value true, to pin the window; otherwise, false.
    */
  def SetPinned(value: scala.Boolean): scala.Unit = js.native
  /**
    * Invokes the control's window.
    */
  def Show(): scala.Unit = js.native
  /**
    * Invokes the control's window at the popup element with the specified index.
    * @param popupElementIndex An integer value specifying the zero-based index of the popup element.
    */
  def Show(popupElementIndex: scala.Double): scala.Unit = js.native
  /**
    * Invokes the control's window and displays it over the specified HTML element.
    * @param htmlElement An object specifying the HTML element relative to whose position the window is invoked.
    */
  def ShowAtElement(htmlElement: js.Object): scala.Unit = js.native
  /**
    * Invokes the control's window and displays it over an HTML element specified by its unique identifier.
    * @param id A string value that specifies the hierarchically qualified identifier of an HTML element relative to whose position the window is invoked.
    */
  def ShowAtElementByID(id: java.lang.String): scala.Unit = js.native
  /**
    * Invokes the control's window at the specified position.
    * @param x A integer value specifying the x-coordinate of the window's display position.
    * @param y A integer value specifying the y-coordinate of the window's display position.
    */
  def ShowAtPos(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

