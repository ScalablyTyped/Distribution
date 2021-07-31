package typings.firebaseRemoteConfig

import typings.firebaseRemoteConfig.errorsMod.ErrorCode
import typings.firebaseRemoteConfig.storageMod.ProjectNamespaceKeyFieldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseRemoteConfigStrings {
  
  @js.native
  sealed trait active_config
    extends StObject
       with ProjectNamespaceKeyFieldValue
  @scala.inline
  def active_config: active_config = "active_config".asInstanceOf[active_config]
  
  @js.native
  sealed trait active_config_etag
    extends StObject
       with ProjectNamespaceKeyFieldValue
  @scala.inline
  def active_config_etag: active_config_etag = "active_config_etag".asInstanceOf[active_config_etag]
  
  @js.native
  sealed trait `fetch-client-network`
    extends StObject
       with ErrorCode
  @scala.inline
  def `fetch-client-network`: `fetch-client-network` = "fetch-client-network".asInstanceOf[`fetch-client-network`]
  
  @js.native
  sealed trait `fetch-client-parse`
    extends StObject
       with ErrorCode
  @scala.inline
  def `fetch-client-parse`: `fetch-client-parse` = "fetch-client-parse".asInstanceOf[`fetch-client-parse`]
  
  @js.native
  sealed trait `fetch-status`
    extends StObject
       with ErrorCode
  @scala.inline
  def `fetch-status`: `fetch-status` = "fetch-status".asInstanceOf[`fetch-status`]
  
  @js.native
  sealed trait `fetch-throttle`
    extends StObject
       with ErrorCode
  @scala.inline
  def `fetch-throttle`: `fetch-throttle` = "fetch-throttle".asInstanceOf[`fetch-throttle`]
  
  @js.native
  sealed trait `fetch-timeout`
    extends StObject
       with ErrorCode
  @scala.inline
  def `fetch-timeout`: `fetch-timeout` = "fetch-timeout".asInstanceOf[`fetch-timeout`]
  
  @js.native
  sealed trait last_fetch_status
    extends StObject
       with ProjectNamespaceKeyFieldValue
  @scala.inline
  def last_fetch_status: last_fetch_status = "last_fetch_status".asInstanceOf[last_fetch_status]
  
  @js.native
  sealed trait last_successful_fetch_response
    extends StObject
       with ProjectNamespaceKeyFieldValue
  @scala.inline
  def last_successful_fetch_response: last_successful_fetch_response = "last_successful_fetch_response".asInstanceOf[last_successful_fetch_response]
  
  @js.native
  sealed trait last_successful_fetch_timestamp_millis
    extends StObject
       with ProjectNamespaceKeyFieldValue
  @scala.inline
  def last_successful_fetch_timestamp_millis: last_successful_fetch_timestamp_millis = "last_successful_fetch_timestamp_millis".asInstanceOf[last_successful_fetch_timestamp_millis]
  
  @js.native
  sealed trait `registration-api-key`
    extends StObject
       with ErrorCode
  @scala.inline
  def `registration-api-key`: `registration-api-key` = "registration-api-key".asInstanceOf[`registration-api-key`]
  
  @js.native
  sealed trait `registration-app-id`
    extends StObject
       with ErrorCode
  @scala.inline
  def `registration-app-id`: `registration-app-id` = "registration-app-id".asInstanceOf[`registration-app-id`]
  
  @js.native
  sealed trait `registration-project-id`
    extends StObject
       with ErrorCode
  @scala.inline
  def `registration-project-id`: `registration-project-id` = "registration-project-id".asInstanceOf[`registration-project-id`]
  
  @js.native
  sealed trait `registration-window`
    extends StObject
       with ErrorCode
  @scala.inline
  def `registration-window`: `registration-window` = "registration-window".asInstanceOf[`registration-window`]
  
  @js.native
  sealed trait settings
    extends StObject
       with ProjectNamespaceKeyFieldValue
  @scala.inline
  def settings: settings = "settings".asInstanceOf[settings]
  
  @js.native
  sealed trait `storage-delete`
    extends StObject
       with ErrorCode
  @scala.inline
  def `storage-delete`: `storage-delete` = "storage-delete".asInstanceOf[`storage-delete`]
  
  @js.native
  sealed trait `storage-get`
    extends StObject
       with ErrorCode
  @scala.inline
  def `storage-get`: `storage-get` = "storage-get".asInstanceOf[`storage-get`]
  
  @js.native
  sealed trait `storage-open`
    extends StObject
       with ErrorCode
  @scala.inline
  def `storage-open`: `storage-open` = "storage-open".asInstanceOf[`storage-open`]
  
  @js.native
  sealed trait `storage-set`
    extends StObject
       with ErrorCode
  @scala.inline
  def `storage-set`: `storage-set` = "storage-set".asInstanceOf[`storage-set`]
  
  @js.native
  sealed trait throttle_metadata
    extends StObject
       with ProjectNamespaceKeyFieldValue
  @scala.inline
  def throttle_metadata: throttle_metadata = "throttle_metadata".asInstanceOf[throttle_metadata]
}
