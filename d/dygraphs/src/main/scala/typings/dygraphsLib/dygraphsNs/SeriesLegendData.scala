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
    val __obj = js.Dynamic.literal(color = color, dashHTML = dashHTML, isHighlighted = isHighlighted, isVisible = isVisible, label = label, labelHTML = labelHTML, y = y, yHTML = yHTML)
  
    __obj.asInstanceOf[SeriesLegendData]
  }
}

