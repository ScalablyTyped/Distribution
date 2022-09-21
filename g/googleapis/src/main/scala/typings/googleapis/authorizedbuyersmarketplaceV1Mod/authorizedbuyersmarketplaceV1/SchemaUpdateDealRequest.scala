package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateDealRequest extends StObject {
  
  /**
    * Required. The deal to update. The deal's `name` field is used to identify the deal to be updated. Note: proposal_revision will have to be provided within the resource or else an error will be thrown. Format: buyers/{accountId\}/proposals/{proposalId\}/deals/{dealId\}
    */
  var deal: js.UndefOr[SchemaDeal] = js.undefined
  
  /**
    * List of fields to be updated. If empty or unspecified, the service will update all fields populated in the update request excluding the output only fields and primitive fields with default value. Note that explicit field mask is required in order to reset a primitive field back to its default value, for example, false for boolean fields, 0 for integer fields. A special field mask consisting of a single path "*" can be used to indicate full replacement(the equivalent of PUT method), updatable fields unset or unspecified in the input will be cleared or set to default value. Output only fields will be ignored regardless of the value of updateMask.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateDealRequest {
  
  inline def apply(): SchemaUpdateDealRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDealRequest]
  }
  
  extension [Self <: SchemaUpdateDealRequest](x: Self) {
    
    inline def setDeal(value: SchemaDeal): Self = StObject.set(x, "deal", value.asInstanceOf[js.Any])
    
    inline def setDealUndefined: Self = StObject.set(x, "deal", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
