package typings.gapiClientAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataResource extends js.Object {
  var dimensions: DimensionsResource
  var metrics: MetricsResource
}

object MetadataResource {
  @scala.inline
  def apply(dimensions: DimensionsResource, metrics: MetricsResource): MetadataResource = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataResource]
  }
}

