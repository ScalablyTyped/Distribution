package typings.gapiDotClientDotCustomsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Turns off the translation between zh-CN and zh-TW. */
  var c2coff: js.UndefOr[String] = js.undefined
  /** Country restrict(s). */
  var cr: js.UndefOr[String] = js.undefined
  /** The custom search engine ID to scope this search query */
  var cx: js.UndefOr[String] = js.undefined
  /** Specifies all search results are from a time period */
  var dateRestrict: js.UndefOr[String] = js.undefined
  /** Identifies a phrase that all documents in the search results must contain */
  var exactTerms: js.UndefOr[String] = js.undefined
  /** Identifies a word or phrase that should not appear in any documents in the search results */
  var excludeTerms: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Returns images of a specified type. Some of the allowed values are: bmp, gif, png, jpg, svg, pdf, ... */
  var fileType: js.UndefOr[String] = js.undefined
  /** Controls turning on or off the duplicate content filter. */
  var filter: js.UndefOr[String] = js.undefined
  /** Geolocation of end user. */
  var gl: js.UndefOr[String] = js.undefined
  /** The local Google domain to use to perform the search. */
  var googlehost: js.UndefOr[String] = js.undefined
  /** Creates a range in form as_nlo value..as_nhi value and attempts to append it to query */
  var highRange: js.UndefOr[String] = js.undefined
  /** Sets the user interface language. */
  var hl: js.UndefOr[String] = js.undefined
  /** Appends the extra query terms to the query. */
  var hq: js.UndefOr[String] = js.undefined
  /** Returns black and white, grayscale, or color images: mono, gray, and color. */
  var imgColorType: js.UndefOr[String] = js.undefined
  /** Returns images of a specific dominant color: yellow, green, teal, blue, purple, pink, white, gray, black and brown. */
  var imgDominantColor: js.UndefOr[String] = js.undefined
  /** Returns images of a specified size, where size can be one of: icon, small, medium, large, xlarge, xxlarge, and huge. */
  var imgSize: js.UndefOr[String] = js.undefined
  /** Returns images of a type, which can be one of: clipart, face, lineart, news, and photo. */
  var imgType: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Specifies that all search results should contain a link to a particular URL */
  var linkSite: js.UndefOr[String] = js.undefined
  /** Creates a range in form as_nlo value..as_nhi value and attempts to append it to query */
  var lowRange: js.UndefOr[String] = js.undefined
  /** The language restriction for the search results */
  var lr: js.UndefOr[String] = js.undefined
  /** Number of search results to return */
  var num: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional
    * search terms
    */
  var orTerms: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Query */
  var q: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Specifies that all search results should be pages that are related to the specified URL */
  var relatedSite: js.UndefOr[String] = js.undefined
  /**
    * Filters based on licensing. Supported values include: cc_publicdomain, cc_attribute, cc_sharealike, cc_noncommercial, cc_nonderived and combinations of
    * these.
    */
  var rights: js.UndefOr[String] = js.undefined
  /** Search safety level */
  var safe: js.UndefOr[String] = js.undefined
  /** Specifies the search type: image. */
  var searchType: js.UndefOr[String] = js.undefined
  /** Specifies all search results should be pages from a given site */
  var siteSearch: js.UndefOr[String] = js.undefined
  /** Controls whether to include or exclude results from the site named in the as_sitesearch parameter */
  var siteSearchFilter: js.UndefOr[String] = js.undefined
  /** The sort expression to apply to the results */
  var sort: js.UndefOr[String] = js.undefined
  /** The index of the first result to return */
  var start: js.UndefOr[Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_Alt {
  @scala.inline
  def apply(
    q: String,
    alt: String = null,
    c2coff: String = null,
    cr: String = null,
    cx: String = null,
    dateRestrict: String = null,
    exactTerms: String = null,
    excludeTerms: String = null,
    fields: String = null,
    fileType: String = null,
    filter: String = null,
    gl: String = null,
    googlehost: String = null,
    highRange: String = null,
    hl: String = null,
    hq: String = null,
    imgColorType: String = null,
    imgDominantColor: String = null,
    imgSize: String = null,
    imgType: String = null,
    key: String = null,
    linkSite: String = null,
    lowRange: String = null,
    lr: String = null,
    num: Int | Double = null,
    oauth_token: String = null,
    orTerms: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    relatedSite: String = null,
    rights: String = null,
    safe: String = null,
    searchType: String = null,
    siteSearch: String = null,
    siteSearchFilter: String = null,
    sort: String = null,
    start: Int | Double = null,
    userIp: String = null
  ): Anon_Alt = {
    val __obj = js.Dynamic.literal(q = q)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (c2coff != null) __obj.updateDynamic("c2coff")(c2coff)
    if (cr != null) __obj.updateDynamic("cr")(cr)
    if (cx != null) __obj.updateDynamic("cx")(cx)
    if (dateRestrict != null) __obj.updateDynamic("dateRestrict")(dateRestrict)
    if (exactTerms != null) __obj.updateDynamic("exactTerms")(exactTerms)
    if (excludeTerms != null) __obj.updateDynamic("excludeTerms")(excludeTerms)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (gl != null) __obj.updateDynamic("gl")(gl)
    if (googlehost != null) __obj.updateDynamic("googlehost")(googlehost)
    if (highRange != null) __obj.updateDynamic("highRange")(highRange)
    if (hl != null) __obj.updateDynamic("hl")(hl)
    if (hq != null) __obj.updateDynamic("hq")(hq)
    if (imgColorType != null) __obj.updateDynamic("imgColorType")(imgColorType)
    if (imgDominantColor != null) __obj.updateDynamic("imgDominantColor")(imgDominantColor)
    if (imgSize != null) __obj.updateDynamic("imgSize")(imgSize)
    if (imgType != null) __obj.updateDynamic("imgType")(imgType)
    if (key != null) __obj.updateDynamic("key")(key)
    if (linkSite != null) __obj.updateDynamic("linkSite")(linkSite)
    if (lowRange != null) __obj.updateDynamic("lowRange")(lowRange)
    if (lr != null) __obj.updateDynamic("lr")(lr)
    if (num != null) __obj.updateDynamic("num")(num.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (orTerms != null) __obj.updateDynamic("orTerms")(orTerms)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (relatedSite != null) __obj.updateDynamic("relatedSite")(relatedSite)
    if (rights != null) __obj.updateDynamic("rights")(rights)
    if (safe != null) __obj.updateDynamic("safe")(safe)
    if (searchType != null) __obj.updateDynamic("searchType")(searchType)
    if (siteSearch != null) __obj.updateDynamic("siteSearch")(siteSearch)
    if (siteSearchFilter != null) __obj.updateDynamic("siteSearchFilter")(siteSearchFilter)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_Alt]
  }
}

