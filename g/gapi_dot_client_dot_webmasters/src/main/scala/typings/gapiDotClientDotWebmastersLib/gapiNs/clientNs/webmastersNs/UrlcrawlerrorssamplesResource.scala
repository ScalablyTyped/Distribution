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

object UrlcrawlerrorssamplesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_AltCategoryFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[UrlCrawlErrorsSample]
    ],
    list: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_AltCategoryFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[UrlCrawlErrorsSamplesListResponse]
    ],
    markAsFixed: js.Function1[
      gapiDotClientDotWebmastersLib.Anon_AltCategoryFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): UrlcrawlerrorssamplesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("markAsFixed")(markAsFixed)
    __obj.asInstanceOf[UrlcrawlerrorssamplesResource]
  }
}

