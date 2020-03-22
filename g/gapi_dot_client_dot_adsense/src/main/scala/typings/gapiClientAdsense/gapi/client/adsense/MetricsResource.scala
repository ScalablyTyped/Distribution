package typings.gapiClientAdsense.gapi.client.adsense

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdsense.AnonFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** List the metadata for the metrics available to this AdSense account. */
  def list(request: AnonFieldsKey): Request_[Metadata]
}

object MetricsResource {
  @scala.inline
  def apply(list: AnonFieldsKey => Request_[Metadata]): MetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetricsResource]
  }
}

