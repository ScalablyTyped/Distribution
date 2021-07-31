package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubnetworksSetPrivateIpGoogleAccessRequest extends StObject {
  
  var privateIpGoogleAccess: js.UndefOr[Boolean] = js.undefined
}
object SchemaSubnetworksSetPrivateIpGoogleAccessRequest {
  
  @scala.inline
  def apply(): SchemaSubnetworksSetPrivateIpGoogleAccessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworksSetPrivateIpGoogleAccessRequest]
  }
  
  @scala.inline
  implicit class SchemaSubnetworksSetPrivateIpGoogleAccessRequestMutableBuilder[Self <: SchemaSubnetworksSetPrivateIpGoogleAccessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateIpGoogleAccess(value: Boolean): Self = StObject.set(x, "privateIpGoogleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpGoogleAccessUndefined: Self = StObject.set(x, "privateIpGoogleAccess", js.undefined)
  }
}
