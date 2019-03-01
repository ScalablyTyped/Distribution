package typings
package gapiDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiPageSpeedOnlineResource extends js.Object {
  /**
    * Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server.
    */
  var formattedResults: Anon_Locale
  /**
    * Canonicalized and final URL for the document, after following page redirects (if any).
    */
  var id: java.lang.String
  /**
    * List of rules that were specified in the request, but which the server did not know how to instantiate.
    */
  var invalidRules: js.Array[java.lang.String]
  /**
    * Kind of result.
    */
  var kind: java.lang.String
  /**
    * Summary statistics for the page, such as number of JavaScript bytes, number of HTML bytes, etc.
    */
  var pageStats: Anon_CssResponsebytes
  /**
    * Response code for the document. 200 indicates a normal page load. 4xx/5xx indicates an error.
    */
  var responseCode: scala.Double
  /**
    * The PageSpeed Score (0-100), which indicates how much faster a page could be. A high score indicates little room for improvement, while a lower score indicates more room for improvement.
    */
  var score: scala.Double
  /**
    * Title of the page, as displayed in the browser's title bar.
    */
  var title: java.lang.String
  /**
    * The version of the PageSpeed SDK used to generate these results.
    */
  var version: Anon_Major
}

object GoogleApiPageSpeedOnlineResource {
  @scala.inline
  def apply(
    formattedResults: Anon_Locale,
    id: java.lang.String,
    invalidRules: js.Array[java.lang.String],
    kind: java.lang.String,
    pageStats: Anon_CssResponsebytes,
    responseCode: scala.Double,
    score: scala.Double,
    title: java.lang.String,
    version: Anon_Major
  ): GoogleApiPageSpeedOnlineResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formattedResults")(formattedResults)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("invalidRules")(invalidRules)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("pageStats")(pageStats)
    __obj.updateDynamic("responseCode")(responseCode)
    __obj.updateDynamic("score")(score)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GoogleApiPageSpeedOnlineResource]
  }
}

