package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorrectViewRequest extends StObject {
  
  /**
    * (Optional) The URL to which the user should be redirected after the correct/send view session has ended. DocuSign redirects to this URL and includes an event
    *  parameter that your app can use.
    *
    * Maximum Length: 500 characters. If the `returnUrl` exceeds this limit, the user is redirected to a truncated URL.
    *
    * The event parameters returned are:
    *
    * * `send` (user corrected and sent the envelope)
    * * `save` (user saved the envelope)
    * * `cancel` (user canceled the transaction.)
    * * `error` (there was an error when performing the correct or send)
    * * `sessionEnd` (the session ended before the user completed a different action)
    *
    * ###### Note: Include `https://` in the URL or the redirect might not succeed on some browsers.
    */
  var returnUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the window is displayed with or without dressing.
    */
  var suppressNavigation: js.UndefOr[String] = js.undefined
}
object CorrectViewRequest {
  
  inline def apply(): CorrectViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorrectViewRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CorrectViewRequest] (val x: Self) extends AnyVal {
    
    inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    
    inline def setReturnUrlUndefined: Self = StObject.set(x, "returnUrl", js.undefined)
    
    inline def setSuppressNavigation(value: String): Self = StObject.set(x, "suppressNavigation", value.asInstanceOf[js.Any])
    
    inline def setSuppressNavigationUndefined: Self = StObject.set(x, "suppressNavigation", js.undefined)
  }
}
