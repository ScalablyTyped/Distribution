package typings.dwt.anon

import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTCompressionType
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTFileFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressionType extends StObject {
  
  /**
    * Specify the compression type of the file.
    */
  var compressionType: js.UndefOr[EnumDWTCompressionType | Double] = js.undefined
  
  /**
    * Specify the file format.
    */
  var fileFormat: js.UndefOr[EnumDWTFileFormat | Double] = js.undefined
  
  /**
    * Specify the file name (or pattern) for file transfer.
    * Example: "C:\\WebTWAIN<%06d>.bmp"
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the quality of JPEG files.
    */
  var jpegQuality: js.UndefOr[Double] = js.undefined
}
object CompressionType {
  
  inline def apply(): CompressionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompressionType] (val x: Self) extends AnyVal {
    
    inline def setCompressionType(value: EnumDWTCompressionType | Double): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "compressionType", js.undefined)
    
    inline def setFileFormat(value: EnumDWTFileFormat | Double): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setJpegQuality(value: Double): Self = StObject.set(x, "jpegQuality", value.asInstanceOf[js.Any])
    
    inline def setJpegQualityUndefined: Self = StObject.set(x, "jpegQuality", js.undefined)
  }
}
