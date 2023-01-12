package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait China extends StObject {
  
  var china: js.UndefOr[Boolean] = js.undefined
  
  var consumerKey: js.UndefOr[String] = js.undefined
  
  var consumerSecret: js.UndefOr[String] = js.undefined
  
  var sandbox: js.UndefOr[Boolean] = js.undefined
  
  var serviceHost: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
}
object China {
  
  inline def apply(): China = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[China]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: China] (val x: Self) extends AnyVal {
    
    inline def setChina(value: Boolean): Self = StObject.set(x, "china", value.asInstanceOf[js.Any])
    
    inline def setChinaUndefined: Self = StObject.set(x, "china", js.undefined)
    
    inline def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
    
    inline def setConsumerKeyUndefined: Self = StObject.set(x, "consumerKey", js.undefined)
    
    inline def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
    
    inline def setConsumerSecretUndefined: Self = StObject.set(x, "consumerSecret", js.undefined)
    
    inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setServiceHost(value: String): Self = StObject.set(x, "serviceHost", value.asInstanceOf[js.Any])
    
    inline def setServiceHostUndefined: Self = StObject.set(x, "serviceHost", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
