package typings.fmWebsync.fm.websync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait baseRequestConfig extends StObject {
  
  /**
    * Extra meta data to associate with the request/response.
    */
  var meta: js.UndefOr[js.Any] = js.native
  
  /**
    * The URL of the proxy to use for this request.
    */
  var requestUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether to ignore errors when parsing the server response. If true, any errors thrown while parsing the JSON response received from the server will be ignored.
    * Defaults to false.
    */
  var suppressErrors: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the request should be executed asynchronously. If true, the request will be executed synchronously if supported by the browser; otherwise,
    * it will be executed asynchronously. All browsers support synchronous requests if the request URL is the same domain as the page. Synchronous requests
    * are not supported in IE6 and IE7 for cross-domain environments. Defaults to false.
    */
  var sync: js.UndefOr[Boolean] = js.native
}
object baseRequestConfig {
  
  @scala.inline
  def apply(): baseRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[baseRequestConfig]
  }
  
  @scala.inline
  implicit class baseRequestConfigMutableBuilder[Self <: baseRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUrlUndefined: Self = StObject.set(x, "requestUrl", js.undefined)
    
    @scala.inline
    def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
  }
}
