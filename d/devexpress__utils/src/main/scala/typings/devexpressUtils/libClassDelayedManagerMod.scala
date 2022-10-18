package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassDelayedManagerMod {
  
  @JSImport("@devexpress/utils/lib/class/delayed-manager", "DelayedActionManager")
  @js.native
  open class DelayedActionManager protected () extends StObject {
    def this(action: js.Function0[Unit]) = this()
    
    /* private */ var action: Any = js.native
    
    def actionExecuted: Boolean = js.native
    
    /* private */ var actionStartTime: Any = js.native
    
    /* private */ var actionTimeout: Any = js.native
    
    /* private */ var actionTimeoutId: Any = js.native
    
    def executeAction(): Unit = js.native
    
    def executeIfTimerExpired(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def start(timeout: Double): Unit = js.native
    
    def stop(): Unit = js.native
  }
}
