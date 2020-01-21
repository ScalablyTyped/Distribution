package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`10`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`8`
import typings.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief websocket 支持模块
	* @detail 使用方法：,```JavaScript,var ws = require('ws');,```,创建一个服务器：,```JavaScript,var ws = require('ws');,var http = require('http');,,var svr = new http.Server(80, {,    '/ws': ws.upgrade((conn, req) => {,        conn.onmessage = e => console.log(e.data);,    }),});,svr.run();,```,使用 WebSocket 客户端：,```JavaScript,var ws = require('ws');,,var conn = new ws.Socket('ws://127.0.0.1/ws');,conn.ommessage = e => console.log(e.data);,```
	*/
@JSImport("ws", JSImport.Namespace)
@js.native
object wsMod extends js.Object {
  @js.native
  class Message () extends ClassWebSocketMessage
  
  @js.native
  class Socket () extends ClassWebSocket
  
  val BINARY: `2` = js.native
  val CLOSE: `8` = js.native
  val CLOSED: `3` = js.native
  val CLOSING: `2` = js.native
  val CONNECTING: `0` = js.native
  val CONTINUE: `0` = js.native
  val OPEN: `1` = js.native
  val PING: `9` = js.native
  val PONG: `10` = js.native
  val TEXT: `1` = js.native
  def upgrade(accept: js.Function): ClassHandler = js.native
}

