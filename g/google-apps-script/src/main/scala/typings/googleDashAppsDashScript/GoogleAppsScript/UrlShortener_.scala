package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Collection.UrlCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Schema.AnalyticsSnapshot
import typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Schema.AnalyticsSummary
import typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Schema.StringCount
import typings.googleDashAppsDashScript.GoogleAppsScript.UrlShortener.Schema.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("UrlShortener")
trait UrlShortener_ extends js.Object {
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

object UrlShortener_ {
  @scala.inline
  def apply(
    newAnalyticsSnapshot: () => AnalyticsSnapshot,
    newAnalyticsSummary: () => AnalyticsSummary,
    newStringCount: () => StringCount,
    newUrl: () => Url,
    Url: UrlCollection = null
  ): UrlShortener_ = {
    val __obj = js.Dynamic.literal(newAnalyticsSnapshot = js.Any.fromFunction0(newAnalyticsSnapshot), newAnalyticsSummary = js.Any.fromFunction0(newAnalyticsSummary), newStringCount = js.Any.fromFunction0(newStringCount), newUrl = js.Any.fromFunction0(newUrl))
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlShortener_]
  }
}

