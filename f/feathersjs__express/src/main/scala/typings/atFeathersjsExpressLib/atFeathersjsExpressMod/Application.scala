package typings
package atFeathersjsExpressLib.atFeathersjsExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof express.express.Application, 'use'> ]: express.express.Application[P]}
- Dropped {[ P in std.Exclude<keyof @feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<T>>>>, 'use'> ]: @feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<@feathersjs/feathers.@feathersjs/feathers.Application<T>>>>[P]} */ @js.native
trait Application[T] extends js.Object {
  @JSName("use")
  var use_Original: FeathersApplicationRequestHandler[T] = js.native
  def use(
    handlers: (expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandlerParams)*
  ): T = js.native
  def use(
    path: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams,
    handlers: (expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandlerParams | (stdLib.Partial[
      atFeathersjsFeathersLib.atFeathersjsFeathersMod.ServiceMethods[_] with atFeathersjsFeathersLib.atFeathersjsFeathersMod.SetupMethod
    ]) | Application[_])*
  ): T = js.native
}

