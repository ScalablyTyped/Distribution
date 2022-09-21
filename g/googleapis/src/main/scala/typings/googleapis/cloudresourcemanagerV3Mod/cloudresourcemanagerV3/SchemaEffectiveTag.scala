package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEffectiveTag extends StObject {
  
  /**
    * Indicates the inheritance status of a tag value attached to the given resource. If the tag value is inherited from one of the resource's ancestors, inherited will be true. If false, then the tag value is directly attached to the resource, inherited will be false.
    */
  var inherited: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The namespaced_name of the TagKey. Now only supported in the format of `{organization_id\}/{tag_key_short_name\}`. Other formats will be supported when we add non-org parented tags.
    */
  var namespacedTagKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Namespaced name of the TagValue. Now only supported in the format `{organization_id\}/{tag_key_short_name\}/{tag_value_short_name\}`. Other formats will be supported when we add non-org parented tags.
    */
  var namespacedTagValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the TagKey, in the format `tagKeys/{id\}`, such as `tagKeys/123`.
    */
  var tagKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name for TagValue in the format `tagValues/456`.
    */
  var tagValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaEffectiveTag {
  
  inline def apply(): SchemaEffectiveTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEffectiveTag]
  }
  
  extension [Self <: SchemaEffectiveTag](x: Self) {
    
    inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setInheritedNull: Self = StObject.set(x, "inherited", null)
    
    inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
    
    inline def setNamespacedTagKey(value: String): Self = StObject.set(x, "namespacedTagKey", value.asInstanceOf[js.Any])
    
    inline def setNamespacedTagKeyNull: Self = StObject.set(x, "namespacedTagKey", null)
    
    inline def setNamespacedTagKeyUndefined: Self = StObject.set(x, "namespacedTagKey", js.undefined)
    
    inline def setNamespacedTagValue(value: String): Self = StObject.set(x, "namespacedTagValue", value.asInstanceOf[js.Any])
    
    inline def setNamespacedTagValueNull: Self = StObject.set(x, "namespacedTagValue", null)
    
    inline def setNamespacedTagValueUndefined: Self = StObject.set(x, "namespacedTagValue", js.undefined)
    
    inline def setTagKey(value: String): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyNull: Self = StObject.set(x, "tagKey", null)
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
    
    inline def setTagValue(value: String): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueNull: Self = StObject.set(x, "tagValue", null)
    
    inline def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
  }
}
