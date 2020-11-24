package typings.forgeDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-di/dist/resolvers/InstanceResolver", JSImport.Namespace)
@js.native
object instanceResolverMod extends js.Object {
  
  @js.native
  trait InstanceResolver
    extends typings.forgeDi.resolverMod.default {
    
    var instance: js.Any = js.native
  }
  
  @js.native
  class default protected () extends InstanceResolver {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      instance: js.Any
    ) = this()
  }
}
