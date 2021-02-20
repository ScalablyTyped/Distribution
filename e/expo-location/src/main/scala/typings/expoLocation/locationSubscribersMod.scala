package typings.expoLocation

import org.scalablytyped.runtime.StringDictionary
import typings.expoLocation.locationTypesMod.LocationCallback
import typings.expoLocation.locationTypesMod.LocationHeadingCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationSubscribersMod {
  
  @JSImport("expo-location/build/LocationSubscribers", "HeadingSubscriber")
  @js.native
  val HeadingSubscriber: Subscriber[LocationHeadingCallback] = js.native
  
  @JSImport("expo-location/build/LocationSubscribers", "LocationSubscriber")
  @js.native
  val LocationSubscriber: Subscriber[LocationCallback] = js.native
  
  @JSImport("expo-location/build/LocationSubscribers", "_getCurrentWatchId")
  @js.native
  def getCurrentWatchId(): Double = js.native
  
  @js.native
  trait EventObject
    extends /* key */ StringDictionary[js.Any] {
    
    var watchId: Double = js.native
  }
  object EventObject {
    
    @scala.inline
    def apply(watchId: Double): EventObject = {
      val __obj = js.Dynamic.literal(watchId = watchId.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventObject]
    }
    
    @scala.inline
    implicit class EventObjectMutableBuilder[Self <: EventObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWatchId(value: Double): Self = StObject.set(x, "watchId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Subscriber[CallbackType /* <: LocationCallback | LocationHeadingCallback */] extends StObject {
    
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
    implicit class SubscriberMutableBuilder[Self <: Subscriber[_], CallbackType /* <: LocationCallback | LocationHeadingCallback */] (val x: Self with Subscriber[CallbackType]) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: js.Any): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventDataField(value: js.Any): Self = StObject.set(x, "eventDataField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventName(value: js.Any): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSubscription(value: js.Any): Self = StObject.set(x, "eventSubscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaybeInitializeSubscription(value: () => Unit): Self = StObject.set(x, "maybeInitializeSubscription", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterCallback(value: CallbackType => Double): Self = StObject.set(x, "registerCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrigger(value: EventObject => Unit): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnregisterCallback(value: Double => Unit): Self = StObject.set(x, "unregisterCallback", js.Any.fromFunction1(value))
    }
  }
}
