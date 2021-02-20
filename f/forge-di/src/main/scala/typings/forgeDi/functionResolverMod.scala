package typings.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionResolverMod {
  
  @JSImport("forge-di/dist/resolvers/FunctionResolver", JSImport.Default)
  @js.native
  class default protected () extends FunctionResolver {
    def this(
      forge: typings.forgeDi.forgeMod.default,
      binding: typings.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @js.native
  trait FunctionResolver
    extends typings.forgeDi.resolverMod.default {
    
    var func: js.Function = js.native
  }
}
