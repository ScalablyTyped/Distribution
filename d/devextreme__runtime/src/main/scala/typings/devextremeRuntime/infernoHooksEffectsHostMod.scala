package typings.devextremeRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infernoHooksEffectsHostMod {
  
  object EffectsHost {
    
    @JSImport("@devextreme/runtime/esm/inferno-hooks/effects_host", "EffectsHost")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEffectHook(effect: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addEffectHook")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def decrement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decrement")().asInstanceOf[Unit]
    
    inline def increment(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")().asInstanceOf[Unit]
  }
}
