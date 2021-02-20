package typings.firebase.mod.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.anon.ServiceWorkerRegistration
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object messaging {
  
  @js.native
  trait FcmOptions extends StObject {
    
    /**
      * Label associated with the message's analytics data. See
      * {@link https://firebase.google.com/docs/cloud-messaging/understand-delivery#adding-analytics-labels-to-messages
      * Adding analytics labels}.
      */
    var analyticsLabel: js.UndefOr[String] = js.native
    
    /**
      * The link to open when the user clicks on the notification. For all URL values, HTTPS is
      * required. For example, by setting this value to your app's URL, a notification click event
      * will put your app in focus for the user.
      */
    var link: js.UndefOr[String] = js.native
  }
  object FcmOptions {
    
    @scala.inline
    def apply(): FcmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FcmOptions]
    }
    
    @scala.inline
    implicit class FcmOptionsMutableBuilder[Self <: FcmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
  
  @js.native
  trait MessagePayload extends StObject {
    
    /**
      * The collapse key of this message. See
      * {@link https://firebase.google.com/docs/cloud-messaging/concept-options#collapsible_and_non-collapsible_messages
      * Collapsible and non-collapsible messages}.
      */
    var collapseKey: String = js.native
    
    /**
      * Arbitrary key/value pairs.
      */
    var data: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * See {@link firebase.messaging.FcmOptions}.
      */
    var fcmOptions: js.UndefOr[FcmOptions] = js.native
    
    /**
      * The sender of this message.
      */
    var from: String = js.native
    
    /**
      * See {@link firebase.messaging.NotificationPayload}.
      */
    var notification: js.UndefOr[NotificationPayload] = js.native
  }
  object MessagePayload {
    
    @scala.inline
    def apply(collapseKey: String, from: String): MessagePayload = {
      val __obj = js.Dynamic.literal(collapseKey = collapseKey.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePayload]
    }
    
    @scala.inline
    implicit class MessagePayloadMutableBuilder[Self <: MessagePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFcmOptions(value: FcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification(value: NotificationPayload): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
  }
  
  /**
    * The Firebase Messaging service interface.
    *
    * Do not call this constructor directly. Instead, use
    * {@link firebase.messaging `firebase.messaging()`}.
    *
    * See {@link https://firebase.google.com/docs/cloud-messaging/js/client
    * Set Up a JavaScript Firebase Cloud Messaging Client App} for a full guide on how to use the
    * Firebase Messaging service.
    *
    */
  @js.native
  trait Messaging extends StObject {
    
    /**
      * Deletes the registration token associated with this messaging instance and unsubscribes the
      * messaging instance from the push subscription.
      *
      * @return The promise resolves when the token has been successfully deleted.
      */
    def deleteToken(): js.Promise[Boolean] = js.native
    /**
      * To forcibly stop a registration token from being used, delete it by calling this method.
      *
      * @param token The token to delete.
      * @return The promise resolves when the token has been successfully deleted.
      *
      * @deprecated Use deleteToken() instead.
      */
    def deleteToken(token: String): js.Promise[Boolean] = js.native
    
    /**
      * Subscribes the messaging instance to push notifications. Returns an FCM registration token
      * that can be used to send push messages to that messaging instance.
      *
      * If a notification permission isn't already granted, this method asks the user for permission.
      * The returned promise rejects if the user does not allow the app to show notifications.
      *
      * @param options.vapidKey The public server key provided to push services. It is used to
      * authenticate the push subscribers to receive push messages only from sending servers that
      * hold the corresponding private key. If it is not provided, a default VAPID key is used. Note
      * that some push services (Chrome Push Service) require a non-default VAPID key. Therefore, it
      * is recommended to generate and import a VAPID key for your project with
      * {@link https://firebase.google.com/docs/cloud-messaging/js/client#configure_web_credentials_with_fcm Configure Web Credentials with FCM}.
      * See
      * {@link https://developers.google.com/web/fundamentals/push-notifications/web-push-protocol The Web Push Protocol}
      * for details on web push services.}
      *
      * @param options.serviceWorkerRegistration The service worker registration for receiving push
      * messaging. If the registration is not provided explicitly, you need to have a
      * `firebase-messaging-sw.js` at your root location. See
      * {@link https://firebase.google.com/docs/cloud-messaging/js/client#retrieve-the-current-registration-token Retrieve the current registration token}
      * for more details.
      *
      * @return The promise resolves with an FCM registration token.
      *
      */
    def getToken(): js.Promise[String] = js.native
    def getToken(options: ServiceWorkerRegistration): js.Promise[String] = js.native
    
    /**
      * Called when a message is received while the app is in the background. An app is considered to
      * be in the background if no active window is displayed.
      *
      * @param
      *     nextOrObserver This function, or observer object with `next` defined,
      *     is called when a message is received and the app is currently in the background.
      *
      * @return To stop listening for messages execute this returned function
      */
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload]): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload], error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload], error: ErrorFn[Error]): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload, Error]): Unsubscribe = js.native
    def onBackgroundMessage(
      nextOrObserver: Observer[MessagePayload, Error],
      error: js.UndefOr[scala.Nothing],
      completed: CompleteFn
    ): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload, Error], error: ErrorFn[Error]): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload, Error], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    
    /**
      * When a push message is received and the user is currently on a page for your origin, the
      * message is passed to the page and an `onMessage()` event is dispatched with the payload of
      * the push message.
      *
      * @param
      *     nextOrObserver This function, or observer object with `next` defined,
      *     is called when a message is received and the user is currently viewing your page.
      * @return To stop listening for messages execute this returned function.
      */
    def onMessage(nextOrObserver: NextFn[_]): Unsubscribe = js.native
    def onMessage(nextOrObserver: NextFn[_], error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe = js.native
    def onMessage(nextOrObserver: NextFn[_], error: ErrorFn[Error]): Unsubscribe = js.native
    def onMessage(nextOrObserver: NextFn[_], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[_, Error]): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[_, Error], error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[_, Error], error: ErrorFn[Error]): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[_, Error], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    
    /**
      * You should listen for token refreshes so your web app knows when FCM has invalidated your
      * existing token and you need to call `getToken()` to get a new token.
      *
      * @param
      *     nextOrObserver This function, or observer object with `next` defined,
      *     is called when a token refresh has occurred.
      * @return To stop listening for token refresh events execute this returned function.
      *
      * @deprecated There is no need to handle token rotation.
      */
    def onTokenRefresh(nextOrObserver: NextFn[_]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: NextFn[_], error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: NextFn[_], error: ErrorFn[Error]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: NextFn[_], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[_, Error]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[_, Error], error: js.UndefOr[scala.Nothing], completed: CompleteFn): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[_, Error], error: ErrorFn[Error]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[_, Error], error: ErrorFn[Error], completed: CompleteFn): Unsubscribe = js.native
    
    /**
      * Notification permissions are required to send a user push messages. Calling this method
      * displays the permission dialog to the user and resolves if the permission is granted. It is
      * not necessary to call this method, as `getToken()` will do this automatically if required.
      *
      * @return The promise resolves if permission is granted. Otherwise, the promise is rejected
      * with an error.
      *
      * @deprecated Use
      * {@link https://developer.mozilla.org/en-US/docs/Web/API/Notification/requestPermission Notification.requestPermission()}
      * instead.
      */
    def requestPermission(): js.Promise[Unit] = js.native
    
    /**
      * FCM directs push messages to your web page's `onMessage()` callback if the user currently has
      * it open. Otherwise, it calls your callback passed into `setBackgroundMessageHandler()`.
      *
      * Your callback should return a promise that, once resolved, has shown a notification.
      *
      * @param callback The function to handle the push message.
      *
      * @deprecated onBackgroundMessage(nextOrObserver: firebase.NextFn<MessagePayload>|
      * firebase.Observer<MessagePayload>, error?: firebase.ErrorFn,completed?: firebase.CompleteFn):
      * firebase.Unsubscribe.
      */
    def setBackgroundMessageHandler(callback: js.Function1[/* payload */ js.Any, js.Promise[_] | Unit]): Unit = js.native
    
    /**
      * @deprecated Use getToken(options?: {vapidKey?: string; serviceWorkerRegistration?:
      * ServiceWorkerRegistration;}): Promise<string>;.
      */
    def usePublicVapidKey(b64PublicKey: String): Unit = js.native
    
    /**
      * To use your own service worker for receiving push messages, you can pass in your service
      * worker registration in this method.
      *
      * @param registration The service worker registration you wish to use for push messaging.
      *
      * @deprecated Use getToken(options?: {vapidKey?: string; serviceWorkerRegistration?:
      * ServiceWorkerRegistration;}: Promise<string>;.
      */
    def useServiceWorker(registration: typings.std.ServiceWorkerRegistration): Unit = js.native
  }
  
  @js.native
  trait NotificationPayload extends StObject {
    
    /**
      * The body of a notification.
      */
    var body: js.UndefOr[String] = js.native
    
    /**
      * The URL of the image that is shown with the notification. See
      * {@link https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#notification
      * `notification.image`} for supported image format.
      */
    var image: js.UndefOr[String] = js.native
    
    /**
      * The title of a notification.
      */
    var title: js.UndefOr[String] = js.native
  }
  object NotificationPayload {
    
    @scala.inline
    def apply(): NotificationPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationPayload]
    }
    
    @scala.inline
    implicit class NotificationPayloadMutableBuilder[Self <: NotificationPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
