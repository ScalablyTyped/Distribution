package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryGrantableRolesRequest extends js.Object {
  /**
    * Required. The full resource name to query from the list of grantable roles.
    *
    * The name follows the Google Cloud Platform resource format.
    * For example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.undefined
  /** Optional limit on the number of roles to include in the response. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * Optional pagination token returned in an earlier
    * QueryGrantableRolesResponse.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object QueryGrantableRolesRequest {
  @scala.inline
  def apply(
    fullResourceName: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    view: String = null
  ): QueryGrantableRolesRequest = {
    val __obj = js.Dynamic.literal()
    if (fullResourceName != null) __obj.updateDynamic("fullResourceName")(fullResourceName.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryGrantableRolesRequest]
  }
}

