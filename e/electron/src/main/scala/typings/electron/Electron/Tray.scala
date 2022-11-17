package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tray extends EventEmitter {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_dragleave")
  def addListener(event: "drag-leave", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_dragend")
  def addListener(event: "drag-end", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_drop")
  def addListener(event: "drop", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_balloonclosed")
  def addListener(event: "balloon-closed", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_dragenter")
  def addListener(event: "drag-enter", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_balloonshow")
  def addListener(event: "balloon-show", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_balloonclick")
  def addListener(event: "balloon-click", listener: js.Function): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_dropfiles")
  def addListener(event: "drop-files", listener: js.Function2[/* event */ Event, /* files */ js.Array[String], Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_mousedown")
  def addListener(event: "mouse-down", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_mouseleave")
  def addListener(
    event: "mouse-leave",
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_doubleclick")
  def addListener(
    event: "double-click",
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_mouseenter")
  def addListener(
    event: "mouse-enter",
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_mousemove")
  def addListener(event: "mouse-move", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_mouseup")
  def addListener(event: "mouse-up", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_droptext")
  def addListener(event: "drop-text", listener: js.Function2[/* event */ Event, /* text */ String, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_rightclick")
  def addListener(
    event: "right-click",
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_click")
  def addListener(
    event: "click",
    listener: js.Function3[/* event */ KeyboardEvent, /* bounds */ Rectangle, /* position */ Point, Unit]
  ): this.type = js.native
  
  /**
    * Closes an open context menu, as set by `tray.setContextMenu()`.
    *
    * @platform darwin,win32
    */
  def closeContextMenu(): Unit = js.native
  
  /**
    * Destroys the tray icon immediately.
    */
  def destroy(): Unit = js.native
  
  /**
    * Displays a tray balloon.
    *
    * @platform win32
    */
  def displayBalloon(options: DisplayBalloonOptions): Unit = js.native
  
  /**
    * Returns focus to the taskbar notification area. Notification area icons should
    * use this message when they have completed their UI operation. For example, if
    * the icon displays a shortcut menu, but the user presses ESC to cancel it, use
    * `tray.focus()` to return focus to the notification area.
    *
    * @platform win32
    */
  def focus(): Unit = js.native
  
  /**
    * The `bounds` of this tray icon as `Object`.
    *
    * @platform darwin,win32
    */
  def getBounds(): Rectangle = js.native
  
  /**
    * Whether double click events will be ignored.
    *
    * @platform darwin
    */
  def getIgnoreDoubleClickEvents(): Boolean = js.native
  
  /**
    * the title displayed next to the tray icon in the status bar
    *
    * @platform darwin
    */
  def getTitle(): String = js.native
  
  /**
    * Whether the tray icon is destroyed.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Emitted when the tray balloon is closed because of timeout or user manually
    * closes it.
    *
    * @platform win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_balloonclosed")
  def on(event: "balloon-closed", listener: js.Function): this.type = js.native
  /**
    * Emitted when the tray balloon shows.
    *
    * @platform win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_balloonshow")
  def on(event: "balloon-show", listener: js.Function): this.type = js.native
  /**
    * Emitted when a drag operation enters the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_dragenter")
  def on(event: "drag-enter", listener: js.Function): this.type = js.native
  /**
    * Emitted when a drag operation exits the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_dragleave")
  def on(event: "drag-leave", listener: js.Function): this.type = js.native
  /**
    * Emitted when a drag operation ends on the tray or ends at another location.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_dragend")
  def on(event: "drag-end", listener: js.Function): this.type = js.native
  // Docs: https://electronjs.org/docs/api/tray
  /**
    * Emitted when the tray balloon is clicked.
    *
    * @platform win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_balloonclick")
  def on(event: "balloon-click", listener: js.Function): this.type = js.native
  /**
    * Emitted when any dragged items are dropped on the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_drop")
  def on(event: "drop", listener: js.Function): this.type = js.native
  /**
    * Emitted when dragged files are dropped in the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_dropfiles")
  def on(event: "drop-files", listener: js.Function2[/* event */ Event, /* files */ js.Array[String], Unit]): this.type = js.native
  /**
    * Emitted when the tray icon is double clicked.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_doubleclick")
  def on(
    event: "double-click",
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  /**
    * Emitted when the mouse is released from clicking the tray icon.
    *
    * Note: This will not be emitted if you have set a context menu for your Tray
    * using `tray.setContextMenu`, as a result of macOS-level constraints.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_mouseup")
  def on(event: "mouse-up", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  /**
    * Emitted when the mouse enters the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_mouseenter")
  def on(
    event: "mouse-enter",
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  /**
    * Emitted when the mouse moves in the tray icon.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_mousemove")
  def on(event: "mouse-move", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  /**
    * Emitted when the mouse exits the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_mouseleave")
  def on(
    event: "mouse-leave",
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  /**
    * Emitted when the tray icon is right clicked.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  @scala.annotation.targetName("on_rightclick")
  def on(
    event: "right-click",
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  /**
    * Emitted when dragged text is dropped in the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_droptext")
  def on(event: "drop-text", listener: js.Function2[/* event */ Event, /* text */ String, Unit]): this.type = js.native
  /**
    * Emitted when the mouse clicks the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  @scala.annotation.targetName("on_mousedown")
  def on(event: "mouse-down", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  /**
    * Emitted when the tray icon is clicked.
    */
  @JSName("on")
  @scala.annotation.targetName("on_click")
  def on(
    event: "click",
    listener: js.Function3[/* event */ KeyboardEvent, /* bounds */ Rectangle, /* position */ Point, Unit]
  ): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_dragend")
  def once(event: "drag-end", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_dragleave")
  def once(event: "drag-leave", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_dragenter")
  def once(event: "drag-enter", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_balloonclosed")
  def once(event: "balloon-closed", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_balloonshow")
  def once(event: "balloon-show", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_balloonclick")
  def once(event: "balloon-click", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_drop")
  def once(event: "drop", listener: js.Function): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_mousemove")
  def once(event: "mouse-move", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_droptext")
  def once(event: "drop-text", listener: js.Function2[/* event */ Event, /* text */ String, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_mousedown")
  def once(event: "mouse-down", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_doubleclick")
  def once(
    event: "double-click",
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_mouseenter")
  def once(
    event: "mouse-enter",
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_mouseleave")
  def once(
    event: "mouse-leave",
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_mouseup")
  def once(event: "mouse-up", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_dropfiles")
  def once(event: "drop-files", listener: js.Function2[/* event */ Event, /* files */ js.Array[String], Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_rightclick")
  def once(
    event: "right-click",
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_click")
  def once(
    event: "click",
    listener: js.Function3[/* event */ KeyboardEvent, /* bounds */ Rectangle, /* position */ Point, Unit]
  ): this.type = js.native
  
  /**
    * Pops up the context menu of the tray icon. When `menu` is passed, the `menu`
    * will be shown instead of the tray icon's context menu.
    *
    * The `position` is only available on Windows, and it is (0, 0) by default.
    *
    * @platform darwin,win32
    */
  def popUpContextMenu(): Unit = js.native
  def popUpContextMenu(menu: Unit, position: Point): Unit = js.native
  def popUpContextMenu(menu: Menu): Unit = js.native
  def popUpContextMenu(menu: Menu, position: Point): Unit = js.native
  
  /**
    * Removes a tray balloon.
    *
    * @platform win32
    */
  def removeBalloon(): Unit = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_balloonclick")
  def removeListener(event: "balloon-click", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_dragenter")
  def removeListener(event: "drag-enter", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_balloonclosed")
  def removeListener(event: "balloon-closed", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_dragleave")
  def removeListener(event: "drag-leave", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_balloonshow")
  def removeListener(event: "balloon-show", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_drop")
  def removeListener(event: "drop", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_dragend")
  def removeListener(event: "drag-end", listener: js.Function): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_droptext")
  def removeListener(event: "drop-text", listener: js.Function2[/* event */ Event, /* text */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_rightclick")
  def removeListener(
    event: "right-click",
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_mousemove")
  def removeListener(event: "mouse-move", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_mouseenter")
  def removeListener(
    event: "mouse-enter",
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_dropfiles")
  def removeListener(event: "drop-files", listener: js.Function2[/* event */ Event, /* files */ js.Array[String], Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_doubleclick")
  def removeListener(
    event: "double-click",
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_mouseleave")
  def removeListener(
    event: "mouse-leave",
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_mousedown")
  def removeListener(event: "mouse-down", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_mouseup")
  def removeListener(event: "mouse-up", listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_click")
  def removeListener(
    event: "click",
    listener: js.Function3[/* event */ KeyboardEvent, /* bounds */ Rectangle, /* position */ Point, Unit]
  ): this.type = js.native
  
  /**
    * Sets the context menu for this icon.
    */
  def setContextMenu(): Unit = js.native
  def setContextMenu(menu: Menu): Unit = js.native
  
  /**
    * Sets the option to ignore double click events. Ignoring these events allows you
    * to detect every individual click of the tray icon.
    *
    * This value is set to false by default.
    *
    * @platform darwin
    */
  def setIgnoreDoubleClickEvents(ignore: Boolean): Unit = js.native
  
  def setImage(image: String): Unit = js.native
  /**
    * Sets the `image` associated with this tray icon.
    */
  def setImage(image: NativeImage_): Unit = js.native
  
  def setPressedImage(image: String): Unit = js.native
  /**
    * Sets the `image` associated with this tray icon when pressed on macOS.
    *
    * @platform darwin
    */
  def setPressedImage(image: NativeImage_): Unit = js.native
  
  /**
    * Sets the title displayed next to the tray icon in the status bar (Support ANSI
    * colors).
    *
    * @platform darwin
    */
  def setTitle(title: String): Unit = js.native
  def setTitle(title: String, options: TitleOptions): Unit = js.native
  
  /**
    * Sets the hover text for this tray icon.
    */
  def setToolTip(toolTip: String): Unit = js.native
}
