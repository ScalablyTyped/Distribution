package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val searchanalytics: gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs.SearchanalyticsResource = js.native
  val sitemaps: gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs.SitemapsResource = js.native
  val sites: gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs.SitesResource = js.native
  val urlcrawlerrorscounts: gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs.UrlcrawlerrorscountsResource = js.native
  val urlcrawlerrorssamples: gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs.UrlcrawlerrorssamplesResource = js.native
  /** Load Search Console API v3 */
  def load(
    name: gapiDotClientDotWebmastersLib.gapiDotClientDotWebmastersLibStrings.webmasters,
    version: gapiDotClientDotWebmastersLib.gapiDotClientDotWebmastersLibStrings.v3
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotWebmastersLib.gapiDotClientDotWebmastersLibStrings.webmasters,
    version: gapiDotClientDotWebmastersLib.gapiDotClientDotWebmastersLibStrings.v3,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

