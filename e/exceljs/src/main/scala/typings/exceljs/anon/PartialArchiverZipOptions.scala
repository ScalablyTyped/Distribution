package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.ArchiverZipOptions> */
trait PartialArchiverZipOptions extends StObject {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var forceLocalTime: js.UndefOr[Boolean] = js.undefined
  
  var forceZip64: js.UndefOr[Boolean] = js.undefined
  
  var store: js.UndefOr[Boolean] = js.undefined
  
  var zlib: js.UndefOr[PartialZlibOptions] = js.undefined
}
object PartialArchiverZipOptions {
  
  inline def apply(): PartialArchiverZipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArchiverZipOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialArchiverZipOptions] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setForceLocalTime(value: Boolean): Self = StObject.set(x, "forceLocalTime", value.asInstanceOf[js.Any])
    
    inline def setForceLocalTimeUndefined: Self = StObject.set(x, "forceLocalTime", js.undefined)
    
    inline def setForceZip64(value: Boolean): Self = StObject.set(x, "forceZip64", value.asInstanceOf[js.Any])
    
    inline def setForceZip64Undefined: Self = StObject.set(x, "forceZip64", js.undefined)
    
    inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setZlib(value: PartialZlibOptions): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
    
    inline def setZlibUndefined: Self = StObject.set(x, "zlib", js.undefined)
  }
}
