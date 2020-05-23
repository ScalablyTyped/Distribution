package typings.gapiClientCustomsearch.gapi.client.customsearch

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
    count: js.UndefOr[Double] = js.undefined,
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
    startIndex: js.UndefOr[Double] = js.undefined,
    startPage: js.UndefOr[Double] = js.undefined,
    title: String = null,
    totalResults: String = null
  ): Query = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (cr != null) __obj.updateDynamic("cr")(cr.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (dateRestrict != null) __obj.updateDynamic("dateRestrict")(dateRestrict.asInstanceOf[js.Any])
    if (disableCnTwTranslation != null) __obj.updateDynamic("disableCnTwTranslation")(disableCnTwTranslation.asInstanceOf[js.Any])
    if (exactTerms != null) __obj.updateDynamic("exactTerms")(exactTerms.asInstanceOf[js.Any])
    if (excludeTerms != null) __obj.updateDynamic("excludeTerms")(excludeTerms.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (gl != null) __obj.updateDynamic("gl")(gl.asInstanceOf[js.Any])
    if (googleHost != null) __obj.updateDynamic("googleHost")(googleHost.asInstanceOf[js.Any])
    if (highRange != null) __obj.updateDynamic("highRange")(highRange.asInstanceOf[js.Any])
    if (hl != null) __obj.updateDynamic("hl")(hl.asInstanceOf[js.Any])
    if (hq != null) __obj.updateDynamic("hq")(hq.asInstanceOf[js.Any])
    if (imgColorType != null) __obj.updateDynamic("imgColorType")(imgColorType.asInstanceOf[js.Any])
    if (imgDominantColor != null) __obj.updateDynamic("imgDominantColor")(imgDominantColor.asInstanceOf[js.Any])
    if (imgSize != null) __obj.updateDynamic("imgSize")(imgSize.asInstanceOf[js.Any])
    if (imgType != null) __obj.updateDynamic("imgType")(imgType.asInstanceOf[js.Any])
    if (inputEncoding != null) __obj.updateDynamic("inputEncoding")(inputEncoding.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (linkSite != null) __obj.updateDynamic("linkSite")(linkSite.asInstanceOf[js.Any])
    if (lowRange != null) __obj.updateDynamic("lowRange")(lowRange.asInstanceOf[js.Any])
    if (orTerms != null) __obj.updateDynamic("orTerms")(orTerms.asInstanceOf[js.Any])
    if (outputEncoding != null) __obj.updateDynamic("outputEncoding")(outputEncoding.asInstanceOf[js.Any])
    if (relatedSite != null) __obj.updateDynamic("relatedSite")(relatedSite.asInstanceOf[js.Any])
    if (rights != null) __obj.updateDynamic("rights")(rights.asInstanceOf[js.Any])
    if (safe != null) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (searchTerms != null) __obj.updateDynamic("searchTerms")(searchTerms.asInstanceOf[js.Any])
    if (searchType != null) __obj.updateDynamic("searchType")(searchType.asInstanceOf[js.Any])
    if (siteSearch != null) __obj.updateDynamic("siteSearch")(siteSearch.asInstanceOf[js.Any])
    if (siteSearchFilter != null) __obj.updateDynamic("siteSearchFilter")(siteSearchFilter.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startPage)) __obj.updateDynamic("startPage")(startPage.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

