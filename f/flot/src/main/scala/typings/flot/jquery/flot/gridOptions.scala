package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait gridOptions extends js.Object {
  
  var aboveData: js.UndefOr[Boolean] = js.native
  
  var autoHighlight: js.UndefOr[Boolean] = js.native
  
  var axisMargin: js.UndefOr[Double] = js.native
  
                  // color
  var backgroundColor: js.UndefOr[js.Any] = js.native
  
            // number or width object
  var borderColor: js.UndefOr[js.Any] = js.native
  
               //array of markings or (fn: axes -> array of markings)
  var borderWidth: js.UndefOr[js.Any] = js.native
  
         // or null
  var clickable: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[js.Any] = js.native
  
  var hoverable: js.UndefOr[Boolean] = js.native
  
                  // number or margin object
  var labelMargin: js.UndefOr[Double] = js.native
  
        //color/gradient or null
  var margin: js.UndefOr[js.Any] = js.native
  
  var markings: js.UndefOr[js.Any] = js.native
  
  var markingsColor: js.UndefOr[js.Any] = js.native
  
  var markingsLineWidth: js.UndefOr[Double] = js.native
  
            // color or null
  var minBorderMargin: js.UndefOr[Double] = js.native
  
  var mouseActiveRadius: js.UndefOr[Double] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var tickColor: js.UndefOr[js.Any] = js.native
}
object gridOptions {
  
  @scala.inline
  def apply(): gridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gridOptions]
  }
  
  @scala.inline
  implicit class gridOptionsOps[Self <: gridOptions] (val x: Self) extends AnyVal {
    
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
    def setAboveData(value: Boolean): Self = this.set("aboveData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAboveData: Self = this.set("aboveData", js.undefined)
    
    @scala.inline
    def setAutoHighlight(value: Boolean): Self = this.set("autoHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHighlight: Self = this.set("autoHighlight", js.undefined)
    
    @scala.inline
    def setAxisMargin(value: Double): Self = this.set("axisMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisMargin: Self = this.set("axisMargin", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: js.Any): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: js.Any): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: js.Any): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    
    @scala.inline
    def setLabelMargin(value: Double): Self = this.set("labelMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelMargin: Self = this.set("labelMargin", js.undefined)
    
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarkings(value: js.Any): Self = this.set("markings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkings: Self = this.set("markings", js.undefined)
    
    @scala.inline
    def setMarkingsColor(value: js.Any): Self = this.set("markingsColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkingsColor: Self = this.set("markingsColor", js.undefined)
    
    @scala.inline
    def setMarkingsLineWidth(value: Double): Self = this.set("markingsLineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkingsLineWidth: Self = this.set("markingsLineWidth", js.undefined)
    
    @scala.inline
    def setMinBorderMargin(value: Double): Self = this.set("minBorderMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinBorderMargin: Self = this.set("minBorderMargin", js.undefined)
    
    @scala.inline
    def setMouseActiveRadius(value: Double): Self = this.set("mouseActiveRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseActiveRadius: Self = this.set("mouseActiveRadius", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTickColor(value: js.Any): Self = this.set("tickColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickColor: Self = this.set("tickColor", js.undefined)
  }
}
