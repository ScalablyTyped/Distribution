package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCriteriaTargeting extends StObject {
  
  /**
    * A list of numeric IDs to be excluded.
    */
  var excludedCriteriaIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of numeric IDs to be included.
    */
  var targetedCriteriaIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCriteriaTargeting {
  
  inline def apply(): SchemaCriteriaTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCriteriaTargeting]
  }
  
  extension [Self <: SchemaCriteriaTargeting](x: Self) {
    
    inline def setExcludedCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "excludedCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedCriteriaIdsNull: Self = StObject.set(x, "excludedCriteriaIds", null)
    
    inline def setExcludedCriteriaIdsUndefined: Self = StObject.set(x, "excludedCriteriaIds", js.undefined)
    
    inline def setExcludedCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "excludedCriteriaIds", js.Array(value*))
    
    inline def setTargetedCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "targetedCriteriaIds", value.asInstanceOf[js.Any])
    
    inline def setTargetedCriteriaIdsNull: Self = StObject.set(x, "targetedCriteriaIds", null)
    
    inline def setTargetedCriteriaIdsUndefined: Self = StObject.set(x, "targetedCriteriaIds", js.undefined)
    
    inline def setTargetedCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "targetedCriteriaIds", js.Array(value*))
  }
}
