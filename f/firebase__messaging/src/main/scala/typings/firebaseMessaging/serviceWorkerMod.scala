package typings.firebaseMessaging

import typings.std.ArrayBuffer
import typings.std.EventInit
import typings.std.PushEncryptionKeyName
import typings.std.PushManager
import typings.std.PushSubscription
import typings.std.PushSubscriptionJSON
import typings.std.PushSubscriptionOptions
import typings.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceWorkerMod {
  
  @JSImport("@firebase/messaging/dist/testing/fakes/service-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/messaging/dist/testing/fakes/service-worker", "FakeEvent")
  @js.native
  class FakeEvent protected ()
    extends StObject
       with ExtendableEvent {
    def this(`type`: String) = this()
    def this(`type`: String, options: EventInit) = this()
    
    @JSName("currentTarget")
    var currentTarget_FakeEvent: Null = js.native
    
    def initEvent(): Unit = js.native
    
    @JSName("srcElement")
    var srcElement_FakeEvent: Null = js.native
    
    @JSName("target")
    var target_FakeEvent: Null = js.native
    
    def waitUntil(): Unit = js.native
  }
  
  @JSImport("@firebase/messaging/dist/testing/fakes/service-worker", "FakePushSubscription")
  @js.native
  class FakePushSubscription ()
    extends StObject
       with PushSubscription {
    
    var auth: String = js.native
    
    /* CompleteClass */
    override val endpoint: String = js.native
    
    /* CompleteClass */
    override val expirationTime: Double | Null = js.native
    @JSName("expirationTime")
    var expirationTime_FakePushSubscription: Double = js.native
    
    /* CompleteClass */
    override def getKey(name: PushEncryptionKeyName): ArrayBuffer | Null = js.native
    
    /* CompleteClass */
    override val options: PushSubscriptionOptions = js.native
    
    var p256: String = js.native
    
    /* CompleteClass */
    override def toJSON(): PushSubscriptionJSON = js.native
    
    /* CompleteClass */
    override def unsubscribe(): js.Promise[Boolean] = js.native
  }
  
  @JSImport("@firebase/messaging/dist/testing/fakes/service-worker", "FakeServiceWorkerRegistration")
  @js.native
  class FakeServiceWorkerRegistration ()
    extends StObject
       with ServiceWorkerRegistration {
    
    @JSName("active")
    var active_FakeServiceWorkerRegistration: Null = js.native
    
    def addEventListener(): Unit = js.native
    
    def dispatchEvent(): Boolean = js.native
    
    @JSName("installing")
    var installing_FakeServiceWorkerRegistration: Null = js.native
    
    @JSName("onupdatefound")
    var onupdatefound_FakeServiceWorkerRegistration: Null = js.native
    
    @JSName("pushManager")
    var pushManager_FakeServiceWorkerRegistration: FakePushManager = js.native
    
    def removeEventListener(): Unit = js.native
    
    def showNotification(): js.Promise[Unit] = js.native
    
    @JSName("waiting")
    var waiting_FakeServiceWorkerRegistration: Null = js.native
  }
  
  @scala.inline
  def mockServiceWorker(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockServiceWorker")().asInstanceOf[Unit]
  
  @scala.inline
  def restoreServiceWorker(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreServiceWorker")().asInstanceOf[Unit]
  
  @js.native
  trait FakePushManager
    extends StObject
       with PushManager {
    
    var subscription: js.Any = js.native
  }
}
