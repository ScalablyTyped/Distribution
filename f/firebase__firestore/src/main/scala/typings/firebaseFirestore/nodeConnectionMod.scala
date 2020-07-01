package typings.firebaseFirestore

import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.firebaseFirestore.remoteConnectivityMonitorMod.ConnectivityMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/connection", JSImport.Namespace)
@js.native
object nodeConnectionMod extends js.Object {
  def newConnection(databaseInfo: DatabaseInfo): js.Promise[Connection] = js.native
  def newConnectivityMonitor(): ConnectivityMonitor = js.native
}

