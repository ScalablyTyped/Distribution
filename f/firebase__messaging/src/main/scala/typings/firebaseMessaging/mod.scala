package typings.firebaseMessaging

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseUtil.mod.NextFn
import typings.firebaseUtil.mod.Observer
import typings.firebaseUtil.mod.Unsubscribe
import typings.std.ServiceWorkerRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/messaging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteToken(messaging: Messaging): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getMessaging(): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")().asInstanceOf[Messaging]
  inline def getMessaging(app: FirebaseApp): Messaging = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessaging")(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
  
  inline def getToken(messaging: Messaging): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(messaging: Messaging, options: GetTokenOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(messaging.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
  
  inline def onMessage(messaging: Messaging, nextOrObserver: NextFn[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onMessage(messaging: Messaging, nextOrObserver: Observer[MessagePayload]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onMessage")(messaging.asInstanceOf[js.Any], nextOrObserver.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  trait FcmOptions extends StObject {
    
    /**
      * The label associated with the message's analytics data.
      */
    var analyticsLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The link to open when the user clicks on the notification.
      */
    var link: js.UndefOr[String] = js.undefined
  }
  object FcmOptions {
    
    inline def apply(): FcmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FcmOptions]
    }
    
    extension [Self <: FcmOptions](x: Self) {
      
      inline def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
  
  trait GetTokenOptions extends StObject {
    
    /**
      * The service worker registration for receiving push
      * messaging. If the registration is not provided explicitly, you need to have a
      * `firebase-messaging-sw.js` at your root location. See
      * {@link https://firebase.google.com/docs/cloud-messaging/js/client#retrieve-the-current-registration-token | Retrieve the current registration token}
      * for more details.
      */
    var serviceWorkerRegistration: js.UndefOr[ServiceWorkerRegistration] = js.undefined
    
    /**
      * The public server key provided to push services. It is used to
      * authenticate the push subscribers to receive push messages only from sending servers that hold
      * the corresponding private key. If it is not provided, a default VAPID key is used. Note that some
      * push services (Chrome Push Service) require a non-default VAPID key. Therefore, it is recommended
      * to generate and import a VAPID key for your project with
      * {@link https://firebase.google.com/docs/cloud-messaging/js/client#configure_web_credentials_with_fcm | Configure Web Credentials with FCM}.
      * See
      * {@link https://developers.google.com/web/fundamentals/push-notifications/web-push-protocol | The Web Push Protocol}
      * for details on web push services.
      */
    var vapidKey: js.UndefOr[String] = js.undefined
  }
  object GetTokenOptions {
    
    inline def apply(): GetTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTokenOptions]
    }
    
    extension [Self <: GetTokenOptions](x: Self) {
      
      inline def setServiceWorkerRegistration(value: ServiceWorkerRegistration): Self = StObject.set(x, "serviceWorkerRegistration", value.asInstanceOf[js.Any])
      
      inline def setServiceWorkerRegistrationUndefined: Self = StObject.set(x, "serviceWorkerRegistration", js.undefined)
      
      inline def setVapidKey(value: String): Self = StObject.set(x, "vapidKey", value.asInstanceOf[js.Any])
      
      inline def setVapidKeyUndefined: Self = StObject.set(x, "vapidKey", js.undefined)
    }
  }
  
  trait MessagePayload extends StObject {
    
    /**
      * The collapse key of the message. See
      * {@link https://firebase.google.com/docs/cloud-messaging/concept-options#collapsible_and_non-collapsible_messages | Non-collapsible and collapsible messages}
      */
    var collapseKey: String
    
    /**
      * Arbitrary key/value payload.
      */
    var data: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * {@inheritdoc FcmOptions}
      */
    var fcmOptions: js.UndefOr[FcmOptions] = js.undefined
    
    /**
      * The sender of this message.
      */
    var from: String
    
    /**
      * The message id of a message.
      */
    var messageId: String
    
    /**
      * {@inheritdoc NotificationPayload}
      */
    var notification: js.UndefOr[NotificationPayload] = js.undefined
  }
  object MessagePayload {
    
    inline def apply(collapseKey: String, from: String, messageId: String): MessagePayload = {
      val __obj = js.Dynamic.literal(collapseKey = collapseKey.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePayload]
    }
    
    extension [Self <: MessagePayload](x: Self) {
      
      inline def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
      
      inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFcmOptions(value: FcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
      
      inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: NotificationPayload): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
  }
  
  trait Messaging extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} this `Messaging` instance is associated with.
      */
    var app: FirebaseApp
  }
  object Messaging {
    
    inline def apply(app: FirebaseApp): Messaging = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messaging]
    }
    
    extension [Self <: Messaging](x: Self) {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationPayload extends StObject {
    
    /**
      * The notification's body text.
      */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of an image that is downloaded on the device and displayed in the notification.
      */
    var image: js.UndefOr[String] = js.undefined
    
    /**
      * The notification's title.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object NotificationPayload {
    
    inline def apply(): NotificationPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationPayload]
    }
    
    extension [Self <: NotificationPayload](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
