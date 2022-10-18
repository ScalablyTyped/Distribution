package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcUtilConstantsMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "CONSOLE_CAMPAIGN_ANALYTICS_ENABLED")
  @js.native
  val CONSOLE_CAMPAIGN_ANALYTICS_ENABLED: /* "google.c.a.e" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "CONSOLE_CAMPAIGN_ID")
  @js.native
  val CONSOLE_CAMPAIGN_ID: /* "google.c.a.c_id" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "CONSOLE_CAMPAIGN_NAME")
  @js.native
  val CONSOLE_CAMPAIGN_NAME: /* "google.c.a.c_l" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "CONSOLE_CAMPAIGN_TIME")
  @js.native
  val CONSOLE_CAMPAIGN_TIME: /* "google.c.a.ts" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "DEFAULT_BACKOFF_TIME_MS")
  @js.native
  val DEFAULT_BACKOFF_TIME_MS: /* 5000 */ Double = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "DEFAULT_SW_PATH")
  @js.native
  val DEFAULT_SW_PATH: /* "/firebase-messaging-sw.js" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "DEFAULT_SW_SCOPE")
  @js.native
  val DEFAULT_SW_SCOPE: /* "/firebase-cloud-messaging-push-scope" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "DEFAULT_VAPID_KEY")
  @js.native
  val DEFAULT_VAPID_KEY: /* "BDOU99-h67HcA6JeFXHbSNMu7e2yNNu3RzoMj8TM4W88jITfq7ZmPvIM1Iv-4_l2LxQcYwhqby2xGpWwzjfAnG4" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "ENDPOINT")
  @js.native
  val ENDPOINT: /* "https://fcmregistrations.googleapis.com/v1" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "EVENT_MESSAGE_DELIVERED")
  @js.native
  val EVENT_MESSAGE_DELIVERED: /* 1 */ Double = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "FCM_LOG_SOURCE")
  @js.native
  val FCM_LOG_SOURCE: /* 1249 */ Double = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "FCM_MSG")
  @js.native
  val FCM_MSG: /* "FCM_MSG" */ String = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "LOG_INTERVAL_IN_MS")
  @js.native
  val LOG_INTERVAL_IN_MS: /* 86400000 */ Double = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "MAX_NUMBER_OF_EVENTS_PER_LOG_REQUEST")
  @js.native
  val MAX_NUMBER_OF_EVENTS_PER_LOG_REQUEST: /* 1000 */ Double = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "MAX_RETRIES")
  @js.native
  val MAX_RETRIES: /* 3 */ Double = js.native
  
  @js.native
  sealed trait MessageType extends StObject
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "MessageType")
  @js.native
  object MessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageType & Double] = js.native
    
    @js.native
    sealed trait DATA_MESSAGE
      extends StObject
         with MessageType
    /* 1 */ val DATA_MESSAGE: typings.firebaseMessaging.distEsmSrcUtilConstantsMod.MessageType.DATA_MESSAGE & Double = js.native
    
    @js.native
    sealed trait DISPLAY_NOTIFICATION
      extends StObject
         with MessageType
    /* 3 */ val DISPLAY_NOTIFICATION: typings.firebaseMessaging.distEsmSrcUtilConstantsMod.MessageType.DISPLAY_NOTIFICATION & Double = js.native
  }
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "SDK_PLATFORM_WEB")
  @js.native
  val SDK_PLATFORM_WEB: /* 3 */ Double = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/util/constants", "TAG")
  @js.native
  val TAG: /* "FirebaseMessaging: " */ String = js.native
}
