package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAppengine.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedDomainsResource extends js.Object {
  /** Lists all domains the user is authorized to administer. */
  def list(request: AnonCallback): Request_[ListAuthorizedDomainsResponse]
}

object AuthorizedDomainsResource {
  @scala.inline
  def apply(list: AnonCallback => Request_[ListAuthorizedDomainsResponse]): AuthorizedDomainsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AuthorizedDomainsResource]
  }
}

