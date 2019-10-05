package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.socket")
@js.native
object socket extends js.Object {
  /**
    * Provides a simple long-poll based comet-style socket/connection to a server and returns an
    * object implementing the WebSocket interface:
    * http://dev.w3.org/html5/websockets/#websocket
    *
    * @param args This uses the same arguments as the other I/O functions in Dojo, with this addition:args.interval:Indicates the amount of time (in milliseconds) after a response was receivedbefore another request is made. By default, a request is made immediatelyafter getting a response. The interval can be increased to reduce load on theserver or to do simple time-based polling where the server always respondsimmediately.args.transport:Provide an alternate transport like dojo.io.script.get
    */
  type LongPoll = js.Function1[/* args */ js.Object, js.Any]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/socket/Reconnect.html
    *
    * Provides auto-reconnection to a websocket after it has been closed
    *
    * @param socket Socket to add reconnection support to.
    * @param options
    */
  type Reconnect = js.Function2[/* socket */ js.Any, /* options */ js.Any, Unit]
  /**
    * A wrapper for WebSocket, than handles standard args and relative URLs
    *
    * @param args
    * @param fallback
    */
  type WebSocket = js.Function2[/* args */ js.Any, /* fallback */ js.Any, Unit]
  /**
    *
    * @param socket
    * @param newSocket
    * @param listenForOpen
    */
  type replace = js.Function3[/* socket */ js.Any, /* newSocket */ js.Any, /* listenForOpen */ js.Any, Unit]
}

