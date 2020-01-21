package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltFieldsKeyOauthtokenPagesize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembershipResource extends js.Object {
  /** Returns Series membership data given the series id. */
  def get(request: AnonAltFieldsKeyOauthtokenPagesize): Request_[Seriesmembership]
}

object MembershipResource {
  @scala.inline
  def apply(get: AnonAltFieldsKeyOauthtokenPagesize => Request_[Seriesmembership]): MembershipResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[MembershipResource]
  }
}

