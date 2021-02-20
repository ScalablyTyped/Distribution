package typings.expressValidator

import typings.expressValidator.anon.PartialMatchedDataOptions
import typings.expressValidator.baseMod.Location
import typings.expressValidator.baseMod.Request
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchedDataMod {
  
  @JSImport("express-validator/src/matched-data", "matchedData")
  @js.native
  def matchedData(req: Request): Record[String, _] = js.native
  @JSImport("express-validator/src/matched-data", "matchedData")
  @js.native
  def matchedData(req: Request, options: PartialMatchedDataOptions): Record[String, _] = js.native
  
  @js.native
  trait MatchedDataOptions extends StObject {
    
    var includeOptionals: Boolean = js.native
    
    var locations: js.Array[Location] = js.native
    
    var onlyValidData: Boolean = js.native
  }
  object MatchedDataOptions {
    
    @scala.inline
    def apply(includeOptionals: Boolean, locations: js.Array[Location], onlyValidData: Boolean): MatchedDataOptions = {
      val __obj = js.Dynamic.literal(includeOptionals = includeOptionals.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], onlyValidData = onlyValidData.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchedDataOptions]
    }
    
    @scala.inline
    implicit class MatchedDataOptionsMutableBuilder[Self <: MatchedDataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeOptionals(value: Boolean): Self = StObject.set(x, "includeOptionals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setOnlyValidData(value: Boolean): Self = StObject.set(x, "onlyValidData", value.asInstanceOf[js.Any])
    }
  }
}
