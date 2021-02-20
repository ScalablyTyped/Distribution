package typings.firebaseMessaging

import typings.std.NotificationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMessagePayloadMod {
  
  @js.native
  sealed trait MessageType extends StObject
  @JSImport("@firebase/messaging/dist/interfaces/internal-message-payload", "MessageType")
  @js.native
  object MessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MessageType with String] = js.native
    
    @js.native
    sealed trait NOTIFICATION_CLICKED extends MessageType
    /* "notification-clicked" */ val NOTIFICATION_CLICKED: typings.firebaseMessaging.internalMessagePayloadMod.MessageType.NOTIFICATION_CLICKED with String = js.native
    
    @js.native
    sealed trait PUSH_RECEIVED extends MessageType
    /* "push-received" */ val PUSH_RECEIVED: typings.firebaseMessaging.internalMessagePayloadMod.MessageType.PUSH_RECEIVED with String = js.native
  }
  
  @js.native
  trait ConsoleMessageData extends StObject
  
  @js.native
  trait FcmOptionsInternal extends StObject {
    
    var analytics_label: js.UndefOr[String] = js.native
    
    var link: js.UndefOr[String] = js.native
  }
  object FcmOptionsInternal {
    
    @scala.inline
    def apply(): FcmOptionsInternal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FcmOptionsInternal]
    }
    
    @scala.inline
    implicit class FcmOptionsInternalMutableBuilder[Self <: FcmOptionsInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalytics_label(value: String): Self = StObject.set(x, "analytics_label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnalytics_labelUndefined: Self = StObject.set(x, "analytics_label", js.undefined)
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
  
  @js.native
  trait MessagePayloadInternal extends StObject {
    
    var collapse_key: String = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var fcmOptions: js.UndefOr[FcmOptionsInternal] = js.native
    
    var from: String = js.native
    
    var isFirebaseMessaging: js.UndefOr[Boolean] = js.native
    
    var messageType: js.UndefOr[MessageType] = js.native
    
    var notification: js.UndefOr[NotificationPayloadInternal] = js.native
  }
  object MessagePayloadInternal {
    
    @scala.inline
    def apply(collapse_key: String, from: String): MessagePayloadInternal = {
      val __obj = js.Dynamic.literal(collapse_key = collapse_key.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePayloadInternal]
    }
    
    @scala.inline
    implicit class MessagePayloadInternalMutableBuilder[Self <: MessagePayloadInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapse_key(value: String): Self = StObject.set(x, "collapse_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFcmOptions(value: FcmOptionsInternal): Self = StObject.set(x, "fcmOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFcmOptionsUndefined: Self = StObject.set(x, "fcmOptions", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFirebaseMessaging(value: Boolean): Self = StObject.set(x, "isFirebaseMessaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFirebaseMessagingUndefined: Self = StObject.set(x, "isFirebaseMessaging", js.undefined)
      
      @scala.inline
      def setMessageType(value: MessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
      
      @scala.inline
      def setNotification(value: NotificationPayloadInternal): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    }
  }
  
  @js.native
  trait NotificationPayloadInternal extends NotificationOptions {
    
    var click_action: js.UndefOr[String] = js.native
    
    var title: String = js.native
  }
  object NotificationPayloadInternal {
    
    @scala.inline
    def apply(title: String): NotificationPayloadInternal = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationPayloadInternal]
    }
    
    @scala.inline
    implicit class NotificationPayloadInternalMutableBuilder[Self <: NotificationPayloadInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick_action(value: String): Self = StObject.set(x, "click_action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClick_actionUndefined: Self = StObject.set(x, "click_action", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
