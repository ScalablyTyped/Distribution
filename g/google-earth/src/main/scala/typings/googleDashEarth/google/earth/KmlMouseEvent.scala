package typings.googleDashEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlMouseEvent")
@js.native
class KmlMouseEvent () extends KmlEvent {
  /**
    * Indicates whether the ALT key was held down when an event occurred.
    */
  def getAltKey(): Boolean = js.native
  /**
    * The altitude at which the event occurred, in meters.
    */
  def getAltitude(): Double = js.native
  /**
    * The button on the mouse was pressed.
    * Possible values include 0, 1, 2, where 0 is left, 1 is middle, and 2 is right mouse key.
    */
  def getButton(): Double = js.native
  /**
    * The x coordinate at which the event occurred, measured in pixels from the left edge of the plug-in window.
    */
  def getClientX(): Double = js.native
  /**
    * The y coordinate at which the event occurred, measured in pixels from the top edge of the plug-in window.
    */
  def getClientY(): Double = js.native
  /**
    * Indicates whether the CTRL key was held down when an event occurred.
    */
  def getCtrlKey(): Boolean = js.native
  /**
    * Indicates whether a mouse action occurred while on the Google Earth globe.
    */
  def getDidHitGlobe(): Boolean = js.native
  /**
    * The latitude at which the event occurred, in decimal degrees.
    */
  def getLatitude(): Double = js.native
  /**
    * The longitude at which the event occurred, in decimal degrees.
    */
  def getLongitude(): Double = js.native
  /**
    * Used with the mouseover and mouseout events to specify a secondary target.
    * For mouseover, it specifies the object that the mouse was over.
    * For mouseout, it specifies the new object that the mouse is over.
    */
  def getRelatedTarget(): GEEventEmitter = js.native
  /**
    * The x coordinate at which the event occurred, measured in pixels from the left edge of the computer screen.
    */
  def getScreenX(): Double = js.native
  /**
    * The y coordinate at which the event occurred, measured in pixels from the top edge of the computer screen.
    */
  def getScreenY(): Double = js.native
  /**
    * Indicates whether the SHIFT key was held down when an event occurred.
    */
  def getShiftKey(): Boolean = js.native
  /**
    * Returns the timestamp of the event, in Unix time.
    */
  def getTimeStamp(): Double = js.native
}

