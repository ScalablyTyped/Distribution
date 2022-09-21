package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlobalAddressesMoveRequest extends StObject {
  
  /**
    * An optional destination address description if intended to be different from the source.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the destination address to move to. This can be a full or partial URL. For example, the following are all valid URLs to a address: - https://www.googleapis.com/compute/v1/projects/project /global/addresses/address - projects/project/global/addresses/address Note that destination project must be different from the source project. So /global/addresses/address is not valid partial url.
    */
  var destinationAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaGlobalAddressesMoveRequest {
  
  inline def apply(): SchemaGlobalAddressesMoveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlobalAddressesMoveRequest]
  }
  
  extension [Self <: SchemaGlobalAddressesMoveRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinationAddress(value: String): Self = StObject.set(x, "destinationAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressNull: Self = StObject.set(x, "destinationAddress", null)
    
    inline def setDestinationAddressUndefined: Self = StObject.set(x, "destinationAddress", js.undefined)
  }
}
