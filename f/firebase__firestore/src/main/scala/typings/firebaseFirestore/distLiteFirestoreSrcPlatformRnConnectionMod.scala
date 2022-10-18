package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteConnectionMod.Connection
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcPlatformRnConnectionMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/platform/rn/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newConnection(databaseInfo: DatabaseInfo): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnection")(databaseInfo.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def newConnectivityMonitor(): ConnectivityMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnectivityMonitor")().asInstanceOf[ConnectivityMonitor]
}
