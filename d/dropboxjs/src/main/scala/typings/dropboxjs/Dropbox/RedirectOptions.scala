package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectOptions extends StObject {
  
  var redirectFile: js.UndefOr[String] = js.undefined
  
  var redirectUrl: js.UndefOr[String] = js.undefined
  
  var rememberUser: js.UndefOr[Boolean] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
}
object RedirectOptions {
  
  @scala.inline
  def apply(): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectOptions]
  }
  
  @scala.inline
  implicit class RedirectOptionsMutableBuilder[Self <: RedirectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRedirectFile(value: String): Self = StObject.set(x, "redirectFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectFileUndefined: Self = StObject.set(x, "redirectFile", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
    
    @scala.inline
    def setRememberUser(value: Boolean): Self = StObject.set(x, "rememberUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRememberUserUndefined: Self = StObject.set(x, "rememberUser", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
