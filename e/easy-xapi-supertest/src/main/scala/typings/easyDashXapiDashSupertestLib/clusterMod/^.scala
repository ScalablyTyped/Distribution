package typings
package easyDashXapiDashSupertestLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var isMaster: scala.Boolean = js.native
  var isWorker: scala.Boolean = js.native
  var settings: ClusterSettings = js.native
  var worker: Worker = js.native
  var workers: js.Array[Worker] = js.native
  def addListener(event: java.lang.String, listener: js.Function): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function): scala.Unit = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def fork(): Worker = js.native
  def fork(env: js.Any): Worker = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function): js.Any = js.native
  def once(event: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeAllListeners(): scala.Unit = js.native
  def removeAllListeners(event: java.lang.String): scala.Unit = js.native
  def removeListener(event: java.lang.String, listener: js.Function): scala.Unit = js.native
  def setMaxListeners(n: scala.Double): scala.Unit = js.native
  def setupMaster(): scala.Unit = js.native
  def setupMaster(settings: ClusterSettings): scala.Unit = js.native
}

