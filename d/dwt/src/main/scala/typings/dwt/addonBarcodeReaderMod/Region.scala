package typings.dwt.addonBarcodeReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends js.Object {
  
  var regionBottom: Double = js.native
  
  var regionLeft: Double = js.native
  
  var regionMeasuredByPercentage: Double = js.native
  
  var regionRight: Double = js.native
  
  var regionTop: Double = js.native
}
object Region {
  
  @scala.inline
  def apply(
    regionBottom: Double,
    regionLeft: Double,
    regionMeasuredByPercentage: Double,
    regionRight: Double,
    regionTop: Double
  ): Region = {
    val __obj = js.Dynamic.literal(regionBottom = regionBottom.asInstanceOf[js.Any], regionLeft = regionLeft.asInstanceOf[js.Any], regionMeasuredByPercentage = regionMeasuredByPercentage.asInstanceOf[js.Any], regionRight = regionRight.asInstanceOf[js.Any], regionTop = regionTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    
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
    def setRegionBottom(value: Double): Self = this.set("regionBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionLeft(value: Double): Self = this.set("regionLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionMeasuredByPercentage(value: Double): Self = this.set("regionMeasuredByPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionRight(value: Double): Self = this.set("regionRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionTop(value: Double): Self = this.set("regionTop", value.asInstanceOf[js.Any])
  }
}
