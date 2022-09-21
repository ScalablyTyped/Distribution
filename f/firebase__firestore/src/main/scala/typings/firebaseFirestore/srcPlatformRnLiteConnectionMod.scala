package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcRemoteConnectionMod.Connection
import typings.firebaseFirestore.firestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitor
import typings.firebaseFirestore.srcCoreDatabaseInfoMod.DatabaseInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPlatformRnLiteConnectionMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/platform/rn_lite/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newConnection(databaseInfo: DatabaseInfo): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnection")(databaseInfo.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def newConnectivityMonitor(): ConnectivityMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnectivityMonitor")().asInstanceOf[ConnectivityMonitor]
}
