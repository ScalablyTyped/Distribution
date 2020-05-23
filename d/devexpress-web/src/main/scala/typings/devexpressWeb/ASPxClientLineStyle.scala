package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines line style settings.
  */
trait ASPxClientLineStyle extends ASPxClientWebChartElement {
  /**
    * Gets the dash style used to paint the line.
    */
  var dashStyle: String
  /**
    * Returns the join style for the ends of consecutive lines.
    */
  var lineJoin: String
  /**
    * Gets the thickness that corresponds to the value of the current ASPxClientLineStyle object.
    */
  var thickness: Double
}

object ASPxClientLineStyle {
  @scala.inline
  def apply(chart: ASPxClientWebChart, dashStyle: String, lineJoin: String, thickness: Double): ASPxClientLineStyle = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dashStyle = dashStyle.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLineStyle]
  }
}

