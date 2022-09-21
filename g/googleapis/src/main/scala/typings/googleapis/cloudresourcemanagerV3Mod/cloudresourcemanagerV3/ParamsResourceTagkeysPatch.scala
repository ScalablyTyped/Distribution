package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagkeysPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable. The resource name for a TagKey. Must be in the format `tagKeys/{tag_key_id\}`, where `tag_key_id` is the generated numeric id for the TagKey.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTagKey] = js.undefined
  
  /**
    * Fields to be updated. The mask may only contain `description` or `etag`. If omitted entirely, both `description` and `etag` are assumed to be significant.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /**
    * Set as true to perform validations necessary for updating the resource, but not actually perform the action.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceTagkeysPatch {
  
  inline def apply(): ParamsResourceTagkeysPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagkeysPatch]
  }
  
  extension [Self <: ParamsResourceTagkeysPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaTagKey): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
