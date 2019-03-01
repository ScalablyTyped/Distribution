package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationResource extends js.Object {
  /** Returns notification details for a given notification id. */
  def get(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocale): gapiDotClientLib.gapiNs.clientNs.Request[Notification]
}

object NotificationResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocale, 
      gapiDotClientLib.gapiNs.clientNs.Request[Notification]
    ]
  ): NotificationResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[NotificationResource]
  }
}

