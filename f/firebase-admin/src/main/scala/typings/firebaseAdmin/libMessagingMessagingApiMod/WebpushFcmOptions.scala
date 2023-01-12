package typings.firebaseAdmin.libMessagingMessagingApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpushFcmOptions extends StObject {
  
  /**
    * The link to open when the user clicks on the notification.
    * For all URL values, HTTPS is required.
    */
  var link: js.UndefOr[String] = js.undefined
}
object WebpushFcmOptions {
  
  inline def apply(): WebpushFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpushFcmOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebpushFcmOptions] (val x: Self) extends AnyVal {
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
