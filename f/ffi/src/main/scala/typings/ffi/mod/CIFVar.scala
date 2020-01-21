package typings.ffi.mod

import typings.ffi.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi", "CIF_var")
@js.native
object CIFVar extends js.Object {
  def apply(retType: js.Any, types: js.Array[_], numFixedArgs: Double): Buffer = js.native
  def apply(retType: js.Any, types: js.Array[_], numFixedArgs: Double, abi: js.Any): Buffer = js.native
}

