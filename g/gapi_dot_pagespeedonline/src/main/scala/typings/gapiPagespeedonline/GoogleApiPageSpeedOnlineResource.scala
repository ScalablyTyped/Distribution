package typings.gapiPagespeedonline

import typings.gapiPagespeedonline.anon.CssResponsebytes
import typings.gapiPagespeedonline.anon.Locale
import typings.gapiPagespeedonline.anon.Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiPageSpeedOnlineResource extends js.Object {
  /**
    * Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server.
    */
  var formattedResults: Locale
  /**
    * Canonicalized and final URL for the document, after following page redirects (if any).
    */
  var id: String
  /**
    * List of rules that were specified in the request, but which the server did not know how to instantiate.
    */
  var invalidRules: js.Array[String]
  /**
    * Kind of result.
    */
  var kind: String
  /**
    * Summary statistics for the page, such as number of JavaScript bytes, number of HTML bytes, etc.
    */
  var pageStats: CssResponsebytes
  /**
    * Response code for the document. 200 indicates a normal page load. 4xx/5xx indicates an error.
    */
  var responseCode: Double
  /**
    * The PageSpeed Score (0-100), which indicates how much faster a page could be. A high score indicates little room for improvement, while a lower score indicates more room for improvement.
    */
  var score: Double
  /**
    * Title of the page, as displayed in the browser's title bar.
    */
  var title: String
  /**
    * The version of the PageSpeed SDK used to generate these results.
    */
  var version: Major
}

object GoogleApiPageSpeedOnlineResource {
  @scala.inline
  def apply(
    formattedResults: Locale,
    id: String,
    invalidRules: js.Array[String],
    kind: String,
    pageStats: CssResponsebytes,
    responseCode: Double,
    score: Double,
    title: String,
    version: Major
  ): GoogleApiPageSpeedOnlineResource = {
    val __obj = js.Dynamic.literal(formattedResults = formattedResults.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invalidRules = invalidRules.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageStats = pageStats.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiPageSpeedOnlineResource]
  }
}

