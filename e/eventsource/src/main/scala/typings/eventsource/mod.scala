package typings.eventsource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eventsource", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EventSource {
    def this(url: String) = this()
    def this(url: String, eventSourceInitDict: EventSourceInitDict) = this()
    
    /* CompleteClass */
    override val CLOSED: Double = js.native
    
    /* CompleteClass */
    override val CONNECTING: Double = js.native
    
    /* CompleteClass */
    override val OPEN: Double = js.native
    
    /* CompleteClass */
    override def addEventListener(`type`: String, listener: js.Function1[/* evt */ MessageEvent[Any], Unit]): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def dispatchEvent(evt: Event): Boolean = js.native
    
    /* CompleteClass */
    override def onerror(evt: MessageEvent[Any]): Any = js.native
    
    /* CompleteClass */
    override def onmessage(evt: MessageEvent[Any]): Any = js.native
    
    /* CompleteClass */
    override def onopen(evt: MessageEvent[Any]): Any = js.native
    
    /* CompleteClass */
    override val readyState: Double = js.native
    
    /* CompleteClass */
    override def removeEventListener(`type`: String, listener: js.Function1[/* evt */ MessageEvent[Any], Unit]): Unit = js.native
    
    /* CompleteClass */
    override val url: String = js.native
    
    /* CompleteClass */
    override val withCredentials: Boolean = js.native
  }
  
  /* static member */
  @JSImport("eventsource", "CLOSED")
  @js.native
  val CLOSED: Double = js.native
  
  /* static member */
  @JSImport("eventsource", "CONNECTING")
  @js.native
  val CONNECTING: Double = js.native
  
  /* static member */
  @JSImport("eventsource", "OPEN")
  @js.native
  val OPEN: Double = js.native
  
  @js.native
  sealed trait ReadyState extends StObject
  @JSImport("eventsource", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState & Double] = js.native
    
    @js.native
    sealed trait CLOSED
      extends StObject
         with ReadyState
    /* 2 */ val CLOSED: typings.eventsource.mod.ReadyState.CLOSED & Double = js.native
    
    @js.native
    sealed trait CONNECTING
      extends StObject
         with ReadyState
    /* 0 */ val CONNECTING: typings.eventsource.mod.ReadyState.CONNECTING & Double = js.native
    
    @js.native
    sealed trait OPEN
      extends StObject
         with ReadyState
    /* 1 */ val OPEN: typings.eventsource.mod.ReadyState.OPEN & Double = js.native
  }
  
  trait EventSource extends StObject {
    
    val CLOSED: Double
    
    val CONNECTING: Double
    
    val OPEN: Double
    
    def addEventListener(`type`: String, listener: js.Function1[/* evt */ MessageEvent[Any], Unit]): Unit
    
    def close(): Unit
    
    def dispatchEvent(evt: Event): Boolean
    
    def onerror(evt: MessageEvent[Any]): Any
    
    def onmessage(evt: MessageEvent[Any]): Any
    
    def onopen(evt: MessageEvent[Any]): Any
    
    val readyState: Double
    
    def removeEventListener(`type`: String, listener: js.Function1[/* evt */ MessageEvent[Any], Unit]): Unit
    
    val url: String
    
    val withCredentials: Boolean
  }
  object EventSource {
    
    inline def apply(
      CLOSED: Double,
      CONNECTING: Double,
      OPEN: Double,
      addEventListener: (String, js.Function1[/* evt */ MessageEvent[Any], Unit]) => Unit,
      close: () => Unit,
      dispatchEvent: Event => Boolean,
      onerror: MessageEvent[Any] => Any,
      onmessage: MessageEvent[Any] => Any,
      onopen: MessageEvent[Any] => Any,
      readyState: Double,
      removeEventListener: (String, js.Function1[/* evt */ MessageEvent[Any], Unit]) => Unit,
      url: String,
      withCredentials: Boolean
    ): EventSource = {
      val __obj = js.Dynamic.literal(CLOSED = CLOSED.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), close = js.Any.fromFunction0(close), dispatchEvent = js.Any.fromFunction1(dispatchEvent), onerror = js.Any.fromFunction1(onerror), onmessage = js.Any.fromFunction1(onmessage), onopen = js.Any.fromFunction1(onopen), readyState = readyState.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener), url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventSource] (val x: Self) extends AnyVal {
      
      inline def setAddEventListener(value: (String, js.Function1[/* evt */ MessageEvent[Any], Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setCLOSED(value: Double): Self = StObject.set(x, "CLOSED", value.asInstanceOf[js.Any])
      
      inline def setCONNECTING(value: Double): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setDispatchEvent(value: Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setOPEN(value: Double): Self = StObject.set(x, "OPEN", value.asInstanceOf[js.Any])
      
      inline def setOnerror(value: MessageEvent[Any] => Any): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnmessage(value: MessageEvent[Any] => Any): Self = StObject.set(x, "onmessage", js.Any.fromFunction1(value))
      
      inline def setOnopen(value: MessageEvent[Any] => Any): Self = StObject.set(x, "onopen", js.Any.fromFunction1(value))
      
      inline def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      inline def setRemoveEventListener(value: (String, js.Function1[/* evt */ MessageEvent[Any], Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventSourceInitDict extends StObject {
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var https: js.UndefOr[js.Object] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object EventSourceInitDict {
    
    inline def apply(): EventSourceInitDict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventSourceInitDict]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventSourceInitDict] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttps(value: js.Object): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
