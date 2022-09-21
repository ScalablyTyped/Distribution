package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCpuUtilization extends StObject {
  
  /**
    * Period of time over which CPU utilization is calculated.
    */
  var aggregationWindowLength: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1.
    */
  var targetUtilization: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCpuUtilization {
  
  inline def apply(): SchemaCpuUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCpuUtilization]
  }
  
  extension [Self <: SchemaCpuUtilization](x: Self) {
    
    inline def setAggregationWindowLength(value: String): Self = StObject.set(x, "aggregationWindowLength", value.asInstanceOf[js.Any])
    
    inline def setAggregationWindowLengthNull: Self = StObject.set(x, "aggregationWindowLength", null)
    
    inline def setAggregationWindowLengthUndefined: Self = StObject.set(x, "aggregationWindowLength", js.undefined)
    
    inline def setTargetUtilization(value: Double): Self = StObject.set(x, "targetUtilization", value.asInstanceOf[js.Any])
    
    inline def setTargetUtilizationNull: Self = StObject.set(x, "targetUtilization", null)
    
    inline def setTargetUtilizationUndefined: Self = StObject.set(x, "targetUtilization", js.undefined)
  }
}
