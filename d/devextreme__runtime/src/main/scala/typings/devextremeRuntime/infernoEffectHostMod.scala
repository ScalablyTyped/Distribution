package typings.devextremeRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infernoEffectHostMod {
  
  object InfernoEffectHost {
    
    @JSImport("@devextreme/runtime/esm/inferno/effect_host", "InfernoEffectHost")
    @js.native
    val ^ : js.Any = js.native
    
    inline def callEffects(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callEffects")().asInstanceOf[Unit]
    
    @JSImport("@devextreme/runtime/esm/inferno/effect_host", "InfernoEffectHost.callbacks")
    @js.native
    def callbacks: js.Array[js.Function0[Unit]] = js.native
    inline def callbacks_=(x: js.Array[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(x.asInstanceOf[js.Any])
    
    inline def lock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")().asInstanceOf[Unit]
    
    @JSImport("@devextreme/runtime/esm/inferno/effect_host", "InfernoEffectHost.lockCount")
    @js.native
    def lockCount: Double = js.native
    inline def lockCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lockCount")(x.asInstanceOf[js.Any])
  }
}
