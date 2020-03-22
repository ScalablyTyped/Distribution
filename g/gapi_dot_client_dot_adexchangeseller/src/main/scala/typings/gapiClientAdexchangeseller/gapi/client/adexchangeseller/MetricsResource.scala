package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangeseller.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** List the metadata for the metrics available to this AdExchange account. */
  def list(request: AnonKey): Request_[Metadata]
}

object MetricsResource {
  @scala.inline
  def apply(list: AnonKey => Request_[Metadata]): MetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetricsResource]
  }
}

