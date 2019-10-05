package typings.gapiDotClientDotAdsense.gapi.client.adsense

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdsense.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** List the metadata for the metrics available to this AdSense account. */
  def list(request: Anon_AltFieldsKey): Request[Metadata]
}

object MetricsResource {
  @scala.inline
  def apply(list: Anon_AltFieldsKey => Request[Metadata]): MetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetricsResource]
  }
}

