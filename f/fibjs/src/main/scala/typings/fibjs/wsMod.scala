package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief websocket 支持模块
  * @detail 使用方法：,```JavaScript,var ws = require('ws');,```,创建一个服务器：,```JavaScript,var ws = require('ws');,var http = require('http');,,var svr = new http.Server(80, {,    '/ws': ws.upgrade((conn, req) => {,        conn.onmessage = e => console.log(e.data);,    }),});,svr.run();,```,使用 WebSocket 客户端：,```JavaScript,var ws = require('ws');,,var conn = new ws.Socket('ws://127.0.0.1/ws');,conn.ommessage = e => console.log(e.data);,```
  */
@JSImport("ws", JSImport.Namespace)
@js.native
object wsMod extends js.Object {
  
  val BINARY: /* 2 */ Double = js.native
  
  val CLOSE: /* 8 */ Double = js.native
  
  val CLOSED: /* 3 */ Double = js.native
  
  val CLOSING: /* 2 */ Double = js.native
  
  val CONNECTING: /* 0 */ Double = js.native
  
  val CONTINUE: /* 0 */ Double = js.native
  
  val OPEN: /* 1 */ Double = js.native
  
  val PING: /* 9 */ Double = js.native
  
  val PONG: /* 10 */ Double = js.native
  
  val TEXT: /* 1 */ Double = js.native
  
  def upgrade(accept: js.Function): ClassHandler = js.native
  
  @js.native
  class Message () extends ClassWebSocketMessage
  
  @js.native
  class Socket () extends ClassWebSocket
}
