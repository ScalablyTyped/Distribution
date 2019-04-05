package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlShortener extends js.Object {
  var Url: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.CollectionNs.UrlCollection
  ] = js.undefined
  // Create a new instance of AnalyticsSnapshot
  def newAnalyticsSnapshot(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.AnalyticsSnapshot
  // Create a new instance of AnalyticsSummary
  def newAnalyticsSummary(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.AnalyticsSummary
  // Create a new instance of StringCount
  def newStringCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.StringCount
  // Create a new instance of Url
  def newUrl(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.Url
}

object UrlShortener {
  @scala.inline
  def apply(
    newAnalyticsSnapshot: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.AnalyticsSnapshot,
    newAnalyticsSummary: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.AnalyticsSummary,
    newStringCount: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.StringCount,
    newUrl: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.Url,
    Url: googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlShortenerNs.CollectionNs.UrlCollection = null
  ): UrlShortener = {
    val __obj = js.Dynamic.literal(newAnalyticsSnapshot = js.Any.fromFunction0(newAnalyticsSnapshot), newAnalyticsSummary = js.Any.fromFunction0(newAnalyticsSummary), newStringCount = js.Any.fromFunction0(newStringCount), newUrl = js.Any.fromFunction0(newUrl))
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[UrlShortener]
  }
}

