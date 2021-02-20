package typings.firebaseDatabase

import typings.firebaseDatabase.anon.App
import typings.firebaseDatabase.anon.Instance
import typings.firebaseDatabase.referenceMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("@firebase/database/dist/src/api/internal", "dataUpdateCount")
  @js.native
  def dataUpdateCount(ref: Reference): Double = js.native
  
  @JSImport("@firebase/database/dist/src/api/internal", "forceLongPolling")
  @js.native
  def forceLongPolling(): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/api/internal", "forceWebSockets")
  @js.native
  def forceWebSockets(): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/api/internal", "initStandalone")
  @js.native
  def initStandalone[T](hasAppUrlVersionCustomAuthImplNamespaceNodeAdmin: App[T]): Instance[T] = js.native
  
  @JSImport("@firebase/database/dist/src/api/internal", "interceptServerData")
  @js.native
  def interceptServerData(ref: Reference, callback: js.Function2[/* a */ String, /* b */ js.Any, Unit]): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/api/internal", "isWebSocketsAvailable")
  @js.native
  def isWebSocketsAvailable(): Boolean = js.native
  
  @JSImport("@firebase/database/dist/src/api/internal", "setSecurityDebugCallback")
  @js.native
  def setSecurityDebugCallback(ref: Reference, callback: js.Function1[/* a */ js.Object, Unit]): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/api/internal", "stats")
  @js.native
  def stats(ref: Reference): Unit = js.native
  @JSImport("@firebase/database/dist/src/api/internal", "stats")
  @js.native
  def stats(ref: Reference, showDelta: Boolean): Unit = js.native
  
  @JSImport("@firebase/database/dist/src/api/internal", "statsIncrementCounter")
  @js.native
  def statsIncrementCounter(ref: Reference, metric: String): Unit = js.native
}
