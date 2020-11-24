package typings.gifwrap.mod

import typings.gifwrap.gifwrapNumbers.`0`
import typings.gifwrap.gifwrapNumbers.`1`
import typings.gifwrap.gifwrapNumbers.`2`
import typings.gifwrap.gifwrapNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GifFrameOptions extends js.Object {
  
  var delayCentisecs: js.UndefOr[Double] = js.native
  
  var disposalMethod: js.UndefOr[`0` | `1` | `2` | `3`] = js.native
  
  var isInterlaced: js.UndefOr[Boolean] = js.native
  
  var xOffset: js.UndefOr[Double] = js.native
  
  var yOffset: js.UndefOr[Double] = js.native
}
object GifFrameOptions {
  
  @scala.inline
  def apply(): GifFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GifFrameOptions]
  }
  
  @scala.inline
  implicit class GifFrameOptionsOps[Self <: GifFrameOptions] (val x: Self) extends AnyVal {
    
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
    def setDelayCentisecs(value: Double): Self = this.set("delayCentisecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayCentisecs: Self = this.set("delayCentisecs", js.undefined)
    
    @scala.inline
    def setDisposalMethod(value: `0` | `1` | `2` | `3`): Self = this.set("disposalMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposalMethod: Self = this.set("disposalMethod", js.undefined)
    
    @scala.inline
    def setIsInterlaced(value: Boolean): Self = this.set("isInterlaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInterlaced: Self = this.set("isInterlaced", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXOffset: Self = this.set("xOffset", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double): Self = this.set("yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYOffset: Self = this.set("yOffset", js.undefined)
  }
}
