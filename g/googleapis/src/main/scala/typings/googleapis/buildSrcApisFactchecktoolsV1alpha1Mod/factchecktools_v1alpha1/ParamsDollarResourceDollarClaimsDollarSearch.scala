package typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarClaimsDollarSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". Can be used to
    * restrict results by language, though we do not currently consider the
    * region.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The maximum age of the returned search results, in days. Age is
    * determined by either claim date or review date, whichever is newer.
    */
  var maxAgeDays: js.UndefOr[Double] = js.native
  /**
    * An integer that specifies the current offset (that is, starting result
    * location) in search results. This field is only considered if
    * `page_token` is unset. For example, 0 means to return results starting
    * from the first matching result, and 10 means to return from the 11th
    * result.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The pagination size. We will return up to that many results. Defaults to
    * 10 if not set.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The pagination token. You may provide the `next_page_token` returned from
    * a previous List request, if any, in order to get the next page. All other
    * fields must have the same values as in the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Textual query string. Required unless `review_publisher_site_filter` is
    * specified.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * The review publisher site to filter results by, e.g. nytimes.com.
    */
  var reviewPublisherSiteFilter: js.UndefOr[String] = js.native
}

