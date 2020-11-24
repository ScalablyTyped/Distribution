package typings.exif.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Copyright extends js.Object {
  
  var Copyright: js.UndefOr[String] = js.native
  
  var ExifOffset: js.UndefOr[Double] = js.native
  
  var ImageHeight: js.UndefOr[Double] = js.native
  
  var ImageWidth: js.UndefOr[Double] = js.native
  
  var Make: js.UndefOr[String] = js.native
  
  var Model: js.UndefOr[String] = js.native
  
  var ModifyDate: js.UndefOr[String] = js.native
  
  var Orientation: js.UndefOr[Double] = js.native
  
  var ResolutionUnit: js.UndefOr[Double] = js.native
  
  var Software: js.UndefOr[String] = js.native
  
  var XResolution: js.UndefOr[Double] = js.native
  
  var YCbCrPositioning: js.UndefOr[Double] = js.native
  
  var YResolution: js.UndefOr[Double] = js.native
}
object Copyright {
  
  @scala.inline
  def apply(): Copyright = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copyright]
  }
  
  @scala.inline
  implicit class CopyrightOps[Self <: Copyright] (val x: Self) extends AnyVal {
    
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
    def setCopyright(value: String): Self = this.set("Copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("Copyright", js.undefined)
    
    @scala.inline
    def setExifOffset(value: Double): Self = this.set("ExifOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExifOffset: Self = this.set("ExifOffset", js.undefined)
    
    @scala.inline
    def setImageHeight(value: Double): Self = this.set("ImageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageHeight: Self = this.set("ImageHeight", js.undefined)
    
    @scala.inline
    def setImageWidth(value: Double): Self = this.set("ImageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageWidth: Self = this.set("ImageWidth", js.undefined)
    
    @scala.inline
    def setMake(value: String): Self = this.set("Make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMake: Self = this.set("Make", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("Model", js.undefined)
    
    @scala.inline
    def setModifyDate(value: String): Self = this.set("ModifyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifyDate: Self = this.set("ModifyDate", js.undefined)
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("Orientation", js.undefined)
    
    @scala.inline
    def setResolutionUnit(value: Double): Self = this.set("ResolutionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionUnit: Self = this.set("ResolutionUnit", js.undefined)
    
    @scala.inline
    def setSoftware(value: String): Self = this.set("Software", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftware: Self = this.set("Software", js.undefined)
    
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
