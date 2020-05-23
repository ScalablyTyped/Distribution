package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsResource extends js.Object {
  /** Permanently deletes a notification subscription. */
  def delete(request: typings.gapiClientStorage.anon.Notification): Request[Unit]
  /** View a notification configuration. */
  def get(request: typings.gapiClientStorage.anon.Notification): Request[Notification]
  /** Creates a notification subscription for a given bucket. */
  def insert(request: typings.gapiClientStorage.anon.Bucket): Request[Notification]
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(request: typings.gapiClientStorage.anon.Bucket): Request[Notifications]
}

object NotificationsResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientStorage.anon.Notification => Request[Unit],
    get: typings.gapiClientStorage.anon.Notification => Request[Notification],
    insert: typings.gapiClientStorage.anon.Bucket => Request[Notification],
    list: typings.gapiClientStorage.anon.Bucket => Request[Notifications]
  ): NotificationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[NotificationsResource]
  }
}

