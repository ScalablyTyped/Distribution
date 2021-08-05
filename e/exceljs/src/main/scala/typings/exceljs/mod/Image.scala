package typings.exceljs.mod

import typings.exceljs.exceljsStrings.gif
import typings.exceljs.exceljsStrings.jpeg
import typings.exceljs.exceljsStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var base64: js.UndefOr[String] = js.undefined
  
  var buffer: js.UndefOr[Buffer] = js.undefined
  
  var `extension`: jpeg | png | gif
  
  var filename: js.UndefOr[String] = js.undefined
}
object Image {
  
  inline def apply(`extension`: jpeg | png | gif): Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
    
    inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
    
    inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setExtension(value: jpeg | png | gif): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
  }
}
