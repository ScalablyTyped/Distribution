package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlEvent extends js.Object {
  /**
    * The target whose event listeners are currently being processed.
    */
  var getCurrentTarget: GEEventEmitter
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
  @scala.inline
  def apply(
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
}

