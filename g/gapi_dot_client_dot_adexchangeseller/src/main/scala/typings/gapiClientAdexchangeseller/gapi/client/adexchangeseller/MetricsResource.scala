package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangeseller.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** List the metadata for the metrics available to this AdExchange account. */
  def list(request: Key): Request[Metadata]
}

object MetricsResource {
  @scala.inline
  def apply(list: Key => Request[Metadata]): MetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MetricsResource]
  }
}

