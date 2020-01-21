package typings.dojo.dojox.geo.charting

import typings.std.Event_
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/charting/KeyboardInteractionSupport.html
  *
  * class to handle keyboard interactions on a dojox.geo.charting.Map component.
  *
  * The sections on the leading edge should receive the focus in response to a TAB event.
  * Then use cursor keys to the peer sections. The cursor event should go the adjacent section
  * in that direction. With the focus, the section zooms in upon SPACE. The map should zoom out
  * on ESC. Finally, while it has the focus, the map should lose the focus on TAB.
  *
  * @param map the Map component this class provides touch navigation for.
  * @param options       OptionalAn object defining additional configuration properties. Currently,only the enableZoom property of this object is taken into account to enable/disablethe Map zooming capability.
  */
@JSGlobal("dojox.geo.charting.KeyboardInteractionSupport")
@js.native
class KeyboardInteractionSupport protected () extends js.Object {
  def this(map: Map) = this()
  def this(map: Map, options: js.Object) = this()
  /**
    * connects this keyboard support class to the Map component
    *
    */
  def connect(): Unit = js.native
  /**
    * disconnects any installed listeners
    *
    */
  def disconnect(): Unit = js.native
  /**
    * Handles a keydown event.
    *
    * @param e An event.
    */
  def keydownHandler(e: KeyboardEvent): Unit = js.native
  /**
    * Handles the onBlur event.
    *
    */
  def onBlur(): Unit = js.native
  /**
    * Handles the onFocus event.
    *
    * @param e An event.
    */
  def onFocus(e: Event_): Unit = js.native
}

