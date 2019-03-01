package typings
package gapiDotClientDotPagespeedonlineLib.gapiNs.clientNs.pagespeedonlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /** Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server. */
  var formattedResults: js.UndefOr[gapiDotClientDotPagespeedonlineLib.Anon_Locale] = js.undefined
  /** Canonicalized and final URL for the document, after following page redirects (if any). */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** List of rules that were specified in the request, but which the server did not know how to instantiate. */
  var invalidRules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Kind of result. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Summary statistics for the page, such as number of JavaScript bytes, number of HTML bytes, etc. */
  var pageStats: js.UndefOr[gapiDotClientDotPagespeedonlineLib.Anon_CssResponseBytes] = js.undefined
  /** Response code for the document. 200 indicates a normal page load. 4xx/5xx indicates an error. */
  var responseCode: js.UndefOr[scala.Double] = js.undefined
  /** A map with one entry for each rule group in these results. */
  var ruleGroups: js.UndefOr[stdLib.Record[java.lang.String, gapiDotClientDotPagespeedonlineLib.Anon_Score]] = js.undefined
  /** Base64-encoded screenshot of the page that was analyzed. */
  var screenshot: js.UndefOr[PagespeedApiImageV2] = js.undefined
  /** Title of the page, as displayed in the browser's title bar. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The version of PageSpeed used to generate these results. */
  var version: js.UndefOr[gapiDotClientDotPagespeedonlineLib.Anon_Major] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    formattedResults: gapiDotClientDotPagespeedonlineLib.Anon_Locale = null,
    id: java.lang.String = null,
    invalidRules: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    pageStats: gapiDotClientDotPagespeedonlineLib.Anon_CssResponseBytes = null,
    responseCode: scala.Int | scala.Double = null,
    ruleGroups: stdLib.Record[java.lang.String, gapiDotClientDotPagespeedonlineLib.Anon_Score] = null,
    screenshot: PagespeedApiImageV2 = null,
    title: java.lang.String = null,
    version: gapiDotClientDotPagespeedonlineLib.Anon_Major = null
  ): Result = {
    val __obj = js.Dynamic.literal()
    if (formattedResults != null) __obj.updateDynamic("formattedResults")(formattedResults)
    if (id != null) __obj.updateDynamic("id")(id)
    if (invalidRules != null) __obj.updateDynamic("invalidRules")(invalidRules)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (pageStats != null) __obj.updateDynamic("pageStats")(pageStats)
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    if (ruleGroups != null) __obj.updateDynamic("ruleGroups")(ruleGroups)
    if (screenshot != null) __obj.updateDynamic("screenshot")(screenshot)
    if (title != null) __obj.updateDynamic("title")(title)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Result]
  }
}

