package typings.atFirebaseRemoteDashConfig.distSrcStorageStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides type-safety for the "key" field used by {@link APP_NAMESPACE_STORE}.
  *
  * <p>This seems like a small price to avoid potentially subtle bugs caused by a typo.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.active_config
  - typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.active_config_etag
  - typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.last_fetch_status
  - typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.last_successful_fetch_timestamp_millis
  - typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.last_successful_fetch_response
  - typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.settings
  - typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.throttle_metadata
*/
trait ProjectNamespaceKeyFieldValue extends js.Object

object ProjectNamespaceKeyFieldValue {
  @scala.inline
  def active_config: typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.active_config = this.cast("active_config")
  @scala.inline
  def active_config_etag: typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.active_config_etag = this.cast("active_config_etag")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def last_fetch_status: typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.last_fetch_status = this.cast("last_fetch_status")
  @scala.inline
  def last_successful_fetch_response: typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.last_successful_fetch_response = this.cast("last_successful_fetch_response")
  @scala.inline
  def last_successful_fetch_timestamp_millis: typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.last_successful_fetch_timestamp_millis = this.cast("last_successful_fetch_timestamp_millis")
  @scala.inline
  def settings: typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.settings = this.cast("settings")
  @scala.inline
  def throttle_metadata: typings.atFirebaseRemoteDashConfig.atFirebaseRemoteDashConfigStrings.throttle_metadata = this.cast("throttle_metadata")
}

