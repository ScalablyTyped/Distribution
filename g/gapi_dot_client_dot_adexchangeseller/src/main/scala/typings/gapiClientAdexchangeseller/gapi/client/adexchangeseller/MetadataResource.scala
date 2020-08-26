package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataResource extends js.Object {
  var dimensions: DimensionsResource = js.native
  var metrics: MetricsResource = js.native
}

object MetadataResource {
  @scala.inline
  def apply(dimensions: DimensionsResource, metrics: MetricsResource): MetadataResource = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataResource]
  }
  @scala.inline
  implicit class MetadataResourceOps[Self <: MetadataResource] (val x: Self) extends AnyVal {
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
    def setDimensions(value: DimensionsResource): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetrics(value: MetricsResource): Self = this.set("metrics", value.asInstanceOf[js.Any])
  }
  
}

