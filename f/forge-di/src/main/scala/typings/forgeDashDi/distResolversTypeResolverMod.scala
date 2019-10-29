package typings.forgeDashDi

import typings.forgeDashDi.distFrameworkConstructorMod.Constructor
import typings.forgeDashDi.distResolversTypeResolverMod.TypeResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/TypeResolver", JSImport.Namespace)
@js.native
object distResolversTypeResolverMod extends js.Object {
  @js.native
  trait TypeResolver
    extends typings.forgeDashDi.distResolversResolverMod.default {
    var `type`: Constructor = js.native
  }
  
  @js.native
  class default protected () extends TypeResolver {
    def this(
      forge: typings.forgeDashDi.distForgeMod.default,
      binding: typings.forgeDashDi.distFrameworkBindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
}

