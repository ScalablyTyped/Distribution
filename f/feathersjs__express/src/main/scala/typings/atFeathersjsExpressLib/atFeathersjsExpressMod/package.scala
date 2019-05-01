package typings
package atFeathersjsExpressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsExpressMod {
  // TypeScript methods cannot be overloaded with a different signature. Derive two application types without the use methods.
  type ExpressAndFeathersApplicationWithoutUse[T] = (atFeathersjsExpressLib.Omit[
    expressLib.expressMod.Application, 
    atFeathersjsExpressLib.atFeathersjsExpressLibStrings.use
  ]) with (atFeathersjsExpressLib.Omit[
    atFeathersjsFeathersLib.atFeathersjsFeathersMod.Application[T], 
    atFeathersjsExpressLib.atFeathersjsExpressLibStrings.use
  ])
  type FeathersApplicationRequestHandler[T] = expressLib.expressMod.IRouterHandler[T] with FeathersRouterMatcher[T] with (js.Function1[
    /* repeated */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandlerParams, 
    T
  ])
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams, 
    /* repeated */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandlerParams | (stdLib.Partial[
      atFeathersjsFeathersLib.atFeathersjsFeathersMod.ServiceMethods[_] with atFeathersjsFeathersLib.atFeathersjsFeathersMod.SetupMethod
    ]) | Application[js.Any], 
    T
  ]
  type FeathersServiceOptions = js.Any
}
