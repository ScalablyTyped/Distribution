package typings.fastDashJsonDashPatch.commonjsDuplexMod

import typings.fastDashJsonDashPatch.commonjsCoreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch/commonjs/duplex", "generate")
@js.native
object generate extends js.Object {
  def apply[T](observer: Observer[js.Object]): js.Array[Operation] = js.native
  def apply[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = js.native
}

