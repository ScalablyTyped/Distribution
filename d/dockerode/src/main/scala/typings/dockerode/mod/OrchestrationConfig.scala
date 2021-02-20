package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrchestrationConfig extends StObject {
  
  var TaskHistoryRetentionLimit: js.UndefOr[Double] = js.native
}
object OrchestrationConfig {
  
  @scala.inline
  def apply(): OrchestrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrchestrationConfig]
  }
  
  @scala.inline
  implicit class OrchestrationConfigMutableBuilder[Self <: OrchestrationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskHistoryRetentionLimit(value: Double): Self = StObject.set(x, "TaskHistoryRetentionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskHistoryRetentionLimitUndefined: Self = StObject.set(x, "TaskHistoryRetentionLimit", js.undefined)
  }
}
