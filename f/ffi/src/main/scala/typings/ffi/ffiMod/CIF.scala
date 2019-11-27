package typings.ffi.ffiMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi", "CIF")
@js.native
object CIF extends js.Object {
  def apply(retType: js.Any, types: js.Array[_]): Buffer = js.native
  def apply(retType: js.Any, types: js.Array[_], abi: js.Any): Buffer = js.native
}

