package typings.gapiDotClientDotAppengine.gapi.client.appengine

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAppengine.Anon_AccesstokenAltAppsIdBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedDomainsResource extends js.Object {
  /** Lists all domains the user is authorized to administer. */
  def list(request: Anon_AccesstokenAltAppsIdBearertokenCallback): Request[ListAuthorizedDomainsResponse]
}

object AuthorizedDomainsResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAltAppsIdBearertokenCallback => Request[ListAuthorizedDomainsResponse]): AuthorizedDomainsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AuthorizedDomainsResource]
  }
}

