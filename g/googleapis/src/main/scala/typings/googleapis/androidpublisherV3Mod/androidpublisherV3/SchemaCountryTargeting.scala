package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCountryTargeting extends StObject {
  
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  
  var includeRestOfWorld: js.UndefOr[Boolean] = js.undefined
}
object SchemaCountryTargeting {
  
  @scala.inline
  def apply(): SchemaCountryTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountryTargeting]
  }
  
  @scala.inline
  implicit class SchemaCountryTargetingMutableBuilder[Self <: SchemaCountryTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    @scala.inline
    def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value :_*))
    
    @scala.inline
    def setIncludeRestOfWorld(value: Boolean): Self = StObject.set(x, "includeRestOfWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeRestOfWorldUndefined: Self = StObject.set(x, "includeRestOfWorld", js.undefined)
  }
}
