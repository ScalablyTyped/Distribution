package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.syncfs")
@js.native
object syncfs extends js.Object {
  def apply(callback: js.Function1[/* e */ js.Any, _]): Unit = js.native
  def apply(callback: js.Function1[/* e */ js.Any, _], populate: Boolean): Unit = js.native
  //
  // core
  //
  def apply(populate: Boolean, callback: js.Function1[/* e */ js.Any, _]): Unit = js.native
}

