package typings.engineIoClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmTransportsWebsocketConstructorMod {
  
  @JSImport("engine.io-client/build/esm/transports/websocket-constructor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("engine.io-client/build/esm/transports/websocket-constructor", "WebSocket")
  @js.native
  val WebSocket: Any = js.native
  
  @JSImport("engine.io-client/build/esm/transports/websocket-constructor", "defaultBinaryType")
  @js.native
  val defaultBinaryType: /* "nodebuffer" */ String = js.native
  
  inline def nextTick(callback: js.Function, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(scala.List(callback.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("engine.io-client/build/esm/transports/websocket-constructor", "usingBrowserWebSocket")
  @js.native
  val usingBrowserWebSocket: /* false */ Boolean = js.native
}
