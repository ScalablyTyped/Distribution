package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcApiReferenceMod.Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/internal", JSImport.Namespace)
@js.native
object distSrcApiInternalMod extends js.Object {
  def dataUpdateCount(ref: Reference): Double = js.native
  def forceLongPolling(): Unit = js.native
  def forceWebSockets(): Unit = js.native
  def interceptServerData(ref: Reference, callback: js.Function2[/* a */ String, /* b */ js.Any, Unit]): Unit = js.native
  def isWebSocketsAvailable(): Boolean = js.native
  def setSecurityDebugCallback(ref: Reference, callback: js.Function1[/* a */ js.Object, Unit]): Unit = js.native
  def stats(ref: Reference): Unit = js.native
  def stats(ref: Reference, showDelta: Boolean): Unit = js.native
  def statsIncrementCounter(ref: Reference, metric: String): Unit = js.native
}

