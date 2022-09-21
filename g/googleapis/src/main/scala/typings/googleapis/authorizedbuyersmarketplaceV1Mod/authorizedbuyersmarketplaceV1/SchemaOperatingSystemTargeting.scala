package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperatingSystemTargeting extends StObject {
  
  /**
    * IDs of operating systems to be included/excluded.
    */
  var operatingSystemCriteria: js.UndefOr[SchemaCriteriaTargeting] = js.undefined
  
  /**
    * IDs of operating system versions to be included/excluded.
    */
  var operatingSystemVersionCriteria: js.UndefOr[SchemaCriteriaTargeting] = js.undefined
}
object SchemaOperatingSystemTargeting {
  
  inline def apply(): SchemaOperatingSystemTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemTargeting]
  }
  
  extension [Self <: SchemaOperatingSystemTargeting](x: Self) {
    
    inline def setOperatingSystemCriteria(value: SchemaCriteriaTargeting): Self = StObject.set(x, "operatingSystemCriteria", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemCriteriaUndefined: Self = StObject.set(x, "operatingSystemCriteria", js.undefined)
    
    inline def setOperatingSystemVersionCriteria(value: SchemaCriteriaTargeting): Self = StObject.set(x, "operatingSystemVersionCriteria", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemVersionCriteriaUndefined: Self = StObject.set(x, "operatingSystemVersionCriteria", js.undefined)
  }
}
