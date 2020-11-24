package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterBandPixelsReadOptions extends js.Object {
  
  var buffer_height: js.UndefOr[Double] = js.native
  
  var buffer_width: js.UndefOr[Double] = js.native
  
  var data_type: js.UndefOr[String] = js.native
  
  var line_space: js.UndefOr[Double] = js.native
  
  var pixel_space: js.UndefOr[Double] = js.native
}
object RasterBandPixelsReadOptions {
  
  @scala.inline
  def apply(): RasterBandPixelsReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterBandPixelsReadOptions]
  }
  
  @scala.inline
  implicit class RasterBandPixelsReadOptionsOps[Self <: RasterBandPixelsReadOptions] (val x: Self) extends AnyVal {
    
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
    def setData_type(value: String): Self = this.set("data_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData_type: Self = this.set("data_type", js.undefined)
    
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
