package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProvisioningQuota extends StObject {
  
  /**
    * The asset type of this provisioning quota.
    */
  var assetType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The available count of the provisioning quota.
    */
  var availableCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The gcp service of the provisioning quota.
    */
  var gcpService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instance quota.
    */
  var instanceQuota: js.UndefOr[SchemaInstanceQuota] = js.undefined
  
  /**
    * The specific location of the provisioining quota.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the provisioning quota.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network bandwidth, Gbps
    */
  var networkBandwidth: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Server count.
    */
  var serverCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Storage size (GB).
    */
  var storageGib: js.UndefOr[String | Null] = js.undefined
}
object SchemaProvisioningQuota {
  
  inline def apply(): SchemaProvisioningQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvisioningQuota]
  }
  
  extension [Self <: SchemaProvisioningQuota](x: Self) {
    
    inline def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeNull: Self = StObject.set(x, "assetType", null)
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setAvailableCount(value: Double): Self = StObject.set(x, "availableCount", value.asInstanceOf[js.Any])
    
    inline def setAvailableCountNull: Self = StObject.set(x, "availableCount", null)
    
    inline def setAvailableCountUndefined: Self = StObject.set(x, "availableCount", js.undefined)
    
    inline def setGcpService(value: String): Self = StObject.set(x, "gcpService", value.asInstanceOf[js.Any])
    
    inline def setGcpServiceNull: Self = StObject.set(x, "gcpService", null)
    
    inline def setGcpServiceUndefined: Self = StObject.set(x, "gcpService", js.undefined)
    
    inline def setInstanceQuota(value: SchemaInstanceQuota): Self = StObject.set(x, "instanceQuota", value.asInstanceOf[js.Any])
    
    inline def setInstanceQuotaUndefined: Self = StObject.set(x, "instanceQuota", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkBandwidth(value: String): Self = StObject.set(x, "networkBandwidth", value.asInstanceOf[js.Any])
    
    inline def setNetworkBandwidthNull: Self = StObject.set(x, "networkBandwidth", null)
    
    inline def setNetworkBandwidthUndefined: Self = StObject.set(x, "networkBandwidth", js.undefined)
    
    inline def setServerCount(value: String): Self = StObject.set(x, "serverCount", value.asInstanceOf[js.Any])
    
    inline def setServerCountNull: Self = StObject.set(x, "serverCount", null)
    
    inline def setServerCountUndefined: Self = StObject.set(x, "serverCount", js.undefined)
    
    inline def setStorageGib(value: String): Self = StObject.set(x, "storageGib", value.asInstanceOf[js.Any])
    
    inline def setStorageGibNull: Self = StObject.set(x, "storageGib", null)
    
    inline def setStorageGibUndefined: Self = StObject.set(x, "storageGib", js.undefined)
  }
}
