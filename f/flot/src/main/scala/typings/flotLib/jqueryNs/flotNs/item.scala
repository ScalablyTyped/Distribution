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
    val __obj = js.Dynamic.literal(dataIndex = dataIndex, datapoint = datapoint, pageX = pageX, pageY = pageY, series = series, seriesIndex = seriesIndex)
  
    __obj.asInstanceOf[item]
  }
}

