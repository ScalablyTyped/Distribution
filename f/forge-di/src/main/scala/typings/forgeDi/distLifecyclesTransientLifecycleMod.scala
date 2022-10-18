package typings.forgeDi

import typings.forgeDi.distFrameworkArgumentsMod.Arguments
import typings.forgeDi.distLifecyclesLifecycleMod.Lifecycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLifecyclesTransientLifecycleMod {
  
  @JSImport("forge-di/dist/lifecycles/TransientLifecycle", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TransientLifecycle {
    
    /* CompleteClass */
    override def resolve(
      resolver: typings.forgeDi.distResolversResolverMod.default,
      context: typings.forgeDi.distFrameworkContextMod.default,
      args: Arguments
    ): Any = js.native
  }
  
  trait TransientLifecycle
    extends StObject
       with Lifecycle
  object TransientLifecycle {
    
    inline def apply(
      resolve: (typings.forgeDi.distResolversResolverMod.default, typings.forgeDi.distFrameworkContextMod.default, Arguments) => Any
    ): TransientLifecycle = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction3(resolve))
      __obj.asInstanceOf[TransientLifecycle]
    }
  }
}
