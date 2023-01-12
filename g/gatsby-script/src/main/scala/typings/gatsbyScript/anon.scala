package typings.gatsbyScript

import typings.std.ErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callbacks extends StObject {
    
    var callbacks: js.UndefOr[js.Array[js.Function1[/* event */ typings.std.Event, Unit]]] = js.undefined
    
    var event: js.UndefOr[typings.std.Event] = js.undefined
  }
  object Callbacks {
    
    inline def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: js.Array[js.Function1[/* event */ typings.std.Event, Unit]]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCallbacksVarargs(value: (js.Function1[/* event */ typings.std.Event, Unit])*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setEvent(value: typings.std.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: js.UndefOr[Event] = js.undefined
    
    var load: js.UndefOr[Callbacks] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLoad(value: Callbacks): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var callbacks: js.UndefOr[js.Array[js.Function1[/* event */ ErrorEvent, Unit]]] = js.undefined
    
    var event: js.UndefOr[ErrorEvent] = js.undefined
  }
  object Event {
    
    inline def apply(): Event = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: js.Array[js.Function1[/* event */ ErrorEvent, Unit]]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCallbacksVarargs(value: (js.Function1[/* event */ ErrorEvent, Unit])*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setEvent(value: ErrorEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    }
  }
}
