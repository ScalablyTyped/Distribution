package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Authorized Domains.
  */
@js.native
trait Schema$ListAuthorizedDomainsResponse extends js.Object {
  /**
    * The authorized domains belonging to the user.
    */
  var domains: js.UndefOr[js.Array[Schema$AuthorizedDomain]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAuthorizedDomainsResponse {
  @scala.inline
  def apply(domains: js.Array[Schema$AuthorizedDomain] = null, nextPageToken: String = null): Schema$ListAuthorizedDomainsResponse = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAuthorizedDomainsResponse]
  }
}

