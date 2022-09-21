package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientState extends StObject {
  
  /**
    * The caller can specify asset tags for this resource
    */
  var assetTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The compliance state of the resource as specified by the API client.
    */
  var complianceState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the client state data was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field may be used to store a unique identifier for the API resource within which these CustomAttributes are a field.
    */
  var customId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The token that needs to be passed back for concurrency control in updates. Token needs to be passed back in UpdateRequest
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Health score of the resource
    */
  var healthScore: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The map of key-value attributes stored by callers specific to a device. The total serialized length of this map may not exceed 10KB. No limit is placed on the number of attributes in a map.
    */
  var keyValuePairs: js.UndefOr[StringDictionary[SchemaCustomAttributeValue] | Null] = js.undefined
  
  /**
    * Output only. The time the client state data was last updated.
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The management state of the resource as specified by the API client.
    */
  var managed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the ClientState in format: `devices/{device_id\}/deviceUsers/{device_user_id\}/clientState/{partner_id\}`, where partner_id corresponds to the partner storing the data.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The owner of the ClientState
    */
  var ownerType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A descriptive cause of the health score.
    */
  var scoreReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaClientState {
  
  inline def apply(): SchemaClientState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientState]
  }
  
  extension [Self <: SchemaClientState](x: Self) {
    
    inline def setAssetTags(value: js.Array[String]): Self = StObject.set(x, "assetTags", value.asInstanceOf[js.Any])
    
    inline def setAssetTagsNull: Self = StObject.set(x, "assetTags", null)
    
    inline def setAssetTagsUndefined: Self = StObject.set(x, "assetTags", js.undefined)
    
    inline def setAssetTagsVarargs(value: String*): Self = StObject.set(x, "assetTags", js.Array(value*))
    
    inline def setComplianceState(value: String): Self = StObject.set(x, "complianceState", value.asInstanceOf[js.Any])
    
    inline def setComplianceStateNull: Self = StObject.set(x, "complianceState", null)
    
    inline def setComplianceStateUndefined: Self = StObject.set(x, "complianceState", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCustomId(value: String): Self = StObject.set(x, "customId", value.asInstanceOf[js.Any])
    
    inline def setCustomIdNull: Self = StObject.set(x, "customId", null)
    
    inline def setCustomIdUndefined: Self = StObject.set(x, "customId", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setHealthScore(value: String): Self = StObject.set(x, "healthScore", value.asInstanceOf[js.Any])
    
    inline def setHealthScoreNull: Self = StObject.set(x, "healthScore", null)
    
    inline def setHealthScoreUndefined: Self = StObject.set(x, "healthScore", js.undefined)
    
    inline def setKeyValuePairs(value: StringDictionary[SchemaCustomAttributeValue]): Self = StObject.set(x, "keyValuePairs", value.asInstanceOf[js.Any])
    
    inline def setKeyValuePairsNull: Self = StObject.set(x, "keyValuePairs", null)
    
    inline def setKeyValuePairsUndefined: Self = StObject.set(x, "keyValuePairs", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setManaged(value: String): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
    
    inline def setManagedNull: Self = StObject.set(x, "managed", null)
    
    inline def setManagedUndefined: Self = StObject.set(x, "managed", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwnerType(value: String): Self = StObject.set(x, "ownerType", value.asInstanceOf[js.Any])
    
    inline def setOwnerTypeNull: Self = StObject.set(x, "ownerType", null)
    
    inline def setOwnerTypeUndefined: Self = StObject.set(x, "ownerType", js.undefined)
    
    inline def setScoreReason(value: String): Self = StObject.set(x, "scoreReason", value.asInstanceOf[js.Any])
    
    inline def setScoreReasonNull: Self = StObject.set(x, "scoreReason", null)
    
    inline def setScoreReasonUndefined: Self = StObject.set(x, "scoreReason", js.undefined)
  }
}
