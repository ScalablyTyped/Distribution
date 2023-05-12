package typings.emberTestWaiters

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitForMod {
  
  @JSImport("@ember/test-waiters/wait-for", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: AsyncFunction[js.Array[Any], Any]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def default(fn: AsyncFunction[js.Array[Any], Any], label: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def default(target: js.Object, _key: String, descriptor: js.PropertyDescriptor): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], _key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
  inline def default(target: js.Object, _key: String, descriptor: js.PropertyDescriptor, label: String): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], _key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
  
  inline def default_CoroutineFunction(fn: CoroutineFunction[js.Array[Any], Any]): CoroutineFunction[js.Array[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[CoroutineFunction[js.Array[Any], Any]]
  inline def default_CoroutineFunction(fn: CoroutineFunction[js.Array[Any], Any], label: String): CoroutineFunction[js.Array[Any], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[CoroutineFunction[js.Array[Any], Any]]
  
  type AsyncFunction[A /* <: js.Array[Any] */, PromiseReturn] = js.Function1[/* args */ A, js.Promise[PromiseReturn]]
  
  type CoroutineFunction[A /* <: js.Array[Any] */, T] = js.Function1[/* args */ A, CoroutineGenerator[T]]
  
  type CoroutineGenerator[T] = Generator[Any, T, Any]
}
