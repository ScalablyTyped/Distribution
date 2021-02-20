package typings.exceljs.mod

import typings.exceljs.anon.Level
import typings.exceljs.exceljsStrings.DEFLATE
import typings.exceljs.exceljsStrings.STORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSZipGeneratorOptions extends StObject {
  
  /**
  	 * @default DEFLATE
  	 */
  var compression: STORE | DEFLATE = js.native
  
  var compressionOptions: Null | Level = js.native
}
object JSZipGeneratorOptions {
  
  @scala.inline
  def apply(compression: STORE | DEFLATE): JSZipGeneratorOptions = {
    val __obj = js.Dynamic.literal(compression = compression.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipGeneratorOptions]
  }
  
  @scala.inline
  implicit class JSZipGeneratorOptionsMutableBuilder[Self <: JSZipGeneratorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompression(value: STORE | DEFLATE): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
  }
}
