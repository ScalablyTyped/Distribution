package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dimensions")(dimensions)
    __obj.updateDynamic("metrics")(metrics)
    __obj.asInstanceOf[MetadataResource]
  }
}

