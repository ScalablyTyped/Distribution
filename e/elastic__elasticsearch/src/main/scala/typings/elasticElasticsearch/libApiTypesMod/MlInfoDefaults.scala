package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInfoDefaults extends StObject {
  
  var anomaly_detectors: MlInfoAnomalyDetectors
  
  var datafeeds: MlInfoDatafeeds
}
object MlInfoDefaults {
  
  inline def apply(anomaly_detectors: MlInfoAnomalyDetectors, datafeeds: MlInfoDatafeeds): MlInfoDefaults = {
    val __obj = js.Dynamic.literal(anomaly_detectors = anomaly_detectors.asInstanceOf[js.Any], datafeeds = datafeeds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInfoDefaults]
  }
  
  extension [Self <: MlInfoDefaults](x: Self) {
    
    inline def setAnomaly_detectors(value: MlInfoAnomalyDetectors): Self = StObject.set(x, "anomaly_detectors", value.asInstanceOf[js.Any])
    
    inline def setDatafeeds(value: MlInfoDatafeeds): Self = StObject.set(x, "datafeeds", value.asInstanceOf[js.Any])
  }
}
