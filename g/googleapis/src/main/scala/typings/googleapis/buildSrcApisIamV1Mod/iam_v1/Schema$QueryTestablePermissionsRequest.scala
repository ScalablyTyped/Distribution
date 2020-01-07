package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to get permissions which can be tested on a resource.
  */
@js.native
trait Schema$QueryTestablePermissionsRequest extends js.Object {
  /**
    * Required. The full resource name to query from the list of testable
    * permissions.  The name follows the Google Cloud Platform resource format.
    * For example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.native
  /**
    * Optional limit on the number of permissions to include in the response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional pagination token returned in an earlier
    * QueryTestablePermissionsRequest.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object Schema$QueryTestablePermissionsRequest {
  @scala.inline
  def apply(fullResourceName: String = null, pageSize: Int | Double = null, pageToken: String = null): Schema$QueryTestablePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (fullResourceName != null) __obj.updateDynamic("fullResourceName")(fullResourceName.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryTestablePermissionsRequest]
  }
}

