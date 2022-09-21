package typings.firebaseMessagingCompat

import typings.firebaseAppCompat.mod.FirebaseService
import typings.firebaseMessaging.mod.MessagePayload
import typings.firebaseMessaging.mod.Messaging
import typings.firebaseMessagingCompat.anon.ServiceWorkerRegistration
import typings.firebaseMessagingCompat.mod.FirebaseApp
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagingCompatMod {
  
  @JSImport("@firebase/messaging-compat/dist/src/messaging-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/messaging-compat/dist/src/messaging-compat", "MessagingCompatImpl")
  @js.native
  open class MessagingCompatImpl protected ()
    extends StObject
       with MessagingCompat
       with FirebaseService {
    def this(app: FirebaseApp, _delegate: Messaging) = this()
    
    /* CompleteClass */
    var _delegate: Any = js.native
    @JSName("_delegate")
    val _delegate_MessagingCompatImpl: Messaging = js.native
    
    /* CompleteClass */
    var app: typings.firebaseAppCompat.mod.FirebaseApp = js.native
    @JSName("app")
    val app_MessagingCompatImpl: FirebaseApp = js.native
  }
  
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  @js.native
  trait MessagingCompat extends StObject {
    
    def deleteToken(): js.Promise[Boolean] = js.native
    
    def getToken(): js.Promise[String] = js.native
    def getToken(options: ServiceWorkerRegistration): js.Promise[String] = js.native
    
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload]): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload]): Unsubscribe = js.native
    
    def onMessage(nextOrObserver: NextFn[MessagePayload]): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[MessagePayload]): Unsubscribe = js.native
  }
}
