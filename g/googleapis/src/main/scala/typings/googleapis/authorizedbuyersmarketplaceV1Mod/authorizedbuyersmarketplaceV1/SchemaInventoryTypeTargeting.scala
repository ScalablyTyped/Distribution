package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventoryTypeTargeting extends StObject {
  
  /**
    * The list of targeted inventory types for the bid request.
    */
  var inventoryTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaInventoryTypeTargeting {
  
  inline def apply(): SchemaInventoryTypeTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryTypeTargeting]
  }
  
  extension [Self <: SchemaInventoryTypeTargeting](x: Self) {
    
    inline def setInventoryTypes(value: js.Array[String]): Self = StObject.set(x, "inventoryTypes", value.asInstanceOf[js.Any])
    
    inline def setInventoryTypesNull: Self = StObject.set(x, "inventoryTypes", null)
    
    inline def setInventoryTypesUndefined: Self = StObject.set(x, "inventoryTypes", js.undefined)
    
    inline def setInventoryTypesVarargs(value: String*): Self = StObject.set(x, "inventoryTypes", js.Array(value*))
  }
}
