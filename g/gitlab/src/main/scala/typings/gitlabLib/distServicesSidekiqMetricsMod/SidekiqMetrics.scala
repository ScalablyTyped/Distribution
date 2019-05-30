package typings
package gitlabLib.distServicesSidekiqMetricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidekiqMetrics
  extends gitlabLib.distInfrastructureMod.BaseService {
  def compoundMetrics(): js.Promise[gitlabLib.GetResponse] = js.native
  def jobStats(): js.Promise[gitlabLib.GetResponse] = js.native
  def processMetrics(): js.Promise[gitlabLib.GetResponse] = js.native
  def queueMetrics(): js.Promise[gitlabLib.GetResponse] = js.native
}

