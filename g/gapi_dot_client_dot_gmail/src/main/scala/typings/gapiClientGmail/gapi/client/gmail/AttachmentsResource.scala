package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Gets the specified message attachment. */
  def get(request: Id): Request[MessagePartBody]
}

object AttachmentsResource {
  @scala.inline
  def apply(get: Id => Request[MessagePartBody]): AttachmentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[AttachmentsResource]
  }
}

