package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreServicesSidekiqMetricsMod.SidekiqMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/SidekiqMetrics", JSImport.Namespace)
@js.native
object distSrcCoreServicesSidekiqMetricsMod extends js.Object {
  @js.native
  trait SidekiqMetrics extends BaseService {
    def compoundMetrics(): js.Promise[GetResponse] = js.native
    def jobStats(): js.Promise[GetResponse] = js.native
    def processMetrics(): js.Promise[GetResponse] = js.native
    def queueMetrics(): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends SidekiqMetrics
  
}

