package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayedManagerMod {
  
  @JSImport("@devexpress/utils/lib/class/delayed-manager", "DelayedActionManager")
  @js.native
  class DelayedActionManager protected () extends StObject {
    def this(action: js.Function0[Unit]) = this()
    
    var action: js.Any = js.native
    
    val actionExecuted: Boolean = js.native
    
    var actionStartTime: js.Any = js.native
    
    var actionTimeout: js.Any = js.native
    
    var actionTimeoutId: js.Any = js.native
    
    def executeAction(): Unit = js.native
    
    def executeIfTimerExpired(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def start(timeout: Double): Unit = js.native
    
    def stop(): Unit = js.native
  }
}
