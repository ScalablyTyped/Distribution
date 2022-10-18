package typings.expressValidator.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<express-validator.express-validator/src/matched-data.MatchedDataOptions> */
trait PartialMatchedDataOptions extends StObject {
  
  var includeOptionals: js.UndefOr[Boolean] = js.undefined
  
  var locations: js.UndefOr[js.Array[typings.expressValidator.srcBaseMod.Location]] = js.undefined
  
  var onlyValidData: js.UndefOr[Boolean] = js.undefined
}
object PartialMatchedDataOptions {
  
  inline def apply(): PartialMatchedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatchedDataOptions]
  }
  
  extension [Self <: PartialMatchedDataOptions](x: Self) {
    
    inline def setIncludeOptionals(value: Boolean): Self = StObject.set(x, "includeOptionals", value.asInstanceOf[js.Any])
    
    inline def setIncludeOptionalsUndefined: Self = StObject.set(x, "includeOptionals", js.undefined)
    
    inline def setLocations(value: js.Array[typings.expressValidator.srcBaseMod.Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: typings.expressValidator.srcBaseMod.Location*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setOnlyValidData(value: Boolean): Self = StObject.set(x, "onlyValidData", value.asInstanceOf[js.Any])
    
    inline def setOnlyValidDataUndefined: Self = StObject.set(x, "onlyValidData", js.undefined)
  }
}
