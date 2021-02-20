package typings.exceljs.anon

import typings.exceljs.exceljsStrings.DEFLATE
import typings.exceljs.exceljsStrings.STORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.JSZipGeneratorOptions> */
@js.native
trait PartialJSZipGeneratorOpti extends StObject {
  
  var compression: js.UndefOr[STORE | DEFLATE] = js.native
  
  var compressionOptions: js.UndefOr[Null | Level] = js.native
}
object PartialJSZipGeneratorOpti {
  
  @scala.inline
  def apply(): PartialJSZipGeneratorOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJSZipGeneratorOpti]
  }
  
  @scala.inline
  implicit class PartialJSZipGeneratorOptiMutableBuilder[Self <: PartialJSZipGeneratorOpti] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompression(value: STORE | DEFLATE): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
    
    @scala.inline
    def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
  }
}
