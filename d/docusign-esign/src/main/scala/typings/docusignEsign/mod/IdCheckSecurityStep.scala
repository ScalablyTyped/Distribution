package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdCheckSecurityStep extends js.Object {
  
  /**
    * Type of authorization used for the security check.
    */
  var authType: js.UndefOr[String] = js.native
}
object IdCheckSecurityStep {
  
  @scala.inline
  def apply(): IdCheckSecurityStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdCheckSecurityStep]
  }
  
  @scala.inline
  implicit class IdCheckSecurityStepOps[Self <: IdCheckSecurityStep] (val x: Self) extends AnyVal {
    
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
    def setAuthType(value: String): Self = this.set("authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthType: Self = this.set("authType", js.undefined)
  }
}
