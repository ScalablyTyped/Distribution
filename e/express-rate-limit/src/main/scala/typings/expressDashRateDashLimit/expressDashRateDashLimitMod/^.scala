package typings.expressDashRateDashLimit.expressDashRateDashLimitMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-rate-limit", JSImport.Namespace)
@js.native
class ^ protected () extends Instance {
  def this(options: Options) = this()
  /* CompleteClass */
  override def apply(
    T0: /* req */ Request[ParamsDictionary, js.Any, js.Any],
    T1: /* res */ Response[js.Any],
    T2: /* next */ NextFunction
  ): js.Any = js.native
}

@JSImport("express-rate-limit", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Instantiable1[/* options */ Options, Instance]] {
  def apply(options: Options): Instance = js.native
}

