package typings
package gapiDotClientDotCustomsearchLib.gapiNs.clientNs.customsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var cr: js.UndefOr[java.lang.String] = js.undefined
  var cx: js.UndefOr[java.lang.String] = js.undefined
  var dateRestrict: js.UndefOr[java.lang.String] = js.undefined
  var disableCnTwTranslation: js.UndefOr[java.lang.String] = js.undefined
  var exactTerms: js.UndefOr[java.lang.String] = js.undefined
  var excludeTerms: js.UndefOr[java.lang.String] = js.undefined
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var gl: js.UndefOr[java.lang.String] = js.undefined
  var googleHost: js.UndefOr[java.lang.String] = js.undefined
  var highRange: js.UndefOr[java.lang.String] = js.undefined
  var hl: js.UndefOr[java.lang.String] = js.undefined
  var hq: js.UndefOr[java.lang.String] = js.undefined
  var imgColorType: js.UndefOr[java.lang.String] = js.undefined
  var imgDominantColor: js.UndefOr[java.lang.String] = js.undefined
  var imgSize: js.UndefOr[java.lang.String] = js.undefined
  var imgType: js.UndefOr[java.lang.String] = js.undefined
  var inputEncoding: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var linkSite: js.UndefOr[java.lang.String] = js.undefined
  var lowRange: js.UndefOr[java.lang.String] = js.undefined
  var orTerms: js.UndefOr[java.lang.String] = js.undefined
  var outputEncoding: js.UndefOr[java.lang.String] = js.undefined
  var relatedSite: js.UndefOr[java.lang.String] = js.undefined
  var rights: js.UndefOr[java.lang.String] = js.undefined
  var safe: js.UndefOr[java.lang.String] = js.undefined
  var searchTerms: js.UndefOr[java.lang.String] = js.undefined
  var searchType: js.UndefOr[java.lang.String] = js.undefined
  var siteSearch: js.UndefOr[java.lang.String] = js.undefined
  var siteSearchFilter: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[java.lang.String] = js.undefined
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  var startPage: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var totalResults: js.UndefOr[java.lang.String] = js.undefined
}

object Query {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    cr: java.lang.String = null,
    cx: java.lang.String = null,
    dateRestrict: java.lang.String = null,
    disableCnTwTranslation: java.lang.String = null,
    exactTerms: java.lang.String = null,
    excludeTerms: java.lang.String = null,
    fileType: java.lang.String = null,
    filter: java.lang.String = null,
    gl: java.lang.String = null,
    googleHost: java.lang.String = null,
    highRange: java.lang.String = null,
    hl: java.lang.String = null,
    hq: java.lang.String = null,
    imgColorType: java.lang.String = null,
    imgDominantColor: java.lang.String = null,
    imgSize: java.lang.String = null,
    imgType: java.lang.String = null,
    inputEncoding: java.lang.String = null,
    language: java.lang.String = null,
    linkSite: java.lang.String = null,
    lowRange: java.lang.String = null,
    orTerms: java.lang.String = null,
    outputEncoding: java.lang.String = null,
    relatedSite: java.lang.String = null,
    rights: java.lang.String = null,
    safe: java.lang.String = null,
    searchTerms: java.lang.String = null,
    searchType: java.lang.String = null,
    siteSearch: java.lang.String = null,
    siteSearchFilter: java.lang.String = null,
    sort: java.lang.String = null,
    startIndex: scala.Int | scala.Double = null,
    startPage: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    totalResults: java.lang.String = null
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

