package typings.feathersjsExpress

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFormatter extends js.Object {
  @JSName("formatter")
  var formatter_Original: RequestHandler[ParamsDictionary] = js.native
  def apply(): js.Function0[Unit] = js.native
  def apply(handler: RequestHandler[ParamsDictionary]): js.Function0[Unit] = js.native
  def formatter(req: Request[ParamsDictionary, _, _], res: Response[_], next: NextFunction): js.Any = js.native
}

