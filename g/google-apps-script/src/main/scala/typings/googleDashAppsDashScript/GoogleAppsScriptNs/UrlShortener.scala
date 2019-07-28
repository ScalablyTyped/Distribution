package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.UrlShortenerNs.CollectionNs.UrlCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.AnalyticsSnapshot
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.AnalyticsSummary
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.StringCount
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.UrlShortenerNs.SchemaNs.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlShortener extends js.Object {
  var Url: js.UndefOr[UrlCollection] = js.undefined
  // Create a new instance of AnalyticsSnapshot
  def newAnalyticsSnapshot(): AnalyticsSnapshot
  // Create a new instance of AnalyticsSummary
  def newAnalyticsSummary(): AnalyticsSummary
  // Create a new instance of StringCount
  def newStringCount(): StringCount
  // Create a new instance of Url
  def newUrl(): Url
}

object UrlShortener {
  @scala.inline
  def apply(
    newAnalyticsSnapshot: () => AnalyticsSnapshot,
    newAnalyticsSummary: () => AnalyticsSummary,
    newStringCount: () => StringCount,
    newUrl: () => Url,
    Url: UrlCollection = null
  ): UrlShortener = {
    val __obj = js.Dynamic.literal(newAnalyticsSnapshot = js.Any.fromFunction0(newAnalyticsSnapshot), newAnalyticsSummary = js.Any.fromFunction0(newAnalyticsSummary), newStringCount = js.Any.fromFunction0(newStringCount), newUrl = js.Any.fromFunction0(newUrl))
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[UrlShortener]
  }
}

