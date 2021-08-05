package typings.dwt.anon

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType
import typings.dwt.webTwainAcquireMod.TiffTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compression extends StObject {
  
  var compression: js.UndefOr[EnumDWTTIFFCompressionType | Double] = js.undefined
  
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify Tiff custom tags.
    */
  var tiffTags: js.UndefOr[js.Array[TiffTag]] = js.undefined
}
object Compression {
  
  inline def apply(): Compression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compression]
  }
  
  extension [Self <: Compression](x: Self) {
    
    inline def setCompression(value: EnumDWTTIFFCompressionType | Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setTiffTags(value: js.Array[TiffTag]): Self = StObject.set(x, "tiffTags", value.asInstanceOf[js.Any])
    
    inline def setTiffTagsUndefined: Self = StObject.set(x, "tiffTags", js.undefined)
    
    inline def setTiffTagsVarargs(value: TiffTag*): Self = StObject.set(x, "tiffTags", js.Array(value :_*))
  }
}
