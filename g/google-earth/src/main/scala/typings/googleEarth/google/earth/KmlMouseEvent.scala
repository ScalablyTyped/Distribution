package typings.googleEarth.google.earth

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
  implicit class KmlMouseEventOps[Self <: KmlMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAltKey(value: () => Boolean): Self = this.set("getAltKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAltitude(value: () => Double): Self = this.set("getAltitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetButton(value: () => Double): Self = this.set("getButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientX(value: () => Double): Self = this.set("getClientX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientY(value: () => Double): Self = this.set("getClientY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCtrlKey(value: () => Boolean): Self = this.set("getCtrlKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDidHitGlobe(value: () => Boolean): Self = this.set("getDidHitGlobe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLatitude(value: () => Double): Self = this.set("getLatitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLongitude(value: () => Double): Self = this.set("getLongitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRelatedTarget(value: () => GEEventEmitter): Self = this.set("getRelatedTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScreenX(value: () => Double): Self = this.set("getScreenX", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScreenY(value: () => Double): Self = this.set("getScreenY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetShiftKey(value: () => Boolean): Self = this.set("getShiftKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeStamp(value: () => Double): Self = this.set("getTimeStamp", js.Any.fromFunction0(value))
  }
}
