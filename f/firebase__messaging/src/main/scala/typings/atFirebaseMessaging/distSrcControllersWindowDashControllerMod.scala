package typings.atFirebaseMessaging

import typings.atFirebaseMessaging.distSrcControllersBaseDashControllerMod.BaseController
import typings.atFirebaseMessaging.distSrcInterfacesInternalDashServicesMod.FirebaseInternalServices
import typings.std.ServiceWorkerRegistration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/controllers/window-controller", JSImport.Namespace)
@js.native
object distSrcControllersWindowDashControllerMod extends js.Object {
  @js.native
  class WindowController protected () extends BaseController {
    /**
      * A service that provides a MessagingService instance.
      */
    def this(services: FirebaseInternalServices) = this()
    var messageObserver: js.Any = js.native
    val onMessageInternal: js.Any = js.native
    val onTokenRefreshInternal: js.Any = js.native
    var publicVapidKeyToUse: js.Any = js.native
    var registrationToUse: js.Any = js.native
    var tokenRefreshObserver: js.Any = js.native
    /**
      * This method will set up a message listener to handle
      * events from the service worker that should trigger
      * events in the page.
      */
    def setupSWMessageListener_(): Unit = js.native
    /**
      * Given a registration, wait for the service worker it relates to
      * become activer
      * @param registration Registration to wait for service worker to become active
      * @return Wait for service worker registration to become active
      */
    def waitForRegistrationToActivate_(registration: ServiceWorkerRegistration): js.Promise[ServiceWorkerRegistration] = js.native
  }
  
}

