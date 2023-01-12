package typings.forgeDi

import typings.forgeDi.distFrameworkArgumentsMod.Arguments
import typings.forgeDi.distLifecyclesLifecycleMod.Lifecycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLifecyclesSingletonLifecycleMod {
  
  @JSImport("forge-di/dist/lifecycles/SingletonLifecycle", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SingletonLifecycle {
    
    /* CompleteClass */
    var instance: Any = js.native
    
    /* CompleteClass */
    override def resolve(
      resolver: typings.forgeDi.distResolversResolverMod.default,
      context: typings.forgeDi.distFrameworkContextMod.default,
      args: Arguments
    ): Any = js.native
  }
  
  trait SingletonLifecycle
    extends StObject
       with Lifecycle {
    
    var instance: Any
  }
  object SingletonLifecycle {
    
    inline def apply(
      instance: Any,
      resolve: (typings.forgeDi.distResolversResolverMod.default, typings.forgeDi.distFrameworkContextMod.default, Arguments) => Any
    ): SingletonLifecycle = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], resolve = js.Any.fromFunction3(resolve))
      __obj.asInstanceOf[SingletonLifecycle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingletonLifecycle] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
}
