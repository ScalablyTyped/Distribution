package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileOptions extends StObject {
  
  /**
    * Any additional headers to attach to all delete file requests
    *
    * @default `{}`
    */
  var customHeaders: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Enable or disable deletion of uploaded files
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The endpoint to which delete file requests are sent.
    *
    * @default `'/server/upload'`
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * Set the method to use for delete requests.
    *
    * Accepts `'POST'` or `'DELETE'`
    *
    * @default `'DELETE'`
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * Any additional parameters to attach to delete file requests
    *
    * @default `{}`
    */
  var params: js.UndefOr[js.Any] = js.undefined
}
object DeleteFileOptions {
  
  @scala.inline
  def apply(): DeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileOptions]
  }
  
  @scala.inline
  implicit class DeleteFileOptionsMutableBuilder[Self <: DeleteFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomHeaders(value: js.Any): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
