package typings
package gapiDotClientDotCustomsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Turns off the translation between zh-CN and zh-TW. */
  var c2coff: js.UndefOr[java.lang.String] = js.undefined
  /** Country restrict(s). */
  var cr: js.UndefOr[java.lang.String] = js.undefined
  /** The custom search engine ID to scope this search query */
  var cx: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies all search results are from a time period */
  var dateRestrict: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies a phrase that all documents in the search results must contain */
  var exactTerms: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies a word or phrase that should not appear in any documents in the search results */
  var excludeTerms: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Returns images of a specified type. Some of the allowed values are: bmp, gif, png, jpg, svg, pdf, ... */
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  /** Controls turning on or off the duplicate content filter. */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** Geolocation of end user. */
  var gl: js.UndefOr[java.lang.String] = js.undefined
  /** The local Google domain to use to perform the search. */
  var googlehost: js.UndefOr[java.lang.String] = js.undefined
  /** Creates a range in form as_nlo value..as_nhi value and attempts to append it to query */
  var highRange: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the user interface language. */
  var hl: js.UndefOr[java.lang.String] = js.undefined
  /** Appends the extra query terms to the query. */
  var hq: js.UndefOr[java.lang.String] = js.undefined
  /** Returns black and white, grayscale, or color images: mono, gray, and color. */
  var imgColorType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns images of a specific dominant color: yellow, green, teal, blue, purple, pink, white, gray, black and brown. */
  var imgDominantColor: js.UndefOr[java.lang.String] = js.undefined
  /** Returns images of a specified size, where size can be one of: icon, small, medium, large, xlarge, xxlarge, and huge. */
  var imgSize: js.UndefOr[java.lang.String] = js.undefined
  /** Returns images of a type, which can be one of: clipart, face, lineart, news, and photo. */
  var imgType: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies that all search results should contain a link to a particular URL */
  var linkSite: js.UndefOr[java.lang.String] = js.undefined
  /** Creates a range in form as_nlo value..as_nhi value and attempts to append it to query */
  var lowRange: js.UndefOr[java.lang.String] = js.undefined
  /** The language restriction for the search results */
  var lr: js.UndefOr[java.lang.String] = js.undefined
  /** Number of search results to return */
  var num: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provides additional search terms to check for in a document, where each document in the search results must contain at least one of the additional
    * search terms
    */
  var orTerms: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Query */
  var q: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies that all search results should be pages that are related to the specified URL */
  var relatedSite: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filters based on licensing. Supported values include: cc_publicdomain, cc_attribute, cc_sharealike, cc_noncommercial, cc_nonderived and combinations of
    * these.
    */
  var rights: js.UndefOr[java.lang.String] = js.undefined
  /** Search safety level */
  var safe: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the search type: image. */
  var searchType: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies all search results should be pages from a given site */
  var siteSearch: js.UndefOr[java.lang.String] = js.undefined
  /** Controls whether to include or exclude results from the site named in the as_sitesearch parameter */
  var siteSearchFilter: js.UndefOr[java.lang.String] = js.undefined
  /** The sort expression to apply to the results */
  var sort: js.UndefOr[java.lang.String] = js.undefined
  /** The index of the first result to return */
  var start: js.UndefOr[scala.Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

