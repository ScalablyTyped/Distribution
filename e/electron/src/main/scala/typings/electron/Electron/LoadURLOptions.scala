package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadURLOptions extends StObject {
  
  /**
    * Base url (with trailing path separator) for files to be loaded by the data url.
    * This is needed only if the specified `url` is a data url and needs to load other
    * files.
    */
  var baseURLForDataURL: js.UndefOr[String] = js.native
  
  /**
    * Extra headers separated by "\n"
    */
  var extraHeaders: js.UndefOr[String] = js.native
  
  /**
    * An HTTP Referrer url.
    */
  var httpReferrer: js.UndefOr[String | Referrer] = js.native
  
  var postData: js.UndefOr[js.Array[UploadBlob | UploadFile | UploadRawData]] = js.native
  
  /**
    * A user agent originating the request.
    */
  var userAgent: js.UndefOr[String] = js.native
}
object LoadURLOptions {
  
  @scala.inline
  def apply(): LoadURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadURLOptions]
  }
  
  @scala.inline
  implicit class LoadURLOptionsMutableBuilder[Self <: LoadURLOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseURLForDataURL(value: String): Self = StObject.set(x, "baseURLForDataURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURLForDataURLUndefined: Self = StObject.set(x, "baseURLForDataURL", js.undefined)
    
    @scala.inline
    def setExtraHeaders(value: String): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    @scala.inline
    def setHttpReferrer(value: String | Referrer): Self = StObject.set(x, "httpReferrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpReferrerUndefined: Self = StObject.set(x, "httpReferrer", js.undefined)
    
    @scala.inline
    def setPostData(value: js.Array[UploadBlob | UploadFile | UploadRawData]): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    @scala.inline
    def setPostDataVarargs(value: (UploadBlob | UploadFile | UploadRawData)*): Self = StObject.set(x, "postData", js.Array(value :_*))
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
