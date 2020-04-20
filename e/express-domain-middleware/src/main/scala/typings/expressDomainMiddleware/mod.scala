package typings.expressDomainMiddleware

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-domain-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): js.Any = js.native
}

