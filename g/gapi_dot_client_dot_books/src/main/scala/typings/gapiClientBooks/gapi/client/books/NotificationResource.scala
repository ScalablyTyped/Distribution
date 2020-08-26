package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Notificationid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationResource extends js.Object {
  /** Returns notification details for a given notification id. */
  def get(request: Notificationid): Request[Notification] = js.native
}

object NotificationResource {
  @scala.inline
  def apply(get: Notificationid => Request[Notification]): NotificationResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[NotificationResource]
  }
  @scala.inline
  implicit class NotificationResourceOps[Self <: NotificationResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: Notificationid => Request[Notification]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

