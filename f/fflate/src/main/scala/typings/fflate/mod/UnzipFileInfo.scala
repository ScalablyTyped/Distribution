package typings.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnzipFileInfo extends StObject {
  
  /**
    * The compression format for the data stream. This number is determined by
    * the spec in PKZIP's APPNOTE.txt, section 4.4.5. For example, 0 = no
    * compression, 8 = deflate, 14 = LZMA. If the filter function returns true
    * but this value is not 8, the unzip function will throw.
    */
  var compression: Double
  
  /**
    * The name of the file
    */
  var name: String
  
  /**
    * The original size of the file
    */
  var originalSize: Double
  
  /**
    * The compressed size of the file
    */
  var size: Double
}
object UnzipFileInfo {
  
  inline def apply(compression: Double, name: String, originalSize: Double, size: Double): UnzipFileInfo = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnzipFileInfo]
  }
  
  extension [Self <: UnzipFileInfo](x: Self) {
    
    inline def setCompression(value: Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginalSize(value: Double): Self = StObject.set(x, "originalSize", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
