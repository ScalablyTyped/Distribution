package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines line style settings.
  */
@js.native
trait ASPxClientLineStyle extends ASPxClientWebChartElement {
  /**
    * Gets the dash style used to paint the line.
    */
  var dashStyle: String = js.native
  /**
    * Returns the join style for the ends of consecutive lines.
    */
  var lineJoin: String = js.native
  /**
    * Gets the thickness that corresponds to the value of the current ASPxClientLineStyle object.
    */
  var thickness: Double = js.native
}

object ASPxClientLineStyle {
  @scala.inline
  def apply(chart: ASPxClientWebChart, dashStyle: String, lineJoin: String, thickness: Double): ASPxClientLineStyle = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dashStyle = dashStyle.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientLineStyle]
  }
  @scala.inline
  implicit class ASPxClientLineStyleOps[Self <: ASPxClientLineStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDashStyle(value: String): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineJoin(value: String): Self = this.set("lineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
  }
  
}

