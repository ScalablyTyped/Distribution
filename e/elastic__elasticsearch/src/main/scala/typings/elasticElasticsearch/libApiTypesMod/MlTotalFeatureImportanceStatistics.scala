package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTotalFeatureImportanceStatistics extends StObject {
  
  var max: integer
  
  var mean_magnitude: double
  
  var min: integer
}
object MlTotalFeatureImportanceStatistics {
  
  inline def apply(max: integer, mean_magnitude: double, min: integer): MlTotalFeatureImportanceStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], mean_magnitude = mean_magnitude.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTotalFeatureImportanceStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlTotalFeatureImportanceStatistics] (val x: Self) extends AnyVal {
    
    inline def setMax(value: integer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMean_magnitude(value: double): Self = StObject.set(x, "mean_magnitude", value.asInstanceOf[js.Any])
    
    inline def setMin(value: integer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
