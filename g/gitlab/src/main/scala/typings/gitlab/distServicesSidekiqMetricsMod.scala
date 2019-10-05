package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distServicesSidekiqMetricsMod.SidekiqMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/SidekiqMetrics", JSImport.Namespace)
@js.native
object distServicesSidekiqMetricsMod extends js.Object {
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

