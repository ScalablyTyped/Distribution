package typings.gapiDotClientDotCustomsearch.gapiNs.clientNs.customsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var cr: js.UndefOr[String] = js.undefined
  var cx: js.UndefOr[String] = js.undefined
  var dateRestrict: js.UndefOr[String] = js.undefined
  var disableCnTwTranslation: js.UndefOr[String] = js.undefined
  var exactTerms: js.UndefOr[String] = js.undefined
  var excludeTerms: js.UndefOr[String] = js.undefined
  var fileType: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var gl: js.UndefOr[String] = js.undefined
  var googleHost: js.UndefOr[String] = js.undefined
  var highRange: js.UndefOr[String] = js.undefined
  var hl: js.UndefOr[String] = js.undefined
  var hq: js.UndefOr[String] = js.undefined
  var imgColorType: js.UndefOr[String] = js.undefined
  var imgDominantColor: js.UndefOr[String] = js.undefined
  var imgSize: js.UndefOr[String] = js.undefined
  var imgType: js.UndefOr[String] = js.undefined
  var inputEncoding: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var linkSite: js.UndefOr[String] = js.undefined
  var lowRange: js.UndefOr[String] = js.undefined
  var orTerms: js.UndefOr[String] = js.undefined
  var outputEncoding: js.UndefOr[String] = js.undefined
  var relatedSite: js.UndefOr[String] = js.undefined
  var rights: js.UndefOr[String] = js.undefined
  var safe: js.UndefOr[String] = js.undefined
  var searchTerms: js.UndefOr[String] = js.undefined
  var searchType: js.UndefOr[String] = js.undefined
  var siteSearch: js.UndefOr[String] = js.undefined
  var siteSearchFilter: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var startPage: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var totalResults: js.UndefOr[String] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    count: Int | Double = null,
    cr: String = null,
    cx: String = null,
    dateRestrict: String = null,
    disableCnTwTranslation: String = null,
    exactTerms: String = null,
    excludeTerms: String = null,
    fileType: String = null,
    filter: String = null,
    gl: String = null,
    googleHost: String = null,
    highRange: String = null,
    hl: String = null,
    hq: String = null,
    imgColorType: String = null,
    imgDominantColor: String = null,
    imgSize: String = null,
    imgType: String = null,
    inputEncoding: String = null,
    language: String = null,
    linkSite: String = null,
    lowRange: String = null,
    orTerms: String = null,
    outputEncoding: String = null,
    relatedSite: String = null,
    rights: String = null,
    safe: String = null,
    searchTerms: String = null,
    searchType: String = null,
    siteSearch: String = null,
    siteSearchFilter: String = null,
    sort: String = null,
    startIndex: Int | Double = null,
    startPage: Int | Double = null,
    title: String = null,
    totalResults: String = null
  ): Query = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (cr != null) __obj.updateDynamic("cr")(cr)
    if (cx != null) __obj.updateDynamic("cx")(cx)
    if (dateRestrict != null) __obj.updateDynamic("dateRestrict")(dateRestrict)
    if (disableCnTwTranslation != null) __obj.updateDynamic("disableCnTwTranslation")(disableCnTwTranslation)
    if (exactTerms != null) __obj.updateDynamic("exactTerms")(exactTerms)
    if (excludeTerms != null) __obj.updateDynamic("excludeTerms")(excludeTerms)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (gl != null) __obj.updateDynamic("gl")(gl)
    if (googleHost != null) __obj.updateDynamic("googleHost")(googleHost)
    if (highRange != null) __obj.updateDynamic("highRange")(highRange)
    if (hl != null) __obj.updateDynamic("hl")(hl)
    if (hq != null) __obj.updateDynamic("hq")(hq)
    if (imgColorType != null) __obj.updateDynamic("imgColorType")(imgColorType)
    if (imgDominantColor != null) __obj.updateDynamic("imgDominantColor")(imgDominantColor)
    if (imgSize != null) __obj.updateDynamic("imgSize")(imgSize)
    if (imgType != null) __obj.updateDynamic("imgType")(imgType)
    if (inputEncoding != null) __obj.updateDynamic("inputEncoding")(inputEncoding)
    if (language != null) __obj.updateDynamic("language")(language)
    if (linkSite != null) __obj.updateDynamic("linkSite")(linkSite)
    if (lowRange != null) __obj.updateDynamic("lowRange")(lowRange)
    if (orTerms != null) __obj.updateDynamic("orTerms")(orTerms)
    if (outputEncoding != null) __obj.updateDynamic("outputEncoding")(outputEncoding)
    if (relatedSite != null) __obj.updateDynamic("relatedSite")(relatedSite)
    if (rights != null) __obj.updateDynamic("rights")(rights)
    if (safe != null) __obj.updateDynamic("safe")(safe)
    if (searchTerms != null) __obj.updateDynamic("searchTerms")(searchTerms)
    if (searchType != null) __obj.updateDynamic("searchType")(searchType)
    if (siteSearch != null) __obj.updateDynamic("siteSearch")(siteSearch)
    if (siteSearchFilter != null) __obj.updateDynamic("siteSearchFilter")(siteSearchFilter)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (startPage != null) __obj.updateDynamic("startPage")(startPage.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults)
    __obj.asInstanceOf[Query]
  }
}

