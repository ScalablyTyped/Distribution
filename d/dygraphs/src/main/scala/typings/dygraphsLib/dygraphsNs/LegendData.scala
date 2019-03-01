package typings
package dygraphsLib.dygraphsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendData extends js.Object {
  /**
    * Dygraph object for this graph
    */
  var dygraph: dygraphsLib.Dygraph
  /**
    * Series data for the highlighted points
    */
  var series: js.Array[SeriesLegendData]
  /**
    * x value of highlighted points
    */
  var x: scala.Double
  /**
    * Generated HTML for x value
    */
  var xHTML: java.lang.String
}

object LegendData {
  @scala.inline
  def apply(
    dygraph: dygraphsLib.Dygraph,
    series: js.Array[SeriesLegendData],
    x: scala.Double,
    xHTML: java.lang.String
  ): LegendData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dygraph")(dygraph)
    __obj.updateDynamic("series")(series)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("xHTML")(xHTML)
    __obj.asInstanceOf[LegendData]
  }
}

