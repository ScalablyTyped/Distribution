package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEEventEmitter")
@js.native
class GEEventEmitter () extends js.Object {
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  def click(event: KmlMouseEvent): scala.Unit = js.native
  /**
    * Triggers an event when the user double clicks a location in Google Earth with the mouse.
    */
  def dblclick(event: KmlMouseEvent): scala.Unit = js.native
  /**
    * Triggers an event when the user presses the mouse button over a location in Google Earth.
    */
  def mousedown(event: KmlMouseEvent): scala.Unit = js.native
  /**
    * Triggers an event when the user moves the mouse inside Google Earth.
    */
  def mousemove(event: KmlMouseEvent): scala.Unit = js.native
  /**
    * Triggers an event when the user moves the mouse off of the object in Google Earth.
    */
  def mouseout(event: KmlMouseEvent): scala.Unit = js.native
  /**
    * Triggers an event when the user moves the mouse pointer over a location in Google Earth.
    */
  def mouseover(event: KmlMouseEvent): scala.Unit = js.native
  /**
    * Triggers an event when the user releases the mouse button over a location in Google Earth.
    */
  def mouseup(event: KmlMouseEvent): scala.Unit = js.native
}

