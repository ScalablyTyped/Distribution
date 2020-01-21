package typings.functionBind

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("function-bind/implementation", JSImport.Namespace)
@js.native
object implementationMod extends js.Object {
  def apply[T](thisArg: js.Any): T = js.native
  def apply[AX, R](thisArg: js.Any, args: AX*): Instantiable1[/* args (repeated) */ AX, R] = js.native
  def apply[T, A /* <: js.Array[_] */, R](thisArg: T): js.Function1[/* args */ A, R] = js.native
  def apply[T, AX, R](thisArg: T, args: AX*): js.Function1[/* repeated */ AX, R] = js.native
  def apply[A0, A /* <: js.Array[_] */, R](thisArg: js.Any, arg0: A0): Instantiable1[/* args */ A, R] = js.native
  def apply[T, A0, A /* <: js.Array[_] */, R](thisArg: T, arg0: A0): js.Function1[/* args */ A, R] = js.native
  def apply[A0, A1, A /* <: js.Array[_] */, R](thisArg: js.Any, arg0: A0, arg1: A1): Instantiable1[/* args */ A, R] = js.native
  def apply[T, A0, A1, A /* <: js.Array[_] */, R](thisArg: T, arg0: A0, arg1: A1): js.Function1[/* args */ A, R] = js.native
  def apply[A0, A1, A2, A /* <: js.Array[_] */, R](thisArg: js.Any, arg0: A0, arg1: A1, arg2: A2): Instantiable1[/* args */ A, R] = js.native
  def apply[T, A0, A1, A2, A /* <: js.Array[_] */, R](thisArg: T, arg0: A0, arg1: A1, arg2: A2): js.Function1[/* args */ A, R] = js.native
  def apply[A0, A1, A2, A3, A /* <: js.Array[_] */, R](thisArg: js.Any, arg0: A0, arg1: A1, arg2: A2, arg3: A3): Instantiable1[/* args */ A, R] = js.native
  def apply[T, A0, A1, A2, A3, A /* <: js.Array[_] */, R](thisArg: T, arg0: A0, arg1: A1, arg2: A2, arg3: A3): js.Function1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply[AX, R](func: Instantiable1[/* args (repeated) */ AX, R], args: js.Array[_ | AX]): Instantiable1[/* args (repeated) */ AX, R] = js.native
  //#endregion
  //#region bind.apply():
  /**
  	 * Creates a bound function with the specified object as the this value and the elements of specified array as the arguments.
  	 * @param thisArg The object to be used as the this object.
  	 * @param args An array of argument values to be passed to the function.
  	 */
  // CallableFunction:
  @JSName("apply")
  def apply[T, A /* <: js.Array[_] */, R](func: js.ThisFunction1[/* this */ T, /* args */ A, R], args: js.Array[T]): js.Function1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply[A0, A /* <: js.Array[_] */, R](func: Instantiable2[/* arg0 */ A0, /* args */ A, R], args: js.Tuple2[_, A0]): Instantiable1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply[T, A0, A /* <: js.Array[_] */, R](func: js.ThisFunction2[/* this */ T, /* arg0 */ A0, /* args */ A, R], args: js.Tuple2[T, A0]): js.Function1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply[A0, A1, A /* <: js.Array[_] */, R](func: Instantiable3[/* arg0 */ A0, /* arg1 */ A1, /* args */ A, R], args: js.Tuple3[_, A0, A1]): Instantiable1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply[T, A0, A1, A /* <: js.Array[_] */, R](
    func: js.ThisFunction3[/* this */ T, /* arg0 */ A0, /* arg1 */ A1, /* args */ A, R],
    args: js.Tuple3[T, A0, A1]
  ): js.Function1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply[A0, A1, A2, A /* <: js.Array[_] */, R](
    func: Instantiable4[/* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* args */ A, R],
    args: js.Tuple4[_, A0, A1, A2]
  ): Instantiable1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply[T, A0, A1, A2, A /* <: js.Array[_] */, R](
    func: js.ThisFunction4[/* this */ T, /* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* args */ A, R],
    args: js.Tuple4[T, A0, A1, A2]
  ): js.Function1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply[A0, A1, A2, A3, A /* <: js.Array[_] */, R](
    func: Instantiable5[/* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* args */ A, R],
    args: js.Tuple5[_, A0, A1, A2, A3]
  ): Instantiable1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply[T, A0, A1, A2, A3, A /* <: js.Array[_] */, R](
    func: js.ThisFunction5[/* this */ T, /* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* args */ A, R],
    args: js.Tuple5[T, A0, A1, A2, A3]
  ): js.Function1[/* args */ A, R] = js.native
  // NewableFunction:
  @JSName("apply")
  def apply_A_ArrayWildcardR[A /* <: js.Array[_] */, R](func: Instantiable1[/* args */ A, R], args: js.Array[_]): Instantiable1[/* args */ A, R] = js.native
  @JSName("apply")
  def apply_TAXR[T, AX, R](func: js.ThisFunction1[/* this */ T, /* repeated */ AX, R], args: js.Array[T | AX]): js.Function1[/* repeated */ AX, R] = js.native
  // NewableFunction:
  def call[A /* <: js.Array[_] */, R](func: Instantiable1[/* args */ A, R], thisArg: js.Any): Instantiable1[/* args */ A, R] = js.native
  def call[AX, R](func: Instantiable1[/* args (repeated) */ AX, R], thisArg: js.Any, args: AX*): Instantiable1[/* args (repeated) */ AX, R] = js.native
  //#region bind.call():
  /**
  	 * Creates a bound function with the specified object as the this value and the specified rest arguments as the arguments.
  	 * @param thisArg The object to be used as the this object.
  	 * @param args Argument values to be passed to the function.
  	 */
  // CallableFunction:
  def call[T, A /* <: js.Array[_] */, R](func: js.ThisFunction1[/* this */ T, /* args */ A, R], thisArg: T): js.Function1[/* args */ A, R] = js.native
  def call[T, AX, R](func: js.ThisFunction1[/* this */ T, /* repeated */ AX, R], thisArg: T, args: AX*): js.Function1[/* repeated */ AX, R] = js.native
  def call[A0, A /* <: js.Array[_] */, R](func: Instantiable2[/* arg0 */ A0, /* args */ A, R], thisArg: js.Any, arg0: A0): Instantiable1[/* args */ A, R] = js.native
  def call[T, A0, A /* <: js.Array[_] */, R](func: js.ThisFunction2[/* this */ T, /* arg0 */ A0, /* args */ A, R], thisArg: T, arg0: A0): js.Function1[/* args */ A, R] = js.native
  def call[A0, A1, A /* <: js.Array[_] */, R](
    func: Instantiable3[/* arg0 */ A0, /* arg1 */ A1, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0,
    arg1: A1
  ): Instantiable1[/* args */ A, R] = js.native
  def call[T, A0, A1, A /* <: js.Array[_] */, R](
    func: js.ThisFunction3[/* this */ T, /* arg0 */ A0, /* arg1 */ A1, /* args */ A, R],
    thisArg: T,
    arg0: A0,
    arg1: A1
  ): js.Function1[/* args */ A, R] = js.native
  def call[A0, A1, A2, A /* <: js.Array[_] */, R](
    func: Instantiable4[/* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0,
    arg1: A1,
    arg2: A2
  ): Instantiable1[/* args */ A, R] = js.native
  def call[T, A0, A1, A2, A /* <: js.Array[_] */, R](
    func: js.ThisFunction4[/* this */ T, /* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* args */ A, R],
    thisArg: T,
    arg0: A0,
    arg1: A1,
    arg2: A2
  ): js.Function1[/* args */ A, R] = js.native
  def call[A0, A1, A2, A3, A /* <: js.Array[_] */, R](
    func: Instantiable5[/* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0,
    arg1: A1,
    arg2: A2,
    arg3: A3
  ): Instantiable1[/* args */ A, R] = js.native
  def call[T, A0, A1, A2, A3, A /* <: js.Array[_] */, R](
    func: js.ThisFunction5[/* this */ T, /* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* args */ A, R],
    thisArg: T,
    arg0: A0,
    arg1: A1,
    arg2: A2,
    arg3: A3
  ): js.Function1[/* args */ A, R] = js.native
}

