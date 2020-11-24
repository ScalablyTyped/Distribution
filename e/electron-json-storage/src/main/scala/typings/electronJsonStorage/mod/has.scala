package typings.electronJsonStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-json-storage", "has")
@js.native
object has extends js.Object {
  
  def apply(key: String, callback: js.Function2[/* error */ js.Any, /* hasKey */ Boolean, Unit]): Unit = js.native
  def apply(
    key: String,
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* hasKey */ Boolean, Unit]
  ): Unit = js.native
}
