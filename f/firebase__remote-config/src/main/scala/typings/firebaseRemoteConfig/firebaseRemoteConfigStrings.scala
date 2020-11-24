package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.errorsMod.ErrorCode
import typings.firebaseRemoteConfig.storageMod.ProjectNamespaceKeyFieldValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseRemoteConfigStrings {
  
  @scala.inline
  def active_config: active_config = "active_config".asInstanceOf[active_config]
  
  @scala.inline
  def active_config_etag: active_config_etag = "active_config_etag".asInstanceOf[active_config_etag]
  
  @scala.inline
  def `fetch-client-network`: `fetch-client-network` = "fetch-client-network".asInstanceOf[`fetch-client-network`]
  
  @scala.inline
  def `fetch-client-parse`: `fetch-client-parse` = "fetch-client-parse".asInstanceOf[`fetch-client-parse`]
  
  @scala.inline
  def `fetch-status`: `fetch-status` = "fetch-status".asInstanceOf[`fetch-status`]
  
  @scala.inline
  def `fetch-throttle`: `fetch-throttle` = "fetch-throttle".asInstanceOf[`fetch-throttle`]
  
  @scala.inline
  def `fetch-timeout`: `fetch-timeout` = "fetch-timeout".asInstanceOf[`fetch-timeout`]
  
  @scala.inline
  def last_fetch_status: last_fetch_status = "last_fetch_status".asInstanceOf[last_fetch_status]
  
  @scala.inline
  def last_successful_fetch_response: last_successful_fetch_response = "last_successful_fetch_response".asInstanceOf[last_successful_fetch_response]
  
  @scala.inline
  def last_successful_fetch_timestamp_millis: last_successful_fetch_timestamp_millis = "last_successful_fetch_timestamp_millis".asInstanceOf[last_successful_fetch_timestamp_millis]
  
  @scala.inline
  def `registration-api-key`: `registration-api-key` = "registration-api-key".asInstanceOf[`registration-api-key`]
  
  @scala.inline
  def `registration-app-id`: `registration-app-id` = "registration-app-id".asInstanceOf[`registration-app-id`]
  
  @scala.inline
  def `registration-project-id`: `registration-project-id` = "registration-project-id".asInstanceOf[`registration-project-id`]
  
  @scala.inline
  def `registration-window`: `registration-window` = "registration-window".asInstanceOf[`registration-window`]
  
  @scala.inline
  def settings: settings = "settings".asInstanceOf[settings]
  
  @scala.inline
  def `storage-delete`: `storage-delete` = "storage-delete".asInstanceOf[`storage-delete`]
  
  @scala.inline
  def `storage-get`: `storage-get` = "storage-get".asInstanceOf[`storage-get`]
  
  @scala.inline
  def `storage-open`: `storage-open` = "storage-open".asInstanceOf[`storage-open`]
  
  @scala.inline
  def `storage-set`: `storage-set` = "storage-set".asInstanceOf[`storage-set`]
  
  @scala.inline
  def throttle_metadata: throttle_metadata = "throttle_metadata".asInstanceOf[throttle_metadata]
  
  @js.native
  sealed trait active_config extends ProjectNamespaceKeyFieldValue
  
  @js.native
  sealed trait active_config_etag extends ProjectNamespaceKeyFieldValue
  
  @js.native
  sealed trait `fetch-client-network` extends ErrorCode
  
  @js.native
  sealed trait `fetch-client-parse` extends ErrorCode
  
  @js.native
  sealed trait `fetch-status` extends ErrorCode
  
  @js.native
  sealed trait `fetch-throttle` extends ErrorCode
  
  @js.native
  sealed trait `fetch-timeout` extends ErrorCode
  
  @js.native
  sealed trait last_fetch_status extends ProjectNamespaceKeyFieldValue
  
  @js.native
  sealed trait last_successful_fetch_response extends ProjectNamespaceKeyFieldValue
  
  @js.native
  sealed trait last_successful_fetch_timestamp_millis extends ProjectNamespaceKeyFieldValue
  
  @js.native
  sealed trait `registration-api-key` extends ErrorCode
  
  @js.native
  sealed trait `registration-app-id` extends ErrorCode
  
  @js.native
  sealed trait `registration-project-id` extends ErrorCode
  
  @js.native
  sealed trait `registration-window` extends ErrorCode
  
  @js.native
  sealed trait settings extends ProjectNamespaceKeyFieldValue
  
  @js.native
  sealed trait `storage-delete` extends ErrorCode
  
  @js.native
  sealed trait `storage-get` extends ErrorCode
  
  @js.native
  sealed trait `storage-open` extends ErrorCode
  
  @js.native
  sealed trait `storage-set` extends ErrorCode
  
  @js.native
  sealed trait throttle_metadata extends ProjectNamespaceKeyFieldValue
}
