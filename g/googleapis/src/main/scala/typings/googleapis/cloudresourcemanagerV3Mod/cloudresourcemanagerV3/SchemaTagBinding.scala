package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTagBinding extends StObject {
  
  /**
    * Output only. The name of the TagBinding. This is a String of the form: `tagBindings/{full-resource-name\}/{tag-value-name\}` (e.g. `tagBindings/%2F%2Fcloudresourcemanager.googleapis.com%2Fprojects%2F123/tagValues/456`).
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of the resource the TagValue is bound to. E.g. `//cloudresourcemanager.googleapis.com/projects/123`
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The TagValue of the TagBinding. Must be of the form `tagValues/456`.
    */
  var tagValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaTagBinding {
  
  inline def apply(): SchemaTagBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTagBinding]
  }
  
  extension [Self <: SchemaTagBinding](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setTagValue(value: String): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueNull: Self = StObject.set(x, "tagValue", null)
    
    inline def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
  }
}
