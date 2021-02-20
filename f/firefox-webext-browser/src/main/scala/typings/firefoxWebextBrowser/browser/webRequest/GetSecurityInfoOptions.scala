package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecurityInfoOptions extends StObject {
  
  /** Include the entire certificate chain. */
  var certificateChain: js.UndefOr[Boolean] = js.native
  
  /** Include raw certificate data for processing by the extension. */
  var rawDER: js.UndefOr[Boolean] = js.native
}
object GetSecurityInfoOptions {
  
  @scala.inline
  def apply(): GetSecurityInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityInfoOptions]
  }
  
  @scala.inline
  implicit class GetSecurityInfoOptionsMutableBuilder[Self <: GetSecurityInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: Boolean): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
    
    @scala.inline
    def setRawDER(value: Boolean): Self = StObject.set(x, "rawDER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawDERUndefined: Self = StObject.set(x, "rawDER", js.undefined)
  }
}
