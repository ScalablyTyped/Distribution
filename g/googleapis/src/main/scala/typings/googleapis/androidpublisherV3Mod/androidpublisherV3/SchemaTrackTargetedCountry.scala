package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrackTargetedCountry extends StObject {
  
  /**
    * The country to target, as a two-letter CLDR code.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaTrackTargetedCountry {
  
  inline def apply(): SchemaTrackTargetedCountry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrackTargetedCountry]
  }
  
  extension [Self <: SchemaTrackTargetedCountry](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
  }
}
