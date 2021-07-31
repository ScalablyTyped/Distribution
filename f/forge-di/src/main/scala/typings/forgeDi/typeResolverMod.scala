package typings.forgeDi

import typings.forgeDi.constructorMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeResolverMod {
  
  @JSImport("forge-di/dist/resolvers/TypeResolver", JSImport.Default)
  @js.native
  class default protected () extends TypeResolver {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @js.native
  trait TypeResolver
    extends typings.forgeDi.resolverMod.default {
    
    var `type`: Constructor = js.native
  }
}
