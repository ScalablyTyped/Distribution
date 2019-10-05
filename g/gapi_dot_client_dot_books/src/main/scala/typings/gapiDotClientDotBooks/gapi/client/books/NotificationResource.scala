package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationResource extends js.Object {
  /** Returns notification details for a given notification id. */
  def get(request: Anon_AltFieldsKeyLocale): Request[Notification]
}

object NotificationResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKeyLocale => Request[Notification]): NotificationResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[NotificationResource]
  }
}

