package typings.firebaseFirestore

import typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagesFirestoreSrcRemoteConnectivityMonitorMod {
  
  trait ConnectivityMonitor extends StObject {
    
    /**
      * Adds a callback to be called when connectivity changes.
      *
      * Callbacks are not made on the initial state of connectivity, since this
      * monitor is primarily used for resetting backoff in the remote store when
      * connectivity changes. As such, the initial connectivity state is
      * irrelevant here.
      */
    def addCallback(callback: ConnectivityMonitorCallback): Unit
    
    /**
      * Stops monitoring connectivity. After this call completes, no further
      * callbacks will be triggered. After shutdown() is called, no further calls
      * are allowed on this instance.
      */
    def shutdown(): Unit
  }
  object ConnectivityMonitor {
    
    inline def apply(addCallback: ConnectivityMonitorCallback => Unit, shutdown: () => Unit): ConnectivityMonitor = {
      val __obj = js.Dynamic.literal(addCallback = js.Any.fromFunction1(addCallback), shutdown = js.Any.fromFunction0(shutdown))
      __obj.asInstanceOf[ConnectivityMonitor]
    }
    
    extension [Self <: ConnectivityMonitor](x: Self) {
      
      inline def setAddCallback(value: ConnectivityMonitorCallback => Unit): Self = StObject.set(x, "addCallback", js.Any.fromFunction1(value))
      
      inline def setShutdown(value: () => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    }
  }
  
  type ConnectivityMonitorCallback = js.Function1[/* status */ NetworkStatus, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
    - typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
  */
  trait NetworkStatus extends StObject
  object NetworkStatus {
    
    inline def AVAILABLE: `0` = 0.asInstanceOf[`0`]
    
    inline def UNAVAILABLE: `1` = 1.asInstanceOf[`1`]
  }
}
