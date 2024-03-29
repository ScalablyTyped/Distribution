package typings.firebaseMessaging

import typings.firebaseMessaging.distSrcUtilSwTypesMod.ExtendableEvent
import typings.std.EpochTimeStamp
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

object distSrcTestingFakesServiceWorkerMod {
  
  @JSImport("@firebase/messaging/dist/src/testing/fakes/service-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/messaging/dist/src/testing/fakes/service-worker", "FakeEvent")
  @js.native
  open class FakeEvent protected ()
    extends StObject
       with ExtendableEvent {
    def this(`type`: String) = this()
    def this(`type`: String, options: EventInit) = this()
    
    @JSName("AT_TARGET")
    var AT_TARGET_FakeEvent: Double = js.native
    
    @JSName("BUBBLING_PHASE")
    var BUBBLING_PHASE_FakeEvent: Double = js.native
    
    @JSName("CAPTURING_PHASE")
    var CAPTURING_PHASE_FakeEvent: Double = js.native
    
    @JSName("NONE")
    var NONE_FakeEvent: Double = js.native
    
    @JSName("currentTarget")
    var currentTarget_FakeEvent: Null = js.native
    
    def initEvent(): Unit = js.native
    
    @JSName("srcElement")
    var srcElement_FakeEvent: Null = js.native
    
    @JSName("target")
    var target_FakeEvent: Null = js.native
    
    @JSName("timeStamp")
    var timeStamp_FakeEvent: Double = js.native
    
    def waitUntil(): Unit = js.native
  }
  
  @JSImport("@firebase/messaging/dist/src/testing/fakes/service-worker", "FakePushSubscription")
  @js.native
  open class FakePushSubscription ()
    extends StObject
       with PushSubscription {
    
    var auth: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/endpoint) */
    /* standard dom */
    /* CompleteClass */
    override val endpoint: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/expirationTime) */
    /* standard dom */
    /* CompleteClass */
    override val expirationTime: EpochTimeStamp | Null = js.native
    @JSName("expirationTime")
    var expirationTime_FakePushSubscription: Double = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/getKey) */
    /* standard dom */
    /* CompleteClass */
    override def getKey(name: PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/options) */
    /* standard dom */
    /* CompleteClass */
    override val options: PushSubscriptionOptions = js.native
    
    var p256: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/toJSON) */
    /* standard dom */
    /* CompleteClass */
    override def toJSON(): PushSubscriptionJSON = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/unsubscribe) */
    /* standard dom */
    /* CompleteClass */
    override def unsubscribe(): js.Promise[Boolean] = js.native
  }
  
  @JSImport("@firebase/messaging/dist/src/testing/fakes/service-worker", "FakeServiceWorkerRegistration")
  @js.native
  open class FakeServiceWorkerRegistration ()
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
  
  inline def mockServiceWorker(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockServiceWorker")().asInstanceOf[Unit]
  
  inline def restoreServiceWorker(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreServiceWorker")().asInstanceOf[Unit]
  
  @js.native
  trait FakePushManager
    extends StObject
       with PushManager {
    
    /* private */ var subscription: Any = js.native
  }
}
