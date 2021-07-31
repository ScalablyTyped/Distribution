package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Downloadurl extends StObject {
  
  var download_url: js.UndefOr[String] = js.undefined
  
  var encrypted_key: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Downloadurl {
  
  @scala.inline
  def apply(): Downloadurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Downloadurl]
  }
  
  @scala.inline
  implicit class DownloadurlMutableBuilder[Self <: Downloadurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload_urlUndefined: Self = StObject.set(x, "download_url", js.undefined)
    
    @scala.inline
    def setEncrypted_key(value: String): Self = StObject.set(x, "encrypted_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted_keyUndefined: Self = StObject.set(x, "encrypted_key", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
