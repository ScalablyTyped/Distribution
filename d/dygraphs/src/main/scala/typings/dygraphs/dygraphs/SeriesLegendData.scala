package typings.dygraphs.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesLegendData extends js.Object {
  /**
    * Assigned or generated series color
    */
  var color: String
  /**
    * Series line dash
    */
  var dashHTML: String
  /**
    * Whether currently focused or not
    */
  var isHighlighted: Boolean
  /**
    * Whether the series line is inside the selected/zoomed region
    */
  var isVisible: Boolean
  /**
    * Assigned label to this series
    */
  var label: String
  /**
    * Generated label html for this series
    */
  var labelHTML: String
  /**
    * y value of this series
    */
  var y: Double
  /**
    * Generated html for y value
    */
  var yHTML: String
}

object SeriesLegendData {
  @scala.inline
  def apply(
    color: String,
    dashHTML: String,
    isHighlighted: Boolean,
    isVisible: Boolean,
    label: String,
    labelHTML: String,
    y: Double,
    yHTML: String
  ): SeriesLegendData = {
    val __obj = js.Dynamic.literal(color = color, dashHTML = dashHTML, isHighlighted = isHighlighted, isVisible = isVisible, label = label, labelHTML = labelHTML, y = y, yHTML = yHTML)
  
    __obj.asInstanceOf[SeriesLegendData]
  }
}

