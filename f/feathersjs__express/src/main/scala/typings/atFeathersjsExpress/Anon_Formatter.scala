package typings.atFeathersjsExpress

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Formatter extends js.Object {
  @JSName("formatter")
  var formatter_Original: RequestHandler[ParamsDictionary] = js.native
  def apply(): js.Function0[Unit] = js.native
  def apply(handler: RequestHandler[ParamsDictionary]): js.Function0[Unit] = js.native
  def formatter(req: Request[ParamsDictionary], res: Response, next: NextFunction): js.Any = js.native
}

