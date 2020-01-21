package typings.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dojox {
  type analytics = typings.dojo.dojox.analytics_
  type collections = typings.dojo.dojox.collections_
  type color = typings.dojo.dojox.color_
  type drawing = typings.dojo.dojox.drawing_
  type dtl = typings.dojo.dojox.dtl_
  type flash = typings.dojo.dojox.flash_
  type fx = typings.dojo.dojox.fx_
  type gfx = typings.dojo.dojox.gfx_
  type gfx3d = typings.dojo.dojox.gfx3d_
  type highlight = typings.dojo.dojox.highlight_
  type html = typings.dojo.dojox.html_
  type image = typings.dojo.dojox.image_
  type main = typings.dojo.dojox.main_
  type math = typings.dojo.dojox.math_
  type mobile = typings.dojo.dojox.mobile_
  type mvc = typings.dojo.dojox.mvc_
  type sketch = typings.dojo.dojox.sketch_
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
  type socket = js.Function1[/* argsOrUrl */ js.Object, scala.Unit]
  type sql = typings.dojo.dojox.sql_
  type timing = typings.dojo.dojox.timing_
  type uuid = typings.dojo.dojox.uuid_
  type validate = typings.dojo.dojox.validate_
}
