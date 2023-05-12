package typings.forgeDi

import typings.forgeDi.distFrameworkConstructorMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolversTypeResolverMod {
  
  @JSImport("forge-di/dist/resolvers/TypeResolver", JSImport.Default)
  @js.native
  open class default protected () extends TypeResolver {
    def this(
      forge: typings.forgeDi.distForgeMod.default,
      binding: typings.forgeDi.distFrameworkBindingMod.default[Any],
      `type`: Constructor[Any]
    ) = this()
  }
  
  @js.native
  trait TypeResolver
    extends typings.forgeDi.distResolversResolverMod.default {
    
    var `type`: Constructor[Any] = js.native
  }
}
