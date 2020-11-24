package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidRangeColor extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueValueText, String]] = js.native
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  
  var invalidRangeColor: js.UndefOr[String] = js.native
  
  var paddingLeftRight: js.UndefOr[Double] = js.native
  
  var paddingTopBottom: js.UndefOr[Double] = js.native
  
  var placeholderHeight: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object InvalidRangeColor {
  
  @scala.inline
  def apply(): InvalidRangeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvalidRangeColor]
  }
  
  @scala.inline
  implicit class InvalidRangeColorOps[Self <: InvalidRangeColor] (val x: Self) extends AnyVal {
    
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
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* scaleValue */ ValueValueText => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInvalidRangeColor(value: String): Self = this.set("invalidRangeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidRangeColor: Self = this.set("invalidRangeColor", js.undefined)
    
    @scala.inline
    def setPaddingLeftRight(value: Double): Self = this.set("paddingLeftRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingLeftRight: Self = this.set("paddingLeftRight", js.undefined)
    
    @scala.inline
    def setPaddingTopBottom(value: Double): Self = this.set("paddingTopBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingTopBottom: Self = this.set("paddingTopBottom", js.undefined)
    
    @scala.inline
    def setPlaceholderHeight(value: Double): Self = this.set("placeholderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderHeight: Self = this.set("placeholderHeight", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
