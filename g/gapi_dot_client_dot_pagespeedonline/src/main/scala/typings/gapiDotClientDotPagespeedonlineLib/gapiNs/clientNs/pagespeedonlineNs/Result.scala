package typings
package gapiDotClientDotPagespeedonlineLib.gapiNs.clientNs.pagespeedonlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Result extends js.Object {
  /** Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server. */
  var formattedResults: js.UndefOr[gapiDotClientDotPagespeedonlineLib.Anon_RuleResults] = js.undefined
  /** Canonicalized and final URL for the document, after following page redirects (if any). */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** List of rules that were specified in the request, but which the server did not know how to instantiate. */
  var invalidRules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Kind of result. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Summary statistics for the page, such as number of JavaScript bytes, number of HTML bytes, etc. */
  var pageStats: js.UndefOr[gapiDotClientDotPagespeedonlineLib.Anon_HtmlResponseBytes] = js.undefined
  /** Response code for the document. 200 indicates a normal page load. 4xx/5xx indicates an error. */
  var responseCode: js.UndefOr[scala.Double] = js.undefined
  /** A map with one entry for each rule group in these results. */
  var ruleGroups: js.UndefOr[stdLib.Record[java.lang.String, gapiDotClientDotPagespeedonlineLib.Anon_Score]] = js.undefined
  /** Base64-encoded screenshot of the page that was analyzed. */
  var screenshot: js.UndefOr[PagespeedApiImageV2] = js.undefined
  /** Title of the page, as displayed in the browser's title bar. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The version of PageSpeed used to generate these results. */
  var version: js.UndefOr[gapiDotClientDotPagespeedonlineLib.Anon_Minor] = js.undefined
}

