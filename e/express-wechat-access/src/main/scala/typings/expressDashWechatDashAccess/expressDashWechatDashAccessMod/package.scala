package typings.expressDashWechatDashAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWechatDashAccessMod {
  import typings.express.expressMod.NextFunction
  import typings.node.httpMod.ServerResponse
  import typings.std.Response

  type WeMiddleware = js.Function3[/* req */ js.Any, /* res */ Response | ServerResponse, /* next */ NextFunction, js.Any]
}
