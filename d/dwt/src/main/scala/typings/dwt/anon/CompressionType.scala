package typings.dwt.anon

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTCompressionType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFileFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressionType extends StObject {
  
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
  implicit class CompressionTypeMutableBuilder[Self <: CompressionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompressionType(value: EnumDWTCompressionType | Double): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionTypeUndefined: Self = StObject.set(x, "compressionType", js.undefined)
    
    @scala.inline
    def setFileFormat(value: EnumDWTFileFormat | Double): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setJpegQuality(value: Double): Self = StObject.set(x, "jpegQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJpegQualityUndefined: Self = StObject.set(x, "jpegQuality", js.undefined)
  }
}
