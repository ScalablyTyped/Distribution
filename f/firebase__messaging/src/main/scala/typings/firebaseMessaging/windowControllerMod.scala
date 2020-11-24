package typings.firebaseMessaging

import typings.firebaseAppTypes.privateMod.FirebaseService
import typings.firebaseMessaging.internalDependenciesMod.FirebaseInternalDependencies
import typings.firebaseMessaging.mod.FirebaseApp
import typings.firebaseMessagingTypes.mod.FirebaseMessaging
import typings.firebaseUtil.subscribeMod.Unsubscribe
import typings.std.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/messaging/dist/controllers/window-controller", JSImport.Namespace)
@js.native
object windowControllerMod extends js.Object {
  
  @js.native
  class WindowController protected ()
    extends FirebaseMessaging
       with FirebaseService {
    def this(firebaseDependencies: FirebaseInternalDependencies) = this()
    
    @JSName("app")
    def app_MWindowController: FirebaseApp = js.native
    
    val firebaseDependencies: js.Any = js.native
    
    def getSwReg(): js.UndefOr[ServiceWorkerRegistration] = js.native
    
    def getToken(options: typings.firebaseMessaging.anon.ServiceWorkerRegistration): js.Promise[String] = js.native
    
    def getVapidKey(): String | Null = js.native
    
    var logEvent: js.Any = js.native
    
    var messageEventListener: js.Any = js.native
    
    def onBackgroundMessage(): Unsubscribe = js.native
    
    var onMessageCallback: js.Any = js.native
    
    /**
      * @deprecated No-op. It was initially designed with token rotation requests from server in mind.
      * However, the plan to implement such feature was abandoned.
      */
    def onTokenRefresh(): Unsubscribe = js.native
    
    var registerDefaultSw: js.Any = js.native
    
    def setBackgroundMessageHandler(): Unit = js.native
    
    var swRegistration: js.Any = js.native
    
    def updateSwReg(): js.Promise[Unit] = js.native
    def updateSwReg(swRegistration: ServiceWorkerRegistration): js.Promise[Unit] = js.native
    
    def updateVapidKey(): js.Promise[Unit] = js.native
    def updateVapidKey(vapidKey: String): js.Promise[Unit] = js.native
    
    var vapidKey: js.Any = js.native
  }
}
