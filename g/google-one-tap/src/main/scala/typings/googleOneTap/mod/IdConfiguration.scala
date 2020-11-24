package typings.googleOneTap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdConfiguration extends js.Object {
  
  var auto_select: js.UndefOr[Boolean] = js.native
  
  var callback: js.UndefOr[js.Function1[/* credentialResponse */ CredentialResponse, Unit]] = js.native
  
  var cancel_on_tap_outside: js.UndefOr[Boolean] = js.native
  
  var client_id: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var native_callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var prompt_parent_id: js.UndefOr[String] = js.native
  
  var state_cookie_domain: js.UndefOr[String] = js.native
}
object IdConfiguration {
  
  @scala.inline
  def apply(): IdConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdConfiguration]
  }
  
  @scala.inline
  implicit class IdConfigurationOps[Self <: IdConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuto_select(value: Boolean): Self = this.set("auto_select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto_select: Self = this.set("auto_select", js.undefined)
    
    @scala.inline
    def setCallback(value: /* credentialResponse */ CredentialResponse => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCancel_on_tap_outside(value: Boolean): Self = this.set("cancel_on_tap_outside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel_on_tap_outside: Self = this.set("cancel_on_tap_outside", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setNative_callback(value: () => Unit): Self = this.set("native_callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNative_callback: Self = this.set("native_callback", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setPrompt_parent_id(value: String): Self = this.set("prompt_parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt_parent_id: Self = this.set("prompt_parent_id", js.undefined)
    
    @scala.inline
    def setState_cookie_domain(value: String): Self = this.set("state_cookie_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState_cookie_domain: Self = this.set("state_cookie_domain", js.undefined)
  }
}
