package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.init")
@js.native
object init extends js.Object {
  def apply(): Unit = js.native
  def apply(input: js.Function0[Double | Null]): Unit = js.native
  def apply(input: js.Function0[Double | Null], output: js.Function1[/* c */ Double, _]): Unit = js.native
  def apply(
    input: js.Function0[Double | Null],
    output: js.Function1[/* c */ Double, _],
    error: js.Function1[/* c */ Double, _]
  ): Unit = js.native
  def apply(input: js.Function0[Double | Null], output: Null, error: js.Function1[/* c */ Double, _]): Unit = js.native
  def apply(input: Null, output: js.Function1[/* c */ Double, _]): Unit = js.native
  def apply(input: Null, output: js.Function1[/* c */ Double, _], error: js.Function1[/* c */ Double, _]): Unit = js.native
  def apply(input: Null, output: Null, error: js.Function1[/* c */ Double, _]): Unit = js.native
}

