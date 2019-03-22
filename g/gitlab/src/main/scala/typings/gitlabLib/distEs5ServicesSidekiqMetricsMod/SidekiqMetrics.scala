package typings
package gitlabLib.distEs5ServicesSidekiqMetricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidekiqMetrics
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def compoundMetrics(): js.Promise[_] = js.native
  def jobStats(): js.Promise[_] = js.native
  def processMetrics(): js.Promise[_] = js.native
  def queueMetrics(): js.Promise[_] = js.native
}

