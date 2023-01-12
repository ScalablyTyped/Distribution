package typings.exceljs.anon

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.XlsxWriteOptions> */
trait PartialXlsxWriteOptions extends StObject {
  
  var filename: js.UndefOr[String] = js.undefined
  
  var stream: js.UndefOr[Stream] = js.undefined
  
  var useSharedStrings: js.UndefOr[Boolean] = js.undefined
  
  var useStyles: js.UndefOr[Boolean] = js.undefined
  
  var zip: js.UndefOr[PartialJSZipGeneratorOpti] = js.undefined
}
object PartialXlsxWriteOptions {
  
  inline def apply(): PartialXlsxWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialXlsxWriteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialXlsxWriteOptions] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setUseSharedStrings(value: Boolean): Self = StObject.set(x, "useSharedStrings", value.asInstanceOf[js.Any])
    
    inline def setUseSharedStringsUndefined: Self = StObject.set(x, "useSharedStrings", js.undefined)
    
    inline def setUseStyles(value: Boolean): Self = StObject.set(x, "useStyles", value.asInstanceOf[js.Any])
    
    inline def setUseStylesUndefined: Self = StObject.set(x, "useStyles", js.undefined)
    
    inline def setZip(value: PartialJSZipGeneratorOpti): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
