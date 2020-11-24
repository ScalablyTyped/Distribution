package typings.firebaseRemoteConfig.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides type-safety for the "key" field used by {@link APP_NAMESPACE_STORE}.
  *
  * <p>This seems like a small price to avoid potentially subtle bugs caused by a typo.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings
  - typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata
*/
trait ProjectNamespaceKeyFieldValue extends js.Object
object ProjectNamespaceKeyFieldValue {
  
  @scala.inline
  def active_config: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config = "active_config".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config]
  
  @scala.inline
  def active_config_etag: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag = "active_config_etag".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.active_config_etag]
  
  @scala.inline
  def last_fetch_status: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status = "last_fetch_status".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_fetch_status]
  
  @scala.inline
  def last_successful_fetch_response: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response = "last_successful_fetch_response".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_response]
  
  @scala.inline
  def last_successful_fetch_timestamp_millis: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis = "last_successful_fetch_timestamp_millis".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.last_successful_fetch_timestamp_millis]
  
  @scala.inline
  def settings: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings = "settings".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.settings]
  
  @scala.inline
  def throttle_metadata: typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata = "throttle_metadata".asInstanceOf[typings.firebaseRemoteConfig.firebaseRemoteConfigStrings.throttle_metadata]
}
