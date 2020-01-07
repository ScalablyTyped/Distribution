package typings.googleapis.buildSrcApisAdminDatatransferUnderscoreV1Mod.admin_datatransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for a collection of Applications.
  */
@js.native
trait Schema$ApplicationsListResponse extends js.Object {
  /**
    * List of applications that support data transfer and are also installed
    * for the customer.
    */
  var applications: js.UndefOr[js.Array[Schema$Application]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a collection of Applications.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Continuation token which will be used to specify next page in list API.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ApplicationsListResponse {
  @scala.inline
  def apply(
    applications: js.Array[Schema$Application] = null,
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$ApplicationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApplicationsListResponse]
  }
}

