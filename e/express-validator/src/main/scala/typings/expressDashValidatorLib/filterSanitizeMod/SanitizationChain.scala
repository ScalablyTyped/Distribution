package typings
package expressDashValidatorLib.filterSanitizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SanitizationChain
  extends expressLib.expressMod.eNs.RequestHandler
     with Sanitizer {
  /* InferMemberOverrides */
  override def apply(
    T0: /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    T1: /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response,
    T2: /* next */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
  ): js.Any = js.native
}

