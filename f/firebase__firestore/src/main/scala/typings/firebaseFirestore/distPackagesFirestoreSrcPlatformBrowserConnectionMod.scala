package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteConnectionMod.Connection
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcPlatformBrowserConnectionMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/browser/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newConnection(databaseInfo: DatabaseInfo): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnection")(databaseInfo.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def newConnectivityMonitor(): ConnectivityMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnectivityMonitor")().asInstanceOf[ConnectivityMonitor]
}
