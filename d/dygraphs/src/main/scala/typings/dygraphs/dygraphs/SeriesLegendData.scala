package typings.dygraphs.dygraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesLegendData extends js.Object {
  
  /**
    * Assigned or generated series color
    */
  var color: String = js.native
  
  /**
    * Series line dash
    */
  var dashHTML: String = js.native
  
  /**
    * Whether currently focused or not
    */
  var isHighlighted: Boolean = js.native
  
  /**
    * Whether the series line is inside the selected/zoomed region
    */
  var isVisible: Boolean = js.native
  
  /**
    * Assigned label to this series
    */
  var label: String = js.native
  
  /**
    * Generated label html for this series
    */
  var labelHTML: String = js.native
  
  /**
    * y value of this series
    */
  var y: Double = js.native
  
  /**
    * Generated html for y value
    */
  var yHTML: String = js.native
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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dashHTML = dashHTML.asInstanceOf[js.Any], isHighlighted = isHighlighted.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelHTML = labelHTML.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yHTML = yHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLegendData]
  }
  
  @scala.inline
  implicit class SeriesLegendDataOps[Self <: SeriesLegendData] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashHTML(value: String): Self = this.set("dashHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHighlighted(value: Boolean): Self = this.set("isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHTML(value: String): Self = this.set("labelHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYHTML(value: String): Self = this.set("yHTML", value.asInstanceOf[js.Any])
  }
}
