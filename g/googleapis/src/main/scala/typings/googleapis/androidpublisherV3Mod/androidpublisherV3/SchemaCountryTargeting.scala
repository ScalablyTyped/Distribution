package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCountryTargeting extends StObject {
  
  /**
    * Countries to target, specified as two letter [CLDR codes](https://unicode.org/cldr/charts/latest/supplemental/territory_containment_un_m_49.html).
    */
  var countries: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Include "rest of world" as well as explicitly targeted countries.
    */
  var includeRestOfWorld: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCountryTargeting {
  
  inline def apply(): SchemaCountryTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountryTargeting]
  }
  
  extension [Self <: SchemaCountryTargeting](x: Self) {
    
    inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setCountriesNull: Self = StObject.set(x, "countries", null)
    
    inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
    
    inline def setIncludeRestOfWorld(value: Boolean): Self = StObject.set(x, "includeRestOfWorld", value.asInstanceOf[js.Any])
    
    inline def setIncludeRestOfWorldNull: Self = StObject.set(x, "includeRestOfWorld", null)
    
    inline def setIncludeRestOfWorldUndefined: Self = StObject.set(x, "includeRestOfWorld", js.undefined)
  }
}
