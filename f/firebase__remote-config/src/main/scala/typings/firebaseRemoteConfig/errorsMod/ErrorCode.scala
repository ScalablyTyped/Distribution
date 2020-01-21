package typings.firebaseRemoteConfig.errorsMod

import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-network`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-parse`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-status`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-throttle`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-timeout`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-api-key`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-app-id`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-project-id`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-window`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-delete`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-get`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-open`
import typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-set`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-window`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-project-id`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-api-key`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`registration-app-id`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-open`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-get`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-set`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`storage-delete`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-network`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-timeout`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-throttle`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-client-parse`
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.`fetch-status`
*/
trait ErrorCode extends js.Object

object ErrorCode {
  @scala.inline
  def FETCH_NETWORK: `fetch-client-network` = this.cast("fetch-client-network")
  @scala.inline
  def FETCH_PARSE: `fetch-client-parse` = this.cast("fetch-client-parse")
  @scala.inline
  def FETCH_STATUS: `fetch-status` = this.cast("fetch-status")
  @scala.inline
  def FETCH_THROTTLE: `fetch-throttle` = this.cast("fetch-throttle")
  @scala.inline
  def FETCH_TIMEOUT: `fetch-timeout` = this.cast("fetch-timeout")
  @scala.inline
  def REGISTRATION_API_KEY: `registration-api-key` = this.cast("registration-api-key")
  @scala.inline
  def REGISTRATION_APP_ID: `registration-app-id` = this.cast("registration-app-id")
  @scala.inline
  def REGISTRATION_PROJECT_ID: `registration-project-id` = this.cast("registration-project-id")
  @scala.inline
  def REGISTRATION_WINDOW: `registration-window` = this.cast("registration-window")
  @scala.inline
  def STORAGE_DELETE: `storage-delete` = this.cast("storage-delete")
  @scala.inline
  def STORAGE_GET: `storage-get` = this.cast("storage-get")
  @scala.inline
  def STORAGE_OPEN: `storage-open` = this.cast("storage-open")
  @scala.inline
  def STORAGE_SET: `storage-set` = this.cast("storage-set")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

