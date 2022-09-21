package typings.googleapis.admobV1Mod.admobV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAdUnitsResponse extends StObject {
  
  /**
    * The resulting ad units for the requested account.
    */
  var adUnits: js.UndefOr[js.Array[SchemaAdUnit]] = js.undefined
  
  /**
    * If not empty, indicates that there may be more ad units for the request; this value should be passed in a new `ListAdUnitsRequest`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAdUnitsResponse {
  
  inline def apply(): SchemaListAdUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAdUnitsResponse]
  }
  
  extension [Self <: SchemaListAdUnitsResponse](x: Self) {
    
    inline def setAdUnits(value: js.Array[SchemaAdUnit]): Self = StObject.set(x, "adUnits", value.asInstanceOf[js.Any])
    
    inline def setAdUnitsUndefined: Self = StObject.set(x, "adUnits", js.undefined)
    
    inline def setAdUnitsVarargs(value: SchemaAdUnit*): Self = StObject.set(x, "adUnits", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
