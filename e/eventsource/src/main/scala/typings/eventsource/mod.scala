package typings.eventsource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eventsource", JSImport.Namespace)
  @js.native
  class ^ protected () extends EventSource {
    def this(url: String) = this()
    def this(url: String, eventSourceInitDict: EventSourceInitDict) = this()
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
    def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
    
    @js.native
    sealed trait CLOSED extends ReadyState
    /* 2 */ val CLOSED: typings.eventsource.mod.ReadyState.CLOSED with Double = js.native
    
    @js.native
    sealed trait CONNECTING extends ReadyState
    /* 0 */ val CONNECTING: typings.eventsource.mod.ReadyState.CONNECTING with Double = js.native
    
    @js.native
    sealed trait OPEN extends ReadyState
    /* 1 */ val OPEN: typings.eventsource.mod.ReadyState.OPEN with Double = js.native
  }
  
  @js.native
  trait EventSource extends StObject {
    
    val CLOSED: Double = js.native
    
    val CONNECTING: Double = js.native
    
    val OPEN: Double = js.native
    
    def addEventListener(`type`: String, listener: EventListener): Unit = js.native
    
    def close(): Unit = js.native
    
    def dispatchEvent(evt: Event): Boolean = js.native
    
    def onerror(evt: MessageEvent[_]): js.Any = js.native
    
    def onmessage(evt: MessageEvent[_]): js.Any = js.native
    
    def onopen(evt: MessageEvent[_]): js.Any = js.native
    
    val readyState: Double = js.native
    
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
    
    val url: String = js.native
    
    val withCredentials: Boolean = js.native
  }
  
  @js.native
  trait EventSourceInitDict extends StObject {
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var https: js.UndefOr[js.Object] = js.native
    
    var proxy: js.UndefOr[String] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object EventSourceInitDict {
    
    @scala.inline
    def apply(): EventSourceInitDict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventSourceInitDict]
    }
    
    @scala.inline
    implicit class EventSourceInitDictMutableBuilder[Self <: EventSourceInitDict] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttps(value: js.Object): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
