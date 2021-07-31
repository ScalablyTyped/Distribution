package typings.firebaseDatabase.anon

import typings.firebaseDatabase.referenceMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofINTERNAL extends StObject {
  
  def dataUpdateCount(ref: Reference): Double = js.native
  
  def forceLongPolling(): Unit = js.native
  
  def forceWebSockets(): Unit = js.native
  
  def initStandalone[T](hasAppUrlVersionCustomAuthImplNamespaceNodeAdmin: App[T]): Instance[T] = js.native
  
  def interceptServerData(ref: Reference, callback: js.Function2[/* a */ String, /* b */ js.Any, Unit]): Unit = js.native
  
  def isWebSocketsAvailable(): Boolean = js.native
  
  def setSecurityDebugCallback(ref: Reference, callback: js.Function1[/* a */ js.Object, Unit]): Unit = js.native
  
  def stats(ref: Reference): Unit = js.native
  def stats(ref: Reference, showDelta: Boolean): Unit = js.native
  
  def statsIncrementCounter(ref: Reference, metric: String): Unit = js.native
}
