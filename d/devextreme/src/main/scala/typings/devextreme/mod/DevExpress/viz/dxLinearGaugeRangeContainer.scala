package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Start
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxLinearGaugeRangeContainer extends BaseGaugeRangeContainer {
  
  /**
    * [descr:dxLinearGauge.Options.rangeContainer.horizontalOrientation]
    */
  var horizontalOrientation: js.UndefOr[center | left | right] = js.native
  
  /**
    * [descr:dxLinearGauge.Options.rangeContainer.verticalOrientation]
    */
  var verticalOrientation: js.UndefOr[bottom | center | top] = js.native
  
  /**
    * [descr:dxLinearGauge.Options.rangeContainer.width]
    */
  var width: js.UndefOr[Start | Double] = js.native
}
object dxLinearGaugeRangeContainer {
  
  @scala.inline
  def apply(): dxLinearGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeRangeContainer]
  }
  
  @scala.inline
  implicit class dxLinearGaugeRangeContainerOps[Self <: dxLinearGaugeRangeContainer] (val x: Self) extends AnyVal {
    
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
    def setHorizontalOrientation(value: center | left | right): Self = this.set("horizontalOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOrientation: Self = this.set("horizontalOrientation", js.undefined)
    
    @scala.inline
    def setVerticalOrientation(value: bottom | center | top): Self = this.set("verticalOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOrientation: Self = this.set("verticalOrientation", js.undefined)
    
    @scala.inline
    def setWidth(value: Start | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
