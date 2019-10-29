package typings.forgeDashDi

import typings.forgeDashDi.distResolversInstanceResolverMod.InstanceResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/InstanceResolver", JSImport.Namespace)
@js.native
object distResolversInstanceResolverMod extends js.Object {
  @js.native
  trait InstanceResolver
    extends typings.forgeDashDi.distResolversResolverMod.default {
    var instance: js.Any = js.native
  }
  
  @js.native
  class default protected () extends InstanceResolver {
    def this(
      forge: typings.forgeDashDi.distForgeMod.default,
      binding: typings.forgeDashDi.distFrameworkBindingMod.default,
      instance: js.Any
    ) = this()
  }
  
}

