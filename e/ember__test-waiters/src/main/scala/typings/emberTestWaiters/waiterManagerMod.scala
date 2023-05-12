package typings.emberTestWaiters

import typings.emberTestWaiters.typesMod.PendingWaiterState
import typings.emberTestWaiters.typesMod.Waiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waiterManagerMod {
  
  @JSImport("@ember/test-waiters/waiter-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPendingWaiterState(): PendingWaiterState = ^.asInstanceOf[js.Dynamic].applyDynamic("getPendingWaiterState")().asInstanceOf[PendingWaiterState]
  
  inline def getWaiters(): js.Array[Waiter] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWaiters")().asInstanceOf[js.Array[Waiter]]
  
  inline def hasPendingWaiters(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPendingWaiters")().asInstanceOf[Boolean]
  
  inline def register(waiter: Waiter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(waiter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_reset")().asInstanceOf[Unit]
  
  inline def unregister(waiter: Waiter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(waiter.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
