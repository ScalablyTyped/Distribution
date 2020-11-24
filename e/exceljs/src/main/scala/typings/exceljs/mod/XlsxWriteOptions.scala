package typings.exceljs.mod

import typings.exceljs.anon.PartialJSZipGeneratorOpti
import typings.exceljs.mod.stream.xlsx.WorkbookWriterOptions
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XlsxWriteOptions extends WorkbookWriterOptions {
  
  /**
  	 * The option passed to JsZip#generateAsync(options)
  	 */
  var zip: PartialJSZipGeneratorOpti = js.native
}
object XlsxWriteOptions {
  
  @scala.inline
  def apply(
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
  implicit class XlsxWriteOptionsOps[Self <: XlsxWriteOptions] (val x: Self) extends AnyVal {
    
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
    def setZip(value: PartialJSZipGeneratorOpti): Self = this.set("zip", value.asInstanceOf[js.Any])
  }
}
