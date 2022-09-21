package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessLocations extends StObject {
  
  /**
    * The "home office" location of the principal. A two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some limited situations Google systems may refer refer to a region code instead of a country code. Possible Region Codes: * ASI: Asia * EUR: Europe * OCE: Oceania * AFR: Africa * NAM: North America * SAM: South America * ANT: Antarctica * ANY: Any location
    */
  var principalOfficeCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Physical location of the principal at the time of the access. A two-letter country code (ISO 3166-1 alpha-2), such as "US", "DE" or "GB" or a region code. In some limited situations Google systems may refer refer to a region code instead of a country code. Possible Region Codes: * ASI: Asia * EUR: Europe * OCE: Oceania * AFR: Africa * NAM: North America * SAM: South America * ANT: Antarctica * ANY: Any location
    */
  var principalPhysicalLocationCountry: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccessLocations {
  
  inline def apply(): SchemaAccessLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessLocations]
  }
  
  extension [Self <: SchemaAccessLocations](x: Self) {
    
    inline def setPrincipalOfficeCountry(value: String): Self = StObject.set(x, "principalOfficeCountry", value.asInstanceOf[js.Any])
    
    inline def setPrincipalOfficeCountryNull: Self = StObject.set(x, "principalOfficeCountry", null)
    
    inline def setPrincipalOfficeCountryUndefined: Self = StObject.set(x, "principalOfficeCountry", js.undefined)
    
    inline def setPrincipalPhysicalLocationCountry(value: String): Self = StObject.set(x, "principalPhysicalLocationCountry", value.asInstanceOf[js.Any])
    
    inline def setPrincipalPhysicalLocationCountryNull: Self = StObject.set(x, "principalPhysicalLocationCountry", null)
    
    inline def setPrincipalPhysicalLocationCountryUndefined: Self = StObject.set(x, "principalPhysicalLocationCountry", js.undefined)
  }
}
