package typings.emberEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceMod {
  
  @JSImport("@ember/engine/instance", JSImport.Default)
  @js.native
  class default () extends EngineInstance
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(RegistryProxyMixin, ContainerProxyMixin) * / any */ @js.native
  trait EngineInstance extends StObject {
    
    /**
      *  Initialize the `EngineInstance` and return a promise that resolves
      *  with the instance itself when the boot process is complete.
      */
    def boot(): js.Promise[EngineInstance] = js.native
    
    /**
      * Unregister a factory.
      */
    def unregister(fullName: String): js.Any = js.native
  }
  object EngineInstance {
    
    @scala.inline
    def apply(boot: () => js.Promise[EngineInstance], unregister: String => js.Any): EngineInstance = {
      val __obj = js.Dynamic.literal(boot = js.Any.fromFunction0(boot), unregister = js.Any.fromFunction1(unregister))
      __obj.asInstanceOf[EngineInstance]
    }
    
    @scala.inline
    implicit class EngineInstanceMutableBuilder[Self <: EngineInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoot(value: () => js.Promise[EngineInstance]): Self = StObject.set(x, "boot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnregister(value: String => js.Any): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    }
  }
}
