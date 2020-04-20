package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Gets the specified message attachment. */
  def get(request: AnonId): Request_[MessagePartBody]
}

object AttachmentsResource {
  @scala.inline
  def apply(get: AnonId => Request_[MessagePartBody]): AttachmentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[AttachmentsResource]
  }
}

