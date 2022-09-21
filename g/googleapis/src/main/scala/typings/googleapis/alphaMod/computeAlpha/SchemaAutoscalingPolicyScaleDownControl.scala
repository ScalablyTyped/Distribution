package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAutoscalingPolicyScaleDownControl extends StObject {
  
  /**
    * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
    */
  var maxScaledDownReplicas: js.UndefOr[SchemaFixedOrPercent] = js.undefined
  
  /**
    * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
    */
  var timeWindowSec: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAutoscalingPolicyScaleDownControl {
  
  inline def apply(): SchemaAutoscalingPolicyScaleDownControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingPolicyScaleDownControl]
  }
  
  extension [Self <: SchemaAutoscalingPolicyScaleDownControl](x: Self) {
    
    inline def setMaxScaledDownReplicas(value: SchemaFixedOrPercent): Self = StObject.set(x, "maxScaledDownReplicas", value.asInstanceOf[js.Any])
    
    inline def setMaxScaledDownReplicasUndefined: Self = StObject.set(x, "maxScaledDownReplicas", js.undefined)
    
    inline def setTimeWindowSec(value: Double): Self = StObject.set(x, "timeWindowSec", value.asInstanceOf[js.Any])
    
    inline def setTimeWindowSecNull: Self = StObject.set(x, "timeWindowSec", null)
    
    inline def setTimeWindowSecUndefined: Self = StObject.set(x, "timeWindowSec", js.undefined)
  }
}
