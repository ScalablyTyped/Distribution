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
  
  @scala.inline
  def apply(): MakeURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeURLOptions]
  }
  
  @scala.inline
  implicit class MakeURLOptionsMutableBuilder[Self <: MakeURLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadHack(value: Boolean): Self = StObject.set(x, "downloadHack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadHackUndefined: Self = StObject.set(x, "downloadHack", js.undefined)
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setLong(value: Boolean): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
    
    @scala.inline
    def setLongUrl(value: Boolean): Self = StObject.set(x, "longUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongUrlUndefined: Self = StObject.set(x, "longUrl", js.undefined)
  }
}
