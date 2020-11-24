package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNetworksUpdatePeeringRequest extends js.Object {
  
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.native
}
object SchemaNetworksUpdatePeeringRequest {
  
  @scala.inline
  def apply(): SchemaNetworksUpdatePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksUpdatePeeringRequest]
  }
  
  @scala.inline
  implicit class SchemaNetworksUpdatePeeringRequestOps[Self <: SchemaNetworksUpdatePeeringRequest] (val x: Self) extends AnyVal {
    
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
    def setNetworkPeering(value: SchemaNetworkPeering): Self = this.set("networkPeering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkPeering: Self = this.set("networkPeering", js.undefined)
  }
}
