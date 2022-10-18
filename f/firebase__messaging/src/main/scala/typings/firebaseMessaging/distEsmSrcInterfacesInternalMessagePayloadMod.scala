package typings.firebaseMessaging

import typings.std.NotificationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcInterfacesInternalMessagePayloadMod {
  
  @js.native
  sealed trait MessageType extends StObject
  @JSImport("@firebase/messaging/dist/esm/src/interfaces/internal-message-payload", "MessageType")
  @js.native
  object MessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MessageType & String] = js.native
    
    @js.native
    sealed trait NOTIFICATION_CLICKED
      extends StObject
         with MessageType
    /* "notification-clicked" */ val NOTIFICATION_CLICKED: typings.firebaseMessaging.distEsmSrcInterfacesInternalMessagePayloadMod.MessageType.NOTIFICATION_CLICKED & String = js.native
    
    @js.native
    sealed trait PUSH_RECEIVED
      extends StObject
         with MessageType
    /* "push-received" */ val PUSH_RECEIVED: typings.firebaseMessaging.distEsmSrcInterfacesInternalMessagePayloadMod.MessageType.PUSH_RECEIVED & String = js.native
  }
  
  @js.native
  trait ConsoleMessageData extends StObject
  
  trait FcmOptionsInternal extends StObject {
    
    var analytics_label: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
  }
  object FcmOptionsInternal {
    
    inline def apply(): FcmOptionsInternal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FcmOptionsInternal]
    }
    
    extension [Self <: FcmOptionsInternal](x: Self) {
      
      inline def setAnalytics_label(value: String): Self = StObject.set(x, "analytics_label", value.asInstanceOf[js.Any])
      
      inline def setAnalytics_labelUndefined: Self = StObject.set(x, "analytics_label", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
  
  trait MessagePayloadInternal extends StObject {
    
    var collapse_key: String
    
    var data: js.UndefOr[Any] = js.undefined
    
    var fcmMessageId: String
    
    var fcmOptions: js.UndefOr[FcmOptionsInternal] = js.undefined
    
    var from: String
    
    var isFirebaseMessaging: js.UndefOr[Boolean] = js.undefined
    
    var messageType: js.UndefOr[MessageType] = js.undefined
    
    var notification: js.UndefOr[NotificationPayloadInternal] = js.undefined
  }
  object MessagePayloadInternal {
    
    inline def apply(collapse_key: String, fcmMessageId: String, from: String): MessagePayloadInternal = {
      val __obj = js.Dynamic.literal(collapse_key = collapse_key.asInstanceOf[js.Any], fcmMessageId = fcmMessageId.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePayloadInternal]
    }
    
    extension [Self <: MessagePayloadInternal](x: Self) {
      
      inline def setCollapse_key(value: String): Self = StObject.set(x, "collapse_key", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFcmMessageId(value: String): Self = StObject.set(x, "fcmMessageId", value.asInstanceOf[js.Any])
      
      inline def setFcmOptions(value: FcmOptionsInternal): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
      
      inline def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setIsFirebaseMessaging(value: Boolean): Self = StObject.set(x, "isFirebaseMessaging", value.asInstanceOf[js.Any])
      
      inline def setIsFirebaseMessagingUndefined: Self = StObject.set(x, "isFirebaseMessaging", js.undefined)
      
      inline def setMessageType(value: MessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
      
      inline def setNotification(value: NotificationPayloadInternal): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
  }
  
  trait NotificationPayloadInternal
    extends StObject
       with NotificationOptions {
    
    var click_action: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object NotificationPayloadInternal {
    
    inline def apply(title: String): NotificationPayloadInternal = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationPayloadInternal]
    }
    
    extension [Self <: NotificationPayloadInternal](x: Self) {
      
      inline def setClick_action(value: String): Self = StObject.set(x, "click_action", value.asInstanceOf[js.Any])
      
      inline def setClick_actionUndefined: Self = StObject.set(x, "click_action", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
