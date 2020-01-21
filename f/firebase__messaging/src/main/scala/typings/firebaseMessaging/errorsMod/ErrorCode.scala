package typings.firebaseMessaging.errorsMod

import typings.firebaseMessaging.firebaseMessagingStrings.`failed-service-worker-registration`
import typings.firebaseMessaging.firebaseMessagingStrings.`invalid-bg-handler`
import typings.firebaseMessaging.firebaseMessagingStrings.`invalid-sw-registration`
import typings.firebaseMessaging.firebaseMessagingStrings.`invalid-vapid-key`
import typings.firebaseMessaging.firebaseMessagingStrings.`missing-app-config-values`
import typings.firebaseMessaging.firebaseMessagingStrings.`only-available-in-sw`
import typings.firebaseMessaging.firebaseMessagingStrings.`only-available-in-window`
import typings.firebaseMessaging.firebaseMessagingStrings.`permission-blocked`
import typings.firebaseMessaging.firebaseMessagingStrings.`permission-default`
import typings.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-failed`
import typings.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-no-token`
import typings.firebaseMessaging.firebaseMessagingStrings.`token-unsubscribe-failed`
import typings.firebaseMessaging.firebaseMessagingStrings.`token-update-failed`
import typings.firebaseMessaging.firebaseMessagingStrings.`token-update-no-token`
import typings.firebaseMessaging.firebaseMessagingStrings.`unsupported-browser`
import typings.firebaseMessaging.firebaseMessagingStrings.`use-sw-after-get-token`
import typings.firebaseMessaging.firebaseMessagingStrings.`use-vapid-key-after-get-token`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseMessaging.firebaseMessagingStrings.`missing-app-config-values`
  - typings.firebaseMessaging.firebaseMessagingStrings.`only-available-in-window`
  - typings.firebaseMessaging.firebaseMessagingStrings.`only-available-in-sw`
  - typings.firebaseMessaging.firebaseMessagingStrings.`permission-default`
  - typings.firebaseMessaging.firebaseMessagingStrings.`permission-blocked`
  - typings.firebaseMessaging.firebaseMessagingStrings.`unsupported-browser`
  - typings.firebaseMessaging.firebaseMessagingStrings.`failed-service-worker-registration`
  - typings.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-failed`
  - typings.firebaseMessaging.firebaseMessagingStrings.`token-subscribe-no-token`
  - typings.firebaseMessaging.firebaseMessagingStrings.`token-unsubscribe-failed`
  - typings.firebaseMessaging.firebaseMessagingStrings.`token-update-failed`
  - typings.firebaseMessaging.firebaseMessagingStrings.`token-update-no-token`
  - typings.firebaseMessaging.firebaseMessagingStrings.`invalid-bg-handler`
  - typings.firebaseMessaging.firebaseMessagingStrings.`use-sw-after-get-token`
  - typings.firebaseMessaging.firebaseMessagingStrings.`invalid-sw-registration`
  - typings.firebaseMessaging.firebaseMessagingStrings.`use-vapid-key-after-get-token`
  - typings.firebaseMessaging.firebaseMessagingStrings.`invalid-vapid-key`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def AVAILABLE_IN_SW: `only-available-in-sw` = this.cast("only-available-in-sw")
  @scala.inline
  def AVAILABLE_IN_WINDOW: `only-available-in-window` = this.cast("only-available-in-window")
  @scala.inline
  def FAILED_DEFAULT_REGISTRATION: `failed-service-worker-registration` = this.cast("failed-service-worker-registration")
  @scala.inline
  def INVALID_BG_HANDLER: `invalid-bg-handler` = this.cast("invalid-bg-handler")
  @scala.inline
  def INVALID_SW_REGISTRATION: `invalid-sw-registration` = this.cast("invalid-sw-registration")
  @scala.inline
  def INVALID_VAPID_KEY: `invalid-vapid-key` = this.cast("invalid-vapid-key")
  @scala.inline
  def MISSING_APP_CONFIG_VALUES: `missing-app-config-values` = this.cast("missing-app-config-values")
  @scala.inline
  def PERMISSION_BLOCKED: `permission-blocked` = this.cast("permission-blocked")
  @scala.inline
  def PERMISSION_DEFAULT: `permission-default` = this.cast("permission-default")
  @scala.inline
  def TOKEN_SUBSCRIBE_FAILED: `token-subscribe-failed` = this.cast("token-subscribe-failed")
  @scala.inline
  def TOKEN_SUBSCRIBE_NO_TOKEN: `token-subscribe-no-token` = this.cast("token-subscribe-no-token")
  @scala.inline
  def TOKEN_UNSUBSCRIBE_FAILED: `token-unsubscribe-failed` = this.cast("token-unsubscribe-failed")
  @scala.inline
  def TOKEN_UPDATE_FAILED: `token-update-failed` = this.cast("token-update-failed")
  @scala.inline
  def TOKEN_UPDATE_NO_TOKEN: `token-update-no-token` = this.cast("token-update-no-token")
  @scala.inline
  def UNSUPPORTED_BROWSER: `unsupported-browser` = this.cast("unsupported-browser")
  @scala.inline
  def USE_SW_AFTER_GET_TOKEN: `use-sw-after-get-token` = this.cast("use-sw-after-get-token")
  @scala.inline
  def USE_VAPID_KEY_AFTER_GET_TOKEN: `use-vapid-key-after-get-token` = this.cast("use-vapid-key-after-get-token")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

