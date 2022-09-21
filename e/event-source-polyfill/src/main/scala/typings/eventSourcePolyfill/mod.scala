package typings.eventSourcePolyfill

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.eventSourcePolyfill.eventSourcePolyfillStrings.error
import typings.eventSourcePolyfill.eventSourcePolyfillStrings.message
import typings.eventSourcePolyfill.eventSourcePolyfillStrings.open
import typings.std.EventSourceInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("event-source-polyfill", "EventSource")
  @js.native
  open class EventSource protected ()
    extends StObject
       with typings.std.EventSource {
    def this(url: String) = this()
    def this(url: String, eventSourceInitDict: EventSourceInit) = this()
  }
  @JSImport("event-source-polyfill", "EventSource")
  @js.native
  val EventSource: EventSourceConstructor = js.native
  
  @JSImport("event-source-polyfill", "EventSourcePolyfill")
  @js.native
  open class EventSourcePolyfill protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, options: EventSourcePolyfillInit) = this()
    
    val CLOSED: Double = js.native
    
    val CONNECTING: Double = js.native
    
    val OPEN: Double = js.native
    
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Any): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any],
      options: Any
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ MessageEvent, Any]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ MessageEvent, Any],
      options: Any
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any],
      options: Any
    ): Unit = js.native
    
    def close(): Unit = js.native
    
    def dispatchEvent(event: Event): Boolean = js.native
    
    var onerror: (js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any]) | Null = js.native
    
    var onmessage: (js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ MessageEvent, Any]) | Null = js.native
    
    var onopen: (js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any]) | Null = js.native
    
    val readyState: Double = js.native
    
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Any): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any],
      options: Any
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ MessageEvent, Any]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_message(
      `type`: message,
      listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ MessageEvent, Any],
      options: Any
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_open(
      `type`: open,
      listener: js.ThisFunction1[/* this */ typings.std.EventSource, /* ev */ Event, Any],
      options: Any
    ): Unit = js.native
    
    val url: String = js.native
    
    val withCredentials: Boolean = js.native
  }
  /* static members */
  object EventSourcePolyfill {
    
    @JSImport("event-source-polyfill", "EventSourcePolyfill.CLOSED")
    @js.native
    val CLOSED: Double = js.native
    
    @JSImport("event-source-polyfill", "EventSourcePolyfill.CONNECTING")
    @js.native
    val CONNECTING: Double = js.native
    
    @JSImport("event-source-polyfill", "EventSourcePolyfill.OPEN")
    @js.native
    val OPEN: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("event-source-polyfill", "NativeEventSource")
  @js.native
  open class NativeEventSource protected ()
    extends StObject
       with typings.std.EventSource {
    def this(url: String) = this()
    def this(url: String, eventSourceInitDict: EventSourceInit) = this()
  }
  @JSImport("event-source-polyfill", "NativeEventSource")
  @js.native
  val NativeEventSource: EventSourceConstructor = js.native
  
  trait Event extends StObject {
    
    var target: Any
    
    var `type`: String
  }
  object Event {
    
    inline def apply(target: Any, `type`: String): Event = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type EventListener = js.Function1[/* evt */ Event, Unit]
  
  trait EventListenerObject extends StObject {
    
    def handleEvent(evt: Event): Unit
  }
  object EventListenerObject {
    
    inline def apply(handleEvent: Event => Unit): EventListenerObject = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[EventListenerObject]
    }
    
    extension [Self <: EventListenerObject](x: Self) {
      
      inline def setHandleEvent(value: Event => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  type EventListenerOrEventListenerObject = EventListener | EventListenerObject
  
  @js.native
  trait EventSourceConstructor
    extends StObject
       with Instantiable1[/* url */ String, typings.std.EventSource]
       with Instantiable2[/* url */ String, /* eventSourceInitDict */ EventSourceInit, typings.std.EventSource] {
    
    val CLOSED: Double = js.native
    
    val CONNECTING: Double = js.native
    
    val OPEN: Double = js.native
  }
  
  trait EventSourceEventMap extends StObject {
    
    var error: Event
    
    var message: MessageEvent
    
    var open: Event
  }
  object EventSourceEventMap {
    
    inline def apply(error: Event, message: MessageEvent, open: Event): EventSourceEventMap = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSourceEventMap]
    }
    
    extension [Self <: EventSourceEventMap](x: Self) {
      
      inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventSourcePolyfillInit extends StObject {
    
    var Transport: js.UndefOr[Instantiable0[Any]] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var heartbeatTimeout: js.UndefOr[Double] = js.undefined
    
    var lastEventIdQueryParameterName: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object EventSourcePolyfillInit {
    
    inline def apply(): EventSourcePolyfillInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventSourcePolyfillInit]
    }
    
    extension [Self <: EventSourcePolyfillInit](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeartbeatTimeout(value: Double): Self = StObject.set(x, "heartbeatTimeout", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatTimeoutUndefined: Self = StObject.set(x, "heartbeatTimeout", js.undefined)
      
      inline def setLastEventIdQueryParameterName(value: String): Self = StObject.set(x, "lastEventIdQueryParameterName", value.asInstanceOf[js.Any])
      
      inline def setLastEventIdQueryParameterNameUndefined: Self = StObject.set(x, "lastEventIdQueryParameterName", js.undefined)
      
      inline def setTransport(value: Instantiable0[Any]): Self = StObject.set(x, "Transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "Transport", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait MessageEvent
    extends StObject
       with Event {
    
    var data: Any
    
    var lastEventId: String
  }
  object MessageEvent {
    
    inline def apply(data: Any, lastEventId: String, target: Any, `type`: String): MessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lastEventId = lastEventId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    extension [Self <: MessageEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLastEventId(value: String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    }
  }
}
