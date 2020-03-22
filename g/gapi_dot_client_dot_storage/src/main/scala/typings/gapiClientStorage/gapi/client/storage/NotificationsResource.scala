package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonBucket
import typings.gapiClientStorage.AnonNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsResource extends js.Object {
  /** Permanently deletes a notification subscription. */
  def delete(request: AnonNotification): Request_[Unit]
  /** View a notification configuration. */
  def get(request: AnonNotification): Request_[Notification]
  /** Creates a notification subscription for a given bucket. */
  def insert(request: AnonBucket): Request_[Notification]
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(request: AnonBucket): Request_[Notifications]
}

object NotificationsResource {
  @scala.inline
  def apply(
    delete: AnonNotification => Request_[Unit],
    get: AnonNotification => Request_[Notification],
    insert: AnonBucket => Request_[Notification],
    list: AnonBucket => Request_[Notifications]
  ): NotificationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[NotificationsResource]
  }
}

