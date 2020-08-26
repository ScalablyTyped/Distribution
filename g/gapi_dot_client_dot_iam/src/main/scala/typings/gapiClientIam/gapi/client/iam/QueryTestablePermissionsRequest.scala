package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTestablePermissionsRequest extends js.Object {
  /**
    * Required. The full resource name to query from the list of testable
    * permissions.
    *
    * The name follows the Google Cloud Platform resource format.
    * For example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.native
  /** Optional limit on the number of permissions to include in the response. */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional pagination token returned in an earlier
    * QueryTestablePermissionsRequest.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object QueryTestablePermissionsRequest {
  @scala.inline
  def apply(): QueryTestablePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTestablePermissionsRequest]
  }
  @scala.inline
  implicit class QueryTestablePermissionsRequestOps[Self <: QueryTestablePermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFullResourceName(value: String): Self = this.set("fullResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullResourceName: Self = this.set("fullResourceName", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

