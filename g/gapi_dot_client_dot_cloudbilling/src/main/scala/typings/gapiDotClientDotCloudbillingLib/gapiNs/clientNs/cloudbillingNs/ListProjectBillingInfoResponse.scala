package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListProjectBillingInfoResponse extends js.Object {
  /**
               * A token to retrieve the next page of results. To retrieve the next page,
               * call `ListProjectBillingInfo` again with the `page_token` field set to this
               * value. This field is empty if there are no more results to retrieve.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A list of `ProjectBillingInfo` resources representing the projects
               * associated with the billing account.
               */
  var projectBillingInfo: js.UndefOr[js.Array[ProjectBillingInfo]] = js.undefined
}

