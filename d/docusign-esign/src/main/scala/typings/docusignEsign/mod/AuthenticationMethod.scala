package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationMethod extends js.Object {
  
  /**
    * Indicates the type of authentication. Valid values are:
    *
    * - `PhoneAuth`
    * - `STAN`
    * - `ISCheck`
    * - `OFAC`
    * - `AccessCode`
    * - `AgeVerify`
    * - `SSOAuth`
    */
  var authenticationType: js.UndefOr[String] = js.native
  
  /**
    * The last provider that authenticated the user.
    */
  var lastProvider: js.UndefOr[String] = js.native
  
  /**
    *  The data and time the user last used the authentication method.
    */
  var lastTimestamp: js.UndefOr[String] = js.native
  
  /**
    * The number of times the authentication method was used.
    */
  var totalCount: js.UndefOr[String] = js.native
}
object AuthenticationMethod {
  
  @scala.inline
  def apply(): AuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethod]
  }
  
  @scala.inline
  implicit class AuthenticationMethodOps[Self <: AuthenticationMethod] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationType(value: String): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationType: Self = this.set("authenticationType", js.undefined)
    
    @scala.inline
    def setLastProvider(value: String): Self = this.set("lastProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastProvider: Self = this.set("lastProvider", js.undefined)
    
    @scala.inline
    def setLastTimestamp(value: String): Self = this.set("lastTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastTimestamp: Self = this.set("lastTimestamp", js.undefined)
    
    @scala.inline
    def setTotalCount(value: String): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
