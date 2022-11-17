package typings.electron.Electron

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Screen
  extends StObject
     with EventEmitter {
  
  @JSName("addListener")
  @scala.annotation.targetName("addListener_displayremoved")
  def addListener(
    event: "display-removed",
    listener: js.Function2[/* event */ Event, /* oldDisplay */ Display, Unit]
  ): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_displayadded")
  def addListener(event: "display-added", listener: js.Function2[/* event */ Event, /* newDisplay */ Display, Unit]): this.type = js.native
  @JSName("addListener")
  @scala.annotation.targetName("addListener_displaymetricschanged")
  def addListener(
    event: "display-metrics-changed",
    listener: js.Function3[/* event */ Event, /* display */ Display, /* changedMetrics */ js.Array[String], Unit]
  ): this.type = js.native
  
  /**
    * Converts a screen DIP point to a screen physical point. The DPI scale is
    * performed relative to the display containing the DIP point.
    *
    * @platform win32
    */
  def dipToScreenPoint(point: Point): Point = js.native
  
  def dipToScreenRect(window: Null, rect: Rectangle): Rectangle = js.native
  /**
    * Converts a screen DIP rect to a screen physical rect. The DPI scale is performed
    * relative to the display nearest to `window`. If `window` is null, scaling will
    * be performed to the display nearest to `rect`.
    *
    * @platform win32
    */
  def dipToScreenRect(window: BrowserWindow, rect: Rectangle): Rectangle = js.native
  
  /**
    * An array of displays that are currently available.
    */
  def getAllDisplays(): js.Array[Display] = js.native
  
  /**
    * The current absolute position of the mouse pointer.
    *
    * **Note:** The return value is a DIP point, not a screen physical point.
    */
  def getCursorScreenPoint(): Point = js.native
  
  /**
    * The display that most closely intersects the provided bounds.
    */
  def getDisplayMatching(rect: Rectangle): Display = js.native
  
  /**
    * The display nearest the specified point.
    */
  def getDisplayNearestPoint(point: Point): Display = js.native
  
  /**
    * The primary display.
    */
  def getPrimaryDisplay(): Display = js.native
  
  // Docs: https://electronjs.org/docs/api/screen
  /**
    * Emitted when `newDisplay` has been added.
    */
  @JSName("on")
  @scala.annotation.targetName("on_displayadded")
  def on(event: "display-added", listener: js.Function2[/* event */ Event, /* newDisplay */ Display, Unit]): this.type = js.native
  /**
    * Emitted when `oldDisplay` has been removed.
    */
  @JSName("on")
  @scala.annotation.targetName("on_displayremoved")
  def on(
    event: "display-removed",
    listener: js.Function2[/* event */ Event, /* oldDisplay */ Display, Unit]
  ): this.type = js.native
  /**
    * Emitted when one or more metrics change in a `display`. The `changedMetrics` is
    * an array of strings that describe the changes. Possible changes are `bounds`,
    * `workArea`, `scaleFactor` and `rotation`.
    */
  @JSName("on")
  @scala.annotation.targetName("on_displaymetricschanged")
  def on(
    event: "display-metrics-changed",
    listener: js.Function3[/* event */ Event, /* display */ Display, /* changedMetrics */ js.Array[String], Unit]
  ): this.type = js.native
  
  @JSName("once")
  @scala.annotation.targetName("once_displayremoved")
  def once(
    event: "display-removed",
    listener: js.Function2[/* event */ Event, /* oldDisplay */ Display, Unit]
  ): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_displayadded")
  def once(event: "display-added", listener: js.Function2[/* event */ Event, /* newDisplay */ Display, Unit]): this.type = js.native
  @JSName("once")
  @scala.annotation.targetName("once_displaymetricschanged")
  def once(
    event: "display-metrics-changed",
    listener: js.Function3[/* event */ Event, /* display */ Display, /* changedMetrics */ js.Array[String], Unit]
  ): this.type = js.native
  
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_displayadded")
  def removeListener(event: "display-added", listener: js.Function2[/* event */ Event, /* newDisplay */ Display, Unit]): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_displayremoved")
  def removeListener(
    event: "display-removed",
    listener: js.Function2[/* event */ Event, /* oldDisplay */ Display, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  @scala.annotation.targetName("removeListener_displaymetricschanged")
  def removeListener(
    event: "display-metrics-changed",
    listener: js.Function3[/* event */ Event, /* display */ Display, /* changedMetrics */ js.Array[String], Unit]
  ): this.type = js.native
  
  /**
    * Converts a screen physical point to a screen DIP point. The DPI scale is
    * performed relative to the display containing the physical point.
    *
    * @platform win32
    */
  def screenToDipPoint(point: Point): Point = js.native
  
  def screenToDipRect(window: Null, rect: Rectangle): Rectangle = js.native
  /**
    * Converts a screen physical rect to a screen DIP rect. The DPI scale is performed
    * relative to the display nearest to `window`. If `window` is null, scaling will
    * be performed to the display nearest to `rect`.
    *
    * @platform win32
    */
  def screenToDipRect(window: BrowserWindow, rect: Rectangle): Rectangle = js.native
}
