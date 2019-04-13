package typings
package expressDashValidatorLib.checkCheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationChain
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler
     with Validator
     with expressDashValidatorLib.filterSanitizeMod.Sanitizer {
  /* InferMemberOverrides */
  override def apply(
    T0: /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request,
    T1: /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response,
    T2: /* next */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
  ): js.Any = js.native
  def custom(validator: CustomValidator): this.type = js.native
}

