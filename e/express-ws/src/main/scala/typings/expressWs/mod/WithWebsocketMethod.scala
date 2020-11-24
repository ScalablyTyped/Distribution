package typings.expressWs.mod

import typings.expressServeStaticCore.mod.PathParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithWebsocketMethod extends js.Object {
  
  def ws(route: PathParams, middlewares: WebsocketRequestHandler*): this.type = js.native
  @JSName("ws")
  var ws_Original: WebsocketMethod[this.type] = js.native
}
