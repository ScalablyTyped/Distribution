package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Electron.Tray")
@js.native
class Tray protected () extends EventEmitter {
  def this(image: NativeImage) = this()
  def this(image: java.lang.String) = this()
  @JSName("addListener")
  def `addListener_balloon-click`(event: electronLib.electronLibStrings.`balloon-click`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_balloon-closed`(event: electronLib.electronLibStrings.`balloon-closed`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_balloon-show`(event: electronLib.electronLibStrings.`balloon-show`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_click(
    event: electronLib.electronLibStrings.click,
    listener: js.Function3[/* event */ Event, /* bounds */ Rectangle, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_double-click`(
    event: electronLib.electronLibStrings.`double-click`,
    listener: js.Function2[/* event */ Event, /* bounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_drag-end`(event: electronLib.electronLibStrings.`drag-end`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_drag-enter`(event: electronLib.electronLibStrings.`drag-enter`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_drag-leave`(event: electronLib.electronLibStrings.`drag-leave`, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def addListener_drop(event: electronLib.electronLibStrings.drop, listener: js.Function): this.type = js.native
  @JSName("addListener")
  def `addListener_drop-files`(
    event: electronLib.electronLibStrings.`drop-files`,
    listener: js.Function2[/* event */ Event, /* files */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_drop-text`(
    event: electronLib.electronLibStrings.`drop-text`,
    listener: js.Function2[/* event */ Event, /* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_mouse-enter`(
    event: electronLib.electronLibStrings.`mouse-enter`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_mouse-leave`(
    event: electronLib.electronLibStrings.`mouse-leave`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_mouse-move`(
    event: electronLib.electronLibStrings.`mouse-move`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_right-click`(
    event: electronLib.electronLibStrings.`right-click`,
    listener: js.Function2[/* event */ Event, /* bounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  /**
    * Destroys the tray icon immediately.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Displays a tray balloon.
    */
  def displayBalloon(options: DisplayBalloonOptions): scala.Unit = js.native
  /**
    * The bounds of this tray icon as Object.
    */
  def getBounds(): Rectangle = js.native
  def getIgnoreDoubleClickEvents(): scala.Boolean = js.native
  def isDestroyed(): scala.Boolean = js.native
  // Docs: http://electronjs.org/docs/api/tray
  /**
    * Emitted when the tray balloon is clicked.
    */
  @JSName("on")
  def `on_balloon-click`(event: electronLib.electronLibStrings.`balloon-click`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the tray balloon is closed because of timeout or user manually
    * closes it.
    */
  @JSName("on")
  def `on_balloon-closed`(event: electronLib.electronLibStrings.`balloon-closed`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the tray balloon shows.
    */
  @JSName("on")
  def `on_balloon-show`(event: electronLib.electronLibStrings.`balloon-show`, listener: js.Function): this.type = js.native
  /**
    * Emitted when the tray icon is clicked.
    */
  @JSName("on")
  def on_click(
    event: electronLib.electronLibStrings.click,
    listener: js.Function3[/* event */ Event, /* bounds */ Rectangle, /* position */ Point, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the tray icon is double clicked.
    */
  @JSName("on")
  def `on_double-click`(
    event: electronLib.electronLibStrings.`double-click`,
    listener: js.Function2[/* event */ Event, /* bounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when a drag operation ends on the tray or ends at another location.
    */
  @JSName("on")
  def `on_drag-end`(event: electronLib.electronLibStrings.`drag-end`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a drag operation enters the tray icon.
    */
  @JSName("on")
  def `on_drag-enter`(event: electronLib.electronLibStrings.`drag-enter`, listener: js.Function): this.type = js.native
  /**
    * Emitted when a drag operation exits the tray icon.
    */
  @JSName("on")
  def `on_drag-leave`(event: electronLib.electronLibStrings.`drag-leave`, listener: js.Function): this.type = js.native
  /**
    * Emitted when any dragged items are dropped on the tray icon.
    */
  @JSName("on")
  def on_drop(event: electronLib.electronLibStrings.drop, listener: js.Function): this.type = js.native
  /**
    * Emitted when dragged files are dropped in the tray icon.
    */
  @JSName("on")
  def `on_drop-files`(
    event: electronLib.electronLibStrings.`drop-files`,
    listener: js.Function2[/* event */ Event, /* files */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when dragged text is dropped in the tray icon.
    */
  @JSName("on")
  def `on_drop-text`(
    event: electronLib.electronLibStrings.`drop-text`,
    listener: js.Function2[/* event */ Event, /* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the mouse enters the tray icon.
    */
  @JSName("on")
  def `on_mouse-enter`(
    event: electronLib.electronLibStrings.`mouse-enter`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the mouse exits the tray icon.
    */
  @JSName("on")
  def `on_mouse-leave`(
    event: electronLib.electronLibStrings.`mouse-leave`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the mouse moves in the tray icon.
    */
  @JSName("on")
  def `on_mouse-move`(
    event: electronLib.electronLibStrings.`mouse-move`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  /**
    * Emitted when the tray icon is right clicked.
    */
  @JSName("on")
  def `on_right-click`(
    event: electronLib.electronLibStrings.`right-click`,
    listener: js.Function2[/* event */ Event, /* bounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_balloon-click`(event: electronLib.electronLibStrings.`balloon-click`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_balloon-closed`(event: electronLib.electronLibStrings.`balloon-closed`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_balloon-show`(event: electronLib.electronLibStrings.`balloon-show`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_click(
    event: electronLib.electronLibStrings.click,
    listener: js.Function3[/* event */ Event, /* bounds */ Rectangle, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_double-click`(
    event: electronLib.electronLibStrings.`double-click`,
    listener: js.Function2[/* event */ Event, /* bounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_drag-end`(event: electronLib.electronLibStrings.`drag-end`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_drag-enter`(event: electronLib.electronLibStrings.`drag-enter`, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_drag-leave`(event: electronLib.electronLibStrings.`drag-leave`, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_drop(event: electronLib.electronLibStrings.drop, listener: js.Function): this.type = js.native
  @JSName("once")
  def `once_drop-files`(
    event: electronLib.electronLibStrings.`drop-files`,
    listener: js.Function2[/* event */ Event, /* files */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_drop-text`(
    event: electronLib.electronLibStrings.`drop-text`,
    listener: js.Function2[/* event */ Event, /* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_mouse-enter`(
    event: electronLib.electronLibStrings.`mouse-enter`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_mouse-leave`(
    event: electronLib.electronLibStrings.`mouse-leave`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_mouse-move`(
    event: electronLib.electronLibStrings.`mouse-move`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def `once_right-click`(
    event: electronLib.electronLibStrings.`right-click`,
    listener: js.Function2[/* event */ Event, /* bounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  /**
    * Pops up the context menu of the tray icon. When menu is passed, the menu will be
    * shown instead of the tray icon's context menu. The position is only available on
    * Windows, and it is (0, 0) by default.
    */
  def popUpContextMenu(): scala.Unit = js.native
  def popUpContextMenu(menu: Menu): scala.Unit = js.native
  def popUpContextMenu(menu: Menu, position: Point): scala.Unit = js.native
  @JSName("removeListener")
  def `removeListener_balloon-click`(event: electronLib.electronLibStrings.`balloon-click`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_balloon-closed`(event: electronLib.electronLibStrings.`balloon-closed`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_balloon-show`(event: electronLib.electronLibStrings.`balloon-show`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_click(
    event: electronLib.electronLibStrings.click,
    listener: js.Function3[/* event */ Event, /* bounds */ Rectangle, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_double-click`(
    event: electronLib.electronLibStrings.`double-click`,
    listener: js.Function2[/* event */ Event, /* bounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_drag-end`(event: electronLib.electronLibStrings.`drag-end`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_drag-enter`(event: electronLib.electronLibStrings.`drag-enter`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_drag-leave`(event: electronLib.electronLibStrings.`drag-leave`, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def removeListener_drop(event: electronLib.electronLibStrings.drop, listener: js.Function): this.type = js.native
  @JSName("removeListener")
  def `removeListener_drop-files`(
    event: electronLib.electronLibStrings.`drop-files`,
    listener: js.Function2[/* event */ Event, /* files */ js.Array[java.lang.String], scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_drop-text`(
    event: electronLib.electronLibStrings.`drop-text`,
    listener: js.Function2[/* event */ Event, /* text */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_mouse-enter`(
    event: electronLib.electronLibStrings.`mouse-enter`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_mouse-leave`(
    event: electronLib.electronLibStrings.`mouse-leave`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_mouse-move`(
    event: electronLib.electronLibStrings.`mouse-move`,
    listener: js.Function2[/* event */ Event, /* position */ Point, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_right-click`(
    event: electronLib.electronLibStrings.`right-click`,
    listener: js.Function2[/* event */ Event, /* bounds */ Rectangle, scala.Unit]
  ): this.type = js.native
  def setContextMenu(): scala.Unit = js.native
  /**
    * Sets the context menu for this icon.
    */
  def setContextMenu(menu: Menu): scala.Unit = js.native
  @JSName("setHighlightMode")
  def setHighlightMode_always(mode: electronLib.electronLibStrings.always): scala.Unit = js.native
  @JSName("setHighlightMode")
  def setHighlightMode_never(mode: electronLib.electronLibStrings.never): scala.Unit = js.native
  /**
    * Sets when the tray's icon background becomes highlighted (in blue). Note: You
    * can use highlightMode with a BrowserWindow by toggling between 'never' and
    * 'always' modes when the window visibility changes.
    */
  @JSName("setHighlightMode")
  def setHighlightMode_selection(mode: electronLib.electronLibStrings.selection): scala.Unit = js.native
  /**
    * Sets the option to ignore double click events. Ignoring these events allows you
    * to detect every individual click of the tray icon. This value is set to false by
    * default.
    */
  def setIgnoreDoubleClickEvents(ignore: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the image associated with this tray icon.
    */
  def setImage(image: NativeImage): scala.Unit = js.native
  def setImage(image: java.lang.String): scala.Unit = js.native
  /**
    * Sets the image associated with this tray icon when pressed on macOS.
    */
  def setPressedImage(image: NativeImage): scala.Unit = js.native
  def setPressedImage(image: java.lang.String): scala.Unit = js.native
  /**
    * Sets the title displayed aside of the tray icon in the status bar (Support ANSI
    * colors).
    */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
    * Sets the hover text for this tray icon.
    */
  def setToolTip(toolTip: java.lang.String): scala.Unit = js.native
}

