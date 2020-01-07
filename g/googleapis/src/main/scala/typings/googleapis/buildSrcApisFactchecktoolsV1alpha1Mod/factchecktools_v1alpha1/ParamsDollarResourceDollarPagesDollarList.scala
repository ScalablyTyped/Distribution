package typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPagesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * An integer that specifies the current offset (that is, starting result
    * location) in search results. This field is only considered if
    * `page_token` is unset, and if the request is not for a specific URL. For
    * example, 0 means to return results starting from the first matching
    * result, and 10 means to return from the 11th result.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The organization for which we want to fetch markups for. For instance,
    * "site.com". Cannot be specified along with an URL.
    */
  var organization: js.UndefOr[String] = js.native
  /**
    * The pagination size. We will return up to that many results. Defaults to
    * 10 if not set. Has no effect if a URL is requested.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The pagination token. You may provide the `next_page_token` returned from
    * a previous List request, if any, in order to get the next page. All other
    * fields must have the same values as in the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The URL from which to get `ClaimReview` markup. There will be at most one
    * result. If markup is associated with a more canonical version of the URL
    * provided, we will return that URL instead. Cannot be specified along with
    * an organization.
    */
  var url: js.UndefOr[String] = js.native
}

