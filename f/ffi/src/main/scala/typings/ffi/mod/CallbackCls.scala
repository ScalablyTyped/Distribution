package typings.ffi.mod

import typings.ffi.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi", "Callback")
@js.native
class CallbackCls protected () extends Buffer {
  def this(retType: js.Any, argTypes: js.Array[_], fn: js.Any) = this()
  def this(retType: js.Any, argTypes: js.Array[_], abi: Double, fn: js.Any) = this()
}

