package typings.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolversFunctionResolverMod {
  
  @JSImport("forge-di/dist/resolvers/FunctionResolver", JSImport.Default)
  @js.native
  open class default protected () extends FunctionResolver {
    def this(
      forge: typings.forgeDi.distForgeMod.default,
      binding: typings.forgeDi.distFrameworkBindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @js.native
  trait FunctionResolver
    extends typings.forgeDi.distResolversResolverMod.default {
    
    var func: js.Function = js.native
  }
}
