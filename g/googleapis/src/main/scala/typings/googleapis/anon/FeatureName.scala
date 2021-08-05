package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureName extends StObject {
  
  var featureName: js.UndefOr[String] = js.undefined
  
  var featureRate: js.UndefOr[Double] = js.undefined
}
object FeatureName {
  
  inline def apply(): FeatureName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureName]
  }
  
  extension [Self <: FeatureName](x: Self) {
    
    inline def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    
    inline def setFeatureNameUndefined: Self = StObject.set(x, "featureName", js.undefined)
    
    inline def setFeatureRate(value: Double): Self = StObject.set(x, "featureRate", value.asInstanceOf[js.Any])
    
    inline def setFeatureRateUndefined: Self = StObject.set(x, "featureRate", js.undefined)
  }
}
