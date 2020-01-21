package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceVolumesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Restrict to volumes by download availability.
    */
  var download: js.UndefOr[String] = js.native
  /**
    * Filter search results.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Restrict results to books with this language code.
    */
  var langRestrict: js.UndefOr[String] = js.native
  /**
    * Restrict search to this user's library.
    */
  var libraryRestrict: js.UndefOr[String] = js.native
  /**
    * The maximum allowed maturity rating of returned recommendations. Books
    * with a higher maturity rating are filtered out.
    */
  var maxAllowedMaturityRating: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Sort search results.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Restrict and brand results for partner ID.
    */
  var partner: js.UndefOr[String] = js.native
  /**
    * Restrict to books or magazines.
    */
  var printType: js.UndefOr[String] = js.native
  /**
    * Restrict information returned to a set of selected fields.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Full-text search query string.
    */
  var q: js.UndefOr[String] = js.native
  /**
    * Set to true to show books available for preorder. Defaults to false.
    */
  var showPreorders: js.UndefOr[Boolean] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Index of the first result to return (starts at 0)
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object ParamsResourceVolumesList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    download: String = null,
    fields: String = null,
    filter: String = null,
    key: String = null,
    langRestrict: String = null,
    libraryRestrict: String = null,
    maxAllowedMaturityRating: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    orderBy: String = null,
    partner: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    printType: String = null,
    projection: String = null,
    q: String = null,
    quotaUser: String = null,
    showPreorders: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    startIndex: Int | Double = null,
    userIp: String = null
  ): ParamsResourceVolumesList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (langRestrict != null) __obj.updateDynamic("langRestrict")(langRestrict.asInstanceOf[js.Any])
    if (libraryRestrict != null) __obj.updateDynamic("libraryRestrict")(libraryRestrict.asInstanceOf[js.Any])
    if (maxAllowedMaturityRating != null) __obj.updateDynamic("maxAllowedMaturityRating")(maxAllowedMaturityRating.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (partner != null) __obj.updateDynamic("partner")(partner.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (printType != null) __obj.updateDynamic("printType")(printType.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreorders)) __obj.updateDynamic("showPreorders")(showPreorders.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceVolumesList]
  }
}

