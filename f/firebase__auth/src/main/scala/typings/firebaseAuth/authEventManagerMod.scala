package typings.firebaseAuth

import typings.firebaseAuth.modelAuthMod.AuthInternal
import typings.firebaseAuth.popupRedirectMod.AuthEvent
import typings.firebaseAuth.popupRedirectMod.AuthEventConsumer
import typings.firebaseAuth.popupRedirectMod.EventManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authEventManagerMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/auth/auth_event_manager", "AuthEventManager")
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
