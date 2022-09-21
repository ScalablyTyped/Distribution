package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkConfig extends StObject {
  
  /**
    * Interconnect bandwidth. Set only when type is CLIENT.
    */
  var bandwidth: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CIDR range of the network.
    */
  var cidr: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A transient unique identifier to identify a volume within an ProvisioningConfig request.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location where to deploy the network.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Service CIDR, if any.
    */
  var serviceCidr: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of this network.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User note field, it can be used by customers to add additional information for the BMS Ops team (b/194021617).
    */
  var userNote: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of VLAN attachments. As of now there are always 2 attachments, but it is going to change in the future (multi vlan).
    */
  var vlanAttachments: js.UndefOr[js.Array[SchemaVlanAttachment]] = js.undefined
}
object SchemaNetworkConfig {
  
  inline def apply(): SchemaNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkConfig]
  }
  
  extension [Self <: SchemaNetworkConfig](x: Self) {
    
    inline def setBandwidth(value: String): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthNull: Self = StObject.set(x, "bandwidth", null)
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setCidr(value: String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrNull: Self = StObject.set(x, "cidr", null)
    
    inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setServiceCidr(value: String): Self = StObject.set(x, "serviceCidr", value.asInstanceOf[js.Any])
    
    inline def setServiceCidrNull: Self = StObject.set(x, "serviceCidr", null)
    
    inline def setServiceCidrUndefined: Self = StObject.set(x, "serviceCidr", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserNote(value: String): Self = StObject.set(x, "userNote", value.asInstanceOf[js.Any])
    
    inline def setUserNoteNull: Self = StObject.set(x, "userNote", null)
    
    inline def setUserNoteUndefined: Self = StObject.set(x, "userNote", js.undefined)
    
    inline def setVlanAttachments(value: js.Array[SchemaVlanAttachment]): Self = StObject.set(x, "vlanAttachments", value.asInstanceOf[js.Any])
    
    inline def setVlanAttachmentsUndefined: Self = StObject.set(x, "vlanAttachments", js.undefined)
    
    inline def setVlanAttachmentsVarargs(value: SchemaVlanAttachment*): Self = StObject.set(x, "vlanAttachments", js.Array(value*))
  }
}
