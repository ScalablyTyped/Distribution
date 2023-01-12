package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandResourceUrls extends StObject {
  
  /**
    * The URI for the email resource file that the brand uses.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the sending resource file that the brand uses.
    */
  var sending: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the signing resource file that the brand uses.
    */
  var signing: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the captive (embedded) signing resource file that the brand uses.
    */
  var signingCaptive: js.UndefOr[String] = js.undefined
}
object BrandResourceUrls {
  
  inline def apply(): BrandResourceUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandResourceUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrandResourceUrls] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setSending(value: String): Self = StObject.set(x, "sending", value.asInstanceOf[js.Any])
    
    inline def setSendingUndefined: Self = StObject.set(x, "sending", js.undefined)
    
    inline def setSigning(value: String): Self = StObject.set(x, "signing", value.asInstanceOf[js.Any])
    
    inline def setSigningCaptive(value: String): Self = StObject.set(x, "signingCaptive", value.asInstanceOf[js.Any])
    
    inline def setSigningCaptiveUndefined: Self = StObject.set(x, "signingCaptive", js.undefined)
    
    inline def setSigningUndefined: Self = StObject.set(x, "signing", js.undefined)
  }
}
