package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionOptions extends StObject {
  
  /**
    * Any additional headers you would like included with the `GET` request sent to your server. Ignored in `IE9` and `IE8` if the endpoint is cross-origin
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[Any] = js.undefined
  
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
  var params: js.UndefOr[Any] = js.undefined
  
  /**
    * Set this to `false` if you do not want the file list to be retrieved from the server as part of a reset.
    *
    * @default `true`
    */
  var refreshOnReset: js.UndefOr[Boolean] = js.undefined
}
object SessionOptions {
  
  inline def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  extension [Self <: SessionOptions](x: Self) {
    
    inline def setCustomHeaders(value: Any): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRefreshOnReset(value: Boolean): Self = StObject.set(x, "refreshOnReset", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnResetUndefined: Self = StObject.set(x, "refreshOnReset", js.undefined)
  }
}
