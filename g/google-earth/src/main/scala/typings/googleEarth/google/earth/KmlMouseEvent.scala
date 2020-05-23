package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlMouseEvent extends KmlEvent {
  /**
    * Indicates whether the ALT key was held down when an event occurred.
    */
  def getAltKey(): Boolean
  /**
    * The altitude at which the event occurred, in meters.
    */
  def getAltitude(): Double
  /**
    * The button on the mouse was pressed.
    * Possible values include 0, 1, 2, where 0 is left, 1 is middle, and 2 is right mouse key.
    */
  def getButton(): Double
  /**
    * The x coordinate at which the event occurred, measured in pixels from the left edge of the plug-in window.
    */
  def getClientX(): Double
  /**
    * The y coordinate at which the event occurred, measured in pixels from the top edge of the plug-in window.
    */
  def getClientY(): Double
  /**
    * Indicates whether the CTRL key was held down when an event occurred.
    */
  def getCtrlKey(): Boolean
  /**
    * Indicates whether a mouse action occurred while on the Google Earth globe.
    */
  def getDidHitGlobe(): Boolean
  /**
    * The latitude at which the event occurred, in decimal degrees.
    */
  def getLatitude(): Double
  /**
    * The longitude at which the event occurred, in decimal degrees.
    */
  def getLongitude(): Double
  /**
    * Used with the mouseover and mouseout events to specify a secondary target.
    * For mouseover, it specifies the object that the mouse was over.
    * For mouseout, it specifies the new object that the mouse is over.
    */
  def getRelatedTarget(): GEEventEmitter
  /**
    * The x coordinate at which the event occurred, measured in pixels from the left edge of the computer screen.
    */
  def getScreenX(): Double
  /**
    * The y coordinate at which the event occurred, measured in pixels from the top edge of the computer screen.
    */
  def getScreenY(): Double
  /**
    * Indicates whether the SHIFT key was held down when an event occurred.
    */
  def getShiftKey(): Boolean
  /**
    * Returns the timestamp of the event, in Unix time.
    */
  def getTimeStamp(): Double
}

object KmlMouseEvent {
  @scala.inline
  def apply(
    getAltKey: () => Boolean,
    getAltitude: () => Double,
    getBubbles: () => Boolean,
    getButton: () => Double,
    getCancelable: () => Boolean,
    getClientX: () => Double,
    getClientY: () => Double,
    getCtrlKey: () => Boolean,
    getCurrentTarget: GEEventEmitter,
    getDidHitGlobe: () => Boolean,
    getEventPhase: () => GEEventPhaseEnum,
    getLatitude: () => Double,
    getLongitude: () => Double,
    getRelatedTarget: () => GEEventEmitter,
    getScreenX: () => Double,
    getScreenY: () => Double,
    getShiftKey: () => Boolean,
    getTarget: () => GEEventEmitter,
    getTimeStamp: () => Double,
    preventDefault: () => Unit,
    stopPropagation: () => Unit
  ): KmlMouseEvent = {
    val __obj = js.Dynamic.literal(getAltKey = js.Any.fromFunction0(getAltKey), getAltitude = js.Any.fromFunction0(getAltitude), getBubbles = js.Any.fromFunction0(getBubbles), getButton = js.Any.fromFunction0(getButton), getCancelable = js.Any.fromFunction0(getCancelable), getClientX = js.Any.fromFunction0(getClientX), getClientY = js.Any.fromFunction0(getClientY), getCtrlKey = js.Any.fromFunction0(getCtrlKey), getCurrentTarget = getCurrentTarget.asInstanceOf[js.Any], getDidHitGlobe = js.Any.fromFunction0(getDidHitGlobe), getEventPhase = js.Any.fromFunction0(getEventPhase), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), getRelatedTarget = js.Any.fromFunction0(getRelatedTarget), getScreenX = js.Any.fromFunction0(getScreenX), getScreenY = js.Any.fromFunction0(getScreenY), getShiftKey = js.Any.fromFunction0(getShiftKey), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[KmlMouseEvent]
  }
}

