package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoChartRegionClickEvent extends js.Object {
  var region: String
}

object GeoChartRegionClickEvent {
  @scala.inline
  def apply(region: String): GeoChartRegionClickEvent = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeoChartRegionClickEvent]
  }
}

