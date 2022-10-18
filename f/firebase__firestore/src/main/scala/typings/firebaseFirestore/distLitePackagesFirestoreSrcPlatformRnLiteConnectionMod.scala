package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.distLitePackagesFirestoreSrcRemoteConnectionMod.Connection
import typings.firebaseFirestore.distLitePackagesFirestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcPlatformRnLiteConnectionMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/platform/rn_lite/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newConnection(databaseInfo: DatabaseInfo): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnection")(databaseInfo.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def newConnectivityMonitor(): ConnectivityMonitor = ^.asInstanceOf[js.Dynamic].applyDynamic("newConnectivityMonitor")().asInstanceOf[ConnectivityMonitor]
}
