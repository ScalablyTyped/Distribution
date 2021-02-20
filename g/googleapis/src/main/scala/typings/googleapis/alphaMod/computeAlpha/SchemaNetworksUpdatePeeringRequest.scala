package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNetworksUpdatePeeringRequest extends StObject {
  
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.native
}
object SchemaNetworksUpdatePeeringRequest {
  
  @scala.inline
  def apply(): SchemaNetworksUpdatePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksUpdatePeeringRequest]
  }
  
  @scala.inline
  implicit class SchemaNetworksUpdatePeeringRequestMutableBuilder[Self <: SchemaNetworksUpdatePeeringRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkPeering(value: SchemaNetworkPeering): Self = StObject.set(x, "networkPeering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPeeringUndefined: Self = StObject.set(x, "networkPeering", js.undefined)
  }
}
