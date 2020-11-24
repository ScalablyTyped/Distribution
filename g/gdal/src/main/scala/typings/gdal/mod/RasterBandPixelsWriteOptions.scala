package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterBandPixelsWriteOptions extends js.Object {
  
  var buffer_height: js.UndefOr[Double] = js.native
  
  var buffer_width: js.UndefOr[Double] = js.native
  
  var line_space: js.UndefOr[Double] = js.native
  
  var pixel_space: js.UndefOr[Double] = js.native
}
object RasterBandPixelsWriteOptions {
  
  @scala.inline
  def apply(): RasterBandPixelsWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterBandPixelsWriteOptions]
  }
  
  @scala.inline
  implicit class RasterBandPixelsWriteOptionsOps[Self <: RasterBandPixelsWriteOptions] (val x: Self) extends AnyVal {
    
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
    def setBuffer_height(value: Double): Self = this.set("buffer_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer_height: Self = this.set("buffer_height", js.undefined)
    
    @scala.inline
    def setBuffer_width(value: Double): Self = this.set("buffer_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer_width: Self = this.set("buffer_width", js.undefined)
    
    @scala.inline
    def setLine_space(value: Double): Self = this.set("line_space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine_space: Self = this.set("line_space", js.undefined)
    
    @scala.inline
    def setPixel_space(value: Double): Self = this.set("pixel_space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixel_space: Self = this.set("pixel_space", js.undefined)
  }
}
