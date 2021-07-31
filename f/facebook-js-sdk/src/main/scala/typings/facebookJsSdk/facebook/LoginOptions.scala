package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.reauthenticate
import typings.facebookJsSdk.facebookJsSdkStrings.reauthorize
import typings.facebookJsSdk.facebookJsSdkStrings.rerequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginOptions extends StObject {
  
  var auth_type: js.UndefOr[reauthenticate | reauthorize | rerequest] = js.undefined
  
  var enable_profile_selector: js.UndefOr[Boolean] = js.undefined
  
  var profile_selector_ids: js.UndefOr[String] = js.undefined
  
  var return_scopes: js.UndefOr[Boolean] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
}
object LoginOptions {
  
  @scala.inline
  def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  
  @scala.inline
  implicit class LoginOptionsMutableBuilder[Self <: LoginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth_type(value: reauthenticate | reauthorize | rerequest): Self = StObject.set(x, "auth_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_typeUndefined: Self = StObject.set(x, "auth_type", js.undefined)
    
    @scala.inline
    def setEnable_profile_selector(value: Boolean): Self = StObject.set(x, "enable_profile_selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable_profile_selectorUndefined: Self = StObject.set(x, "enable_profile_selector", js.undefined)
    
    @scala.inline
    def setProfile_selector_ids(value: String): Self = StObject.set(x, "profile_selector_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_selector_idsUndefined: Self = StObject.set(x, "profile_selector_ids", js.undefined)
    
    @scala.inline
    def setReturn_scopes(value: Boolean): Self = StObject.set(x, "return_scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_scopesUndefined: Self = StObject.set(x, "return_scopes", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
