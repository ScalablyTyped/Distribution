package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlCrawlErrorCountsPerType extends js.Object {
  /** The crawl error type. */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /** The error count entries time series. */
  var entries: js.UndefOr[js.Array[UrlCrawlErrorCount]] = js.undefined
  /** The general type of Googlebot that made the request (see list of Googlebot user-agents for the user-agents used). */
  var platform: js.UndefOr[java.lang.String] = js.undefined
}

