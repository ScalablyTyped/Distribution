package typings.firebase.mod.default

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.firebase.app.App
import typings.firebase.mod.firebase.messaging.Messaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object messaging {
  
  /**
    * Gets the {@link firebase.messaging.Messaging `Messaging`} service for the
    * default app or a given app.
    *
    * `firebase.messaging()` can be called with no arguments to access the default
    * app's {@link firebase.messaging.Messaging `Messaging`} service or as
    * `firebase.messaging(app)` to access the
    * {@link firebase.messaging.Messaging `Messaging`} service associated with a
    * specific app.
    *
    * Calling `firebase.messaging()` in a service worker results in Firebase
    * generating notifications if the push message payload has a `notification`
    * parameter.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the Messaging service for the default app
    * var defaultMessaging = firebase.messaging();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Messaging service for a given app
    * var otherMessaging = firebase.messaging(otherApp);
    * ```
    *
    * @namespace
    * @param app The app to create a Messaging service for.
    *     If not passed, uses the default app.
    */
  inline def apply(): Messaging = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Messaging]
  inline def apply(app: App): Messaging = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
  
  @JSImport("firebase", "default.messaging")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
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
    
    extension [Self <: FcmOptions](x: Self) {
      
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
    var fcmOptions: js.UndefOr[typings.firebase.mod.firebase.messaging.FcmOptions] = js.undefined
    
    /**
      * The sender of this message.
      */
    var from: String
    
    /**
      * See {@link firebase.messaging.NotificationPayload}.
      */
    var notification: js.UndefOr[typings.firebase.mod.firebase.messaging.NotificationPayload] = js.undefined
  }
  object MessagePayload {
    
    inline def apply(collapseKey: String, from: String): MessagePayload = {
      val __obj = js.Dynamic.literal(collapseKey = collapseKey.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePayload]
    }
    
    extension [Self <: MessagePayload](x: Self) {
      
      inline def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
      
      inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFcmOptions(value: typings.firebase.mod.firebase.messaging.FcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
      
      inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: typings.firebase.mod.firebase.messaging.NotificationPayload): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
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
