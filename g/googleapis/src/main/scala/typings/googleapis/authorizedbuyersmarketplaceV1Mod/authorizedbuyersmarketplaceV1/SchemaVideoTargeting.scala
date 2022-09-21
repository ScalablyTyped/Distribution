package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoTargeting extends StObject {
  
  /**
    * A list of video positions to be excluded. When this field is populated, the targeted_position_types field must be empty.
    */
  var excludedPositionTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of video positions to be included. When this field is populated, the excluded_position_types field must be empty.
    */
  var targetedPositionTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaVideoTargeting {
  
  inline def apply(): SchemaVideoTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoTargeting]
  }
  
  extension [Self <: SchemaVideoTargeting](x: Self) {
    
    inline def setExcludedPositionTypes(value: js.Array[String]): Self = StObject.set(x, "excludedPositionTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludedPositionTypesNull: Self = StObject.set(x, "excludedPositionTypes", null)
    
    inline def setExcludedPositionTypesUndefined: Self = StObject.set(x, "excludedPositionTypes", js.undefined)
    
    inline def setExcludedPositionTypesVarargs(value: String*): Self = StObject.set(x, "excludedPositionTypes", js.Array(value*))
    
    inline def setTargetedPositionTypes(value: js.Array[String]): Self = StObject.set(x, "targetedPositionTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetedPositionTypesNull: Self = StObject.set(x, "targetedPositionTypes", null)
    
    inline def setTargetedPositionTypesUndefined: Self = StObject.set(x, "targetedPositionTypes", js.undefined)
    
    inline def setTargetedPositionTypesVarargs(value: String*): Self = StObject.set(x, "targetedPositionTypes", js.Array(value*))
  }
}
