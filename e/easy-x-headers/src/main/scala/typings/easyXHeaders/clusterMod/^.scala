package typings.easyXHeaders.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var isMaster: Boolean = js.native
  var isWorker: Boolean = js.native
  var settings: ClusterSettings = js.native
  var worker: Worker_ = js.native
  var workers: js.Array[Worker_] = js.native
}

