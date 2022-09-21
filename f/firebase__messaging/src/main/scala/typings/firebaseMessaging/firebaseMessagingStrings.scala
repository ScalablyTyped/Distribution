package typings.firebaseMessaging

import typings.firebaseMessaging.errorsMod.ErrorCode
import typings.firebaseMessaging.loggingTypesMod.UserResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseMessagingStrings {
  
  @js.native
  sealed trait DELETE_REQUEST
    extends StObject
       with UserResponse
       with typings.firebaseMessaging.interfacesLoggingTypesMod.UserResponse
  inline def DELETE_REQUEST: DELETE_REQUEST = "DELETE_REQUEST".asInstanceOf[DELETE_REQUEST]
  
  @js.native
  sealed trait RESPONSE_ACTION_UNKNOWN
    extends StObject
       with UserResponse
       with typings.firebaseMessaging.interfacesLoggingTypesMod.UserResponse
  inline def RESPONSE_ACTION_UNKNOWN: RESPONSE_ACTION_UNKNOWN = "RESPONSE_ACTION_UNKNOWN".asInstanceOf[RESPONSE_ACTION_UNKNOWN]
  
  @js.native
  sealed trait RETRY_REQUEST_LATER
    extends StObject
       with UserResponse
       with typings.firebaseMessaging.interfacesLoggingTypesMod.UserResponse
  inline def RETRY_REQUEST_LATER: RETRY_REQUEST_LATER = "RETRY_REQUEST_LATER".asInstanceOf[RETRY_REQUEST_LATER]
  
  @js.native
  sealed trait `failed-service-worker-registration`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `failed-service-worker-registration`: `failed-service-worker-registration` = "failed-service-worker-registration".asInstanceOf[`failed-service-worker-registration`]
  
  @js.native
  sealed trait granted extends StObject
  inline def granted: granted = "granted".asInstanceOf[granted]
  
  @js.native
  sealed trait `indexed-db-unsupported`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `indexed-db-unsupported`: `indexed-db-unsupported` = "indexed-db-unsupported".asInstanceOf[`indexed-db-unsupported`]
  
  @js.native
  sealed trait `invalid-bg-handler`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `invalid-bg-handler`: `invalid-bg-handler` = "invalid-bg-handler".asInstanceOf[`invalid-bg-handler`]
  
  @js.native
  sealed trait `invalid-sw-registration`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `invalid-sw-registration`: `invalid-sw-registration` = "invalid-sw-registration".asInstanceOf[`invalid-sw-registration`]
  
  @js.native
  sealed trait `invalid-vapid-key`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `invalid-vapid-key`: `invalid-vapid-key` = "invalid-vapid-key".asInstanceOf[`invalid-vapid-key`]
  
  @js.native
  sealed trait messaging extends StObject
  inline def messaging: messaging = "messaging".asInstanceOf[messaging]
  
  @js.native
  sealed trait `missing-app-config-values`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `missing-app-config-values`: `missing-app-config-values` = "missing-app-config-values".asInstanceOf[`missing-app-config-values`]
  
  @js.native
  sealed trait notificationclick extends StObject
  inline def notificationclick: notificationclick = "notificationclick".asInstanceOf[notificationclick]
  
  @js.native
  sealed trait `only-available-in-sw`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `only-available-in-sw`: `only-available-in-sw` = "only-available-in-sw".asInstanceOf[`only-available-in-sw`]
  
  @js.native
  sealed trait `only-available-in-window`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `only-available-in-window`: `only-available-in-window` = "only-available-in-window".asInstanceOf[`only-available-in-window`]
  
  @js.native
  sealed trait `permission-blocked`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `permission-blocked`: `permission-blocked` = "permission-blocked".asInstanceOf[`permission-blocked`]
  
  @js.native
  sealed trait `permission-default`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `permission-default`: `permission-default` = "permission-default".asInstanceOf[`permission-default`]
  
  @js.native
  sealed trait push extends StObject
  inline def push: push = "push".asInstanceOf[push]
  
  @js.native
  sealed trait pushsubscriptionchange extends StObject
  inline def pushsubscriptionchange: pushsubscriptionchange = "pushsubscriptionchange".asInstanceOf[pushsubscriptionchange]
  
  @js.native
  sealed trait `token-subscribe-failed`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `token-subscribe-failed`: `token-subscribe-failed` = "token-subscribe-failed".asInstanceOf[`token-subscribe-failed`]
  
  @js.native
  sealed trait `token-subscribe-no-token`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `token-subscribe-no-token`: `token-subscribe-no-token` = "token-subscribe-no-token".asInstanceOf[`token-subscribe-no-token`]
  
  @js.native
  sealed trait `token-unsubscribe-failed`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `token-unsubscribe-failed`: `token-unsubscribe-failed` = "token-unsubscribe-failed".asInstanceOf[`token-unsubscribe-failed`]
  
  @js.native
  sealed trait `token-update-failed`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `token-update-failed`: `token-update-failed` = "token-update-failed".asInstanceOf[`token-update-failed`]
  
  @js.native
  sealed trait `token-update-no-token`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `token-update-no-token`: `token-update-no-token` = "token-update-no-token".asInstanceOf[`token-update-no-token`]
  
  @js.native
  sealed trait `unsupported-browser`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `unsupported-browser`: `unsupported-browser` = "unsupported-browser".asInstanceOf[`unsupported-browser`]
  
  @js.native
  sealed trait `use-sw-after-get-token`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `use-sw-after-get-token`: `use-sw-after-get-token` = "use-sw-after-get-token".asInstanceOf[`use-sw-after-get-token`]
  
  @js.native
  sealed trait `use-vapid-key-after-get-token`
    extends StObject
       with ErrorCode
       with typings.firebaseMessaging.utilErrorsMod.ErrorCode
  inline def `use-vapid-key-after-get-token`: `use-vapid-key-after-get-token` = "use-vapid-key-after-get-token".asInstanceOf[`use-vapid-key-after-get-token`]
}
