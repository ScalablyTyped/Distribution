package typings.expressValidator

import typings.expressValidator.anon.PartialMatchedDataOptions
import typings.expressValidator.srcBaseMod.Location
import typings.expressValidator.srcBaseMod.Request
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMatchedDataMod {
  
  @JSImport("express-validator/src/matched-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchedData(req: Request): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchedData")(req.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def matchedData(req: Request, options: PartialMatchedDataOptions): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchedData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  trait MatchedDataOptions extends StObject {
    
    var includeOptionals: Boolean
    
    var locations: js.Array[Location]
    
    var onlyValidData: Boolean
  }
  object MatchedDataOptions {
    
    inline def apply(includeOptionals: Boolean, locations: js.Array[Location], onlyValidData: Boolean): MatchedDataOptions = {
      val __obj = js.Dynamic.literal(includeOptionals = includeOptionals.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], onlyValidData = onlyValidData.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchedDataOptions]
    }
    
    extension [Self <: MatchedDataOptions](x: Self) {
      
      inline def setIncludeOptionals(value: Boolean): Self = StObject.set(x, "includeOptionals", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setOnlyValidData(value: Boolean): Self = StObject.set(x, "onlyValidData", value.asInstanceOf[js.Any])
    }
  }
}
