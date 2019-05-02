package typings
package expressDashAsyncDashWrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-async-wrap", JSImport.Namespace)
@js.native
object expressDashAsyncDashWrapMod extends js.Object {
  def default(
    handler: js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request, 
      /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
      /* next */ connectLib.connectMod.NextFunction, 
      js.Promise[scala.Unit]
    ]
  ): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler = js.native
  def default(
    handler: js.Function4[
      /* err */ js.Any, 
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request, 
      /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
      /* next */ connectLib.connectMod.NextFunction, 
      js.Promise[scala.Unit]
    ]
  ): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.ErrorRequestHandler = js.native
}

