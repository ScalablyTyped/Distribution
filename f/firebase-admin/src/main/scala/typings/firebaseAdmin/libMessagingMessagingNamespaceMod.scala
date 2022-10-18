package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessagingMessagingNamespaceMod {
  
  object messaging {
    
    inline def apply(): Messaging = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Messaging]
    inline def apply(app: App): Messaging = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
    
    @JSImport("firebase-admin/lib/messaging/messaging-namespace", "messaging")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.messaging#AndroidConfig}.
      */
    type AndroidConfig = typings.firebaseAdmin.libMessagingMessagingApiMod.AndroidConfig
    
    /**
      * Type alias to {@link firebase-admin.messaging#AndroidFcmOptions}.
      */
    type AndroidFcmOptions = typings.firebaseAdmin.libMessagingMessagingApiMod.AndroidFcmOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#AndroidNotification}.
      */
    type AndroidNotification = typings.firebaseAdmin.libMessagingMessagingApiMod.AndroidNotification
    
    /**
      * Type alias to {@link firebase-admin.messaging#ApnsConfig}.
      */
    type ApnsConfig = typings.firebaseAdmin.libMessagingMessagingApiMod.ApnsConfig
    
    /**
      * Type alias to {@link firebase-admin.messaging#ApnsFcmOptions}.
      */
    type ApnsFcmOptions = typings.firebaseAdmin.libMessagingMessagingApiMod.ApnsFcmOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#ApnsPayload}.
      */
    type ApnsPayload = typings.firebaseAdmin.libMessagingMessagingApiMod.ApnsPayload
    
    /**
      * Type alias to {@link firebase-admin.messaging#Aps}.
      */
    type Aps = typings.firebaseAdmin.libMessagingMessagingApiMod.Aps
    
    /**
      * Type alias to {@link firebase-admin.messaging#ApsAlert}.
      */
    type ApsAlert = typings.firebaseAdmin.libMessagingMessagingApiMod.ApsAlert
    
    /**
      * Type alias to {@link firebase-admin.messaging#BatchResponse}.
      */
    type BatchResponse = typings.firebaseAdmin.libMessagingMessagingApiMod.BatchResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#ConditionMessage}.
      */
    type ConditionMessage = typings.firebaseAdmin.libMessagingMessagingApiMod.ConditionMessage
    
    /**
      * Type alias to {@link firebase-admin.messaging#CriticalSound}.
      */
    type CriticalSound = typings.firebaseAdmin.libMessagingMessagingApiMod.CriticalSound
    
    /**
      * Type alias to {@link firebase-admin.messaging#DataMessagePayload}.
      */
    type DataMessagePayload = typings.firebaseAdmin.libMessagingMessagingApiMod.DataMessagePayload
    
    /**
      * Type alias to {@link firebase-admin.messaging#FcmOptions}.
      */
    type FcmOptions = typings.firebaseAdmin.libMessagingMessagingApiMod.FcmOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#LightSettings}.
      */
    type LightSettings = typings.firebaseAdmin.libMessagingMessagingApiMod.LightSettings
    
    /**
      * Type alias to {@link firebase-admin.messaging#Message}.
      */
    type Message = typings.firebaseAdmin.libMessagingMessagingApiMod.Message
    
    /**
      * Type alias to {@link firebase-admin.messaging#Messaging}.
      */
    type Messaging = typings.firebaseAdmin.libMessagingMessagingMod.Messaging
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingConditionResponse}.
      */
    type MessagingConditionResponse = typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingConditionResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingDeviceGroupResponse}.
      */
    type MessagingDeviceGroupResponse = typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingDeviceGroupResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingDeviceResult}.
      */
    type MessagingDeviceResult = typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingDeviceResult
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingDevicesResponse}.
      */
    type MessagingDevicesResponse = typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingDevicesResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingOptions}.
      */
    type MessagingOptions = typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingPayload}.
      */
    type MessagingPayload = typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingPayload
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingTopicManagementResponse}.
      */
    type MessagingTopicManagementResponse = typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingTopicManagementResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingTopicResponse}.
      */
    type MessagingTopicResponse = typings.firebaseAdmin.libMessagingMessagingApiMod.MessagingTopicResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MulticastMessage}.
      */
    type MulticastMessage = typings.firebaseAdmin.libMessagingMessagingApiMod.MulticastMessage
    
    /**
      * Type alias to {@link firebase-admin.messaging#Notification}.
      */
    type Notification = typings.firebaseAdmin.libMessagingMessagingApiMod.Notification
    
    /**
      * Type alias to {@link firebase-admin.messaging#NotificationMessagePayload}.
      */
    type NotificationMessagePayload = typings.firebaseAdmin.libMessagingMessagingApiMod.NotificationMessagePayload
    
    /**
      * Type alias to {@link firebase-admin.messaging#SendResponse}.
      */
    type SendResponse = typings.firebaseAdmin.libMessagingMessagingApiMod.SendResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#TokenMessage}.
      */
    type TokenMessage = typings.firebaseAdmin.libMessagingMessagingApiMod.TokenMessage
    
    /**
      * Type alias to {@link firebase-admin.messaging#TopicMessage}.
      */
    type TopicMessage = typings.firebaseAdmin.libMessagingMessagingApiMod.TopicMessage
    
    /**
      * Type alias to {@link firebase-admin.messaging#WebpushConfig}.
      */
    type WebpushConfig = typings.firebaseAdmin.libMessagingMessagingApiMod.WebpushConfig
    
    /**
      * Type alias to {@link firebase-admin.messaging#WebpushFcmOptions}.
      */
    type WebpushFcmOptions = typings.firebaseAdmin.libMessagingMessagingApiMod.WebpushFcmOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#WebpushNotification}.
      */
    type WebpushNotification = typings.firebaseAdmin.libMessagingMessagingApiMod.WebpushNotification
  }
}
