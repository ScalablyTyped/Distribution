package typings.atFeathersjsExpress.atFeathersjsExpressMod

import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.ServiceMethods
import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.SetupMethod
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandlerParams
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof express.express.Application, 'use'> ]: express.express.Application[P]}
- Dropped {[ P in std.Exclude<keyof @feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<T>>>>, 'use'> ]: @feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<T>>>>[P]} */ @js.native
trait Application[T] extends js.Object {
  @JSName("use")
  var use_Original: FeathersApplicationRequestHandler[T] = js.native
  def use(handlers: (RequestHandler[ParamsDictionary] | RequestHandlerParams[ParamsDictionary])*): T = js.native
  def use(
    path: PathParams,
    handlers: (RequestHandler[ParamsDictionary] | RequestHandlerParams[ParamsDictionary] | (Partial[ServiceMethods[_] with SetupMethod]) | Application[_])*
  ): T = js.native
}

