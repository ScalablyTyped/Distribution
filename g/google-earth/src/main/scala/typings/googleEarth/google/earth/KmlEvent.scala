package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlEvent extends js.Object {
  /**
    * The target whose event listeners are currently being processed.
    */
  var getCurrentTarget: GEEventEmitter = js.native
  /**
    * Indicates whether or not an event is a bubbling event.
    */
  def getBubbles(): Boolean = js.native
  /**
    * Indicates whether the event can be cancelled.
    *
    * Note: Currently, cancelable has no effect.
    */
  def getCancelable(): Boolean = js.native
  /**
    * The current stage of the flow of events.
    */
  def getEventPhase(): GEEventPhaseEnum = js.native
  /**
    * The object to which the KMLEvent was originally dispatched.
    */
  def getTarget(): GEEventEmitter = js.native
  /**
    * Cancels the default action of the event.
    * For example, calling this method in a placemark click handler prevents the placemark's default balloon from popping up.
    */
  def preventDefault(): Unit = js.native
  /**
    * Prevents event propagation.
    * For example, if click event handlers are set up on both the GEGlobe and GEWindow objects,
    * and stopPropagation is called in the GEGlobe click event handler, the GEWindow event handler will not be triggered when the globe is clicked.
    */
  def stopPropagation(): Unit = js.native
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
  @scala.inline
  implicit class KmlEventOps[Self <: KmlEvent] (val x: Self) extends AnyVal {
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
    def setGetBubbles(value: () => Boolean): Self = this.set("getBubbles", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCancelable(value: () => Boolean): Self = this.set("getCancelable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentTarget(value: GEEventEmitter): Self = this.set("getCurrentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetEventPhase(value: () => GEEventPhaseEnum): Self = this.set("getEventPhase", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTarget(value: () => GEEventEmitter): Self = this.set("getTarget", js.Any.fromFunction0(value))
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
  }
  
}

