package typings.expect.expectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect", "createSpy")
@js.native
object createSpy extends js.Object {
  def apply(): Spy[_] = js.native
  def apply(fn: js.Function1[/* repeated */ js.Any, _]): Spy[_] = js.native
  def apply(fn: js.Function1[/* repeated */ js.Any, _], restore: js.Function1[/* repeated */ js.Any, _]): Spy[_] = js.native
}

