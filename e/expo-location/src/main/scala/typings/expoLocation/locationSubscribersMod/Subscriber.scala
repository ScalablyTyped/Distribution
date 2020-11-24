package typings.expoLocation.locationSubscribersMod

import typings.expoLocation.locationTypesMod.LocationCallback
import typings.expoLocation.locationTypesMod.LocationHeadingCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscriber[CallbackType /* <: LocationCallback | LocationHeadingCallback */] extends js.Object {
  
  var callbacks: js.Any = js.native
  
  var eventDataField: js.Any = js.native
  
  var eventName: js.Any = js.native
  
  var eventSubscription: js.Any = js.native
  
  def maybeInitializeSubscription(): Unit = js.native
  
  /**
    * Registers given callback under new id which is then returned.
    */
  def registerCallback(callback: CallbackType): Double = js.native
  
  def trigger(event: EventObject): Unit = js.native
  
  /**
    * Unregisters a callback with given id and revokes the subscription if possible.
    */
  def unregisterCallback(id: Double): Unit = js.native
}
object Subscriber {
  
  @scala.inline
  def apply[CallbackType /* <: LocationCallback | LocationHeadingCallback */](
    callbacks: js.Any,
    eventDataField: js.Any,
    eventName: js.Any,
    eventSubscription: js.Any,
    maybeInitializeSubscription: () => Unit,
    registerCallback: CallbackType => Double,
    trigger: EventObject => Unit,
    unregisterCallback: Double => Unit
  ): Subscriber[CallbackType] = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], eventDataField = eventDataField.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSubscription = eventSubscription.asInstanceOf[js.Any], maybeInitializeSubscription = js.Any.fromFunction0(maybeInitializeSubscription), registerCallback = js.Any.fromFunction1(registerCallback), trigger = js.Any.fromFunction1(trigger), unregisterCallback = js.Any.fromFunction1(unregisterCallback))
    __obj.asInstanceOf[Subscriber[CallbackType]]
  }
  
  @scala.inline
  implicit class SubscriberOps[Self <: Subscriber[_], CallbackType /* <: LocationCallback | LocationHeadingCallback */] (val x: Self with Subscriber[CallbackType]) extends AnyVal {
    
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
    def setCallbacks(value: js.Any): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDataField(value: js.Any): Self = this.set("eventDataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventName(value: js.Any): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSubscription(value: js.Any): Self = this.set("eventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaybeInitializeSubscription(value: () => Unit): Self = this.set("maybeInitializeSubscription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterCallback(value: CallbackType => Double): Self = this.set("registerCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrigger(value: EventObject => Unit): Self = this.set("trigger", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterCallback(value: Double => Unit): Self = this.set("unregisterCallback", js.Any.fromFunction1(value))
  }
}
