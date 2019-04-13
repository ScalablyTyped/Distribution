package typings
package atFeathersjsExpressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Formatter extends js.Object {
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

