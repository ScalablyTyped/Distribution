package typings.firebaseFirestore.connectivityMonitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectivityMonitor extends js.Object {
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
  @scala.inline
  def apply(addCallback: ConnectivityMonitorCallback => Unit, shutdown: () => Unit): ConnectivityMonitor = {
    val __obj = js.Dynamic.literal(addCallback = js.Any.fromFunction1(addCallback), shutdown = js.Any.fromFunction0(shutdown))
    __obj.asInstanceOf[ConnectivityMonitor]
  }
}

