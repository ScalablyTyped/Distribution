package typings.firebase.mod.firebase.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The phone info options for multi-factor sign-in. Either multi-factor hint or
  * multi-factor UID and multi-factor session are required.
  */
@js.native
trait PhoneMultiFactorSignInInfoOptions extends PhoneInfoOptions {
  
  var multiFactorHint: js.UndefOr[MultiFactorInfo] = js.native
  
  var multiFactorUid: js.UndefOr[String] = js.native
  
  var session: MultiFactorSession = js.native
}
object PhoneMultiFactorSignInInfoOptions {
  
  @scala.inline
  def apply(session: MultiFactorSession): PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorSignInInfoOptions]
  }
  
  @scala.inline
  implicit class PhoneMultiFactorSignInInfoOptionsOps[Self <: PhoneMultiFactorSignInInfoOptions] (val x: Self) extends AnyVal {
    
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
    def setSession(value: MultiFactorSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorHint(value: MultiFactorInfo): Self = this.set("multiFactorHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiFactorHint: Self = this.set("multiFactorHint", js.undefined)
    
    @scala.inline
    def setMultiFactorUid(value: String): Self = this.set("multiFactorUid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiFactorUid: Self = this.set("multiFactorUid", js.undefined)
  }
}
