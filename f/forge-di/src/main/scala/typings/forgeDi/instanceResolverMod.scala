package typings.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceResolverMod {
  
  @JSImport("forge-di/dist/resolvers/InstanceResolver", JSImport.Default)
  @js.native
  open class default protected () extends InstanceResolver {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      instance: Any
    ) = this()
  }
  
  @js.native
  trait InstanceResolver
    extends typings.forgeDi.resolverMod.default {
    
    var instance: Any = js.native
  }
}
