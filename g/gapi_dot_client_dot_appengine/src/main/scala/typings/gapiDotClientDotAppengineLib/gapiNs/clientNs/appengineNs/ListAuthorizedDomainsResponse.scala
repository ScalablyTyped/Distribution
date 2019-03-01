package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAuthorizedDomainsResponse extends js.Object {
  /** The authorized domains belonging to the user. */
  var domains: js.UndefOr[js.Array[AuthorizedDomain]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListAuthorizedDomainsResponse {
  @scala.inline
  def apply(domains: js.Array[AuthorizedDomain] = null, nextPageToken: java.lang.String = null): ListAuthorizedDomainsResponse = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListAuthorizedDomainsResponse]
  }
}

