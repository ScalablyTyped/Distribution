package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDayPartTargeting extends StObject {
  
  /**
    * The targeted weekdays and times
    */
  var dayParts: js.UndefOr[js.Array[SchemaDayPart]] = js.undefined
  
  /**
    * The time zone type of the day parts
    */
  var timeZoneType: js.UndefOr[String | Null] = js.undefined
}
object SchemaDayPartTargeting {
  
  inline def apply(): SchemaDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDayPartTargeting]
  }
  
  extension [Self <: SchemaDayPartTargeting](x: Self) {
    
    inline def setDayParts(value: js.Array[SchemaDayPart]): Self = StObject.set(x, "dayParts", value.asInstanceOf[js.Any])
    
    inline def setDayPartsUndefined: Self = StObject.set(x, "dayParts", js.undefined)
    
    inline def setDayPartsVarargs(value: SchemaDayPart*): Self = StObject.set(x, "dayParts", js.Array(value*))
    
    inline def setTimeZoneType(value: String): Self = StObject.set(x, "timeZoneType", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneTypeNull: Self = StObject.set(x, "timeZoneType", null)
    
    inline def setTimeZoneTypeUndefined: Self = StObject.set(x, "timeZoneType", js.undefined)
  }
}
