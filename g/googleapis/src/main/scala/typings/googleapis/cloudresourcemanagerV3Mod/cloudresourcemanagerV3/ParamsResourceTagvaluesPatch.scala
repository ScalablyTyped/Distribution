package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagvaluesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable. Resource name for TagValue in the format `tagValues/456`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTagValue] = js.undefined
  
  /**
    * Optional. Fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. True to perform validations necessary for updating the resource, but not actually perform the action.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceTagvaluesPatch {
  
  inline def apply(): ParamsResourceTagvaluesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagvaluesPatch]
  }
  
  extension [Self <: ParamsResourceTagvaluesPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaTagValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
