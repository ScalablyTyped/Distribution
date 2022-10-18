package typings.firebaseAuth

import typings.firebaseAuth.distEsm5SrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distEsm5SrcModelPopupRedirectMod.AuthEvent
import typings.firebaseAuth.distEsm5SrcModelPopupRedirectMod.AuthEventConsumer
import typings.firebaseAuth.distEsm5SrcModelPopupRedirectMod.EventManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreAuthAuthEventManagerMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/auth/auth_event_manager", "AuthEventManager")
  @js.native
  open class AuthEventManager protected ()
    extends StObject
       with EventManager {
    def this(auth: AuthInternal) = this()
    
    /* private */ val auth: Any = js.native
    
    /* private */ val cachedEventUids: Any = js.native
    
    /* private */ val consumers: Any = js.native
    
    /* private */ var hasEventBeenHandled: Any = js.native
    
    /* protected */ var hasHandledPotentialRedirect: Boolean = js.native
    
    /* private */ var isEventForConsumer: Any = js.native
    
    /* private */ var lastProcessedEventTime: Any = js.native
    
    def onEvent(event: AuthEvent): Boolean = js.native
    
    /* protected */ var queuedRedirectEvent: AuthEvent | Null = js.native
    
    /* CompleteClass */
    override def registerConsumer(authEventConsumer: AuthEventConsumer): Unit = js.native
    
    /* private */ var saveEventToCache: Any = js.native
    
    /* private */ var sendToConsumer: Any = js.native
    
    /* CompleteClass */
    override def unregisterConsumer(authEventConsumer: AuthEventConsumer): Unit = js.native
  }
}
