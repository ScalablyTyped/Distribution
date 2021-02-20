package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Target scaling by CPU usage.
  */
@js.native
trait SchemaCpuUtilization extends StObject {
  
  /**
    * Period of time over which CPU utilization is calculated.
    */
  var aggregationWindowLength: js.UndefOr[String] = js.native
  
  /**
    * Target CPU utilization ratio to maintain when scaling. Must be between 0
    * and 1.
    */
  var targetUtilization: js.UndefOr[Double] = js.native
}
object SchemaCpuUtilization {
  
  @scala.inline
  def apply(): SchemaCpuUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCpuUtilization]
  }
  
  @scala.inline
  implicit class SchemaCpuUtilizationMutableBuilder[Self <: SchemaCpuUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationWindowLength(value: String): Self = StObject.set(x, "aggregationWindowLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationWindowLengthUndefined: Self = StObject.set(x, "aggregationWindowLength", js.undefined)
    
    @scala.inline
    def setTargetUtilization(value: Double): Self = StObject.set(x, "targetUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUtilizationUndefined: Self = StObject.set(x, "targetUtilization", js.undefined)
  }
}
