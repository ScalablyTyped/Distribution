package typings.ffiDashNapi.ffiDashNapiMod

import typings.ffiDashNapi.Buffer
import typings.refDashNapi.refDashNapiMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ffi-napi", "ForeignFunction")
@js.native
class ForeignFunctionCls protected () extends ForeignFunction {
  def this(ptr: Buffer, retType: String, argTypes: js.Array[_]) = this()
  def this(ptr: Buffer, retType: Type, argTypes: js.Array[_]) = this()
  def this(ptr: Buffer, retType: String, argTypes: js.Array[_], abi: Double) = this()
  def this(ptr: Buffer, retType: Type, argTypes: js.Array[_], abi: Double) = this()
}

