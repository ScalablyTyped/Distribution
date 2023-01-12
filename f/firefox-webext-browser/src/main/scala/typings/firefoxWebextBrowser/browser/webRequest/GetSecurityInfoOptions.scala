package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityInfoOptions extends StObject {
  
  /** Include the entire certificate chain. */
  var certificateChain: js.UndefOr[Boolean] = js.undefined
  
  /** Include raw certificate data for processing by the extension. */
  var rawDER: js.UndefOr[Boolean] = js.undefined
}
object GetSecurityInfoOptions {
  
  inline def apply(): GetSecurityInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityInfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSecurityInfoOptions] (val x: Self) extends AnyVal {
    
    inline def setCertificateChain(value: Boolean): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
    
    inline def setRawDER(value: Boolean): Self = StObject.set(x, "rawDER", value.asInstanceOf[js.Any])
    
    inline def setRawDERUndefined: Self = StObject.set(x, "rawDER", js.undefined)
  }
}
