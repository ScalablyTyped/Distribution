package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.afterResizing
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beforeResizing
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beginCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.callbackError
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.closeUp
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.closing
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.endCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.pinnedChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.popUp
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.resize
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.shown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapPopupControl")
@js.native
class BootstrapPopupControl () extends Control {
  def adjustSize(): Unit = js.native
  def bringToFront(): Unit = js.native
  def bringWindowToFront(window: BootstrapPopupWindow): Unit = js.native
  def getCollapsed(): Boolean = js.native
  def getContentHeight(): Double = js.native
  def getContentHtml(): String = js.native
  def getContentIFrame(): js.Any = js.native
  def getContentIFrameWindow(): js.Any = js.native
  def getContentUrl(): String = js.native
  def getContentWidth(): Double = js.native
  def getCurrentPopupElement(): js.Any = js.native
  def getCurrentPopupElementIndex(): Double = js.native
  def getFooterImageUrl(): String = js.native
  def getFooterNavigateUrl(): String = js.native
  def getFooterText(): String = js.native
  def getHeaderImageUrl(): String = js.native
  def getHeaderNavigateUrl(): String = js.native
  def getHeaderText(): String = js.native
  def getMaximized(): Boolean = js.native
  def getPinned(): Boolean = js.native
  def getPopUpReasonMouseEvent(): js.Any = js.native
  def getWindow(index: Double): BootstrapPopupWindow | Null = js.native
  def getWindowByName(name: String): BootstrapPopupWindow | Null = js.native
  def getWindowCollapsed(window: BootstrapPopupWindow): Boolean = js.native
  def getWindowContentHeight(window: BootstrapPopupWindow): Double = js.native
  def getWindowContentHtml(window: BootstrapPopupWindow): String = js.native
  def getWindowContentIFrame(window: BootstrapPopupWindow): js.Any = js.native
  def getWindowContentUrl(window: BootstrapPopupWindow): String = js.native
  def getWindowContentWidth(window: BootstrapPopupWindow): Double = js.native
  def getWindowCount(): Double = js.native
  def getWindowCurrentPopupElement(window: BootstrapPopupWindow): js.Any = js.native
  def getWindowCurrentPopupElementIndex(window: BootstrapPopupWindow): Double = js.native
  def getWindowHeight(window: BootstrapPopupWindow): Double = js.native
  def getWindowMaximized(window: BootstrapPopupWindow): Boolean = js.native
  def getWindowPinned(window: BootstrapPopupWindow): Boolean = js.native
  def getWindowPopUpReasonMouseEvent(window: BootstrapPopupWindow): js.Any = js.native
  def getWindowWidth(window: BootstrapPopupWindow): Double = js.native
  def hide(): Unit = js.native
  def hideWindow(window: BootstrapPopupWindow): Unit = js.native
  def isVisible(): Boolean = js.native
  def isWindowVisible(window: BootstrapPopupWindow): Boolean = js.native
  @JSName("off")
  def off_afterResizing(eventName: afterResizing): this.type = js.native
  @JSName("off")
  def off_afterResizing(
    eventName: afterResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_beforeResizing(eventName: beforeResizing): this.type = js.native
  @JSName("off")
  def off_beforeResizing(
    eventName: beforeResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_beginCallback(eventName: beginCallback): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(eventName: callbackError): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_closeUp(eventName: closeUp): this.type = js.native
  @JSName("off")
  def off_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowCloseUpEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_closing(eventName: closing): this.type = js.native
  @JSName("off")
  def off_closing(
    eventName: closing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_pinnedChanged(eventName: pinnedChanged): this.type = js.native
  @JSName("off")
  def off_pinnedChanged(
    eventName: pinnedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowPinnedChangedEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_popUp(eventName: popUp): this.type = js.native
  @JSName("off")
  def off_popUp(
    eventName: popUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_resize(eventName: resize): this.type = js.native
  @JSName("off")
  def off_resize(
    eventName: resize,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowResizeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_shown(eventName: shown): this.type = js.native
  @JSName("off")
  def off_shown(
    eventName: shown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_afterResizing(
    eventName: afterResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_beforeResizing(
    eventName: beforeResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowCloseUpEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_closing(
    eventName: closing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pinnedChanged(
    eventName: pinnedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowPinnedChangedEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_popUp(
    eventName: popUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_resize(
    eventName: resize,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowResizeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_shown(
    eventName: shown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_afterResizing(
    eventName: afterResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_beforeResizing(
    eventName: beforeResizing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowCloseUpEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_closing(
    eventName: closing,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pinnedChanged(
    eventName: pinnedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowPinnedChangedEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_popUp(
    eventName: popUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_resize(
    eventName: resize,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowResizeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_shown(
    eventName: shown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[PopupWindowEventArgs], Unit]
  ): this.type = js.native
  def performCallback(data: js.Any): js.Promise[Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[Unit]): Unit = js.native
  def refreshContentUrl(): Unit = js.native
  def refreshPopupElementConnection(): Unit = js.native
  def refreshWindowContentUrl(window: BootstrapPopupWindow): Unit = js.native
  def setAdaptiveMaxHeight(maxHeight: String): Unit = js.native
  def setAdaptiveMaxHeight(maxHeight: Double): Unit = js.native
  def setAdaptiveMaxWidth(maxWidth: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setAdaptiveMaxWidth(maxWidth: Double): Unit = js.native
  def setAdaptiveMinHeight(minHeight: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setAdaptiveMinHeight(minHeight: Double): Unit = js.native
  def setAdaptiveMinWidth(minWidth: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setAdaptiveMinWidth(minWidth: Double): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setCollapsed(value: Boolean): Unit = js.native
  def setContentHtml(html: String): Unit = js.native
  def setContentUrl(url: String): Unit = js.native
  def setFooterImageUrl(value: String): Unit = js.native
  def setFooterNavigateUrl(value: String): Unit = js.native
  def setFooterText(value: String): Unit = js.native
  def setHeaderImageUrl(value: String): Unit = js.native
  def setHeaderNavigateUrl(value: String): Unit = js.native
  def setHeaderText(value: String): Unit = js.native
  def setMaximized(value: Boolean): Unit = js.native
  def setPinned(value: Boolean): Unit = js.native
  def setPopupElementCssSelector(selector: String): Unit = js.native
  def setPopupElementID(popupElementId: String): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setWindowAdaptiveMaxHeight(window: BootstrapPopupWindow, maxHeight: String): Unit = js.native
  def setWindowAdaptiveMaxHeight(window: BootstrapPopupWindow, maxHeight: Double): Unit = js.native
  def setWindowAdaptiveMaxWidth(window: BootstrapPopupWindow, maxWidth: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setWindowAdaptiveMaxWidth(window: BootstrapPopupWindow, maxWidth: Double): Unit = js.native
  def setWindowAdaptiveMinHeight(window: BootstrapPopupWindow, minHeight: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setWindowAdaptiveMinHeight(window: BootstrapPopupWindow, minHeight: Double): Unit = js.native
  def setWindowAdaptiveMinWidth(window: BootstrapPopupWindow, minWidth: String): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setWindowAdaptiveMinWidth(window: BootstrapPopupWindow, minWidth: Double): Unit = js.native
   // tslint:disable-line:unified-signatures
  def setWindowCollapsed(window: BootstrapPopupWindow, value: Boolean): Unit = js.native
  def setWindowContentHtml(window: BootstrapPopupWindow, html: String): Unit = js.native
  def setWindowContentUrl(window: BootstrapPopupWindow, url: String): Unit = js.native
  def setWindowMaximized(window: BootstrapPopupWindow, value: Boolean): Unit = js.native
  def setWindowPinned(window: BootstrapPopupWindow, value: Boolean): Unit = js.native
  def setWindowPopupElementID(window: BootstrapPopupWindow, popupElementId: String): Unit = js.native
  def setWindowSize(window: BootstrapPopupWindow, width: Double, height: Double): Unit = js.native
  def show(): Unit = js.native
  def showAtElement(htmlElement: js.Any): Unit = js.native
  def showAtElementByID(id: String): Unit = js.native
  def showAtPos(x: Double, y: Double): Unit = js.native
  def showWindow(window: BootstrapPopupWindow): Unit = js.native
  def showWindow(window: BootstrapPopupWindow, popupElementIndex: Double): Unit = js.native
   // tslint:disable-line:unified-signatures
  def showWindowAtElement(window: BootstrapPopupWindow, htmlElement: js.Any): Unit = js.native
  def showWindowAtElementByID(window: BootstrapPopupWindow, id: String): Unit = js.native
  def showWindowAtPos(window: BootstrapPopupWindow, x: Double, y: Double): Unit = js.native
  def stretchVertically(): Unit = js.native
  def updatePosition(): Unit = js.native
  def updatePositionAtElement(htmlElement: js.Any): Unit = js.native
  def updateWindowPosition(window: BootstrapPopupWindow): Unit = js.native
  def updateWindowPositionAtElement(window: BootstrapPopupWindow, htmlElement: js.Any): Unit = js.native
  def windowStretchVertically(window: BootstrapPopupWindow): Unit = js.native
}

