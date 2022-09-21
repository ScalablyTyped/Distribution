package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExplanation extends StObject {
  
  /**
    * Attribution of feature.
    */
  var attribution: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The full feature name. For non-numerical features, will be formatted like `.`. Overall size of feature name will always be truncated to first 120 characters.
    */
  var featureName: js.UndefOr[String | Null] = js.undefined
}
object SchemaExplanation {
  
  inline def apply(): SchemaExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplanation]
  }
  
  extension [Self <: SchemaExplanation](x: Self) {
    
    inline def setAttribution(value: Double): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionNull: Self = StObject.set(x, "attribution", null)
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureNameNull: Self = StObject.set(x, "featureName", null)
    
    inline def setFeatureNameUndefined: Self = StObject.set(x, "featureName", js.undefined)
  }
}
