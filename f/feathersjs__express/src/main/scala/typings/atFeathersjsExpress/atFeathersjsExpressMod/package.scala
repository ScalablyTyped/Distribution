package typings.atFeathersjsExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsExpressMod {
  import typings.atFeathersjsExpress.Omit
  import typings.atFeathersjsExpress.atFeathersjsExpressStrings.use
  import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.ServiceMethods
  import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.SetupMethod
  import typings.express.expressMod.IRouterHandler
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandlerParams
  import typings.std.Partial

  // TypeScript methods cannot be overloaded with a different signature. Derive two application types without the use methods.
  type ExpressAndFeathersApplicationWithoutUse[T] = (Omit[typings.express.expressMod.Application, use]) with (Omit[typings.atFeathersjsFeathers.atFeathersjsFeathersMod.Application[T], use])
  type FeathersApplicationRequestHandler[T] = IRouterHandler[T] with FeathersRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary], T])
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ PathParams, 
    /* repeated */ RequestHandler[ParamsDictionary] | RequestHandlerParams[ParamsDictionary] | (Partial[ServiceMethods[_] with SetupMethod]) | Application[js.Any], 
    T
  ]
  type FeathersServiceOptions = js.Any
}
