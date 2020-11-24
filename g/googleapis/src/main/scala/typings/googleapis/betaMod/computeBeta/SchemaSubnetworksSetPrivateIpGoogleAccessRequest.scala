package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSubnetworksSetPrivateIpGoogleAccessRequest extends js.Object {
  
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.native
}
object SchemaSubnetworksSetPrivateIpGoogleAccessRequest {
  
  @scala.inline
  def apply(): SchemaSubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworksSetPrivateIpGoogleAccessRequest]
  }
  
  @scala.inline
  implicit class SchemaSubnetworksSetPrivateIpGoogleAccessRequestOps[Self <: SchemaSubnetworksSetPrivateIpGoogleAccessRequest] (val x: Self) extends AnyVal {
    
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
    def setPrivateIpGoogleAccess(value: Boolean): Self = this.set("privateIpGoogleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpGoogleAccess: Self = this.set("privateIpGoogleAccess", js.undefined)
  }
}
