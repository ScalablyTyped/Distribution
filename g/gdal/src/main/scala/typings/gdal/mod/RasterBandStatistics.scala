package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterBandStatistics extends StObject {
  
  var max: Double
  
  var mean: Double
  
  var min: Double
  
  var std_dev: Double
}
object RasterBandStatistics {
  
  inline def apply(max: Double, mean: Double, min: Double, std_dev: Double): RasterBandStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], std_dev = std_dev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterBandStatistics]
  }
  
  extension [Self <: RasterBandStatistics](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setStd_dev(value: Double): Self = StObject.set(x, "std_dev", value.asInstanceOf[js.Any])
  }
}
