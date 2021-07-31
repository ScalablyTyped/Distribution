package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionOptions extends StObject {
  
  /**
    * Any additional headers you would like included with the `GET` request sent to your server. Ignored in `IE9` and `IE8` if the endpoint is cross-origin
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any] = js.undefined
  
  /**
    * If non-null, Fine Uploader will send a `GET` request on startup to this endpoint, expecting a `JSON` response containing data about the initial file list to populate
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Any parameters you would like passed with the associated `GET` request to your server
    *
    * @default `{}`
    */
  var params: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Set this to `false` if you do not want the file list to be retrieved from the server as part of a reset.
    *
    * @default `true`
    */
  var refreshOnReset: js.UndefOr[Boolean] = js.undefined
}
object SessionOptions {
  
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit class SessionOptionsMutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomHeaders(value: js.Any): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setRefreshOnReset(value: Boolean): Self = StObject.set(x, "refreshOnReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshOnResetUndefined: Self = StObject.set(x, "refreshOnReset", js.undefined)
  }
}
