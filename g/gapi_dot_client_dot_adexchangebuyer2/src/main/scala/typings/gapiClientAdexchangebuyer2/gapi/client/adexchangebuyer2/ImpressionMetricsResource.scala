package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImpressionMetricsResource extends js.Object {
  /** Lists all metrics that are measured in terms of number of impressions. */
  def list(request: AnonFilterSetId): Request_[ListImpressionMetricsResponse]
}

object ImpressionMetricsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => Request_[ListImpressionMetricsResponse]): ImpressionMetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ImpressionMetricsResource]
  }
}

