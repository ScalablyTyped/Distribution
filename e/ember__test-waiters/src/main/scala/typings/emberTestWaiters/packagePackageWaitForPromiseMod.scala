package typings.emberTestWaiters

import typings.rsvp.mod.default.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagePackageWaitForPromiseMod {
  
  @JSImport("@ember/test-waiters/package/package/wait-for-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](promise: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def default[T](promise: js.Promise[T], label: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def default[T](promise: Promise[T]): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
  inline def default[T](promise: Promise[T], label: String): Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Promise[T]]
}
