package typings.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typings.gapiClientPagespeedonline.anon.CssResponseBytes
import typings.gapiClientPagespeedonline.anon.Locale
import typings.gapiClientPagespeedonline.anon.Major
import typings.gapiClientPagespeedonline.anon.Score
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /** Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server. */
  var formattedResults: js.UndefOr[Locale] = js.undefined
  /** Canonicalized and final URL for the document, after following page redirects (if any). */
  var id: js.UndefOr[String] = js.undefined
  /** List of rules that were specified in the request, but which the server did not know how to instantiate. */
  var invalidRules: js.UndefOr[js.Array[String]] = js.undefined
  /** Kind of result. */
  var kind: js.UndefOr[String] = js.undefined
  /** Summary statistics for the page, such as number of JavaScript bytes, number of HTML bytes, etc. */
  var pageStats: js.UndefOr[CssResponseBytes] = js.undefined
  /** Response code for the document. 200 indicates a normal page load. 4xx/5xx indicates an error. */
  var responseCode: js.UndefOr[Double] = js.undefined
  /** A map with one entry for each rule group in these results. */
  var ruleGroups: js.UndefOr[Record[String, Score]] = js.undefined
  /** Base64-encoded screenshot of the page that was analyzed. */
  var screenshot: js.UndefOr[PagespeedApiImageV2] = js.undefined
  /** Title of the page, as displayed in the browser's title bar. */
  var title: js.UndefOr[String] = js.undefined
  /** The version of PageSpeed used to generate these results. */
  var version: js.UndefOr[Major] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    formattedResults: Locale = null,
    id: String = null,
    invalidRules: js.Array[String] = null,
    kind: String = null,
    pageStats: CssResponseBytes = null,
    responseCode: js.UndefOr[Double] = js.undefined,
    ruleGroups: Record[String, Score] = null,
    screenshot: PagespeedApiImageV2 = null,
    title: String = null,
    version: Major = null
  ): Result = {
    val __obj = js.Dynamic.literal()
    if (formattedResults != null) __obj.updateDynamic("formattedResults")(formattedResults.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invalidRules != null) __obj.updateDynamic("invalidRules")(invalidRules.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pageStats != null) __obj.updateDynamic("pageStats")(pageStats.asInstanceOf[js.Any])
    if (!js.isUndefined(responseCode)) __obj.updateDynamic("responseCode")(responseCode.get.asInstanceOf[js.Any])
    if (ruleGroups != null) __obj.updateDynamic("ruleGroups")(ruleGroups.asInstanceOf[js.Any])
    if (screenshot != null) __obj.updateDynamic("screenshot")(screenshot.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

