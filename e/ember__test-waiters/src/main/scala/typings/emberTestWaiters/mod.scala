package typings.emberTestWaiters

import typings.emberTestWaiters.typesMod.PendingWaiterState
import typings.emberTestWaiters.typesMod.TestWaiter
import typings.emberTestWaiters.typesMod.Token
import typings.emberTestWaiters.typesMod.Waiter
import typings.emberTestWaiters.waitForMod.AsyncFunction
import typings.emberTestWaiters.waitForMod.CoroutineFunction
import typings.rsvp.mod.default.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/test-waiters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildWaiter(name: String): TestWaiter[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildWaiter")(name.asInstanceOf[js.Any]).asInstanceOf[TestWaiter[Token]]
  
  inline def getPendingWaiterState(): PendingWaiterState = ^.asInstanceOf[js.Dynamic].applyDynamic("getPendingWaiterState")().asInstanceOf[PendingWaiterState]
  
  inline def getWaiters(): js.Array[Waiter] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWaiters")().asInstanceOf[js.Array[Waiter]]
  
  inline def hasPendingWaiters(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPendingWaiters")().asInstanceOf[Boolean]
  
  inline def register(waiter: Waiter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(waiter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_reset")().asInstanceOf[Unit]
  
  inline def resetWaiterNames(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_resetWaiterNames")().asInstanceOf[Unit]
  
  inline def unregister(waiter: Waiter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(waiter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def waitFor(fn: AsyncFunction[js.Array[Any], Any]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def waitFor(fn: AsyncFunction[js.Array[Any], Any], label: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def waitFor(target: js.Object, _key: String, descriptor: js.PropertyDescriptor): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(target.asInstanceOf[js.Any], _key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
  inline def waitFor(target: js.Object, _key: String, descriptor: js.PropertyDescriptor, label: String): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(target.asInstanceOf[js.Any], _key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
  
  inline def waitForPromise[T](promise: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def waitForPromise[T](promise: js.Promise[T], label: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForPromise")(promise.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def waitForPromise[T](promise: Promise[T]): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  inline def waitForPromise[T](promise: Promise[T], label: String): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForPromise")(promise.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
  
  inline def waitFor_CoroutineFunction(fn: CoroutineFunction[js.Array[Any], Any]): CoroutineFunction[js.Array[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any]).asInstanceOf[CoroutineFunction[js.Array[Any], Any]]
  inline def waitFor_CoroutineFunction(fn: CoroutineFunction[js.Array[Any], Any], label: String): CoroutineFunction[js.Array[Any], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[CoroutineFunction[js.Array[Any], Any]]
}
