package typings.feathersjsExpress

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  @JSName("formatter")
  var formatter_Original: RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(): js.Function0[Unit] = js.native
  def apply(handler: RequestHandler[ParamsDictionary, _, _, Query]): js.Function0[Unit] = js.native
  def formatter(req: Request[ParamsDictionary, _, _, Query], res: Response[_], next: NextFunction): js.Any = js.native
}

