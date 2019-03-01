package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoChartRegionClickEvent extends js.Object {
  var region: java.lang.String
}

object GeoChartRegionClickEvent {
  @scala.inline
  def apply(region: java.lang.String): GeoChartRegionClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GeoChartRegionClickEvent]
  }
}

