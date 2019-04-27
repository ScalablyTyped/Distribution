package typings
package atFeathersjsExpressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsExpressMod {
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams, 
    /* repeated */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandlerParams | (stdLib.Partial[
      atFeathersjsFeathersLib.atFeathersjsFeathersMod.ServiceMethods[_] with atFeathersjsFeathersLib.atFeathersjsFeathersMod.SetupMethod
    ]) | Application[js.Any], 
    T
  ]
  type FeathersServiceOptions = js.Any
}
