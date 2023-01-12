package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Only used as a response to the onAuthRequired event. If set, the request is made using the supplied credentials.
  */
trait BlockingResponseAuthCredentials extends StObject {
  
  var password: String
  
  var username: String
}
object BlockingResponseAuthCredentials {
  
  inline def apply(password: String, username: String): BlockingResponseAuthCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockingResponseAuthCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockingResponseAuthCredentials] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
