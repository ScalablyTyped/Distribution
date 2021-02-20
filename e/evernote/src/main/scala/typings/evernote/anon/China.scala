package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait China extends StObject {
  
  var china: js.UndefOr[Boolean] = js.native
  
  var consumerKey: js.UndefOr[String] = js.native
  
  var consumerSecret: js.UndefOr[String] = js.native
  
  var sandbox: js.UndefOr[Boolean] = js.native
  
  var serviceHost: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
}
object China {
  
  @scala.inline
  def apply(): China = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[China]
  }
  
  @scala.inline
  implicit class ChinaMutableBuilder[Self <: China] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChina(value: Boolean): Self = StObject.set(x, "china", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChinaUndefined: Self = StObject.set(x, "china", js.undefined)
    
    @scala.inline
    def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerKeyUndefined: Self = StObject.set(x, "consumerKey", js.undefined)
    
    @scala.inline
    def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerSecretUndefined: Self = StObject.set(x, "consumerSecret", js.undefined)
    
    @scala.inline
    def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    @scala.inline
    def setServiceHost(value: String): Self = StObject.set(x, "serviceHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceHostUndefined: Self = StObject.set(x, "serviceHost", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
