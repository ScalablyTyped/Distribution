package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/SidekiqMetrics", JSImport.Namespace)
@js.native
object sidekiqMetricsMod extends js.Object {
  @js.native
  class SidekiqMetrics () extends BaseService {
    def compoundMetrics(): js.Promise[GetResponse] = js.native
    def jobStats(): js.Promise[GetResponse] = js.native
    def processMetrics(): js.Promise[GetResponse] = js.native
    def queueMetrics(): js.Promise[GetResponse] = js.native
  }
  
}

