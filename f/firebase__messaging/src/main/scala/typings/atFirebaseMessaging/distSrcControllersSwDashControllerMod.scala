package typings.atFirebaseMessaging

import typings.atFirebaseMessaging.distSrcControllersBaseDashControllerMod.BaseController
import typings.atFirebaseMessaging.distSrcInterfacesInternalDashServicesMod.FirebaseInternalServices
import typings.atFirebaseMessaging.distSrcInterfacesMessageDashPayloadMod.MessagePayload
import typings.atFirebaseMessaging.distSrcInterfacesMessageDashPayloadMod.NotificationDetails
import typings.atFirebaseMessaging.distSrcModelsWorkerDashPageDashMessageMod.InternalMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/src/controllers/sw-controller", JSImport.Namespace)
@js.native
object distSrcControllersSwDashControllerMod extends js.Object {
  @js.native
  class SwController protected () extends BaseController {
    def this(services: FirebaseInternalServices) = this()
    var bgMessageHandler: js.Any = js.native
    var onNotificationClick_ : js.Any = js.native
    /**
      * A handler for push events that shows notifications based on the content of
      * the payload.
      *
      * The payload must be a JSON-encoded Object with a `notification` key. The
      * value of the `notification` property will be used as the NotificationOptions
      * object passed to showNotification. Additionally, the `title` property of the
      * notification object will be used as the title.
      *
      * If there is no notification data in the payload then no notification will be
      * shown.
      */
    var onPush_ : js.Any = js.native
    var onSubChange_ : js.Any = js.native
    /**
      * This message will attempt to send the message to a window client.
      * @param client The WindowClient to send the message to.
      * @param message The message to send to the client.
      * @returns Returns a promise that resolves after sending the message. This
      * does not guarantee that the message was successfully received.
      */
    def attemptToMessageClient_(client: WindowClient, message: InternalMessage): js.Promise[Unit] = js.native
    def getNotificationData_(msgPayload: MessagePayload): js.UndefOr[NotificationDetails] = js.native
    /**
      * @param url The URL to look for when focusing a client.
      * @return Returns an existing window client or a newly opened WindowClient.
      */
    def getWindowClient_(url: String): js.Promise[WindowClient | Null] = js.native
    /**
      * @returns If there is currently a visible WindowClient, this method will
      * resolve to true, otherwise false.
      */
    def hasVisibleClients_(): js.Promise[Boolean] = js.native
    def onNotificationClick(event: NotificationEvent): Unit = js.native
    def onPush(event: PushEvent): Unit = js.native
    def onSubChange(event: PushSubscriptionChangeEvent): Unit = js.native
    /**
      * @param msgPayload The data from the push event that should be sent to all
      * available pages.
      * @returns Returns a promise that resolves once the message has been sent to
      * all WindowClients.
      */
    def sendMessageToWindowClients_(msgPayload: MessagePayload): js.Promise[Unit] = js.native
  }
  
}

