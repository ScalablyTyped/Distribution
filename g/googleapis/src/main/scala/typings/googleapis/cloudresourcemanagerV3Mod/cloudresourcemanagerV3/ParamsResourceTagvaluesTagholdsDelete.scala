package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagvaluesTagholdsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the TagHold to delete. Must be of the form: `tagValues/{tag-value-id\}/tagHolds/{tag-hold-id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Set to true to perform the validations necessary for deleting the resource, but not actually perform the action.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceTagvaluesTagholdsDelete {
  
  inline def apply(): ParamsResourceTagvaluesTagholdsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagvaluesTagholdsDelete]
  }
  
  extension [Self <: ParamsResourceTagvaluesTagholdsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
