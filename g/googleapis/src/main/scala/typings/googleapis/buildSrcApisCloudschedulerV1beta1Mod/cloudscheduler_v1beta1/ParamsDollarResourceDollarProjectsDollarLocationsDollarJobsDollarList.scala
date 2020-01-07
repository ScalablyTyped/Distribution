package typings.googleapis.buildSrcApisCloudschedulerV1beta1Mod.cloudscheduler_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Requested page size.  The maximum page size is 500. If unspecified, the
    * page size will be the maximum. Fewer jobs than requested might be
    * returned, even if more jobs exist; use next_page_token to determine if
    * more jobs exist.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server will return. To request
    * the first page results, page_token must be empty. To request the next
    * page of results, page_token must be the value of next_page_token returned
    * from the previous call to ListJobs. It is an error to switch the value of
    * filter or order_by while iterating through pages.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required.  The location name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID`.
    */
  var parent: js.UndefOr[String] = js.native
}

