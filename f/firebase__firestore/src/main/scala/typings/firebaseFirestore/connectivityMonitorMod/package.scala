package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectivityMonitorMod {
  type ConnectivityMonitorCallback = js.Function1[
    /* status */ typings.firebaseFirestore.connectivityMonitorMod.NetworkStatus, 
    scala.Unit
  ]
}
