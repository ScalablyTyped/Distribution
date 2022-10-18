package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitor
import typings.firebaseFirestore.distFirestoreSrcRemoteConnectivityMonitorMod.ConnectivityMonitorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcPlatformBrowserConnectivityMonitorMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/platform/browser/connectivity_monitor", "BrowserConnectivityMonitor")
  @js.native
  open class BrowserConnectivityMonitor ()
    extends StObject
       with ConnectivityMonitor {
    
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
    
    /* private */ var callbacks: Any = js.native
    
    /* private */ var configureNetworkMonitoring: Any = js.native
    
    /* private */ val networkAvailableListener: Any = js.native
    
    /* private */ val networkUnavailableListener: Any = js.native
    
    /* private */ var onNetworkAvailable: Any = js.native
    
    /* private */ var onNetworkUnavailable: Any = js.native
    
    /**
      * Stops monitoring connectivity. After this call completes, no further
      * callbacks will be triggered. After shutdown() is called, no further calls
      * are allowed on this instance.
      */
    /* CompleteClass */
    override def shutdown(): Unit = js.native
  }
  /* static members */
  object BrowserConnectivityMonitor {
    
    @JSImport("@firebase/firestore/dist/firestore/src/platform/browser/connectivity_monitor", "BrowserConnectivityMonitor")
    @js.native
    val ^ : js.Any = js.native
    
    /** Checks that all used attributes of window are available. */
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
}
