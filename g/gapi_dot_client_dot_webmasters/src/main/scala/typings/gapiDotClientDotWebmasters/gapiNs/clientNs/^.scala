package typings.gapiDotClientDotWebmasters.gapiNs.clientNs

import typings.gapiDotClientDotWebmasters.gapiDotClientDotWebmastersStrings.v3
import typings.gapiDotClientDotWebmasters.gapiDotClientDotWebmastersStrings.webmasters
import typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs.SearchanalyticsResource
import typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs.SitemapsResource
import typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs.SitesResource
import typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs.UrlcrawlerrorscountsResource
import typings.gapiDotClientDotWebmasters.gapiNs.clientNs.webmastersNs.UrlcrawlerrorssamplesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val searchanalytics: SearchanalyticsResource = js.native
  val sitemaps: SitemapsResource = js.native
  val sites: SitesResource = js.native
  val urlcrawlerrorscounts: UrlcrawlerrorscountsResource = js.native
  val urlcrawlerrorssamples: UrlcrawlerrorssamplesResource = js.native
  /** Load Search Console API v3 */
  def load(name: webmasters, version: v3): js.Thenable[Unit] = js.native
  def load(name: webmasters, version: v3, callback: js.Function0[_]): Unit = js.native
}

