package typings.easyDashXapiDashSupertest.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var isMaster: Boolean = js.native
  var isWorker: Boolean = js.native
  var settings: ClusterSettings = js.native
  var worker: Worker = js.native
  var workers: js.Array[Worker] = js.native
  def addListener(event: String, listener: js.Function): Unit = js.native
  def disconnect(): Unit = js.native
  def disconnect(callback: js.Function): Unit = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def fork(): Worker = js.native
  def fork(env: js.Any): Worker = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def on(event: String, listener: js.Function): js.Any = js.native
  def once(event: String, listener: js.Function): Unit = js.native
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(event: String): Unit = js.native
  def removeListener(event: String, listener: js.Function): Unit = js.native
  def setMaxListeners(n: Double): Unit = js.native
  def setupMaster(): Unit = js.native
  def setupMaster(settings: ClusterSettings): Unit = js.native
}

