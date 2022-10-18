package typings.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolversInstanceResolverMod {
  
  @JSImport("forge-di/dist/resolvers/InstanceResolver", JSImport.Default)
  @js.native
  open class default protected () extends InstanceResolver {
    def this(
      forge: typings.forgeDi.distForgeMod.default,
      binding: typings.forgeDi.distFrameworkBindingMod.default,
      instance: Any
    ) = this()
  }
  
  @js.native
  trait InstanceResolver
    extends typings.forgeDi.distResolversResolverMod.default {
    
    var instance: Any = js.native
  }
}
