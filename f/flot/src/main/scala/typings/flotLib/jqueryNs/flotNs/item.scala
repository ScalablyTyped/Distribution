package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait item extends js.Object {
          // the point, e.g. [0, 2]
  var dataIndex: scala.Double
  var datapoint: js.Array[scala.Double]
          //the index of the series
  var pageX: scala.Double
  var pageY: scala.Double
            // the index of the point in the data array
  var series: dataSeries
               //the series object
  var seriesIndex: scala.Double
}

object item {
  @scala.inline
  def apply(
    dataIndex: scala.Double,
    datapoint: js.Array[scala.Double],
    pageX: scala.Double,
    pageY: scala.Double,
    series: dataSeries,
    seriesIndex: scala.Double
  ): item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataIndex")(dataIndex)
    __obj.updateDynamic("datapoint")(datapoint)
    __obj.updateDynamic("pageX")(pageX)
    __obj.updateDynamic("pageY")(pageY)
    __obj.updateDynamic("series")(series)
    __obj.updateDynamic("seriesIndex")(seriesIndex)
    __obj.asInstanceOf[item]
  }
}

