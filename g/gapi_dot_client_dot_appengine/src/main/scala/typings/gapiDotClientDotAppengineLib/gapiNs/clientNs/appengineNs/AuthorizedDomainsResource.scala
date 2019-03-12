package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedDomainsResource extends js.Object {
  /** Lists all domains the user is authorized to administer. */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListAuthorizedDomainsResponse]
}

object AuthorizedDomainsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[ListAuthorizedDomainsResponse]
  ): AuthorizedDomainsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AuthorizedDomainsResource]
  }
}

