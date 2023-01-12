package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrchestrationConfig extends StObject {
  
  var TaskHistoryRetentionLimit: js.UndefOr[Double] = js.undefined
}
object OrchestrationConfig {
  
  inline def apply(): OrchestrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrchestrationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrchestrationConfig] (val x: Self) extends AnyVal {
    
    inline def setTaskHistoryRetentionLimit(value: Double): Self = StObject.set(x, "TaskHistoryRetentionLimit", value.asInstanceOf[js.Any])
    
    inline def setTaskHistoryRetentionLimitUndefined: Self = StObject.set(x, "TaskHistoryRetentionLimit", js.undefined)
  }
}
