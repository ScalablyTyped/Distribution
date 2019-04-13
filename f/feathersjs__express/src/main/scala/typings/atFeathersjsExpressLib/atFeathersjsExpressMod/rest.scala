package typings
package atFeathersjsExpressLib.atFeathersjsExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/express", "rest")
@js.native
object rest extends js.Object {
  @JSName("formatter")
  var formatter_Original: expressLib.expressMod.RequestHandler = js.native
  def apply(): js.Function0[scala.Unit] = js.native
  def apply(handler: expressLib.expressMod.RequestHandler): js.Function0[scala.Unit] = js.native
  def formatter(
    req: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    res: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response,
    next: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
  ): js.Any = js.native
}

