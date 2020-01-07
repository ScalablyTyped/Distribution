package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarSessionsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The database in which to list sessions.
    */
  var database: js.UndefOr[String] = js.native
  /**
    * An expression for filtering the results of the request. Filter rules are
    * case insensitive. The fields eligible for filtering are:    *
    * `labels.key` where key is the name of a label  Some examples of using
    * filters are:    * `labels.env:*` --> The session has the label "env".   *
    * `labels.env:dev` --> The session has the label "env" and the value of the
    * label contains the string "dev".
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Number of sessions to be returned in the response. If 0 or less, defaults
    * to the server's maximum allowed page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If non-empty, `page_token` should contain a next_page_token from a
    * previous ListSessionsResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
}

