package typings.giphyApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GiphyOptions extends StObject {
  
  var apiKey: js.UndefOr[String] = js.native
  
  var https: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object GiphyOptions {
  
  @scala.inline
  def apply(): GiphyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GiphyOptions]
  }
  
  @scala.inline
  implicit class GiphyOptionsMutableBuilder[Self <: GiphyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
