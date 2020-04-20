package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonNotificationid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationResource extends js.Object {
  /** Returns notification details for a given notification id. */
  def get(request: AnonNotificationid): Request_[Notification]
}

object NotificationResource {
  @scala.inline
  def apply(get: AnonNotificationid => Request_[Notification]): NotificationResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[NotificationResource]
  }
}

