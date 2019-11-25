package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait item extends js.Object {
          // the point, e.g. [0, 2]
  var dataIndex: Double
  var datapoint: js.Array[Double]
          //the index of the series
  var pageX: Double
  var pageY: Double
            // the index of the point in the data array
  var series: dataSeries
               //the series object
  var seriesIndex: Double
}

object item {
  @scala.inline
  def apply(
    dataIndex: Double,
    datapoint: js.Array[Double],
    pageX: Double,
    pageY: Double,
    series: dataSeries,
    seriesIndex: Double
  ): item = {
    val __obj = js.Dynamic.literal(dataIndex = dataIndex.asInstanceOf[js.Any], datapoint = datapoint.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[item]
  }
}

