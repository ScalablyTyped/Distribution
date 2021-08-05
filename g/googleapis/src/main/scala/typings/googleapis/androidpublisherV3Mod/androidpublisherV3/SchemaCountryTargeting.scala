package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCountryTargeting extends StObject {
  
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  
  var includeRestOfWorld: js.UndefOr[Boolean] = js.undefined
}
object SchemaCountryTargeting {
  
  inline def apply(): SchemaCountryTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountryTargeting]
  }
  
  extension [Self <: SchemaCountryTargeting](x: Self) {
    
    inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
    
    inline def setIncludeRestOfWorld(value: Boolean): Self = StObject.set(x, "includeRestOfWorld", value.asInstanceOf[js.Any])
    
    inline def setIncludeRestOfWorldUndefined: Self = StObject.set(x, "includeRestOfWorld", js.undefined)
  }
}
