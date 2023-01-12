package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeURLOptions extends StObject {
  
  var download: js.UndefOr[Boolean] = js.undefined
  
  var downloadHack: js.UndefOr[Boolean] = js.undefined
  
  var long: js.UndefOr[Boolean] = js.undefined
  
  var longUrl: js.UndefOr[Boolean] = js.undefined
}
object MakeURLOptions {
  
  inline def apply(): MakeURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeURLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MakeURLOptions] (val x: Self) extends AnyVal {
    
    inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadHack(value: Boolean): Self = StObject.set(x, "downloadHack", value.asInstanceOf[js.Any])
    
    inline def setDownloadHackUndefined: Self = StObject.set(x, "downloadHack", js.undefined)
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setLong(value: Boolean): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
    
    inline def setLongUrl(value: Boolean): Self = StObject.set(x, "longUrl", value.asInstanceOf[js.Any])
    
    inline def setLongUrlUndefined: Self = StObject.set(x, "longUrl", js.undefined)
  }
}
