package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPlaymoviespartner.AnonAccesstoken
import typings.gapiClientPlaymoviespartner.AnonAccesstokenAccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailsResource extends js.Object {
  /** Get an Avail given its avail group id and avail id. */
  def get(request: AnonAccesstoken): Request_[Avail]
  /**
    * List Avails owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: AnonAccesstokenAccountId): Request_[ListAvailsResponse]
}

object AvailsResource {
  @scala.inline
  def apply(
    get: AnonAccesstoken => Request_[Avail],
    list: AnonAccesstokenAccountId => Request_[ListAvailsResponse]
  ): AvailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AvailsResource]
  }
}

