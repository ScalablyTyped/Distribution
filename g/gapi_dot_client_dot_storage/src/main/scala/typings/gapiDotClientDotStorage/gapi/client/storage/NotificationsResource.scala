package typings.gapiDotClientDotStorage.gapi.client.storage

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotStorage.Anon_AltBucket
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsKeyNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsResource extends js.Object {
  /** Permanently deletes a notification subscription. */
  def delete(request: Anon_AltBucketFieldsKeyNotification): Request[Unit]
  /** View a notification configuration. */
  def get(request: Anon_AltBucketFieldsKeyNotification): Request[Notification]
  /** Creates a notification subscription for a given bucket. */
  def insert(request: Anon_AltBucket): Request[Notification]
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(request: Anon_AltBucket): Request[Notifications]
}

object NotificationsResource {
  @scala.inline
  def apply(
    delete: Anon_AltBucketFieldsKeyNotification => Request[Unit],
    get: Anon_AltBucketFieldsKeyNotification => Request[Notification],
    insert: Anon_AltBucket => Request[Notification],
    list: Anon_AltBucket => Request[Notifications]
  ): NotificationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[NotificationsResource]
  }
}

