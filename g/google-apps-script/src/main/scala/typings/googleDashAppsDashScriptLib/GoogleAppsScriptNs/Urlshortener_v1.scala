package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Urlshortener_v1 extends js.Object {
  var Url: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.CollectionNs.UrlCollection
  ] = js.undefined
  // Create a new instance of AnalyticsSnapshot
  def newAnalyticsSnapshot(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs.AnalyticsSnapshot
  // Create a new instance of AnalyticsSummary
  def newAnalyticsSummary(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs.AnalyticsSummary
  // Create a new instance of StringCount
  def newStringCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs.StringCount
  // Create a new instance of Url
  def newUrl(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs.Url
}

object Urlshortener_v1 {
  @scala.inline
  def apply(
    newAnalyticsSnapshot: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs.AnalyticsSnapshot,
    newAnalyticsSummary: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs.AnalyticsSummary,
    newStringCount: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs.StringCount,
    newUrl: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.SchemaNs.Url,
    Url: googleDashAppsDashScriptLib.GoogleAppsScriptNs.UrlshortenerUnderscoreV1Ns.CollectionNs.UrlCollection = null
  ): Urlshortener_v1 = {
    val __obj = js.Dynamic.literal(newAnalyticsSnapshot = js.Any.fromFunction0(newAnalyticsSnapshot), newAnalyticsSummary = js.Any.fromFunction0(newAnalyticsSummary), newStringCount = js.Any.fromFunction0(newStringCount), newUrl = js.Any.fromFunction0(newUrl))
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[Urlshortener_v1]
  }
}

