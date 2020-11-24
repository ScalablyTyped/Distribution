package typings.forgeDi

import typings.forgeDi.constructorMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-di/dist/resolvers/TypeResolver", JSImport.Namespace)
@js.native
object typeResolverMod extends js.Object {
  
  @js.native
  trait TypeResolver
    extends typings.forgeDi.resolverMod.default {
    
    var `type`: Constructor = js.native
  }
  
  @js.native
  class default protected () extends TypeResolver {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
}
