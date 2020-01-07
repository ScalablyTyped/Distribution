package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListDomainsResponse extends js.Object {
  /**
    * The list of domains, if any exist.
    */
  var domains: js.UndefOr[js.Array[Schema$Domain]] = js.native
  /**
    * The pagination token, if more results exist.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDomainsResponse {
  @scala.inline
  def apply(domains: js.Array[Schema$Domain] = null, nextPageToken: String = null): Schema$ListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDomainsResponse]
  }
}

