package typings.forgeDi

import typings.forgeDi.distFrameworkArgumentsMod.Arguments
import typings.forgeDi.distResolversResolverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLifecyclesLifecycleMod {
  
  trait Lifecycle extends StObject {
    
    def resolve(resolver: default, context: typings.forgeDi.distFrameworkContextMod.default, args: Arguments): Any
  }
  object Lifecycle {
    
    inline def apply(resolve: (default, typings.forgeDi.distFrameworkContextMod.default, Arguments) => Any): Lifecycle = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
      __obj.asInstanceOf[Lifecycle]
    }
    
    extension [Self <: Lifecycle](x: Self) {
      
      inline def setResolve(value: (default, typings.forgeDi.distFrameworkContextMod.default, Arguments) => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction3(value))
    }
  }
}
