package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonAltBucket
import typings.gapiClientStorage.AnonAltBucketFieldsKeyNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsResource extends js.Object {
  /** Permanently deletes a notification subscription. */
  def delete(request: AnonAltBucketFieldsKeyNotification): Request_[Unit]
  /** View a notification configuration. */
  def get(request: AnonAltBucketFieldsKeyNotification): Request_[Notification]
  /** Creates a notification subscription for a given bucket. */
  def insert(request: AnonAltBucket): Request_[Notification]
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(request: AnonAltBucket): Request_[Notifications]
}

object NotificationsResource {
  @scala.inline
  def apply(
    delete: AnonAltBucketFieldsKeyNotification => Request_[Unit],
    get: AnonAltBucketFieldsKeyNotification => Request_[Notification],
    insert: AnonAltBucket => Request_[Notification],
    list: AnonAltBucket => Request_[Notifications]
  ): NotificationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[NotificationsResource]
  }
}

