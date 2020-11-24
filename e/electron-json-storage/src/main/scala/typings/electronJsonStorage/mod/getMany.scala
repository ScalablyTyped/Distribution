package typings.electronJsonStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-json-storage", "getMany")
@js.native
object getMany extends js.Object {
  
  def apply(keys: js.Array[String], callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  def apply(
    keys: js.Array[String],
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]
  ): Unit = js.native
}
