package typings
package expressDashClusterLib.expressDashClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  def apply(config: Config, fn: WorkerFunction): scala.Unit = js.native
  def apply(fn: WorkerFunction, config: Config): scala.Unit = js.native
}

