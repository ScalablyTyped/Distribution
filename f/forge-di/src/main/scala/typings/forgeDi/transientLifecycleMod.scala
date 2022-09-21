package typings.forgeDi

import typings.forgeDi.argumentsMod.Arguments
import typings.forgeDi.lifecycleMod.Lifecycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transientLifecycleMod {
  
  @JSImport("forge-di/dist/lifecycles/TransientLifecycle", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TransientLifecycle {
    
    /* CompleteClass */
    override def resolve(
      resolver: typings.forgeDi.resolverMod.default,
      context: typings.forgeDi.contextMod.default,
      args: Arguments
    ): Any = js.native
  }
  
  trait TransientLifecycle
    extends StObject
       with Lifecycle
  object TransientLifecycle {
    
    inline def apply(
      resolve: (typings.forgeDi.resolverMod.default, typings.forgeDi.contextMod.default, Arguments) => Any
    ): TransientLifecycle = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
      __obj.asInstanceOf[TransientLifecycle]
    }
  }
}
