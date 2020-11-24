package typings.forgeDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-di/dist/resolvers/FunctionResolver", JSImport.Namespace)
@js.native
object functionResolverMod extends js.Object {
  
  @js.native
  trait FunctionResolver
    extends typings.forgeDi.resolverMod.default {
    
    var func: js.Function = js.native
  }
  
  @js.native
  class default protected () extends FunctionResolver {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
}
