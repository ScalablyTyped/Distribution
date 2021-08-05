package typings.firebaseMessagingTypes

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseMessagingTypes.anon.ServiceWorkerRegistration
import typings.firebaseMessagingTypes.firebaseMessagingTypesStrings.messaging
import typings.firebaseUtil.subscribeMod.CompleteFn
import typings.firebaseUtil.subscribeMod.ErrorFn
import typings.firebaseUtil.subscribeMod.NextFn
import typings.firebaseUtil.subscribeMod.Observer
import typings.firebaseUtil.subscribeMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait FcmOptions extends StObject {
    
    var analyticsLabel: js.UndefOr[String] = js.undefined
    
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
  
  @js.native
  trait FirebaseMessaging extends StObject {
    
    /** window controller */
    def deleteToken(): js.Promise[Boolean] = js.native
    /** @deprecated */
    def deleteToken(token: String): js.Promise[Boolean] = js.native
    
    def getToken(): js.Promise[String] = js.native
    def getToken(options: ServiceWorkerRegistration): js.Promise[String] = js.native
    
    /** service worker controller */
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload]): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload], error: Unit, completed: CompleteFn): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload], error: ErrorFn): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: NextFn[MessagePayload], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload]): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload], error: Unit, completed: CompleteFn): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload], error: ErrorFn): Unsubscribe = js.native
    def onBackgroundMessage(nextOrObserver: Observer[MessagePayload], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
    
    def onMessage(nextOrObserver: NextFn[js.Any]): Unsubscribe = js.native
    def onMessage(nextOrObserver: NextFn[js.Any], error: Unit, completed: CompleteFn): Unsubscribe = js.native
    def onMessage(nextOrObserver: NextFn[js.Any], error: ErrorFn): Unsubscribe = js.native
    def onMessage(nextOrObserver: NextFn[js.Any], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[js.Any]): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[js.Any], error: Unit, completed: CompleteFn): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[js.Any], error: ErrorFn): Unsubscribe = js.native
    def onMessage(nextOrObserver: Observer[js.Any], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
    
    def onTokenRefresh(nextOrObserver: NextFn[js.Any]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: NextFn[js.Any], error: Unit, completed: CompleteFn): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: NextFn[js.Any], error: ErrorFn): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: NextFn[js.Any], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[js.Any]): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[js.Any], error: Unit, completed: CompleteFn): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[js.Any], error: ErrorFn): Unsubscribe = js.native
    def onTokenRefresh(nextOrObserver: Observer[js.Any], error: ErrorFn, completed: CompleteFn): Unsubscribe = js.native
    
    /**
      * @deprecated Use Notification.requestPermission() instead.
      * https://developer.mozilla.org/en-US/docs/Web/API/Notification/requestPermission
      */
    def requestPermission(): js.Promise[Unit] = js.native
    
    def setBackgroundMessageHandler(callback: js.Function1[/* payload */ js.Any, js.Promise[js.Any] | Unit]): Unit = js.native
    
    def usePublicVapidKey(b64PublicKey: String): Unit = js.native
    
    def useServiceWorker(registration: typings.std.ServiceWorkerRegistration): Unit = js.native
  }
  
  type FirebaseMessagingName = messaging
  
  trait MessagePayload extends StObject {
    
    var collapseKey: String
    
    var data: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var fcmOptions: js.UndefOr[FcmOptions] = js.undefined
    
    var from: String
    
    var notification: js.UndefOr[NotificationPayload] = js.undefined
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
      
      inline def setFcmOptions(value: FcmOptions): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
      
      inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: NotificationPayload): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
  }
  
  trait NotificationPayload extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
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
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var messaging: FirebaseMessaging
    }
    object NameServiceMapping {
      
      inline def apply(messaging: FirebaseMessaging): NameServiceMapping = {
        val __obj = js.Dynamic.literal(messaging = messaging.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      extension [Self <: NameServiceMapping](x: Self) {
        
        inline def setMessaging(value: FirebaseMessaging): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
      }
    }
  }
}
