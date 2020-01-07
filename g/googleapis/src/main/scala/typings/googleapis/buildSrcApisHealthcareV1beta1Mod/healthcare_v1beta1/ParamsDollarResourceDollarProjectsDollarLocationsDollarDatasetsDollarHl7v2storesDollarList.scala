package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasetsDollarHl7v2storesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Restricts stores returned to those matching a filter. Syntax:
    * https://cloud.google.com/appengine/docs/standard/python/search/query_strings
    * Only filtering on labels is supported, for example `labels.key=value`.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Limit on the number of HL7v2 stores to return in a single response. If
    * zero the default page size of 100 is used.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from the previous List request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Name of the dataset.
    */
  var parent: js.UndefOr[String] = js.native
}

