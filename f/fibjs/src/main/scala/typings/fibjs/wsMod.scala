package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief websocket 支持模块
  * @detail 使用方法：,```JavaScript,var ws = require('ws');,```,创建一个服务器：,```JavaScript,var ws = require('ws');,var http = require('http');,,var svr = new http.Server(80, {,    '/ws': ws.upgrade((conn, req) => {,        conn.onmessage = e => console.log(e.data);,    }),});,svr.run();,```,使用 WebSocket 客户端：,```JavaScript,var ws = require('ws');,,var conn = new ws.Socket('ws://127.0.0.1/ws');,conn.ommessage = e => console.log(e.data);,```
  */
object wsMod {
  
  @JSImport("ws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ws", "BINARY")
  @js.native
  val BINARY: /* 2 */ Double = js.native
  
  @JSImport("ws", "CLOSE")
  @js.native
  val CLOSE: /* 8 */ Double = js.native
  
  @JSImport("ws", "CLOSED")
  @js.native
  val CLOSED: /* 3 */ Double = js.native
  
  @JSImport("ws", "CLOSING")
  @js.native
  val CLOSING: /* 2 */ Double = js.native
  
  @JSImport("ws", "CONNECTING")
  @js.native
  val CONNECTING: /* 0 */ Double = js.native
  
  @JSImport("ws", "CONTINUE")
  @js.native
  val CONTINUE: /* 0 */ Double = js.native
  
  @JSImport("ws", "Message")
  @js.native
  class Message ()
    extends StObject
       with ClassWebSocketMessage
  
  @JSImport("ws", "OPEN")
  @js.native
  val OPEN: /* 1 */ Double = js.native
  
  @JSImport("ws", "PING")
  @js.native
  val PING: /* 9 */ Double = js.native
  
  @JSImport("ws", "PONG")
  @js.native
  val PONG: /* 10 */ Double = js.native
  
  @JSImport("ws", "Socket")
  @js.native
  class Socket ()
    extends StObject
       with ClassWebSocket
  
  @JSImport("ws", "TEXT")
  @js.native
  val TEXT: /* 1 */ Double = js.native
  
  @scala.inline
  def upgrade(accept: js.Function): ClassHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(accept.asInstanceOf[js.Any]).asInstanceOf[ClassHandler]
}
