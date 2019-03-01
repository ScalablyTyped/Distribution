package typings
package dygraphsLib.dygraphsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesLegendData extends js.Object {
  /**
    * Assigned or generated series color
    */
  var color: java.lang.String
  /**
    * Series line dash
    */
  var dashHTML: java.lang.String
  /**
    * Whether currently focused or not
    */
  var isHighlighted: scala.Boolean
  /**
    * Whether the series line is inside the selected/zoomed region
    */
  var isVisible: scala.Boolean
  /**
    * Assigned label to this series
    */
  var label: java.lang.String
  /**
    * Generated label html for this series
    */
  var labelHTML: java.lang.String
  /**
    * y value of this series
    */
  var y: scala.Double
  /**
    * Generated html for y value
    */
  var yHTML: java.lang.String
}

object SeriesLegendData {
  @scala.inline
  def apply(
    color: java.lang.String,
    dashHTML: java.lang.String,
    isHighlighted: scala.Boolean,
    isVisible: scala.Boolean,
    label: java.lang.String,
    labelHTML: java.lang.String,
    y: scala.Double,
    yHTML: java.lang.String
  ): SeriesLegendData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("dashHTML")(dashHTML)
    __obj.updateDynamic("isHighlighted")(isHighlighted)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("labelHTML")(labelHTML)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("yHTML")(yHTML)
    __obj.asInstanceOf[SeriesLegendData]
  }
}

