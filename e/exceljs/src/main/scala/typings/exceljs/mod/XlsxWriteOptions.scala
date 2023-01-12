package typings.exceljs.mod

import typings.exceljs.anon.PartialJSZipGeneratorOpti
import typings.exceljs.mod.stream.xlsx.WorkbookWriterOptions
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XlsxWriteOptions
  extends StObject
     with WorkbookWriterOptions {
  
  /**
  	 * The option passed to JsZip#generateAsync(options)
  	 */
  var zip: PartialJSZipGeneratorOpti
}
object XlsxWriteOptions {
  
  inline def apply(
    filename: String,
    stream: Stream,
    useSharedStrings: Boolean,
    useStyles: Boolean,
    zip: PartialJSZipGeneratorOpti
  ): XlsxWriteOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[XlsxWriteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XlsxWriteOptions] (val x: Self) extends AnyVal {
    
    inline def setZip(value: PartialJSZipGeneratorOpti): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
  }
}
