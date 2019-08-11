package typings.gitlab.distServicesSidekiqMetricsMod

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidekiqMetrics extends BaseService {
  def compoundMetrics(): js.Promise[GetResponse] = js.native
  def jobStats(): js.Promise[GetResponse] = js.native
  def processMetrics(): js.Promise[GetResponse] = js.native
  def queueMetrics(): js.Promise[GetResponse] = js.native
}

