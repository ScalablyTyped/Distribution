package typings.gently.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gently extends js.Object {
  var hijacked: js.Array[_] = js.native
  def expect(obj: js.Any, method: String): js.Function1[/* repeated */ js.Any, _] = js.native
  def expect(obj: js.Any, method: String, count: Double, stubFn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def expect(obj: js.Any, method: String, stubFn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def hijack(realRequire: js.Function1[/* id */ String, _]): js.Function1[/* id */ String, _] = js.native
  def restore(obj: js.Any, method: String): Unit = js.native
  def stub(location: String): js.Any = js.native
  def stub(location: String, exportsName: String): js.Any = js.native
  def verify(): Unit = js.native
  def verify(msg: String): Unit = js.native
}

