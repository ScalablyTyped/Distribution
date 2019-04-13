package typings
package expressDashWsLib.expressDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithWebsocketMethod extends js.Object {
  @JSName("ws")
  var ws_Original: WebsocketMethod[this.type] = js.native
  def ws(
    route: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams,
    middlewares: WebsocketRequestHandler*
  ): this.type = js.native
}

