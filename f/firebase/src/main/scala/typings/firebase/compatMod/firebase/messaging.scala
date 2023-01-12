package typings.firebase.compatMod.firebase

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.anon.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object messaging {
  
  trait FcmOptions extends StObject {
    
    /**
      * Label associated with the message's analytics data. See
      * {@link https://firebase.google.com/docs/cloud-messaging/understand-delivery#adding-analytics-labels-to-messages
      * Adding analytics labels}.
      */
    var analyticsLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The link to open when the user clicks on the notification. For all URL values, HTTPS is
      * required. For example, by setting this value to your app's URL, a notification click event
      * will put your app in focus for the user.
      */
    var link: js.UndefOr[String] = js.undefined
  }
  object FcmOptions {
    
    inline def apply(): FcmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FcmOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FcmOptions] (val x: Self) extends AnyVal {
      
      inline def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
  
  trait MessagePayload extends StObject {
    
    /**
      * The collapse key of this message. See
      * {@link https://firebase.google.com/docs/cloud-messaging/concept-options#collapsible_and_non-collapsible_messages
      * Collapsible and non-collapsible messages}.
      */
    var collapseKey: String
    
    /**
      * Arbitrary key/value pairs.
      */
    var data: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * See {@link firebase.messaging.FcmOptions}.
      */
    var fcmOptions: js.UndefOr[FcmOptions] = js.undefined
    
    /**
      * The sender of this message.
      */
    var from: String
    
    /**
      * See {@link firebase.messaging.NotificationPayload}.
      */
    var notification: js.UndefOr[NotificationPayload] = js.undefined
  }
  object MessagePayload {
    
    inline def apply(collapseKey: String, from: String): MessagePayload = {
      val __obj = js.Dynamic.literal(collapseKey = collapseKey.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessagePayload] (val x: Self) extends AnyVal {
      
      inline def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
      
      inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFcmOptions(value: FcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
      
      inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: NotificationPayload): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
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
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload, js.Error]): Unsubscribe = js.native
    
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
    def onMessage(nextOrObserver: NextFn[Any]): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[Any, js.Error]): Unsubscribe = js.native
  }
  
  trait NotificationPayload extends StObject {
    
    /**
      * The body of a notification.
      */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of the image that is shown with the notification. See
      * {@link https://firebase.google.com/docs/reference/fcm/rest/v1/projects.messages#notification
      * `notification.image`} for supported image format.
      */
    var image: js.UndefOr[String] = js.undefined
    
    /**
      * The title of a notification.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object NotificationPayload {
    
    inline def apply(): NotificationPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationPayload] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
