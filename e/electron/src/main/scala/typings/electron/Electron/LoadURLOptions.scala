package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadURLOptions extends StObject {
  
  /**
    * Base url (with trailing path separator) for files to be loaded by the data url.
    * This is needed only if the specified `url` is a data url and needs to load other
    * files.
    */
  var baseURLForDataURL: js.UndefOr[String] = js.undefined
  
  /**
    * Extra headers separated by "\n"
    */
  var extraHeaders: js.UndefOr[String] = js.undefined
  
  /**
    * An HTTP Referrer url.
    */
  var httpReferrer: js.UndefOr[String | Referrer] = js.undefined
  
  var postData: js.UndefOr[js.Array[UploadBlob | UploadFile | UploadRawData]] = js.undefined
  
  /**
    * A user agent originating the request.
    */
  var userAgent: js.UndefOr[String] = js.undefined
}
object LoadURLOptions {
  
  inline def apply(): LoadURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadURLOptions]
  }
  
  extension [Self <: LoadURLOptions](x: Self) {
    
    inline def setBaseURLForDataURL(value: String): Self = StObject.set(x, "baseURLForDataURL", value.asInstanceOf[js.Any])
    
    inline def setBaseURLForDataURLUndefined: Self = StObject.set(x, "baseURLForDataURL", js.undefined)
    
    inline def setExtraHeaders(value: String): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setHttpReferrer(value: String | Referrer): Self = StObject.set(x, "httpReferrer", value.asInstanceOf[js.Any])
    
    inline def setHttpReferrerUndefined: Self = StObject.set(x, "httpReferrer", js.undefined)
    
    inline def setPostData(value: js.Array[UploadBlob | UploadFile | UploadRawData]): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    inline def setPostDataVarargs(value: (UploadBlob | UploadFile | UploadRawData)*): Self = StObject.set(x, "postData", js.Array(value :_*))
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
