package typings.expressCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  def apply(config: Config, fn: WorkerFunction): Unit = js.native
  def apply(fn: WorkerFunction, config: Config): Unit = js.native
}

