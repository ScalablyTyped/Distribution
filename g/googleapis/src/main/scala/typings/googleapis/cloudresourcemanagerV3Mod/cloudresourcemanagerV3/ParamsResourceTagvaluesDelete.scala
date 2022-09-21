package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagvaluesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The etag known to the client for the expected state of the TagValue. This is to be used for optimistic concurrency.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name for TagValue to be deleted in the format tagValues/456.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Set as true to perform the validations necessary for deletion, but not actually perform the action.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceTagvaluesDelete {
  
  inline def apply(): ParamsResourceTagvaluesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagvaluesDelete]
  }
  
  extension [Self <: ParamsResourceTagvaluesDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
