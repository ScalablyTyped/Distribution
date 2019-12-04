package typings.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dojox {
  type analytics = analytics_
  type collections = collections_
  type color = color_
  type drawing = drawing_
  type dtl = dtl_
  type fx = fx_
  type gfx = gfx_
  type gfx3d = gfx3d_
  type highlight = highlight_
  type html = html_
  type main = main_
  type mobile = mobile_
  type mvc = mvc_
  type sketch = sketch_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/socket.html
    *
    * Provides a simple socket connection using WebSocket, or alternate
    * communication mechanisms in legacy browsers for comet-style communication. This is based
    * on the WebSocket API and returns an object that implements the WebSocket interface:
    * http://dev.w3.org/html5/websockets/#websocket
    * Provides socket connections. This can be used with virtually any Comet protocol.
    *
    * @param argsOrUrl This uses the same arguments as the other I/O functions in Dojo, or aURL to connect to. The URL should be a relative URL in order to properlywork with WebSockets (it can still be host relative, like //other-site.org/endpoint)
    */
  type socket = js.Function1[/* argsOrUrl */ js.Object, Unit]
  type sql = sql_
  type uuid = uuid_
  type validate = validate_
}
