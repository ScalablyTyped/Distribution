package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.FilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImpressionMetricsResource extends js.Object {
  /** Lists all metrics that are measured in terms of number of impressions. */
  def list(request: FilterSetId): Request[ListImpressionMetricsResponse] = js.native
}

object ImpressionMetricsResource {
  @scala.inline
  def apply(list: FilterSetId => Request[ListImpressionMetricsResponse]): ImpressionMetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ImpressionMetricsResource]
  }
  @scala.inline
  implicit class ImpressionMetricsResourceOps[Self <: ImpressionMetricsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setList(value: FilterSetId => Request[ListImpressionMetricsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

