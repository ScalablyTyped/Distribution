package typings.expoModulesCore

import typings.reactNative.mod.NativeEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEventEmitterMod {
  
  @JSImport("expo-modules-core/build/EventEmitter", "EventEmitter")
  @js.native
  open class EventEmitter protected () extends StObject {
    def this(nativeModule: NativeModule) = this()
    
    var _eventEmitter: NativeEventEmitter = js.native
    
    var _listenerCount: Double = js.native
    
    var _nativeModule: NativeModule = js.native
    
    def addListener[T](eventName: String, listener: js.Function1[/* event */ T, Unit]): Subscription = js.native
    
    def emit(eventName: String, params: Any*): Unit = js.native
    
    def removeAllListeners(eventName: String): Unit = js.native
    
    def removeSubscription(subscription: Subscription): Unit = js.native
  }
  
  trait NativeModule extends StObject {
    
    var __expo_module_name__ : js.UndefOr[String] = js.undefined
    
    def addListener(eventName: String): Unit
    
    def removeListeners(count: Double): Unit
    
    var startObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var stopObserving: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object NativeModule {
    
    inline def apply(addListener: String => Unit, removeListeners: Double => Unit): NativeModule = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeListeners = js.Any.fromFunction1(removeListeners))
      __obj.asInstanceOf[NativeModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeModule] (val x: Self) extends AnyVal {
      
      inline def setAddListener(value: String => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListeners(value: Double => Unit): Self = StObject.set(x, "removeListeners", js.Any.fromFunction1(value))
      
      inline def setStartObserving(value: () => Unit): Self = StObject.set(x, "startObserving", js.Any.fromFunction0(value))
      
      inline def setStartObservingUndefined: Self = StObject.set(x, "startObserving", js.undefined)
      
      inline def setStopObserving(value: () => Unit): Self = StObject.set(x, "stopObserving", js.Any.fromFunction0(value))
      
      inline def setStopObservingUndefined: Self = StObject.set(x, "stopObserving", js.undefined)
      
      inline def set__expo_module_name__(value: String): Self = StObject.set(x, "__expo_module_name__", value.asInstanceOf[js.Any])
      
      inline def set__expo_module_name__Undefined: Self = StObject.set(x, "__expo_module_name__", js.undefined)
    }
  }
  
  trait Subscription extends StObject {
    
    /**
      * A method to unsubscribe the listener.
      */
    def remove(): Unit
  }
  object Subscription {
    
    inline def apply(remove: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
