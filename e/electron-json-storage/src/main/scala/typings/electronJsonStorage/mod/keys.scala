package typings.electronJsonStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-json-storage", "keys")
@js.native
object keys extends js.Object {
  def apply(callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[String], Unit]): Unit = js.native
  def apply(
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[String], Unit]
  ): Unit = js.native
}

