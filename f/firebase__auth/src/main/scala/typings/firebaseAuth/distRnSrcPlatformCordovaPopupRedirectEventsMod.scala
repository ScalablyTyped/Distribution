package typings.firebaseAuth

import typings.firebaseAuth.distRnSrcCoreAuthAuthEventManagerMod.AuthEventManager
import typings.firebaseAuth.distRnSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distRnSrcModelPopupRedirectMod.AuthEvent
import typings.firebaseAuth.distRnSrcModelPopupRedirectMod.AuthEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcPlatformCordovaPopupRedirectEventsMod {
  
  @JSImport("@firebase/auth/dist/rn/src/platform_cordova/popup_redirect/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/rn/src/platform_cordova/popup_redirect/events", "CordovaAuthEventManager")
  @js.native
  open class CordovaAuthEventManager protected () extends AuthEventManager {
    def this(auth: AuthInternal) = this()
    
    def addPassiveListener(cb: js.Function1[/* e */ AuthEvent, Unit]): Unit = js.native
    
    /* private */ var initPromise: Any = js.native
    
    def initialized(): js.Promise[Unit] = js.native
    
    /* private */ val passiveListeners: Any = js.native
    
    def removePassiveListener(cb: js.Function1[/* e */ AuthEvent, Unit]): Unit = js.native
    
    def resetRedirect(): Unit = js.native
    
    /* private */ var resolveInialized: Any = js.native
  }
  
  inline def eventFromPartialAndUrl(partialEvent: AuthEvent, url: String): AuthEvent | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_eventFromPartialAndUrl")(partialEvent.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[AuthEvent | Null]
  
  inline def generateNewEvent(auth: AuthInternal, `type`: AuthEventType): AuthEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("_generateNewEvent")(auth.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[AuthEvent]
  inline def generateNewEvent(auth: AuthInternal, `type`: AuthEventType, eventId: String): AuthEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("_generateNewEvent")(auth.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any])).asInstanceOf[AuthEvent]
  
  inline def getAndRemoveEvent(auth: AuthInternal): js.Promise[AuthEvent | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getAndRemoveEvent")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AuthEvent | Null]]
  
  inline def getDeepLinkFromCallback(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_getDeepLinkFromCallback")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def savePartialEvent(auth: AuthInternal, event: AuthEvent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_savePartialEvent")(auth.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
