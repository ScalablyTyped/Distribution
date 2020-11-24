package typings.dwt.anon

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCompressionType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressionType extends js.Object {
  
  /**
    * Specify the compression type of the file.
    */
  var compressionType: js.UndefOr[EnumDWTCompressionType | Double] = js.native
  
  /**
    * Specify the file format.
    */
  var fileFormat: js.UndefOr[EnumDWTFileFormat | Double] = js.native
  
  /**
    * Specify the file name (or pattern) for file transfer.
    * Example: "C:\\WebTWAIN<%06d>.bmp"
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * Specify the quality of JPEG files.
    */
  var jpegQuality: js.UndefOr[Double] = js.native
}
object CompressionType {
  
  @scala.inline
  def apply(): CompressionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressionType]
  }
  
  @scala.inline
  implicit class CompressionTypeOps[Self <: CompressionType] (val x: Self) extends AnyVal {
    
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
    def setCompressionType(value: EnumDWTCompressionType | Double): Self = this.set("compressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionType: Self = this.set("compressionType", js.undefined)
    
    @scala.inline
    def setFileFormat(value: EnumDWTFileFormat | Double): Self = this.set("fileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileFormat: Self = this.set("fileFormat", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setJpegQuality(value: Double): Self = this.set("jpegQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJpegQuality: Self = this.set("jpegQuality", js.undefined)
  }
}
