package typings.expoErrorRecovery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildExpoErrorRecoveryDotwebMod {
  
  object default {
    
    @JSImport("expo-error-recovery/build/ExpoErrorRecovery.web", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo-error-recovery/build/ExpoErrorRecovery.web", "default.name")
    @js.native
    val name: String = js.native
    
    @JSImport("expo-error-recovery/build/ExpoErrorRecovery.web", "default.recoveredProps")
    @js.native
    def recoveredProps: String | Null = js.native
    inline def recoveredProps_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recoveredProps")(x.asInstanceOf[js.Any])
    
    inline def saveRecoveryProps(props: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveRecoveryProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
