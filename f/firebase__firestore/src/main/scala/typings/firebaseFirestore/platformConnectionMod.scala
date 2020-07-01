package typings.firebaseFirestore

import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.firebaseFirestore.remoteConnectivityMonitorMod.ConnectivityMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/connection", JSImport.Namespace)
@js.native
object platformConnectionMod extends js.Object {
  def newConnection(databaseInfo: DatabaseInfo): js.Promise[Connection] = js.native
  def newConnectivityMonitor(): ConnectivityMonitor = js.native
}

