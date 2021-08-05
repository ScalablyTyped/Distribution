package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailUrlOptions extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
  
  var png: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object ThumbnailUrlOptions {
  
  inline def apply(): ThumbnailUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailUrlOptions]
  }
  
  extension [Self <: ThumbnailUrlOptions](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPng(value: Boolean): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
    
    inline def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
