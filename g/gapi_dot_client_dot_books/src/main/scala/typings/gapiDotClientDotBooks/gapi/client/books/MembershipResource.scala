package typings.gapiDotClientDotBooks.gapi.client.books

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyOauthtokenPagesize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembershipResource extends js.Object {
  /** Returns Series membership data given the series id. */
  def get(request: Anon_AltFieldsKeyOauthtokenPagesize): Request[Seriesmembership]
}

object MembershipResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKeyOauthtokenPagesize => Request[Seriesmembership]): MembershipResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[MembershipResource]
  }
}

