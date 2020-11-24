package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalClaim extends js.Object {
  
  /**
    * The UNIX epoch time at which the claim was acquired from the external provider.
    */
  var acquiredTime: js.UndefOr[String] = js.native
  
  /**
    * The name of the external claim being requested.
    */
  var claimName: js.UndefOr[String] = js.native
  
  /**
    * The claim provider's client ID from which the claim is being requested.
    */
  var provider: js.UndefOr[String] = js.native
  
  /**
    * The value provided for the external claim.
    */
  var value: js.UndefOr[String] = js.native
}
object ExternalClaim {
  
  @scala.inline
  def apply(): ExternalClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalClaim]
  }
  
  @scala.inline
  implicit class ExternalClaimOps[Self <: ExternalClaim] (val x: Self) extends AnyVal {
    
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
    def setAcquiredTime(value: String): Self = this.set("acquiredTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcquiredTime: Self = this.set("acquiredTime", js.undefined)
    
    @scala.inline
    def setClaimName(value: String): Self = this.set("claimName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimName: Self = this.set("claimName", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
