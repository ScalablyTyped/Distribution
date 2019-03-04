package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsResource extends js.Object {
  /** Permanently deletes a notification subscription. */
  def delete(request: gapiDotClientDotStorageLib.Anon_AltBucketFieldsKeyNotification): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** View a notification configuration. */
  def get(request: gapiDotClientDotStorageLib.Anon_AltBucketFieldsKeyNotification): gapiDotClientLib.gapiNs.clientNs.Request[Notification]
  /** Creates a notification subscription for a given bucket. */
  def insert(request: gapiDotClientDotStorageLib.Anon_AltBucket): gapiDotClientLib.gapiNs.clientNs.Request[Notification]
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(request: gapiDotClientDotStorageLib.Anon_AltBucket): gapiDotClientLib.gapiNs.clientNs.Request[Notifications]
}

object NotificationsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucketFieldsKeyNotification, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucketFieldsKeyNotification, 
      gapiDotClientLib.gapiNs.clientNs.Request[Notification]
    ],
    insert: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucket, 
      gapiDotClientLib.gapiNs.clientNs.Request[Notification]
    ],
    list: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucket, 
      gapiDotClientLib.gapiNs.clientNs.Request[Notifications]
    ]
  ): NotificationsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list)
  
    __obj.asInstanceOf[NotificationsResource]
  }
}

