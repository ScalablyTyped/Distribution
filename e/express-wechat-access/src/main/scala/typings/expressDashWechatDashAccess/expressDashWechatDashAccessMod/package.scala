package typings.expressDashWechatDashAccess

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Response
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWechatDashAccessMod {
  type WeMiddleware = js.Function3[/* req */ js.Any, /* res */ Response | ServerResponse, /* next */ NextFunction, js.Any]
}
