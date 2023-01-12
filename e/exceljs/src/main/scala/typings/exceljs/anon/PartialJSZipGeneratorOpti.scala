package typings.exceljs.anon

import typings.exceljs.exceljsStrings.DEFLATE
import typings.exceljs.exceljsStrings.STORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.JSZipGeneratorOptions> */
trait PartialJSZipGeneratorOpti extends StObject {
  
  var compression: js.UndefOr[STORE | DEFLATE] = js.undefined
  
  var compressionOptions: js.UndefOr[Null | Level] = js.undefined
}
object PartialJSZipGeneratorOpti {
  
  inline def apply(): PartialJSZipGeneratorOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJSZipGeneratorOpti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialJSZipGeneratorOpti] (val x: Self) extends AnyVal {
    
    inline def setCompression(value: STORE | DEFLATE): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
    
    inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
    
    inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
  }
}
