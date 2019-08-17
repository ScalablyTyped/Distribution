package typings.expressDashWechatDashAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWechatDashAccessMod {
  import typings.express.expressMod.NextFunction
  import typings.express.expressMod.Response
  import typings.node.httpMod.ServerResponse

  type WeMiddleware = js.Function3[/* req */ js.Any, /* res */ Response | ServerResponse, /* next */ NextFunction, js.Any]
}
