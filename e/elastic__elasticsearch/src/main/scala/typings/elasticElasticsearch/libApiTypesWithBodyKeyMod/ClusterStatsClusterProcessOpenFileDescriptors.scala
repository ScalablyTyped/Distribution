package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterProcessOpenFileDescriptors extends StObject {
  
  var avg: long
  
  var max: long
  
  var min: long
}
object ClusterStatsClusterProcessOpenFileDescriptors {
  
  inline def apply(avg: long, max: long, min: long): ClusterStatsClusterProcessOpenFileDescriptors = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterProcessOpenFileDescriptors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterProcessOpenFileDescriptors] (val x: Self) extends AnyVal {
    
    inline def setAvg(value: long): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: long): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: long): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
