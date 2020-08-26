package typings.electron.Electron

import typings.electron.electronStrings.`balloon-click`
import typings.electron.electronStrings.`balloon-closed`
import typings.electron.electronStrings.`balloon-show`
import typings.electron.electronStrings.`double-click`
import typings.electron.electronStrings.`drag-end`
import typings.electron.electronStrings.`drag-enter`
import typings.electron.electronStrings.`drag-leave`
import typings.electron.electronStrings.`drop-files`
import typings.electron.electronStrings.`drop-text`
import typings.electron.electronStrings.`mouse-down`
import typings.electron.electronStrings.`mouse-enter`
import typings.electron.electronStrings.`mouse-leave`
import typings.electron.electronStrings.`mouse-move`
import typings.electron.electronStrings.`mouse-up`
import typings.electron.electronStrings.`right-click`
import typings.electron.electronStrings.click
import typings.electron.electronStrings.drop
import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tray extends EventEmitter {
  @JSName("addListener")
  def addListener_balloonclick(event: `balloon-click`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_balloonclosed(event: `balloon-closed`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_balloonshow(event: `balloon-show`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_click(
    event: click,
    listener: js.Function3[/* event */ KeyboardEvent, /* bounds */ Rectangle, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_doubleclick(
    event: `double-click`,
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_dragend(event: `drag-end`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_dragenter(event: `drag-enter`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_dragleave(event: `drag-leave`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_drop(event: drop, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_dropfiles(event: `drop-files`, listener: js.Function2[/* event */ Event, /* files */ js.Array[String], Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_droptext(event: `drop-text`, listener: js.Function2[/* event */ Event, /* text */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_mousedown(event: `mouse-down`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_mouseenter(
    event: `mouse-enter`,
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_mouseleave(
    event: `mouse-leave`,
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_mousemove(event: `mouse-move`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_mouseup(event: `mouse-up`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_rightclick(
    event: `right-click`,
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
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
  // Docs: http://electronjs.org/docs/api/tray
  /**
    * Emitted when the tray balloon is clicked.
    *
    * @platform win32
    */
  @JSName("on")
  def on_balloonclick(event: `balloon-click`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the tray balloon is closed because of timeout or user manually
    * closes it.
    *
    * @platform win32
    */
  @JSName("on")
  def on_balloonclosed(event: `balloon-closed`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the tray balloon shows.
    *
    * @platform win32
    */
  @JSName("on")
  def on_balloonshow(event: `balloon-show`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the tray icon is clicked.
    */
  @JSName("on")
  def on_click(
    event: click,
    listener: js.Function3[/* event */ KeyboardEvent, /* bounds */ Rectangle, /* position */ Point, Unit]
  ): this.type = js.native
  /**
    * Emitted when the tray icon is double clicked.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_doubleclick(
    event: `double-click`,
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  /**
    * Emitted when a drag operation ends on the tray or ends at another location.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_dragend(event: `drag-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a drag operation enters the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_dragenter(event: `drag-enter`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a drag operation exits the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_dragleave(event: `drag-leave`, listener: js.Function): this.type = js.native
  /**
    * Emitted when any dragged items are dropped on the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_drop(event: drop, listener: js.Function): this.type = js.native
  /**
    * Emitted when dragged files are dropped in the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_dropfiles(event: `drop-files`, listener: js.Function2[/* event */ Event, /* files */ js.Array[String], Unit]): this.type = js.native
  /**
    * Emitted when dragged text is dropped in the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_droptext(event: `drop-text`, listener: js.Function2[/* event */ Event, /* text */ String, Unit]): this.type = js.native
  /**
    * Emitted when the mouse clicks the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_mousedown(event: `mouse-down`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  /**
    * Emitted when the mouse enters the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_mouseenter(
    event: `mouse-enter`,
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  /**
    * Emitted when the mouse exits the tray icon.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_mouseleave(
    event: `mouse-leave`,
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  /**
    * Emitted when the mouse moves in the tray icon.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_mousemove(event: `mouse-move`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  /**
    * Emitted when the mouse is released from clicking the tray icon.
    *
    * Note: This will not be emitted if you have set a context menu for your Tray
    * using `tray.setContextMenu`, as a result of macOS-level constraints.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_mouseup(event: `mouse-up`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  /**
    * Emitted when the tray icon is right clicked.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_rightclick(
    event: `right-click`,
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_balloonclick(event: `balloon-click`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_balloonclosed(event: `balloon-closed`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_balloonshow(event: `balloon-show`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_click(
    event: click,
    listener: js.Function3[/* event */ KeyboardEvent, /* bounds */ Rectangle, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_doubleclick(
    event: `double-click`,
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dragend(event: `drag-end`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_dragenter(event: `drag-enter`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_dragleave(event: `drag-leave`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_drop(event: drop, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_dropfiles(event: `drop-files`, listener: js.Function2[/* event */ Event, /* files */ js.Array[String], Unit]): this.type = js.native
  @JSName("once")
  def once_droptext(event: `drop-text`, listener: js.Function2[/* event */ Event, /* text */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_mousedown(event: `mouse-down`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseenter(
    event: `mouse-enter`,
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseleave(
    event: `mouse-leave`,
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(event: `mouse-move`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("once")
  def once_mouseup(event: `mouse-up`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("once")
  def once_rightclick(
    event: `right-click`,
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  /**
    * Pops up the context menu of the tray icon. When `menu` is passed, the `menu`
    * will be shown instead of the tray icon's context menu.
    * 
  The `position` is only available on Windows, and it is (0, 0) by default.
    *
    * @platform darwin,win32
    */
  def popUpContextMenu(): Unit = js.native
  def popUpContextMenu(menu: js.UndefOr[scala.Nothing], position: Point): Unit = js.native
  def popUpContextMenu(menu: Menu): Unit = js.native
  def popUpContextMenu(menu: Menu, position: Point): Unit = js.native
  /**
    * Removes a tray balloon.
    *
    * @platform win32
    */
  def removeBalloon(): Unit = js.native
  @JSName("removeListener")
  def removeListener_balloonclick(event: `balloon-click`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_balloonclosed(event: `balloon-closed`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_balloonshow(event: `balloon-show`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_click(
    event: click,
    listener: js.Function3[/* event */ KeyboardEvent, /* bounds */ Rectangle, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_doubleclick(
    event: `double-click`,
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_dragend(event: `drag-end`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_dragenter(event: `drag-enter`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_dragleave(event: `drag-leave`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_drop(event: drop, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_dropfiles(event: `drop-files`, listener: js.Function2[/* event */ Event, /* files */ js.Array[String], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_droptext(event: `drop-text`, listener: js.Function2[/* event */ Event, /* text */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_mousedown(event: `mouse-down`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_mouseenter(
    event: `mouse-enter`,
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_mouseleave(
    event: `mouse-leave`,
    listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_mousemove(event: `mouse-move`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_mouseup(event: `mouse-up`, listener: js.Function2[/* event */ KeyboardEvent, /* position */ Point, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_rightclick(
    event: `right-click`,
    listener: js.Function2[/* event */ KeyboardEvent, /* bounds */ Rectangle, Unit]
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
  This value is set to false by default.
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
  /**
    * Sets the hover text for this tray icon.
    */
  def setToolTip(toolTip: String): Unit = js.native
}

