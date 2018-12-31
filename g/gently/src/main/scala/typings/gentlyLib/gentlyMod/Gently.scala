package typings
package gentlyLib.gentlyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gently extends js.Object {
  var hijacked: js.Array[_] = js.native
  def expect(obj: js.Any, method: java.lang.String): js.Function1[/* repeated */ js.Any, _] = js.native
  def expect(
    obj: js.Any,
    method: java.lang.String,
    count: scala.Double,
    stubFn: js.Function1[/* repeated */ js.Any, _]
  ): js.Function1[/* repeated */ js.Any, _] = js.native
  def expect(obj: js.Any, method: java.lang.String, stubFn: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def hijack(realRequire: js.Function1[/* id */ java.lang.String, _]): js.Function1[/* id */ java.lang.String, _] = js.native
  def restore(obj: js.Any, method: java.lang.String): scala.Unit = js.native
  def stub(location: java.lang.String): js.Any = js.native
  def stub(location: java.lang.String, exportsName: java.lang.String): js.Any = js.native
  def verify(): scala.Unit = js.native
  def verify(msg: java.lang.String): scala.Unit = js.native
}

