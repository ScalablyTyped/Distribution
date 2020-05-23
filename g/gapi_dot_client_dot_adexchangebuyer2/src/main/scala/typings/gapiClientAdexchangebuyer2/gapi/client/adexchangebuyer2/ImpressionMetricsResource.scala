package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.FilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImpressionMetricsResource extends js.Object {
  /** Lists all metrics that are measured in terms of number of impressions. */
  def list(request: FilterSetId): Request[ListImpressionMetricsResponse]
}

object ImpressionMetricsResource {
  @scala.inline
  def apply(list: FilterSetId => Request[ListImpressionMetricsResponse]): ImpressionMetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ImpressionMetricsResource]
  }
}

