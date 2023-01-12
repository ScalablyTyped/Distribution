package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlEvent extends StObject {
  
  /**
    * Indicates whether or not an event is a bubbling event.
    */
  def getBubbles(): Boolean
  
  /**
    * Indicates whether the event can be cancelled.
    *
    * Note: Currently, cancelable has no effect.
    */
  def getCancelable(): Boolean
  
  /**
    * The target whose event listeners are currently being processed.
    */
  var getCurrentTarget: GEEventEmitter
  
  /**
    * The current stage of the flow of events.
    */
  def getEventPhase(): GEEventPhaseEnum
  
  /**
    * The object to which the KMLEvent was originally dispatched.
    */
  def getTarget(): GEEventEmitter
  
  /**
    * Cancels the default action of the event.
    * For example, calling this method in a placemark click handler prevents the placemark's default balloon from popping up.
    */
  def preventDefault(): Unit
  
  /**
    * Prevents event propagation.
    * For example, if click event handlers are set up on both the GEGlobe and GEWindow objects,
    * and stopPropagation is called in the GEGlobe click event handler, the GEWindow event handler will not be triggered when the globe is clicked.
    */
  def stopPropagation(): Unit
}
object KmlEvent {
  
  inline def apply(
    getBubbles: () => Boolean,
    getCancelable: () => Boolean,
    getCurrentTarget: GEEventEmitter,
    getEventPhase: () => GEEventPhaseEnum,
    getTarget: () => GEEventEmitter,
    preventDefault: () => Unit,
    stopPropagation: () => Unit
  ): KmlEvent = {
    val __obj = js.Dynamic.literal(getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = getCurrentTarget.asInstanceOf[js.Any], getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[KmlEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlEvent] (val x: Self) extends AnyVal {
    
    inline def setGetBubbles(value: () => Boolean): Self = StObject.set(x, "getBubbles", js.Any.fromFunction0(value))
    
    inline def setGetCancelable(value: () => Boolean): Self = StObject.set(x, "getCancelable", js.Any.fromFunction0(value))
    
    inline def setGetCurrentTarget(value: GEEventEmitter): Self = StObject.set(x, "getCurrentTarget", value.asInstanceOf[js.Any])
    
    inline def setGetEventPhase(value: () => GEEventPhaseEnum): Self = StObject.set(x, "getEventPhase", js.Any.fromFunction0(value))
    
    inline def setGetTarget(value: () => GEEventEmitter): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
  }
}
