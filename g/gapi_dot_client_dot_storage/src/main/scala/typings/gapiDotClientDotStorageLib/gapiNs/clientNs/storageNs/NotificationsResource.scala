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
    delete: gapiDotClientDotStorageLib.Anon_AltBucketFieldsKeyNotification => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotStorageLib.Anon_AltBucketFieldsKeyNotification => gapiDotClientLib.gapiNs.clientNs.Request[Notification],
    insert: gapiDotClientDotStorageLib.Anon_AltBucket => gapiDotClientLib.gapiNs.clientNs.Request[Notification],
    list: gapiDotClientDotStorageLib.Anon_AltBucket => gapiDotClientLib.gapiNs.clientNs.Request[Notifications]
  ): NotificationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[NotificationsResource]
  }
}

