package typings.forgeDashDi

import typings.forgeDashDi.distResolversFunctionResolverMod.FunctionResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/FunctionResolver", JSImport.Namespace)
@js.native
object distResolversFunctionResolverMod extends js.Object {
  @js.native
  trait FunctionResolver
    extends typings.forgeDashDi.distResolversResolverMod.default {
    var func: js.Function = js.native
  }
  
  @js.native
  class default protected () extends FunctionResolver {
    def this(
      forge: typings.forgeDashDi.distForgeMod.default,
      binding: typings.forgeDashDi.distFrameworkBindingMod.default,
      func: js.Function
    ) = this()
  }
  
}

