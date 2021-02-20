package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlMouseEvent extends KmlEvent {
  
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
  
  @scala.inline
  implicit class KmlMouseEventMutableBuilder[Self <: KmlMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAltKey(value: () => Boolean): Self = StObject.set(x, "getAltKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAltitude(value: () => Double): Self = StObject.set(x, "getAltitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetButton(value: () => Double): Self = StObject.set(x, "getButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientX(value: () => Double): Self = StObject.set(x, "getClientX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientY(value: () => Double): Self = StObject.set(x, "getClientY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCtrlKey(value: () => Boolean): Self = StObject.set(x, "getCtrlKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDidHitGlobe(value: () => Boolean): Self = StObject.set(x, "getDidHitGlobe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLatitude(value: () => Double): Self = StObject.set(x, "getLatitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLongitude(value: () => Double): Self = StObject.set(x, "getLongitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRelatedTarget(value: () => GEEventEmitter): Self = StObject.set(x, "getRelatedTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScreenX(value: () => Double): Self = StObject.set(x, "getScreenX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScreenY(value: () => Double): Self = StObject.set(x, "getScreenY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShiftKey(value: () => Boolean): Self = StObject.set(x, "getShiftKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeStamp(value: () => Double): Self = StObject.set(x, "getTimeStamp", js.Any.fromFunction0(value))
  }
}
