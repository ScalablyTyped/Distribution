package typings.expoErrorRecovery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoErrorRecoveryWebMod {
  
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
    @scala.inline
    def recoveredProps_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recoveredProps")(x.asInstanceOf[js.Any])
    
    @JSImport("expo-error-recovery/build/ExpoErrorRecovery.web", "default.saveRecoveryProps")
    @js.native
    def saveRecoveryProps(props: String): Unit = js.native
  }
}
