package typings.gapiDotClientDotAdexchangeseller.gapi.client.adexchangeseller

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
    val __obj = js.Dynamic.literal(dimensions = dimensions, metrics = metrics)
  
    __obj.asInstanceOf[MetadataResource]
  }
}

