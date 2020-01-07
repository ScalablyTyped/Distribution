package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `ListProjectBillingInfoResponse`.
  */
@js.native
trait Schema$ListProjectBillingInfoResponse extends js.Object {
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
  var projectBillingInfo: js.UndefOr[js.Array[Schema$ProjectBillingInfo]] = js.native
}

object Schema$ListProjectBillingInfoResponse {
  @scala.inline
  def apply(nextPageToken: String = null, projectBillingInfo: js.Array[Schema$ProjectBillingInfo] = null): Schema$ListProjectBillingInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (projectBillingInfo != null) __obj.updateDynamic("projectBillingInfo")(projectBillingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListProjectBillingInfoResponse]
  }
}

