package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTagValue extends StObject {
  
  /**
    * Output only. Creation time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. User-assigned description of the TagValue. Must not exceed 256 characters. Read-write.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagValueRequest for details.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Resource name for TagValue in the format `tagValues/456`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Namespaced name of the TagValue. Now only supported in the format `{organization_id\}/{tag_key_short_name\}/{short_name\}`. Other formats will be supported when we add non-org parented tags.
    */
  var namespacedName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The resource name of the new TagValue's parent TagKey. Must be of the form `tagKeys/{tag_key_id\}`.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. User-assigned short name for TagValue. The short name should be unique for TagValues within the same parent TagKey. The short name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
    */
  var shortName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Update time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTagValue {
  
  inline def apply(): SchemaTagValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagValue]
  }
  
  extension [Self <: SchemaTagValue](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespacedName(value: String): Self = StObject.set(x, "namespacedName", value.asInstanceOf[js.Any])
    
    inline def setNamespacedNameNull: Self = StObject.set(x, "namespacedName", null)
    
    inline def setNamespacedNameUndefined: Self = StObject.set(x, "namespacedName", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameNull: Self = StObject.set(x, "shortName", null)
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
