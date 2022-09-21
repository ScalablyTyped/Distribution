package typings.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websocketProviderMod {
  
  @JSImport("@ethersproject/providers/lib/websocket-provider", "WebSocketProvider")
  @js.native
  open class WebSocketProvider protected () extends JsonRpcProvider {
    def this(url: String) = this()
    def this(url: WebSocketLike) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: WebSocketLike, network: Networkish) = this()
    
    val _detectNetwork: js.Promise[Network] = js.native
    
    val _requests: StringDictionary[InflightRequest] = js.native
    
    val _subIds: StringDictionary[js.Promise[String]] = js.native
    
    val _subs: StringDictionary[Subscription] = js.native
    
    def _subscribe(tag: String, param: js.Array[Any], processFunc: js.Function1[/* result */ Any, Unit]): js.Promise[Unit] = js.native
    
    val _websocket: Any = js.native
    
    var _wsReady: Boolean = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def send(method: String): js.Promise[Any] = js.native
    
    def websocket: WebSocketLike = js.native
  }
  /* static members */
  object WebSocketProvider {
    
    @JSImport("@ethersproject/providers/lib/websocket-provider", "WebSocketProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUrl")().asInstanceOf[String]
  }
  
  trait InflightRequest extends StObject {
    
    def callback(error: js.Error, result: Any): Unit
    
    var payload: String
  }
  object InflightRequest {
    
    inline def apply(callback: (js.Error, Any) => Unit, payload: String): InflightRequest = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[InflightRequest]
    }
    
    extension [Self <: InflightRequest](x: Self) {
      
      inline def setCallback(value: (js.Error, Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscription extends StObject {
    
    def processFunc(payload: Any): Unit
    
    var tag: String
  }
  object Subscription {
    
    inline def apply(processFunc: Any => Unit, tag: String): Subscription = {
      val __obj = js.Dynamic.literal(processFunc = js.Any.fromFunction1(processFunc), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setProcessFunc(value: Any => Unit): Self = StObject.set(x, "processFunc", js.Any.fromFunction1(value))
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebSocketLike extends StObject {
    
    def close(): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, reason: String): Unit = js.native
    def close(code: Unit, reason: String): Unit = js.native
    
    var onerror: (js.Function1[/* repeated */ Any, Any]) | Null = js.native
    
    var onmessage: (js.Function1[/* repeated */ Any, Any]) | Null = js.native
    
    var onopen: (js.Function1[/* repeated */ Any, Any]) | Null = js.native
    
    var readyState: Double = js.native
    
    def send(payload: Any): Unit = js.native
  }
}
