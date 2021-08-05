package typings.firebaseMessaging

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAppTypes.privateMod.FirebaseService
import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import typings.firebaseUtil.subscribeMod.Unsubscribe
import typings.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowControllerMod {
  
  @JSImport("@firebase/messaging/dist/controllers/window-controller", "WindowController")
  @js.native
  class WindowController protected ()
    extends StObject
       with FirebaseMessaging
       with FirebaseService {
    def this(firebaseDependencies: FirebaseInternalDependencies) = this()
    
    /* CompleteClass */
    var app: FirebaseApp = js.native
    @JSName("app")
    def app_MWindowController: typings.firebaseMessaging.mod.FirebaseApp = js.native
    
    /* private */ val firebaseDependencies: js.Any = js.native
    
    def getSwReg(): js.UndefOr[ServiceWorkerRegistration] = js.native
    
    def getToken(options: typings.firebaseMessaging.anon.ServiceWorkerRegistration): js.Promise[String] = js.native
    
    def getVapidKey(): String | Null = js.native
    
    /* private */ var logEvent: js.Any = js.native
    
    /* private */ var messageEventListener: js.Any = js.native
    
    def onBackgroundMessage(): Unsubscribe = js.native
    
    /* private */ var onMessageCallback: js.Any = js.native
    
    /**
      * @deprecated No-op. It was initially designed with token rotation requests from server in mind.
      * However, the plan to implement such feature was abandoned.
      */
    def onTokenRefresh(): Unsubscribe = js.native
    
    /* private */ var registerDefaultSw: js.Any = js.native
    
    def setBackgroundMessageHandler(): Unit = js.native
    
    /* private */ var swRegistration: js.Any = js.native
    
    def updateSwReg(): js.Promise[Unit] = js.native
    def updateSwReg(swRegistration: ServiceWorkerRegistration): js.Promise[Unit] = js.native
    
    def updateVapidKey(): js.Promise[Unit] = js.native
    def updateVapidKey(vapidKey: String): js.Promise[Unit] = js.native
    
    /* private */ var vapidKey: js.Any = js.native
  }
}
