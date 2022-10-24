package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesSidekiqMetricsMod {
  
  @JSImport("gitlab/dist/types/core/services/SidekiqMetrics", "SidekiqMetrics")
  @js.native
  open class SidekiqMetrics () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def compoundMetrics(): js.Promise[GetResponse] = js.native
    
    def jobStats(): js.Promise[GetResponse] = js.native
    
    def processMetrics(): js.Promise[GetResponse] = js.native
    
    def queueMetrics(): js.Promise[GetResponse] = js.native
  }
}
