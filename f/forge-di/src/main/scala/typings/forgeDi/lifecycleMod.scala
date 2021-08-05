package typings.forgeDi

import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.resolverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecycleMod {
  
  trait Lifecycle extends StObject {
    
    def resolve(resolver: default, context: typings.forgeDi.contextMod.default, args: Arguments): js.Any
  }
  object Lifecycle {
    
    inline def apply(resolve: (default, typings.forgeDi.contextMod.default, Arguments) => js.Any): Lifecycle = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
      __obj.asInstanceOf[Lifecycle]
    }
    
    extension [Self <: Lifecycle](x: Self) {
      
      inline def setResolve(value: (default, typings.forgeDi.contextMod.default, Arguments) => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction3(value))
    }
  }
}
