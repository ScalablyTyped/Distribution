package typings.emberTestWaiters

import typings.emberTestWaiters.anon.For
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCustomEmberDebugMod {
  
  /* augmented module */
  object emberDebugAugmentingMod {
    
    @JSImport("@ember/debug", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def deprecate(message: String, test: Boolean, options: For): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(message.asInstanceOf[js.Any], test.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberTestWaiters.emberTestWaitersStrings.available
    - typings.emberTestWaiters.emberTestWaitersStrings.enabled
  */
  trait DeprecationStages extends StObject
  object DeprecationStages {
    
    inline def available: typings.emberTestWaiters.emberTestWaitersStrings.available = "available".asInstanceOf[typings.emberTestWaiters.emberTestWaitersStrings.available]
    
    inline def enabled: typings.emberTestWaiters.emberTestWaitersStrings.enabled = "enabled".asInstanceOf[typings.emberTestWaiters.emberTestWaitersStrings.enabled]
  }
}
