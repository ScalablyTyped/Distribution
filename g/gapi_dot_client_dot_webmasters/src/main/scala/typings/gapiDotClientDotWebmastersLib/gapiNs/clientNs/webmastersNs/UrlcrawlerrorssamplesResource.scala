package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlcrawlerrorssamplesResource extends js.Object {
  /** Retrieves details about crawl errors for a site's sample URL. */
  def get(request: gapiDotClientDotWebmastersLib.Anon_AltCategoryFields): gapiDotClientLib.gapiNs.clientNs.Request[UrlCrawlErrorsSample]
  /** Lists a site's sample URLs for the specified crawl error category and platform. */
  def list(request: gapiDotClientDotWebmastersLib.Anon_AltCategoryFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[UrlCrawlErrorsSamplesListResponse]
  /** Marks the provided site's sample URL as fixed, and removes it from the samples list. */
  def markAsFixed(request: gapiDotClientDotWebmastersLib.Anon_AltCategoryFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

