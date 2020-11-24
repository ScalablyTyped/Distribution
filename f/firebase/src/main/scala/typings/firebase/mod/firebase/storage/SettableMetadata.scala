package typings.firebase.mod.firebase.storage

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object metadata that can be set at any time.
  */
@js.native
trait SettableMetadata extends js.Object {
  
  /**
    * Served as the 'Cache-Control' header on object download.
    */
  var cacheControl: js.UndefOr[String | Null] = js.native
  
  var contentDisposition: js.UndefOr[String | Null] = js.native
  
  /**
    * Served as the 'Content-Encoding' header on object download.
    */
  var contentEncoding: js.UndefOr[String | Null] = js.native
  
  /**
    * Served as the 'Content-Language' header on object download.
    */
  var contentLanguage: js.UndefOr[String | Null] = js.native
  
  /**
    * Served as the 'Content-Type' header on object download.
    */
  var contentType: js.UndefOr[String | Null] = js.native
  
  /**
    * Additional user-defined custom metadata.
    */
  var customMetadata: js.UndefOr[StringDictionary[String] | Null] = js.native
}
object SettableMetadata {
  
  @scala.inline
  def apply(): SettableMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableMetadata]
  }
  
  @scala.inline
  implicit class SettableMetadataOps[Self <: SettableMetadata] (val x: Self) extends AnyVal {
    
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
    def setCacheControl(value: String): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    
    @scala.inline
    def setCacheControlNull: Self = this.set("cacheControl", null)
    
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDisposition: Self = this.set("contentDisposition", js.undefined)
    
    @scala.inline
    def setContentDispositionNull: Self = this.set("contentDisposition", null)
    
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    
    @scala.inline
    def setContentEncodingNull: Self = this.set("contentEncoding", null)
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    
    @scala.inline
    def setContentLanguageNull: Self = this.set("contentLanguage", null)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setContentTypeNull: Self = this.set("contentType", null)
    
    @scala.inline
    def setCustomMetadata(value: StringDictionary[String]): Self = this.set("customMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMetadata: Self = this.set("customMetadata", js.undefined)
    
    @scala.inline
    def setCustomMetadataNull: Self = this.set("customMetadata", null)
  }
}
