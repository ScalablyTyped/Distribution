package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `ListProjectBillingInfoResponse`.
  */
@js.native
trait SchemaListProjectBillingInfoResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListProjectBillingInfo` again with the `page_token` field set to
    * this value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of `ProjectBillingInfo` resources representing the projects
    * associated with the billing account.
    */
  var projectBillingInfo: js.UndefOr[js.Array[SchemaProjectBillingInfo]] = js.native
}

object SchemaListProjectBillingInfoResponse {
  @scala.inline
  def apply(nextPageToken: String = null, projectBillingInfo: js.Array[SchemaProjectBillingInfo] = null): SchemaListProjectBillingInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (projectBillingInfo != null) __obj.updateDynamic("projectBillingInfo")(projectBillingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListProjectBillingInfoResponse]
  }
}

