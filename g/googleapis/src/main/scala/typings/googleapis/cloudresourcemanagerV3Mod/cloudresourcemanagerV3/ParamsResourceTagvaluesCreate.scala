package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagvaluesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTagValue] = js.undefined
  
  /**
    * Optional. Set as true to perform the validations necessary for creating the resource, but not actually perform the action.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceTagvaluesCreate {
  
  inline def apply(): ParamsResourceTagvaluesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagvaluesCreate]
  }
  
  extension [Self <: ParamsResourceTagvaluesCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaTagValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
