package typings.exif.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compression extends js.Object {
  
  var Compression: js.UndefOr[Double] = js.native
  
  var Orientation: js.UndefOr[Double] = js.native
  
  var ResolutionUnit: js.UndefOr[Double] = js.native
  
  var ThumbnailLength: js.UndefOr[Double] = js.native
  
  var ThumbnailOffset: js.UndefOr[Double] = js.native
  
  var XResolution: js.UndefOr[Double] = js.native
  
  var YCbCrPositioning: js.UndefOr[Double] = js.native
  
  var YResolution: js.UndefOr[Double] = js.native
}
object Compression {
  
  @scala.inline
  def apply(): Compression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compression]
  }
  
  @scala.inline
  implicit class CompressionOps[Self <: Compression] (val x: Self) extends AnyVal {
    
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
    def setCompression(value: Double): Self = this.set("Compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("Compression", js.undefined)
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("Orientation", js.undefined)
    
    @scala.inline
    def setResolutionUnit(value: Double): Self = this.set("ResolutionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionUnit: Self = this.set("ResolutionUnit", js.undefined)
    
    @scala.inline
    def setThumbnailLength(value: Double): Self = this.set("ThumbnailLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailLength: Self = this.set("ThumbnailLength", js.undefined)
    
    @scala.inline
    def setThumbnailOffset(value: Double): Self = this.set("ThumbnailOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailOffset: Self = this.set("ThumbnailOffset", js.undefined)
    
    @scala.inline
    def setXResolution(value: Double): Self = this.set("XResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXResolution: Self = this.set("XResolution", js.undefined)
    
    @scala.inline
    def setYCbCrPositioning(value: Double): Self = this.set("YCbCrPositioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYCbCrPositioning: Self = this.set("YCbCrPositioning", js.undefined)
    
    @scala.inline
    def setYResolution(value: Double): Self = this.set("YResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYResolution: Self = this.set("YResolution", js.undefined)
  }
}
