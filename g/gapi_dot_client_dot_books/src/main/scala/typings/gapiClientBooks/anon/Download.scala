package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Download extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Restrict to volumes by download availability. */
  var download: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** Filter search results. */
  var filter: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Restrict results to books with this language code. */
  var langRestrict: js.UndefOr[String] = js.native
  /** Restrict search to this user's library. */
  var libraryRestrict: js.UndefOr[String] = js.native
  /** The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out. */
  var maxAllowedMaturityRating: js.UndefOr[String] = js.native
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Sort search results. */
  var orderBy: js.UndefOr[String] = js.native
  /** Restrict and brand results for partner ID. */
  var partner: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Restrict to books or magazines. */
  var printType: js.UndefOr[String] = js.native
  /** Restrict information returned to a set of selected fields. */
  var projection: js.UndefOr[String] = js.native
  /** Full-text search query string. */
  var q: String = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /** Set to true to show books available for preorder. Defaults to false. */
  var showPreorders: js.UndefOr[Boolean] = js.native
  /** String to identify the originator of this request. */
  var source: js.UndefOr[String] = js.native
  /** Index of the first result to return (starts at 0) */
  var startIndex: js.UndefOr[Double] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object Download {
  @scala.inline
  def apply(q: String): Download = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[Download]
  }
  @scala.inline
  implicit class DownloadOps[Self <: Download] (val x: Self) extends AnyVal {
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
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLangRestrict(value: String): Self = this.set("langRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLangRestrict: Self = this.set("langRestrict", js.undefined)
    @scala.inline
    def setLibraryRestrict(value: String): Self = this.set("libraryRestrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibraryRestrict: Self = this.set("libraryRestrict", js.undefined)
    @scala.inline
    def setMaxAllowedMaturityRating(value: String): Self = this.set("maxAllowedMaturityRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAllowedMaturityRating: Self = this.set("maxAllowedMaturityRating", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPartner(value: String): Self = this.set("partner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartner: Self = this.set("partner", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setPrintType(value: String): Self = this.set("printType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintType: Self = this.set("printType", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setShowPreorders(value: Boolean): Self = this.set("showPreorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPreorders: Self = this.set("showPreorders", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

