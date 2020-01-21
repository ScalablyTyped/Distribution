package typings.expressWs.mod

import typings.expressServeStaticCore.mod.PathParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithWebsocketMethod extends js.Object {
  @JSName("ws")
  var ws_Original: WebsocketMethod[this.type] = js.native
  def ws(route: PathParams, middlewares: WebsocketRequestHandler*): this.type = js.native
}

