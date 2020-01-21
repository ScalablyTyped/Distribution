package typings.electronJsonStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-json-storage", "set")
@js.native
object set extends js.Object {
  def apply(key: String, json: js.Object, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def apply(
    key: String,
    json: js.Object,
    options: DataOptions,
    callback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
}

