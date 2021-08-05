package typings.exceljs.mod

import typings.exceljs.anon.Level
import typings.exceljs.exceljsStrings.DEFLATE
import typings.exceljs.exceljsStrings.STORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSZipGeneratorOptions extends StObject {
  
  /**
  	 * @default DEFLATE
  	 */
  var compression: STORE | DEFLATE
  
  var compressionOptions: Null | Level
}
object JSZipGeneratorOptions {
  
  inline def apply(compression: STORE | DEFLATE): JSZipGeneratorOptions = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any], compressionOptions = null)
    __obj.asInstanceOf[JSZipGeneratorOptions]
  }
  
  extension [Self <: JSZipGeneratorOptions](x: Self) {
    
    inline def setCompression(value: STORE | DEFLATE): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
    
    inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
  }
}
