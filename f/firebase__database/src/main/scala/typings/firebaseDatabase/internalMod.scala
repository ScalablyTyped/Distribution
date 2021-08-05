package typings.firebaseDatabase

import typings.firebaseDatabase.anon.App
import typings.firebaseDatabase.anon.Instance
import typings.firebaseDatabase.referenceMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("@firebase/database/dist/src/api/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dataUpdateCount(ref: Reference): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dataUpdateCount")(ref.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def forceLongPolling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLongPolling")().asInstanceOf[Unit]
  
  inline def forceWebSockets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceWebSockets")().asInstanceOf[Unit]
  
  inline def initStandalone[T](hasAppUrlVersionCustomAuthImplNamespaceNodeAdmin: App[T]): Instance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("initStandalone")(hasAppUrlVersionCustomAuthImplNamespaceNodeAdmin.asInstanceOf[js.Any]).asInstanceOf[Instance[T]]
  
  inline def interceptServerData(ref: Reference, callback: js.Function2[/* a */ String, /* b */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("interceptServerData")(ref.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isWebSocketsAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebSocketsAvailable")().asInstanceOf[Boolean]
  
  inline def setSecurityDebugCallback(ref: Reference, callback: js.Function1[/* a */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSecurityDebugCallback")(ref.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stats(ref: Reference): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stats")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def stats(ref: Reference, showDelta: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stats")(ref.asInstanceOf[js.Any], showDelta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def statsIncrementCounter(ref: Reference, metric: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statsIncrementCounter")(ref.asInstanceOf[js.Any], metric.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
