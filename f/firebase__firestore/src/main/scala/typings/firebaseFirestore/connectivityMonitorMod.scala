package typings.firebaseFirestore

import typings.firebaseFirestore.remoteConnectivityMonitorMod.ConnectivityMonitor
import typings.firebaseFirestore.remoteConnectivityMonitorMod.ConnectivityMonitorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/browser/connectivity_monitor", JSImport.Namespace)
@js.native
object connectivityMonitorMod extends js.Object {
  @js.native
  class BrowserConnectivityMonitor () extends ConnectivityMonitor {
    var callbacks: js.Any = js.native
    var configureNetworkMonitoring: js.Any = js.native
    val networkAvailableListener: js.Any = js.native
    val networkUnavailableListener: js.Any = js.native
    var onNetworkAvailable: js.Any = js.native
    var onNetworkUnavailable: js.Any = js.native
    /**
      * Adds a callback to be called when connectivity changes.
      *
      * Callbacks are not made on the initial state of connectivity, since this
      * monitor is primarily used for resetting backoff in the remote store when
      * connectivity changes. As such, the initial connectivity state is
      * irrelevant here.
      */
    /* CompleteClass */
    override def addCallback(callback: ConnectivityMonitorCallback): Unit = js.native
    /**
      * Stops monitoring connectivity. After this call completes, no further
      * callbacks will be triggered. After shutdown() is called, no further calls
      * are allowed on this instance.
      */
    /* CompleteClass */
    override def shutdown(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object BrowserConnectivityMonitor extends js.Object {
    /** Checks that all used attributes of window are available. */
    def isAvailable(): Boolean = js.native
  }
  
}

